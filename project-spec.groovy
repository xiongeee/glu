/*
 * Copyright (c) 2010-2010 LinkedIn, Inc
 * Portions Copyright (c) 2011-2013 Yan Pujante
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

spec = [
  name: 'glu',
  group: 'org.linkedin',
  version: '4.7.0',

  versions: [
    jdk: '1.6',
    grails: '2.2.1',
    groovy: '2.0.7',
    jetty: '8.1.10.v20130312', // '9.0.0.v20130308' (cannot use 9 -> requires jdk 1.7)
    linkedinUtils: '1.8.glu47.0',
    linkedinZookeeper: '1.5.glu47.0',
    restlet: '2.1.2',
    sigar: '1.6.4',
    slf4j: '1.6.2' // to be compatible with grails 2.2.1
  ],

  // information about the build framework itself
  build: [
    type: "gradle",
    commands: [
      "snapshot": "./gradlew release",
      "release": "./gradlew -Prelease=true release"
    ]
  ]
]

spec.scmUrl = "git@github.com:linkedin/${spec.name}.git"

/**
 * External dependencies
 */
spec.external = [
  commonsCli: 'commons-cli:commons-cli:1.2',
  commonsIO: 'commons-io:commons-io:2.1',
  ehcacheCore: 'net.sf.ehcache:ehcache-core:2.4.6', // using same version embedded in grails
  grailsBootstrap: "org.grails:grails-bootstrap:${spec.versions.grails}",
  grailsCore: "org.grails:grails-core:${spec.versions.grails}",
  groovy: "org.codehaus.groovy:groovy:${spec.versions.groovy}",
  groovyTest: "org.codehaus.groovy:groovy-test:${spec.versions.groovy}",
  httpClient: "org.apache.httpcomponents:httpclient:4.2.3",
  ivy: 'org.apache.ivy:ivy:2.2.0',
  jettyPackage: [
    group: "org.eclipse.jetty",
    name: "jetty-distribution",
    version: spec.versions.jetty,
    ext: "tar.gz"
  ],
  junit: 'junit:junit:4.10',
  linkedinUtilsCore: "org.linkedin:org.linkedin.util-core:${spec.versions.linkedinUtils}",
  linkedinUtilsGroovy: "org.linkedin:org.linkedin.util-groovy:${spec.versions.linkedinUtils}",
  linkedinZookeeperCliImpl: "org.linkedin:org.linkedin.zookeeper-cli-impl:${spec.versions.linkedinZookeeper}",
  linkedinZookeeperCliPackage: [
    group: "org.linkedin",
    name: "org.linkedin.zookeeper-cli",
    version: spec.versions.linkedinZookeeper,
    packaging: "tgz"
  ],
  linkedinZookeeperImpl: "org.linkedin:org.linkedin.zookeeper-impl:${spec.versions.linkedinZookeeper}",
  linkedinZookeeperServerPackage: [
    group: "org.linkedin",
    name: "org.linkedin.zookeeper-server",
    version: spec.versions.linkedinZookeeper,
    packaging: "tgz"
  ],
  log4j: 'log4j:log4j:1.2.16',
  mimeUtil: 'eu.medsea.mimeutil:mime-util:2.1.3',
  restlet: "org.restlet.jse:org.restlet:${spec.versions.restlet}",
  restletExtHttpClient: "org.restlet.jse:org.restlet.ext.httpclient:${spec.versions.restlet}",
  restletExtJson: "org.restlet.jse:org.restlet.ext.json:${spec.versions.restlet}",
  restletExtJetty: "org.restlet.jse:org.restlet.ext.jetty:${spec.versions.restlet}",
  servletApi: 'javax.servlet:servlet-api:2.5',
  shiro: "org.apache.shiro:shiro-all:1.2.1",
  sigar: "com.hyperic:sigar:${spec.versions.sigar}",
  slf4j: "org.slf4j:slf4j-api:${spec.versions.slf4j}",
  slf4jLog4j: "org.slf4j:slf4j-log4j12:${spec.versions.slf4j}",
  slf4jJul: "org.slf4j:jul-to-slf4j:${spec.versions.slf4j}",
  zookeeper: 'org.apache.zookeeper:zookeeper:3.4.5'
]
