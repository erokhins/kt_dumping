'AbstractParameterTablePanel<TypeParameter, IntroduceTypeAliasParameterTablePanel.TypeParameterInfo>' @ [23:52] ==> public constructor AbstractParameterTablePanel<Param, UIParam : AbstractParameterTablePanel.AbstractParameterInfo<TypeParameter>>() defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[ClassConstructorDescriptorImpl]
Inferred types:
    <Param> -> TypeParameter
    <UIParam : AbstractParameterTablePanel.AbstractParameterInfo<Param>> -> TypeParameterInfo

'AbstractParameterTablePanel.AbstractParameterInfo<TypeParameter>' @ [26:9] ==> public constructor AbstractParameterInfo<out Param>(originalParameter: TypeParameter) defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel.AbstractParameterInfo[ClassConstructorDescriptorImpl]
Inferred types:
    <out Param> -> TypeParameter

'originalParameter' @ [26:74] ==> value-parameter originalParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [28:13] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo[PropertyDescriptorImpl]

'originalParameter' @ [28:20] ==> value-parameter originalParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo.<init>[ValueParameterDescriptorImpl]

'name' @ [28:38] ==> public final val name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[PropertyDescriptorImpl]

'originalParameter' @ [31:38] ==> public final val originalParameter: TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo[PropertyDescriptorImpl]

'copy' @ [31:56] ==> public final fun copy(name: String = ..., typeReferenceInfos: Collection<TypeReferenceInfo> = ...): TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.TypeParameter[SimpleFunctionDescriptorImpl]

'name' @ [31:61] ==> public final lateinit var name: String defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo[PropertyDescriptorImpl]

'parameterInfos' @ [35:9] ==> protected final lateinit var parameterInfos: MutableList<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel[PropertyDescriptorImpl]

'parameters' @ [35:26] ==> value-parameter parameters: List<TypeParameter> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.init[ValueParameterDescriptorImpl]

'mapTo' @ [35:37] ==> public inline fun <T, R, C : MutableCollection<in IntroduceTypeAliasParameterTablePanel.TypeParameterInfo>> Iterable<TypeParameter>.mapTo(destination: ArrayList<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo>, transform: (TypeParameter) -> IntroduceTypeAliasParameterTablePanel.TypeParameterInfo): ArrayList<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameter
    <R> -> TypeParameterInfo
    <C : MutableCollection<in R>> -> ArrayList<TypeParameterInfo>

'ArrayList' @ [35:43] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TypeParameterInfo

'super' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel[LazyClassReceiverParameterDescriptor]

'init' @ [36:15] ==> public final fun init(): Unit defined in org.jetbrains.kotlin.idea.refactoring.introduce.ui.AbstractParameterTablePanel[SimpleFunctionDescriptorImpl]

'parameterInfos' @ [42:17] ==> protected final lateinit var parameterInfos: MutableList<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel[PropertyDescriptorImpl]

'filter' @ [42:32] ==> public inline fun <T> Iterable<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo>.filter(predicate: (IntroduceTypeAliasParameterTablePanel.TypeParameterInfo) -> Boolean): List<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo

'it' @ [42:41] ==> value-parameter it: IntroduceTypeAliasParameterTablePanel.TypeParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.<get-selectedTypeParameterInfos>.<anonymous>[ValueParameterDescriptorImpl]

'isEnabled' @ [42:44] ==> public final var isEnabled: Boolean defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo[PropertyDescriptorImpl]

'selectedTypeParameterInfos' @ [45:17] ==> public final val selectedTypeParameterInfos: List<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo> defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel[PropertyDescriptorImpl]

'map' @ [45:44] ==> public inline fun <T, R> Iterable<IntroduceTypeAliasParameterTablePanel.TypeParameterInfo>.map(transform: (IntroduceTypeAliasParameterTablePanel.TypeParameterInfo) -> TypeParameter): List<TypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterInfo
    <R> -> TypeParameter

'it' @ [45:50] ==> value-parameter it: IntroduceTypeAliasParameterTablePanel.TypeParameterInfo defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.<get-selectedTypeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'toParameter' @ [45:53] ==> public open fun toParameter(): TypeParameter defined in org.jetbrains.kotlin.idea.refactoring.introduce.introduceTypeAlias.ui.IntroduceTypeAliasParameterTablePanel.TypeParameterInfo[SimpleFunctionDescriptorImpl]

