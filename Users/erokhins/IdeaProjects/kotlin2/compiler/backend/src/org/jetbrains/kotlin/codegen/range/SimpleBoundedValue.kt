'AbstractBoundedValue' @ [32:4] ==> public constructor AbstractBoundedValue(codegen: ExpressionCodegen, rangeCall: ResolvedCall<out CallableDescriptor>, isLowInclusive: Boolean = ..., isHighInclusive: Boolean = ...) defined in org.jetbrains.kotlin.codegen.range.AbstractBoundedValue[ClassConstructorDescriptorImpl]

'codegen' @ [32:25] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'rangeCall' @ [32:34] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'isLowInclusive' @ [32:45] ==> value-parameter isLowInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'isHighInclusive' @ [32:61] ==> value-parameter isHighInclusive: Boolean defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'this' @ [38:9] ==> public constructor SimpleBoundedValue(codegen: ExpressionCodegen, rangeCall: ResolvedCall<out CallableDescriptor>, lowBound: StackValue, isLowInclusive: Boolean, highBound: StackValue, isHighInclusive: Boolean) defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[ClassConstructorDescriptorImpl]

'codegen' @ [39:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'rangeCall' @ [40:13] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'codegen' @ [41:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'generateCallReceiver' @ [41:21] ==> public fun ExpressionCodegen.generateCallReceiver(rangeCall: ResolvedCall<out CallableDescriptor>): StackValue defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'rangeCall' @ [41:42] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'isLowInclusive' @ [42:13] ==> value-parameter isLowInclusive: Boolean = ... defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'codegen' @ [43:13] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'generateCallSingleArgument' @ [43:21] ==> public fun ExpressionCodegen.generateCallSingleArgument(rangeCall: ResolvedCall<out CallableDescriptor>): StackValue defined in org.jetbrains.kotlin.codegen[SimpleFunctionDescriptorImpl]

'rangeCall' @ [43:48] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'isHighInclusive' @ [44:13] ==> value-parameter isHighInclusive: Boolean = ... defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'this' @ [52:9] ==> public constructor SimpleBoundedValue(codegen: ExpressionCodegen, rangeCall: ResolvedCall<out CallableDescriptor>, lowBound: StackValue, isLowInclusive: Boolean, highBound: StackValue, isHighInclusive: Boolean) defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[ClassConstructorDescriptorImpl]

'codegen' @ [52:14] ==> value-parameter codegen: ExpressionCodegen defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'rangeCall' @ [52:23] ==> value-parameter rangeCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'lowBound' @ [52:34] ==> value-parameter lowBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'highBound' @ [52:50] ==> value-parameter highBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.<init>[ValueParameterDescriptorImpl]

'if (!lowBound.canHaveSideEffects() || !highBound.canHaveSideEffects()) {
            highBound.put(type, v)
            lowBound.put(type, v)
        }
        else {
            lowBound.put(type, v)
            highBound.put(type, v)
            AsmUtil.swap(v, type, type)
        }' @ [55:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [55:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lowBound' @ [55:14] ==> private final val lowBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'canHaveSideEffects' @ [55:23] ==> public open fun canHaveSideEffects(): Boolean defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'!' @ [55:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'highBound' @ [55:48] ==> private final val highBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'canHaveSideEffects' @ [55:58] ==> public open fun canHaveSideEffects(): Boolean defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'highBound' @ [56:13] ==> private final val highBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'put' @ [56:23] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [56:27] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'v' @ [56:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'lowBound' @ [57:13] ==> private final val lowBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'put' @ [57:22] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [57:26] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'v' @ [57:32] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'lowBound' @ [60:13] ==> private final val lowBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'put' @ [60:22] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [60:26] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'v' @ [60:32] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'highBound' @ [61:13] ==> private final val highBound: StackValue defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue[PropertyDescriptorImpl]

'put' @ [61:23] ==> public open fun put(@NotNull type: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'type' @ [61:27] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'v' @ [61:33] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'swap' @ [62:21] ==> public open fun swap(v: (InstructionAdapter..InstructionAdapter?), stackTop: (Type..Type?), afterTop: (Type..Type?)): Unit defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'v' @ [62:26] ==> value-parameter v: InstructionAdapter defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'type' @ [62:29] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

'type' @ [62:35] ==> value-parameter type: Type defined in org.jetbrains.kotlin.codegen.range.SimpleBoundedValue.putHighLow[ValueParameterDescriptorImpl]

