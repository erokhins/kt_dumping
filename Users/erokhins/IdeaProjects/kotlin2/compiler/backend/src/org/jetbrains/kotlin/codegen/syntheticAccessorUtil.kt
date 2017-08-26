'' @ [23:11] ==> private constructor FieldAccessorKind(suffix: String) defined in org.jetbrains.kotlin.codegen.FieldAccessorKind[ClassConstructorDescriptorImpl]

'' @ [24:23] ==> private constructor FieldAccessorKind(suffix: String) defined in org.jetbrains.kotlin.codegen.FieldAccessorKind[ClassConstructorDescriptorImpl]

'' @ [25:21] ==> private constructor FieldAccessorKind(suffix: String) defined in org.jetbrains.kotlin.codegen.FieldAccessorKind[ClassConstructorDescriptorImpl]

'suffix' @ [27:31] ==> public final val suffix: String defined in org.jetbrains.kotlin.codegen.FieldAccessorKind[PropertyDescriptorImpl]

'?:' @ [31:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'getJvmName' @ [31:25] ==> @Nullable public open fun getJvmName(@NotNull p0: Annotated): String? defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'this' @ [31:36] ==> <this> defined in org.jetbrains.kotlin.codegen.getJvmName[ReceiverParameterDescriptorImpl]

'name' @ [31:45] ==> public final val CallableMemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [31:50] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'when (descriptor) {
        is ConstructorDescriptor ->
            return "will be ignored"
        is SimpleFunctionDescriptor ->
            descriptor.getJvmName()
        is PropertyDescriptor ->
            descriptor.getJvmName() + "$" + accessorKind
        else ->
            throw UnsupportedOperationException("Do not know how to create accessor for descriptor " + descriptor)
    }' @ [35:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'descriptor' @ [35:24] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'descriptor' @ [39:13] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'getJvmName' @ [39:24] ==> private fun CallableMemberDescriptor.getJvmName(): String defined in org.jetbrains.kotlin.codegen in file syntheticAccessorUtil.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [41:13] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'getJvmName' @ [41:24] ==> private fun CallableMemberDescriptor.getJvmName(): String defined in org.jetbrains.kotlin.codegen in file syntheticAccessorUtil.kt[SimpleFunctionDescriptorImpl]

'accessorKind' @ [41:45] ==> value-parameter accessorKind: FieldAccessorKind defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [43:19] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'+' @ [43:49] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [43:104] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'if (superCallDescriptor == null) suffix else "$suffix\$s${superCallDescriptor.name.asString().hashCode()}"' @ [46:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'superCallDescriptor' @ [46:16] ==> value-parameter superCallDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'suffix' @ [46:45] ==> val suffix: String defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[LocalVariableDescriptor]

'suffix' @ [46:59] ==> val suffix: String defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[LocalVariableDescriptor]

'superCallDescriptor' @ [46:70] ==> value-parameter superCallDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.codegen.getAccessorNameSuffix[ValueParameterDescriptorImpl]

'name' @ [46:90] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [46:95] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'hashCode' @ [46:106] ==> public open fun hashCode(): Int defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

