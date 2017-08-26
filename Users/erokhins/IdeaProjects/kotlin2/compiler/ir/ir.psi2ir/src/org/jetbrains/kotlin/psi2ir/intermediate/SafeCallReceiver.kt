'generator' @ [39:21] ==> public final val generator: GeneratorWithScope defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'scope' @ [39:31] ==> public abstract val scope: Scope defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorWithScope[DeserializedPropertyDescriptor]

'createTemporaryVariable' @ [39:37] ==> public final fun createTemporaryVariable(irExpression: IrExpression, nameHint: String? = ..., isMutable: Boolean = ..., origin: IrDeclarationOrigin = ...): IrVariable defined in org.jetbrains.kotlin.ir.builders.Scope[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [39:61] ==> public final val extensionReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'load' @ [39:80] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [39:90] ==> public final val dispatchReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'load' @ [39:109] ==> public abstract fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.IntermediateValue[SimpleFunctionDescriptorImpl]

'VariableLValue' @ [40:33] ==> public constructor VariableLValue(irVariable: IrVariable, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[ClassConstructorDescriptorImpl]

'irTmp' @ [40:48] ==> val irTmp: IrVariable defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'if (extensionReceiver != null) {
            dispatchReceiverValue = dispatchReceiver
            extensionReceiverValue = safeReceiverValue
        }
        else {
            dispatchReceiverValue = safeReceiverValue
            extensionReceiverValue = null
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'extensionReceiver' @ [44:13] ==> public final val extensionReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'dispatchReceiverValue' @ [45:13] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'dispatchReceiver' @ [45:37] ==> public final val dispatchReceiver: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'extensionReceiverValue' @ [46:13] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'safeReceiverValue' @ [46:38] ==> val safeReceiverValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'dispatchReceiverValue' @ [49:13] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'safeReceiverValue' @ [49:37] ==> val safeReceiverValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'extensionReceiverValue' @ [50:13] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'invoke' @ [53:24] ==> public abstract operator fun invoke(p1: IntermediateValue?, p2: IntermediateValue?): IrExpression defined in kotlin.Function2[FunctionInvokeDescriptor]

'dispatchReceiverValue' @ [53:58] ==> val dispatchReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'extensionReceiverValue' @ [53:81] ==> val extensionReceiverValue: IntermediateValue? defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'if (isAssignmentReceiver) irResult.type.builtIns.unitType else irResult.type.makeNullable()' @ [54:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'isAssignmentReceiver' @ [54:30] ==> public final val isAssignmentReceiver: Boolean defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'irResult' @ [54:52] ==> val irResult: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'type' @ [54:61] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'builtIns' @ [54:66] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'unitType' @ [54:75] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'irResult' @ [54:89] ==> val irResult: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'type' @ [54:98] ==> public abstract val type: KotlinType defined in org.jetbrains.kotlin.ir.expressions.IrExpression[DeserializedPropertyDescriptor]

'makeNullable' @ [54:103] ==> public fun KotlinType.makeNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'IrBlockImpl' @ [56:23] ==> public constructor IrBlockImpl(startOffset: Int, endOffset: Int, type: KotlinType, origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [56:35] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'endOffset' @ [56:48] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'resultType' @ [56:59] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'SAFE_CALL' @ [56:89] ==> public object SAFE_CALL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irBlock' @ [58:9] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'statements' @ [58:17] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [58:28] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irTmp' @ [58:32] ==> val irTmp: IrVariable defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'IrIfThenElseImpl' @ [60:28] ==> public constructor IrIfThenElseImpl(startOffset: Int, endOffset: Int, type: KotlinType, condition: IrExpression, thenBranch: IrExpression, elseBranch: IrExpression? = ..., origin: IrStatementOrigin? = ...) defined in org.jetbrains.kotlin.ir.expressions.impl.IrIfThenElseImpl[DeserializedClassConstructorDescriptor]

'startOffset' @ [60:45] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'endOffset' @ [60:58] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'resultType' @ [60:69] ==> val resultType: KotlinType defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'generator' @ [61:45] ==> public final val generator: GeneratorWithScope defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'context' @ [61:55] ==> public abstract val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorWithScope[PropertyDescriptorImpl]

'equalsNull' @ [61:63] ==> public fun IrGeneratorContext.equalsNull(startOffset: Int, endOffset: Int, argument: IrExpression): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [61:74] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'endOffset' @ [61:87] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'safeReceiverValue' @ [61:98] ==> val safeReceiverValue: VariableLValue defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'load' @ [61:116] ==> public open fun load(): IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.VariableLValue[SimpleFunctionDescriptorImpl]

'generator' @ [62:45] ==> public final val generator: GeneratorWithScope defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'context' @ [62:55] ==> public abstract val context: GeneratorContext defined in org.jetbrains.kotlin.psi2ir.generators.GeneratorWithScope[PropertyDescriptorImpl]

'constNull' @ [62:63] ==> public fun IrGeneratorContext.constNull(startOffset: Int, endOffset: Int): IrExpression defined in org.jetbrains.kotlin.ir.builders[DeserializedSimpleFunctionDescriptor]

'startOffset' @ [62:73] ==> public final val startOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'endOffset' @ [62:86] ==> public final val endOffset: Int defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver[PropertyDescriptorImpl]

'irResult' @ [63:45] ==> val irResult: IrExpression defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'SAFE_CALL' @ [64:63] ==> public object SAFE_CALL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'irBlock' @ [65:9] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'statements' @ [65:17] ==> public open val statements: MutableList<IrStatement> defined in org.jetbrains.kotlin.ir.expressions.impl.IrBlockImpl[DeserializedPropertyDescriptor]

'add' @ [65:28] ==> public abstract fun add(element: IrStatement): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'irIfThenElse' @ [65:32] ==> val irIfThenElse: IrIfThenElseImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

'irBlock' @ [67:16] ==> val irBlock: IrBlockImpl defined in org.jetbrains.kotlin.psi2ir.intermediate.SafeCallReceiver.call[LocalVariableDescriptor]

