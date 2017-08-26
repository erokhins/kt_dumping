'JvmStatic' @ [22:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'when (owner) {
                is MultifileClassFacadeContext -> owner.filePartType
                is DelegatingToPartContext -> owner.implementationOwnerClassType
                else -> null
            }' @ [23:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Type?, entry1: Type?, entry2: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Type?

'owner' @ [23:19] ==> value-parameter owner: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.context.CodegenContextUtil.getImplementationOwnerClassType[ValueParameterDescriptorImpl]

'owner' @ [24:51] ==> value-parameter owner: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.context.CodegenContextUtil.getImplementationOwnerClassType[ValueParameterDescriptorImpl]

'filePartType' @ [24:57] ==> public final val MultifileClassFacadeContext.filePartType: (Type..Type?)[MyPropertyDescriptor]

'owner' @ [25:47] ==> value-parameter owner: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.context.CodegenContextUtil.getImplementationOwnerClassType[ValueParameterDescriptorImpl]

'implementationOwnerClassType' @ [25:53] ==> public final val DelegatingToPartContext.implementationOwnerClassType: Type?[MyPropertyDescriptor]

'JvmStatic' @ [29:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'owner' @ [30:13] ==> value-parameter owner: CodegenContext<*> defined in org.jetbrains.kotlin.codegen.context.CodegenContextUtil.isImplClassOwner[ValueParameterDescriptorImpl]

