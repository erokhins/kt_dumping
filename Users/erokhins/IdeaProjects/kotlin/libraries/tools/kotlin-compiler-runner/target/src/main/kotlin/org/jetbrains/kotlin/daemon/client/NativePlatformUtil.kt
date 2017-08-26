'lazy' @ [23:80] ==> public fun <T> lazy(initializer: () -> ProcessLauncher): Lazy<ProcessLauncher> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ProcessLauncher

'get' @ [24:44] ==> @ThreadSafe public open fun <T : (NativeIntegration..NativeIntegration?)> get(p0: (Class<(ProcessLauncher..ProcessLauncher?)>..Class<(ProcessLauncher..ProcessLauncher?)>?)): (ProcessLauncher..ProcessLauncher?) defined in net.rubygrapefruit.platform.Native[JavaMethodDescriptor]
Inferred types:
    <T : (NativeIntegration..NativeIntegration?)> -> ProcessLauncher

'ProcessLauncher' @ [24:76] ==> @ThreadSafe public fun ProcessLauncher(function: ((ProcessBuilder..ProcessBuilder?)) -> (Process..Process?)): ProcessLauncher defined in net.rubygrapefruit.platform[SimpleFunctionDescriptorImpl]

'java' @ [24:99] ==> public val <T> KClass<ProcessLauncher>.java: Class<ProcessLauncher> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ProcessLauncher

'nativeLauncher' @ [29:17] ==> private final val nativeLauncher: ProcessLauncher defined in org.jetbrains.kotlin.daemon.client.NativePlatformLauncherWrapper[PropertyDescriptorImpl]

'start' @ [29:32] ==> @ThreadSafe public abstract fun start(p0: (ProcessBuilder..ProcessBuilder?)): (Process..Process?) defined in net.rubygrapefruit.platform.ProcessLauncher[JavaMethodDescriptor]

'processBuilder' @ [29:38] ==> value-parameter processBuilder: ProcessBuilder defined in org.jetbrains.kotlin.daemon.client.NativePlatformLauncherWrapper.launch[ValueParameterDescriptorImpl]

'IOException' @ [32:23] ==> public constructor IOException(p0: (Throwable..Throwable?)) defined in java.io.IOException[JavaClassConstructorDescriptor]

'e' @ [32:35] ==> val e: NativeException defined in org.jetbrains.kotlin.daemon.client.NativePlatformLauncherWrapper.launch[LocalVariableDescriptor]

'?:' @ [38:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Process?, right: Process): Process[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Process

'NativePlatformLauncherWrapper' @ [40:13] ==> public constructor NativePlatformLauncherWrapper() defined in org.jetbrains.kotlin.daemon.client.NativePlatformLauncherWrapper[ClassConstructorDescriptorImpl]

'launch' @ [40:45] ==> public final fun launch(processBuilder: ProcessBuilder): Process defined in org.jetbrains.kotlin.daemon.client.NativePlatformLauncherWrapper[SimpleFunctionDescriptorImpl]

'processBuilder' @ [40:52] ==> value-parameter processBuilder: ProcessBuilder defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'reportingTargets' @ [43:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'report' @ [43:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [43:58] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [43:159] ==> val e: UnsatisfiedLinkError defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[LocalVariableDescriptor]

'reportingSource' @ [43:164] ==> value-parameter reportingSource: String = ... defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'reportingTargets' @ [47:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'report' @ [47:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [47:58] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [47:160] ==> val e: IOException defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[LocalVariableDescriptor]

'cause' @ [47:162] ==> public open val cause: Throwable? defined in java.io.IOException[DeserializedPropertyDescriptor]

'reportingSource' @ [47:172] ==> value-parameter reportingSource: String = ... defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'reportingTargets' @ [51:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'report' @ [51:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [51:58] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [51:166] ==> val e: NoClassDefFoundError defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[LocalVariableDescriptor]

'reportingSource' @ [51:171] ==> value-parameter reportingSource: String = ... defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'reportingTargets' @ [55:13] ==> value-parameter reportingTargets: DaemonReportingTargets defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'report' @ [55:30] ==> internal fun DaemonReportingTargets.report(category: DaemonReportCategory, message: String, source: String? = ...): Unit defined in org.jetbrains.kotlin.daemon.client in file KotlinCompilerClient.kt[SimpleFunctionDescriptorImpl]

'DEBUG' @ [55:58] ==> enum entry DEBUG defined in org.jetbrains.kotlin.daemon.common.DaemonReportCategory[FakeCallableDescriptorForObject]

'e' @ [55:166] ==> val e: ClassNotFoundException defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[LocalVariableDescriptor]

'reportingSource' @ [55:171] ==> value-parameter reportingSource: String = ... defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'processBuilder' @ [58:12] ==> value-parameter processBuilder: ProcessBuilder defined in org.jetbrains.kotlin.daemon.client.launchProcessWithFallback[ValueParameterDescriptorImpl]

'start' @ [58:27] ==> public open fun start(): (Process..Process?) defined in java.lang.ProcessBuilder[JavaMethodDescriptor]

