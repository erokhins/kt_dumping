'operatorReference' @ [32:32] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getResolvedCallWithAssert' @ [32:50] ==> public fun KtElement.getResolvedCallWithAssert(context: BindingContext): ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'codegen' @ [32:76] ==> public final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[PropertyDescriptorImpl]

'bindingContext' @ [32:84] ==> public final val ExpressionCodegen.bindingContext: BindingContext[MyPropertyDescriptor]

'operatorReference' @ [33:31] ==> value-parameter operatorReference: KtSimpleNameExpression defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.<init>[ValueParameterDescriptorImpl]

'getReferencedNameElementType' @ [33:49] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'NOT_IN' @ [33:92] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'gen' @ [36:13] ==> private final fun gen(argument: StackValue): BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[SimpleFunctionDescriptorImpl]

'argument' @ [36:17] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.generate[ValueParameterDescriptorImpl]

'let' @ [36:27] ==> @InlineOnly public inline fun <T, R> BranchedValue.let(block: (BranchedValue) -> BranchedValue): BranchedValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BranchedValue
    <R> -> BranchedValue

'if (isInverted) Invert(it) else it' @ [36:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: BranchedValue, elseBranch: BranchedValue): BranchedValue[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> BranchedValue

'isInverted' @ [36:37] ==> private final val isInverted: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[PropertyDescriptorImpl]

'Invert' @ [36:49] ==> public constructor Invert(condition: BranchedValue) defined in org.jetbrains.kotlin.codegen.Invert[ClassConstructorDescriptorImpl]

'it' @ [36:56] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [36:65] ==> value-parameter it: BranchedValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.generate.<anonymous>[ValueParameterDescriptorImpl]

'BranchedValue' @ [39:22] ==> public constructor BranchedValue(arg1: StackValue, arg2: StackValue? = ..., operandType: Type, opcode: Int) defined in org.jetbrains.kotlin.codegen.BranchedValue[ClassConstructorDescriptorImpl]

'argument' @ [39:36] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen[ValueParameterDescriptorImpl]

'argument' @ [39:52] ==> value-parameter argument: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen[ValueParameterDescriptorImpl]

'type' @ [39:61] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'IFEQ' @ [39:75] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'invokeFunction' @ [41:21] ==> private final fun invokeFunction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [41:36] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.putSelector[ValueParameterDescriptorImpl]

'invokeFunction' @ [45:21] ==> private final fun invokeFunction(v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>[SimpleFunctionDescriptorImpl]

'v' @ [45:36] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'v' @ [46:21] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'visitJumpInsn' @ [46:23] ==> public open fun visitJumpInsn(p0: Int, p1: (Label..Label?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'if (jumpIfFalse) Opcodes.IFEQ else Opcodes.IFNE' @ [46:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'jumpIfFalse' @ [46:41] ==> value-parameter jumpIfFalse: Boolean defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'IFEQ' @ [46:62] ==> public const final val IFEQ: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'IFNE' @ [46:80] ==> public const final val IFNE: Int defined in org.jetbrains.org.objectweb.asm.Opcodes[JavaPropertyDescriptor]

'jumpLabel' @ [46:86] ==> value-parameter jumpLabel: Label defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.condJump[ValueParameterDescriptorImpl]

'codegen' @ [50:34] ==> public final val codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[PropertyDescriptorImpl]

'invokeFunction' @ [50:42] ==> @NotNull public open fun invokeFunction(@NotNull call: Call, @NotNull resolvedCall: ResolvedCall<*>, @NotNull receiver: StackValue): StackValue defined in org.jetbrains.kotlin.codegen.ExpressionCodegen[JavaMethodDescriptor]

'resolvedCall' @ [50:57] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[PropertyDescriptorImpl]

'call' @ [50:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'resolvedCall' @ [50:76] ==> private final val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator[PropertyDescriptorImpl]

'none' @ [50:90] ==> public open fun none(): (StackValue..StackValue?) defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'result' @ [51:21] ==> val result: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.invokeFunction[LocalVariableDescriptor]

'put' @ [51:28] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'result' @ [51:32] ==> val result: StackValue defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.invokeFunction[LocalVariableDescriptor]

'type' @ [51:39] ==> @NotNull public final val type: Type defined in org.jetbrains.kotlin.codegen.StackValue[JavaPropertyDescriptor]

'v' @ [51:45] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.inExpression.CallBasedInExpressionGenerator.gen.<no name provided>.invokeFunction[ValueParameterDescriptorImpl]

