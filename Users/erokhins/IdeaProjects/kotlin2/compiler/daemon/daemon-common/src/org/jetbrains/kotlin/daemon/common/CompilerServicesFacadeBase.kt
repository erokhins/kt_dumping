'Throws' @ [27:5] ==> public constructor Throws(vararg exceptionClasses: KClass<out Throwable>) defined in kotlin.jvm.Throws[DeserializedClassConstructorDescriptor]

'RemoteException' @ [27:13] ==> public constructor RemoteException() defined in java.rmi.RemoteException[JavaClassConstructorDescriptor]

'' @ [32:21] ==> private constructor ReportCategory(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportCategory[ClassConstructorDescriptorImpl]

'' @ [33:14] ==> private constructor ReportCategory(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportCategory[ClassConstructorDescriptorImpl]

'' @ [34:19] ==> private constructor ReportCategory(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportCategory[ClassConstructorDescriptorImpl]

'' @ [35:15] ==> private constructor ReportCategory(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportCategory[ClassConstructorDescriptorImpl]

'' @ [36:19] ==> private constructor ReportCategory(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportCategory[ClassConstructorDescriptorImpl]

'ReportCategory' @ [40:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportCategory[FakeCallableDescriptorForObject]

'values' @ [40:32] ==> public final fun values(): Array<ReportCategory> defined in org.jetbrains.kotlin.daemon.common.ReportCategory[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [40:41] ==> public inline fun <T> Array<out ReportCategory>.firstOrNull(predicate: (ReportCategory) -> Boolean): ReportCategory? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReportCategory

'it' @ [40:55] ==> value-parameter it: ReportCategory defined in org.jetbrains.kotlin.daemon.common.ReportCategory.Companion.fromCode.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [40:58] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[PropertyDescriptorImpl]

'code' @ [40:66] ==> value-parameter code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory.Companion.fromCode[ValueParameterDescriptorImpl]

'' @ [45:10] ==> private constructor ReportSeverity(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[ClassConstructorDescriptorImpl]

'' @ [46:12] ==> private constructor ReportSeverity(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[ClassConstructorDescriptorImpl]

'' @ [47:9] ==> private constructor ReportSeverity(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[ClassConstructorDescriptorImpl]

'' @ [48:10] ==> private constructor ReportSeverity(code: Int) defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[ClassConstructorDescriptorImpl]

'ReportSeverity' @ [52:17] ==> public companion object defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[FakeCallableDescriptorForObject]

'values' @ [52:32] ==> public final fun values(): Array<ReportSeverity> defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [52:41] ==> public inline fun <T> Array<out ReportSeverity>.firstOrNull(predicate: (ReportSeverity) -> Boolean): ReportSeverity? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReportSeverity

'it' @ [52:55] ==> value-parameter it: ReportSeverity defined in org.jetbrains.kotlin.daemon.common.ReportSeverity.Companion.fromCode.<anonymous>[ValueParameterDescriptorImpl]

'code' @ [52:58] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[PropertyDescriptorImpl]

'code' @ [52:66] ==> value-parameter code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity.Companion.fromCode[ValueParameterDescriptorImpl]

'report' @ [57:5] ==> @Throws public abstract fun report(category: Int, severity: Int, message: String?, attachment: Serializable?): Unit defined in org.jetbrains.kotlin.daemon.common.CompilerServicesFacadeBase[SimpleFunctionDescriptorImpl]

'category' @ [57:12] ==> value-parameter category: ReportCategory defined in org.jetbrains.kotlin.daemon.common.report[ValueParameterDescriptorImpl]

'code' @ [57:21] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportCategory[PropertyDescriptorImpl]

'severity' @ [57:27] ==> value-parameter severity: ReportSeverity defined in org.jetbrains.kotlin.daemon.common.report[ValueParameterDescriptorImpl]

'code' @ [57:36] ==> public final val code: Int defined in org.jetbrains.kotlin.daemon.common.ReportSeverity[PropertyDescriptorImpl]

'message' @ [57:42] ==> value-parameter message: String? = ... defined in org.jetbrains.kotlin.daemon.common.report[ValueParameterDescriptorImpl]

'attachment' @ [57:51] ==> value-parameter attachment: Serializable? = ... defined in org.jetbrains.kotlin.daemon.common.report[ValueParameterDescriptorImpl]

