'IntrinsicMethod' @ [23:23] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicMethod[JavaClassConstructorDescriptor]

'createUnaryIntrinsicCallable' @ [25:13] ==> public fun createUnaryIntrinsicCallable(callable: CallableMethod, newReturnType: Type? = ..., needPrimitiveCheck: Boolean = ..., newThisType: Type? = ..., invoke: IntrinsicCallable.(v: InstructionAdapter) -> Unit): IntrinsicCallable defined in org.jetbrains.kotlin.codegen.intrinsics in file IntrinsicCallable.kt[SimpleFunctionDescriptorImpl]

'method' @ [25:42] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'method' @ [26:43] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'owner' @ [26:50] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'descriptor' @ [26:56] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'returnType' @ [26:70] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.intrinsics.IntrinsicCallable[PropertyDescriptorImpl]

'descriptor' @ [26:81] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'if (AsmUtil.isPrimitive(method.owner.elementType))
                            "kotlin/jvm/internal/ArrayIteratorsKt"
                        else
                            "kotlin/jvm/internal/ArrayIteratorKt"' @ [28:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isPrimitive' @ [28:37] ==> public open fun isPrimitive(type: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'method' @ [28:49] ==> value-parameter method: CallableMethod defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'owner' @ [28:56] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[PropertyDescriptorImpl]

'elementType' @ [28:62] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'it' @ [32:17] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'invokestatic' @ [32:20] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'intrinsicOwner' @ [32:33] ==> val intrinsicOwner: String defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable.<anonymous>[LocalVariableDescriptor]

'methodSignature' @ [32:61] ==> val methodSignature: String defined in org.jetbrains.kotlin.codegen.intrinsics.ArrayIterator.toCallable.<anonymous>[LocalVariableDescriptor]

