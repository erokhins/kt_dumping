'unsubstitutedMemberScope' @ [42:5] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'getContributedFunctions' @ [43:14] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [43:43] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [43:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ValueParameterDescriptorImpl]

'FROM_IDE' @ [43:78] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [44:14] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.firstOrNull(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'it' @ [44:28] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [44:31] ==> public final val SimpleFunctionDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'this' @ [44:56] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ReceiverParameterDescriptorImpl]

'it' @ [44:64] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [44:67] ==> public final val SimpleFunctionDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [44:105] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'invoke' @ [44:120] ==> public abstract operator fun invoke(p1: FunctionDescriptor): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [44:127] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [45:15] ==> @InlineOnly public inline fun <T, R> SimpleFunctionDescriptor.let(block: (SimpleFunctionDescriptor) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor
    <R> -> Nothing

'it' @ [45:28] ==> value-parameter it: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction.<anonymous>[ValueParameterDescriptorImpl]

'if (checkSuperClasses) getSuperClassOrAny().findDeclaredFunction(name, checkSuperClasses, filter) else null' @ [47:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionDescriptor?, elseBranch: FunctionDescriptor?): FunctionDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionDescriptor?

'checkSuperClasses' @ [47:16] ==> value-parameter checkSuperClasses: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ValueParameterDescriptorImpl]

'getSuperClassOrAny' @ [47:35] ==> public fun ClassDescriptor.getSuperClassOrAny(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'findDeclaredFunction' @ [47:56] ==> public tailrec fun ClassDescriptor.findDeclaredFunction(name: String, checkSuperClasses: Boolean, filter: (FunctionDescriptor) -> Boolean): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.actions.generate[SimpleFunctionDescriptorImpl]

'name' @ [47:77] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ValueParameterDescriptorImpl]

'checkSuperClasses' @ [47:83] ==> value-parameter checkSuperClasses: Boolean defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ValueParameterDescriptorImpl]

'filter' @ [47:102] ==> value-parameter filter: (FunctionDescriptor) -> Boolean defined in org.jetbrains.kotlin.idea.actions.generate.findDeclaredFunction[ValueParameterDescriptorImpl]

'ArrayList' @ [51:12] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedDeclaration

'apply' @ [51:44] ==> @InlineOnly public inline fun <T> ArrayList<KtNamedDeclaration>.apply(block: ArrayList<KtNamedDeclaration>.() -> Unit): ArrayList<KtNamedDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<KtNamedDeclaration>

'classOrObject' @ [52:9] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember[ValueParameterDescriptorImpl]

'primaryConstructorParameters' @ [52:23] ==> public final val KtClassOrObject.primaryConstructorParameters: List<KtParameter>[MyPropertyDescriptor]

'filterTo' @ [52:52] ==> public inline fun <T, C : MutableCollection<in KtParameter>> Iterable<KtParameter>.filterTo(destination: ArrayList<KtNamedDeclaration>, predicate: (KtParameter) -> Boolean): ArrayList<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter
    <C : MutableCollection<in T>> -> ArrayList<KtNamedDeclaration>

'this' @ [52:61] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [52:69] ==> value-parameter it: KtParameter defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'hasValOrVar' @ [52:72] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'classOrObject' @ [53:9] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember[ValueParameterDescriptorImpl]

'declarations' @ [53:23] ==> public final val KtClassOrObject.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'filterIsInstance' @ [53:36] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtProperty> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtProperty

'filterTo' @ [53:67] ==> public inline fun <T, C : MutableCollection<in KtProperty>> Iterable<KtProperty>.filterTo(destination: ArrayList<KtNamedDeclaration>, predicate: (KtProperty) -> Boolean): ArrayList<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtProperty
    <C : MutableCollection<in T>> -> ArrayList<KtNamedDeclaration>

'this' @ [53:76] ==> <this> defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>[ReceiverParameterDescriptorImpl]

'it' @ [54:30] ==> value-parameter it: KtProperty defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [54:33] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'when (descriptor) {
                is ValueParameterDescriptor -> true
                is PropertyDescriptor -> descriptor.getter?.isDefault ?: true
                else -> false
            }' @ [55:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [55:19] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [57:42] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getter' @ [57:53] ==> public abstract val getter: PropertyGetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'isDefault' @ [57:61] ==> public final val PropertyGetterDescriptor.isDefault: Boolean[MyPropertyDescriptor]

'filter' @ [61:7] ==> public inline fun <T> Iterable<KtNamedDeclaration>.filter(predicate: (KtNamedDeclaration) -> Boolean): List<KtNamedDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtNamedDeclaration

'KotlinNameSuggester' @ [62:9] ==> public object KotlinNameSuggester defined in org.jetbrains.kotlin.idea.core[FakeCallableDescriptorForObject]

'isIdentifier' @ [62:29] ==> public final fun isIdentifier(name: String?): Boolean defined in org.jetbrains.kotlin.idea.core.KotlinNameSuggester[DeserializedSimpleFunctionDescriptor]

