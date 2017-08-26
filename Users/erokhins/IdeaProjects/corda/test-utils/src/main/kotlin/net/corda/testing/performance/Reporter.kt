'MetricRegistry' @ [11:86] ==> public constructor MetricRegistry() defined in com.codahale.metrics.MetricRegistry[JavaClassConstructorDescriptor]

'thread' @ [12:23] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'forRegistry' @ [14:17] ==> public open fun forRegistry(p0: (MetricRegistry..MetricRegistry?)): (JmxReporter.Builder..JmxReporter.Builder?) defined in com.codahale.metrics.JmxReporter[JavaMethodDescriptor]

'metricRegistry' @ [14:29] ==> value-parameter metricRegistry: MetricRegistry = ... defined in net.corda.testing.performance.startReporter[ValueParameterDescriptorImpl]

'inDomain' @ [15:17] ==> public open fun inDomain(p0: (String..String?)): (JmxReporter.Builder..JmxReporter.Builder?) defined in com.codahale.metrics.JmxReporter.Builder[JavaMethodDescriptor]

'createsObjectNamesWith' @ [16:17] ==> public final fun createsObjectNamesWith(p0: (((String..String?), (String..String?), (String..String?)) -> (ObjectName..ObjectName?)..(((String..String?), (String..String?), (String..String?)) -> (ObjectName..ObjectName?))?)): (JmxReporter.Builder..JmxReporter.Builder?) defined in com.codahale.metrics.JmxReporter.Builder[MyFunctionDescriptor]

'name' @ [18:36] ==> value-parameter name: (String..String?) defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substringBefore' @ [18:41] ==> public fun String.substringBefore(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [19:35] ==> value-parameter name: (String..String?) defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substringAfter' @ [19:40] ==> public fun String.substringAfter(delimiter: Char, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (subName == "")
                        ObjectName("$domain:name=$category")
                    else
                        ObjectName("$domain:type=$category,name=$subName")' @ [20:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (ObjectName..ObjectName?), elseBranch: (ObjectName..ObjectName?)): (ObjectName..ObjectName?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (javax.management.ObjectName..javax.management.ObjectName?)

'subName' @ [20:25] ==> val subName: String defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ObjectName' @ [21:25] ==> public constructor ObjectName(p0: (String..String?)) defined in javax.management.ObjectName[JavaClassConstructorDescriptor]

'domain' @ [21:38] ==> value-parameter domain: (String..String?) defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [21:51] ==> val category: String defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'ObjectName' @ [23:25] ==> public constructor ObjectName(p0: (String..String?)) defined in javax.management.ObjectName[JavaClassConstructorDescriptor]

'domain' @ [23:38] ==> value-parameter domain: (String..String?) defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'category' @ [23:51] ==> val category: String defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'subName' @ [23:66] ==> val subName: String defined in net.corda.testing.performance.startReporter.<anonymous>.<anonymous>[LocalVariableDescriptor]

'build' @ [25:17] ==> public open fun build(): (JmxReporter..JmxReporter?) defined in com.codahale.metrics.JmxReporter.Builder[JavaMethodDescriptor]

'start' @ [26:17] ==> public open fun start(): Unit defined in com.codahale.metrics.JmxReporter[JavaMethodDescriptor]

'shutdownManager' @ [28:5] ==> value-parameter shutdownManager: ShutdownManager defined in net.corda.testing.performance.startReporter[ValueParameterDescriptorImpl]

'registerShutdown' @ [28:21] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'jmxReporter' @ [28:40] ==> val jmxReporter: Thread defined in net.corda.testing.performance.startReporter[LocalVariableDescriptor]

'interrupt' @ [28:52] ==> public open fun interrupt(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'thread' @ [29:27] ==> public fun thread(start: Boolean = ..., isDaemon: Boolean = ..., contextClassLoader: ClassLoader? = ..., name: String? = ..., priority: Int = ..., block: () -> Unit): Thread defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]

'forRegistry' @ [30:25] ==> public open fun forRegistry(p0: (MetricRegistry..MetricRegistry?)): (ConsoleReporter.Builder..ConsoleReporter.Builder?) defined in com.codahale.metrics.ConsoleReporter[JavaMethodDescriptor]

'metricRegistry' @ [30:37] ==> value-parameter metricRegistry: MetricRegistry = ... defined in net.corda.testing.performance.startReporter[ValueParameterDescriptorImpl]

'build' @ [30:53] ==> public open fun build(): (ConsoleReporter..ConsoleReporter?) defined in com.codahale.metrics.ConsoleReporter.Builder[JavaMethodDescriptor]

'start' @ [30:61] ==> public open fun start(p0: Long, p1: (TimeUnit..TimeUnit?)): Unit defined in com.codahale.metrics.ConsoleReporter[JavaMethodDescriptor]

'SECONDS' @ [30:79] ==> enum entry SECONDS defined in java.util.concurrent.TimeUnit[FakeCallableDescriptorForObject]

'shutdownManager' @ [32:5] ==> value-parameter shutdownManager: ShutdownManager defined in net.corda.testing.performance.startReporter[ValueParameterDescriptorImpl]

'registerShutdown' @ [32:21] ==> public final fun registerShutdown(shutdown: () -> Unit): Unit defined in net.corda.testing.driver.ShutdownManager[SimpleFunctionDescriptorImpl]

'consoleReporter' @ [32:40] ==> val consoleReporter: Thread defined in net.corda.testing.performance.startReporter[LocalVariableDescriptor]

'interrupt' @ [32:56] ==> public open fun interrupt(): Unit defined in java.lang.Thread[JavaMethodDescriptor]

'metricRegistry' @ [33:12] ==> value-parameter metricRegistry: MetricRegistry = ... defined in net.corda.testing.performance.startReporter[ValueParameterDescriptorImpl]

