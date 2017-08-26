'IntrinsicMethod' @ [25:23] ==> public constructor IntrinsicMethod() defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IntrinsicMethod[ClassConstructorDescriptorImpl]

'context' @ [27:22] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'state' @ [27:30] ==> public final val state: GenerationState defined in org.jetbrains.kotlin.backend.jvm.JvmBackendContext[PropertyDescriptorImpl]

'typeMapper' @ [27:36] ==> public final val typeMapper: KotlinTypeMapper defined in org.jetbrains.kotlin.codegen.state.GenerationState[DeserializedPropertyDescriptor]

'mapToCallableMethod' @ [27:47] ==> @NotNull public open fun mapToCallableMethod(@NotNull p0: FunctionDescriptor, p1: Boolean): CallableMethod defined in org.jetbrains.kotlin.codegen.state.KotlinTypeMapper[JavaMethodDescriptor]

'expression' @ [27:67] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'descriptor' @ [27:78] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.ir.expressions.IrMemberAccessExpression[DeserializedPropertyDescriptor]

'IrIntrinsicFunction' @ [28:16] ==> public companion object defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction[FakeCallableDescriptorForObject]

'create' @ [28:36] ==> public final fun create(expression: IrMemberAccessExpression, signature: JvmMethodSignature, context: JvmBackendContext, type: Type, invokeInstruction: IrIntrinsicFunction.(InstructionAdapter) -> Unit): IrIntrinsicFunction defined in org.jetbrains.kotlin.backend.jvm.intrinsics.IrIntrinsicFunction.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [28:43] ==> value-parameter expression: IrMemberAccessExpression defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'signature' @ [28:55] ==> value-parameter signature: JvmMethodSignature defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'context' @ [28:66] ==> value-parameter context: JvmBackendContext defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[ValueParameterDescriptorImpl]

'method' @ [28:75] ==> val method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[LocalVariableDescriptor]

'owner' @ [28:82] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedPropertyDescriptor]

'method' @ [29:39] ==> val method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[LocalVariableDescriptor]

'owner' @ [29:46] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedPropertyDescriptor]

'descriptor' @ [29:52] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'method' @ [29:66] ==> val method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[LocalVariableDescriptor]

'returnType' @ [29:73] ==> public open val returnType: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedPropertyDescriptor]

'descriptor' @ [29:84] ==> public final val Type.descriptor: (String..String?)[MyPropertyDescriptor]

'if (AsmUtil.isPrimitive(method.owner.elementType))
                        "kotlin/jvm/internal/ArrayIteratorsKt"
                    else
                        "kotlin/jvm/internal/ArrayIteratorKt"' @ [31:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'isPrimitive' @ [31:33] ==> public open fun isPrimitive(p0: (Type..Type?)): Boolean defined in org.jetbrains.kotlin.codegen.AsmUtil[JavaMethodDescriptor]

'method' @ [31:45] ==> val method: CallableMethod defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable[LocalVariableDescriptor]

'owner' @ [31:52] ==> public open val owner: Type defined in org.jetbrains.kotlin.codegen.CallableMethod[DeserializedPropertyDescriptor]

'elementType' @ [31:58] ==> public final val Type.elementType: (Type..Type?)[MyPropertyDescriptor]

'it' @ [35:13] ==> value-parameter it: InstructionAdapter defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable.<anonymous>[ValueParameterDescriptorImpl]

'invokestatic' @ [35:16] ==> public open fun invokestatic(p0: (String..String?), p1: (String..String?), p2: (String..String?), p3: Boolean): Unit defined in org.jetbrains.org.objectweb.asm.commons.InstructionAdapter[JavaMethodDescriptor]

'intrinsicOwner' @ [35:29] ==> val intrinsicOwner: String defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable.<anonymous>[LocalVariableDescriptor]

'methodSignature' @ [35:57] ==> val methodSignature: String defined in org.jetbrains.kotlin.backend.jvm.intrinsics.ArrayIterator.toCallable.<anonymous>[LocalVariableDescriptor]

