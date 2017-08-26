'params' @ [26:12] ==> value-parameter params: List<CapturedParamInfo> defined in org.jetbrains.kotlin.codegen.inline.getNewFieldsToGenerate[ValueParameterDescriptorImpl]

'filter' @ [26:19] ==> public inline fun <T> Iterable<CapturedParamInfo>.filter(predicate: (CapturedParamInfo) -> Boolean): List<CapturedParamInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamInfo

'it' @ [28:9] ==> value-parameter it: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.getNewFieldsToGenerate.<anonymous>[ValueParameterDescriptorImpl]

'lambda' @ [28:12] ==> public final var CapturedParamInfo.lambda: LambdaInfo?[MyPropertyDescriptor]

'map' @ [29:7] ==> public inline fun <T, R> Iterable<CapturedParamInfo>.map(transform: (CapturedParamInfo) -> NewJavaField): List<NewJavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CapturedParamInfo
    <R> -> NewJavaField

'NewJavaField' @ [30:9] ==> public constructor NewJavaField(name: String, type: Type, skip: Boolean) defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[ClassConstructorDescriptorImpl]

'it' @ [30:22] ==> value-parameter it: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.getNewFieldsToGenerate.<anonymous>[ValueParameterDescriptorImpl]

'newFieldName' @ [30:25] ==> public final val CapturedParamInfo.newFieldName: String[MyPropertyDescriptor]

'it' @ [30:39] ==> value-parameter it: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.getNewFieldsToGenerate.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [30:42] ==> public final val type: (Type..Type?) defined in org.jetbrains.kotlin.codegen.inline.CapturedParamInfo[JavaPropertyDescriptor]

'it' @ [30:48] ==> value-parameter it: CapturedParamInfo defined in org.jetbrains.kotlin.codegen.inline.getNewFieldsToGenerate.<anonymous>[ValueParameterDescriptorImpl]

'isSkipInConstructor' @ [30:51] ==> public final val CapturedParamInfo.isSkipInConstructor: Boolean[MyPropertyDescriptor]

'newFields' @ [35:12] ==> value-parameter newFields: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.transformToFieldInfo[ValueParameterDescriptorImpl]

'map' @ [35:22] ==> public inline fun <T, R> Iterable<NewJavaField>.map(transform: (NewJavaField) -> FieldInfo): List<FieldInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewJavaField
    <R> -> FieldInfo

'createForHiddenField' @ [36:19] ==> @NotNull public open fun createForHiddenField(@NotNull owner: Type, @NotNull fieldType: Type, @NotNull fieldName: String): FieldInfo defined in org.jetbrains.kotlin.codegen.FieldInfo[JavaMethodDescriptor]

'lambdaType' @ [36:40] ==> value-parameter lambdaType: Type defined in org.jetbrains.kotlin.codegen.inline.transformToFieldInfo[ValueParameterDescriptorImpl]

'field' @ [36:52] ==> value-parameter field: NewJavaField defined in org.jetbrains.kotlin.codegen.inline.transformToFieldInfo.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [36:58] ==> public final val type: Type defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

'field' @ [36:64] ==> value-parameter field: NewJavaField defined in org.jetbrains.kotlin.codegen.inline.transformToFieldInfo.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [36:70] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

'fields' @ [41:12] ==> value-parameter fields: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.filterSkipped[ValueParameterDescriptorImpl]

'filter' @ [41:19] ==> public inline fun <T> Iterable<NewJavaField>.filter(predicate: (NewJavaField) -> Boolean): List<NewJavaField> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewJavaField

'!' @ [41:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [41:29] ==> value-parameter it: NewJavaField defined in org.jetbrains.kotlin.codegen.inline.filterSkipped.<anonymous>[ValueParameterDescriptorImpl]

'skip' @ [41:32] ==> public final val skip: Boolean defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

'fields' @ [44:76] ==> value-parameter fields: List<NewJavaField> defined in org.jetbrains.kotlin.codegen.inline.toNameTypePair[ValueParameterDescriptorImpl]

'map' @ [44:83] ==> public inline fun <T, R> Iterable<NewJavaField>.map(transform: (NewJavaField) -> Pair<String, Type>): List<Pair<String, Type>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NewJavaField
    <R> -> Pair<String, Type>

'Pair' @ [44:89] ==> public constructor Pair<A : (Any..Any?), B : (Any..Any?)>(p0: (String..String?), p1: (Type..Type?)) defined in com.intellij.openapi.util.Pair[JavaClassConstructorDescriptor]
Inferred types:
    <A : (Any..Any?)> -> String
    <B : (Any..Any?)> -> Type

'it' @ [44:94] ==> value-parameter it: NewJavaField defined in org.jetbrains.kotlin.codegen.inline.toNameTypePair.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [44:97] ==> public final val name: String defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

'it' @ [44:103] ==> value-parameter it: NewJavaField defined in org.jetbrains.kotlin.codegen.inline.toNameTypePair.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [44:106] ==> public final val type: Type defined in org.jetbrains.kotlin.codegen.inline.NewJavaField[PropertyDescriptorImpl]

