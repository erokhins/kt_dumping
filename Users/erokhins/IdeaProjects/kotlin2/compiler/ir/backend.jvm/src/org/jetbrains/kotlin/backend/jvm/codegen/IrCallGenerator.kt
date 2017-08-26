'if (!callDefault) {
            callableMethod.genInvokeInstruction(codegen.mv)
        } else {
            (callableMethod as CallableMethod).genInvokeDefaultInstruction(codegen.mv)
        }' @ [30:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [30:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callDefault' @ [30:14] ==> value-parameter callDefault: Boolean defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genCall[ValueParameterDescriptorImpl]

'callableMethod' @ [31:13] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genCall[ValueParameterDescriptorImpl]

'genInvokeInstruction' @ [31:28] ==> public abstract fun genInvokeInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.Callable[DeserializedSimpleFunctionDescriptor]

'codegen' @ [31:49] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genCall[ValueParameterDescriptorImpl]

'mv' @ [31:57] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'callableMethod' @ [33:14] ==> value-parameter callableMethod: Callable defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genCall[ValueParameterDescriptorImpl]

'genInvokeDefaultInstruction' @ [33:48] ==> public final fun genInvokeDefaultInstruction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedSimpleFunctionDescriptor]

'codegen' @ [33:76] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genCall[ValueParameterDescriptorImpl]

'mv' @ [33:84] ==> public final val mv: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

'codegen' @ [45:9] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'gen' @ [45:17] ==> public final fun gen(expression: IrElement, type: Type, data: BlockInfo): StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[SimpleFunctionDescriptorImpl]

'argumentExpression' @ [45:21] ==> value-parameter argumentExpression: IrExpression defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'parameterType' @ [45:41] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'blockInfo' @ [45:56] ==> value-parameter blockInfo: BlockInfo defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.genValueAndPut[ValueParameterDescriptorImpl]

'value' @ [49:9] ==> value-parameter value: StackValue defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'put' @ [49:15] ==> public open fun put(@NotNull p0: Type, @NotNull p1: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'parameterType' @ [49:19] ==> value-parameter parameterType: Type defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'codegen' @ [49:34] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.backend.jvm.codegen.IrCallGenerator.putValueIfNeeded[ValueParameterDescriptorImpl]

'visitor' @ [49:42] ==> public open val visitor: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.codegen.ExpressionCodegen[PropertyDescriptorImpl]

