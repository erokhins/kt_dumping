'IntrinsicMethod' @ [25:13] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'numberFunctionOperandType' @ [27:38] ==> @NotNull public open fun numberFunctionOperandType(@NotNull expectedType: Type): Type defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'method' @ [27:64] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'returnType' @ [27:71] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'createUnaryIntrinsicCallable' @ [28:16] ==> public fun createUnaryIntrinsicCallable(callable: CallableMethod, newReturnType: Type? = ..., needPrimitiveCheck: Boolean = ..., newThisType: Type? = ..., invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit): IntrinsicCallable defined in org.jetbrains.kotlin.codegen.intrinsics in file IntrinsicCallable.kt[SimpleFunctionDescriptorImpl]

'method' @ [28:45] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable[ValueParameterDescriptorImpl]

'if (returnType == Type.LONG_TYPE) {
                it.lconst(-1)
            }
            else {
                it.iconst(-1)
            }' @ [29:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'returnType' @ [29:17] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[PropertyDescriptorImpl]

'LONG_TYPE' @ [29:36] ==> public final val LONG_TYPE: (Type..Type?) defined in org.jetbrains.org.objectweb.asm.Type[JavaPropertyDescriptor]

'it' @ [30:17] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'lconst' @ [30:20] ==> public open fun lconst(p0: Long): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'-' @ [30:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [33:17] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'iconst' @ [33:20] ==> public open fun iconst(p0: Int): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'-' @ [33:27] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'it' @ [35:13] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'xor' @ [35:16] ==> public open fun xor(p0: (Type..Type?)): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'intermediateResultType' @ [35:20] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable[LocalVariableDescriptor]

'coerce' @ [36:24] ==> public open fun coerce(@NotNull fromType: Type, @NotNull toType: Type, @NotNull v: InstructionAdapter): Unit defined in org.jetbrains.kotlin.codegen.StackValue[JavaMethodDescriptor]

'intermediateResultType' @ [36:31] ==> val intermediateResultType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable[LocalVariableDescriptor]

'returnType' @ [36:55] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[PropertyDescriptorImpl]

'it' @ [36:67] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.Inv.toCallable.<anonymous>[ValueParameterDescriptorImpl]

