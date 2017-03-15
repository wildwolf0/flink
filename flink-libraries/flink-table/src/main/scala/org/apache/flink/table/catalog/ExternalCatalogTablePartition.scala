/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.catalog

import java.util.{HashMap => JHashMap, Map => JMap}

import org.apache.flink.table.plan.stats.TablePartitionStats

object ExternalCatalogTypes {

  /**
    * external table partition specification.
    * Key is partition column name, value is partition column value.
    */
  type PartitionSpec = JMap[String, String]
}

/**
  * Partition definition of an external Catalog table
  *
  * @param partitionSpec partition specification
  * @param properties    partition properties
  * @param stats         partition statistics
  */
case class ExternalCatalogTablePartition(
    partitionSpec: ExternalCatalogTypes.PartitionSpec,
    properties: JMap[String, String] = new JHashMap(),
    stats: TablePartitionStats = null)