'it' @ [62:42] ==> value-parameter it: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.actions.generate.getPropertiesToUseInGeneratedMember.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [62:45] ==> public final val KtNamedDeclaration.name: String?[MyPropertyDescriptor]

'quoteIfNeeded' @ [62:51] ==> public fun String.quoteIfNeeded(): String defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'IdeDescriptorRenderers' @ [66:31] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_SHORT_NAMES_IN_TYPES' @ [66:54] ==> @field:JvmField public final val SOURCE_CODE_SHORT_NAMES_IN_TYPES: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'withOptions' @ [66:87] ==> public final fun withOptions(changeOptions: DescriptorRendererOptions.() -> Unit): DescriptorRenderer defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'modifiers' @ [67:5] ==> public abstract var modifiers: Set<DescriptorRendererModifier> defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'emptySet' @ [67:17] ==> public fun <T> emptySet(): Set<DescriptorRendererModifier> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorRendererModifier

'startFromName' @ [68:5] ==> public abstract var startFromName: Boolean defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'parameterNameRenderingPolicy' @ [69:5] ==> public abstract var parameterNameRenderingPolicy: ParameterNameRenderingPolicy defined in org.jetbrains.kotlin.renderer.DescriptorRendererOptions[DeserializedPropertyDescriptor]

'NONE' @ [69:65] ==> enum entry NONE defined in org.jetbrains.kotlin.renderer.ParameterNameRenderingPolicy[FakeCallableDescriptorForObject]

'getApplication' @ [73:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [73:45] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'descriptors' @ [75:25] ==> value-parameter vararg descriptors: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite[ValueParameterDescriptorImpl]

'joinToString' @ [75:37] ==> public fun <T> Array<out FunctionDescriptor>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((FunctionDescriptor) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'MEMBER_RENDERER' @ [75:77] ==> private val MEMBER_RENDERER: DescriptorRenderer defined in org.jetbrains.kotlin.idea.actions.generate in file utils.kt[PropertyDescriptorImpl]

'render' @ [75:93] ==> public abstract fun render(declarationDescriptor: DeclarationDescriptor): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'it' @ [75:100] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite.<anonymous>[ValueParameterDescriptorImpl]

'functionsText' @ [76:31] ==> val functionsText: String defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite[LocalVariableDescriptor]

'targetClass' @ [76:78] ==> value-parameter targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite[ValueParameterDescriptorImpl]

'name' @ [76:90] ==> public final val KtClass.name: String?[MyPropertyDescriptor]

'==' @ [77:12] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'showYesNoDialog' @ [77:21] ==> @Messages.YesNoResult public open fun showYesNoDialog(@Nullable p0: Project?, p1: (String..String?), @NotNull @Nls p2: String, @Nullable p3: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'targetClass' @ [77:37] ==> value-parameter targetClass: KtClass defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite[ValueParameterDescriptorImpl]

'project' @ [77:49] ==> public final val KtClass.project: Project[MyPropertyDescriptor]

'message' @ [77:58] ==> val message: String defined in org.jetbrains.kotlin.idea.actions.generate.confirmMemberRewrite[LocalVariableDescriptor]

'message' @ [78:55] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.codeInsight.CodeInsightBundle[JavaMethodDescriptor]

'getQuestionIcon' @ [79:46] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'YES' @ [79:77] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'OverrideMemberChooserObject' @ [83:12] ==> public companion object defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject[FakeCallableDescriptorForObject]

'create' @ [84:14] ==> public final fun create(project: Project, descriptor: CallableMemberDescriptor, immediateSuper: CallableMemberDescriptor, bodyType: OverrideMemberChooserObject.BodyType, preferConstructorParameter: Boolean = ...): OverrideMemberChooserObject defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.Companion[DeserializedSimpleFunctionDescriptor]

'project' @ [84:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.generateFunctionSkeleton[ValueParameterDescriptorImpl]

'descriptor' @ [84:30] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.generateFunctionSkeleton[ValueParameterDescriptorImpl]

'descriptor' @ [84:42] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.actions.generate.generateFunctionSkeleton[ValueParameterDescriptorImpl]

'OverrideMemberChooserObject' @ [84:54] ==> public companion object defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject[FakeCallableDescriptorForObject]

'EMPTY' @ [84:91] ==> public object EMPTY : OverrideMemberChooserObject.BodyType defined in org.jetbrains.kotlin.idea.core.overrideImplement.OverrideMemberChooserObject.BodyType[FakeCallableDescriptorForObject]

'generateMember' @ [85:14] ==> public fun OverrideMemberChooserObject.generateMember(project: Project, copyDoc: Boolean): KtCallableDeclaration defined in org.jetbrains.kotlin.idea.core.overrideImplement[DeserializedSimpleFunctionDescriptor]

'project' @ [85:29] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.actions.generate.generateFunctionSkeleton[ValueParameterDescriptorImpl]

