'IrValidator' @ [27:19] ==> public constructor IrValidator(context: CommonBackendContext, performHeavyValidations: Boolean) defined in org.jetbrains.kotlin.backend.common.IrValidator[ClassConstructorDescriptorImpl]

'context' @ [27:31] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.validateIrFile[ValueParameterDescriptorImpl]

'irFile' @ [28:5] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.common.validateIrFile[ValueParameterDescriptorImpl]

'acceptVoid' @ [28:12] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'visitor' @ [28:23] ==> val visitor: IrValidator defined in org.jetbrains.kotlin.backend.common.validateIrFile[LocalVariableDescriptor]

'IrValidator' @ [32:19] ==> public constructor IrValidator(context: CommonBackendContext, performHeavyValidations: Boolean) defined in org.jetbrains.kotlin.backend.common.IrValidator[ClassConstructorDescriptorImpl]

'context' @ [32:31] ==> value-parameter context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.validateIrModule[ValueParameterDescriptorImpl]

'irModule' @ [33:5] ==> value-parameter irModule: IrModuleFragment defined in org.jetbrains.kotlin.backend.common.validateIrModule[ValueParameterDescriptorImpl]

'acceptVoid' @ [33:14] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'visitor' @ [33:25] ==> val visitor: IrValidator defined in org.jetbrains.kotlin.backend.common.validateIrModule[LocalVariableDescriptor]

'this' @ [40:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[ReceiverParameterDescriptorImpl]

'reportWarning' @ [40:14] ==> public fun CommonBackendContext.reportWarning(message: String, irFile: IrFile, irElement: IrElement): Unit defined in org.jetbrains.kotlin.backend.common in file Utils.kt[SimpleFunctionDescriptorImpl]

'message' @ [40:46] ==> value-parameter message: String defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[ValueParameterDescriptorImpl]

'irFile' @ [40:56] ==> value-parameter irFile: IrFile defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[ValueParameterDescriptorImpl]

'irElement' @ [40:64] ==> value-parameter irElement: IrElement defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[ValueParameterDescriptorImpl]

'println' @ [42:9] ==> @InlineOnly public inline fun println(message: Any?): Unit defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'e' @ [42:63] ==> val e: Throwable defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[LocalVariableDescriptor]

'e' @ [43:9] ==> val e: Throwable defined in org.jetbrains.kotlin.backend.common.reportIrValidationError[LocalVariableDescriptor]

'printStackTrace' @ [43:11] ==> public open fun printStackTrace(): Unit defined in kotlin.Throwable[JavaMethodDescriptor]

'context' @ [50:20] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'builtIns' @ [50:28] ==> public abstract val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.CommonBackendContext[PropertyDescriptorImpl]

'currentFile' @ [54:9] ==> public final lateinit var currentFile: IrFile defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'declaration' @ [54:23] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrValidator.visitFile[ValueParameterDescriptorImpl]

'super' @ [55:9] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrValidator[LazyClassReceiverParameterDescriptor]

'visitFile' @ [55:15] ==> public open fun visitFile(declaration: IrFile): Unit defined in org.jetbrains.kotlin.ir.visitors.IrElementVisitorVoid[DeserializedSimpleFunctionDescriptor]

'declaration' @ [55:25] ==> value-parameter declaration: IrFile defined in org.jetbrains.kotlin.backend.common.IrValidator.visitFile[ValueParameterDescriptorImpl]

'context' @ [60:9] ==> public final val context: CommonBackendContext defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'reportIrValidationError' @ [60:17] ==> private fun CommonBackendContext.reportIrValidationError(message: String, irFile: IrFile, irElement: IrElement): Unit defined in org.jetbrains.kotlin.backend.common in file IrValidator.kt[SimpleFunctionDescriptorImpl]

'+' @ [61:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'message' @ [61:19] ==> value-parameter message: String defined in org.jetbrains.kotlin.backend.common.IrValidator.error[ValueParameterDescriptorImpl]

'element' @ [62:25] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.IrValidator.error[ValueParameterDescriptorImpl]

'render' @ [62:33] ==> public fun IrElement.render(): String defined in org.jetbrains.kotlin.ir.util[DeserializedSimpleFunctionDescriptor]

'currentFile' @ [63:17] ==> public final lateinit var currentFile: IrFile defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'element' @ [63:30] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.IrValidator.error[ValueParameterDescriptorImpl]

'CheckIrElementVisitor' @ [66:34] ==> public constructor CheckIrElementVisitor(builtIns: KotlinBuiltIns, reportError: ReportError /* = (element: IrElement, message: String) -> Unit */, ensureAllNodesAreDifferent: Boolean) defined in org.jetbrains.kotlin.backend.common.CheckIrElementVisitor[ClassConstructorDescriptorImpl]

'builtIns' @ [66:56] ==> public final val builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'this' @ [66:66] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrValidator[LazyClassReceiverParameterDescriptor]

'error' @ [66:72] ==> private final fun error(element: IrElement, message: String): Unit defined in org.jetbrains.kotlin.backend.common.IrValidator[SimpleFunctionDescriptorImpl]

'performHeavyValidations' @ [66:79] ==> value-parameter performHeavyValidations: Boolean defined in org.jetbrains.kotlin.backend.common.IrValidator.<init>[ValueParameterDescriptorImpl]

'element' @ [69:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.IrValidator.visitElement[ValueParameterDescriptorImpl]

'acceptVoid' @ [69:17] ==> public fun IrElement.acceptVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'elementChecker' @ [69:28] ==> private final val elementChecker: CheckIrElementVisitor defined in org.jetbrains.kotlin.backend.common.IrValidator[PropertyDescriptorImpl]

'element' @ [70:9] ==> value-parameter element: IrElement defined in org.jetbrains.kotlin.backend.common.IrValidator.visitElement[ValueParameterDescriptorImpl]

'acceptChildrenVoid' @ [70:17] ==> public fun IrElement.acceptChildrenVoid(visitor: IrElementVisitorVoid): Unit defined in org.jetbrains.kotlin.ir.visitors[DeserializedSimpleFunctionDescriptor]

'this' @ [70:36] ==> <this> defined in org.jetbrains.kotlin.backend.common.IrValidator[LazyClassReceiverParameterDescriptor]

