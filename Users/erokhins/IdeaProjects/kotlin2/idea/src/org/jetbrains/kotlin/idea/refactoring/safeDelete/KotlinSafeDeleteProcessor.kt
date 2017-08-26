'JavaSafeDeleteProcessor' @ [64:35] ==> public constructor JavaSafeDeleteProcessor() defined in com.intellij.refactoring.safeDelete.JavaSafeDeleteProcessor[JavaClassConstructorDescriptor]

'getValue' @ [68:20] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T defined in org.jetbrains.kotlin.psi.NotNullableUserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [68:52] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'getValue' @ [70:65] ==> public final operator fun getValue(thisRef: R, desc: KProperty<*>): T? defined in org.jetbrains.kotlin.psi.UserDataProperty[DeserializedSimpleFunctionDescriptor]

'create' @ [70:86] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'element' @ [73:65] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.handlesElement[ValueParameterDescriptorImpl]

'canDeleteElement' @ [73:73] ==> public fun PsiElement.canDeleteElement(): Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'SmartSet' @ [78:25] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [78:34] ==> @JvmStatic public final fun <T> create(): SmartSet<PsiElement> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'deleteSet' @ [79:9] ==> val deleteSet: SmartSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[LocalVariableDescriptor]

'addAll' @ [79:19] ==> public fun <T> MutableCollection<in PsiElement>.addAll(elements: Array<out PsiElement>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'allElementsToDelete' @ [79:26] ==> value-parameter allElementsToDelete: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'Condition' @ [81:39] ==> public fun <T : (Any..Any?)> Condition(function: ((PsiElement..PsiElement?)) -> Boolean): Condition<PsiElement> defined in com.intellij.openapi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> PsiElement

'it' @ [82:17] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.getIgnoranceCondition.<anonymous>[ValueParameterDescriptorImpl]

'deleteSet' @ [83:13] ==> val deleteSet: SmartSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[LocalVariableDescriptor]

'any' @ [83:23] ==> public inline fun <T> Iterable<(PsiElement..PsiElement?)>.any(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'isInside' @ [83:64] ==> public open fun isInside(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Boolean defined in com.intellij.refactoring.safeDelete.JavaSafeDeleteProcessor[JavaMethodDescriptor]

'it' @ [83:73] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.getIgnoranceCondition.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [83:77] ==> value-parameter element: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.getIgnoranceCondition.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unwrapped' @ [83:85] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'NonCodeUsageSearchInfo' @ [86:50] ==> public constructor NonCodeUsageSearchInfo(p0: (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.safeDelete.NonCodeUsageSearchInfo[JavaClassConstructorDescriptor]

'getIgnoranceCondition' @ [86:73] ==> local final fun getIgnoranceCondition(): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [86:98] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.getSearchInfo[ValueParameterDescriptorImpl]

'if (declaration is KtParameter) declaration.withHeaderImplementations() else listOf(declaration)' @ [89:36] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<KtDeclaration>, elseBranch: List<KtDeclaration>): List<KtDeclaration>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<KtDeclaration>

'declaration' @ [89:40] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences[ValueParameterDescriptorImpl]

'declaration' @ [89:68] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences[ValueParameterDescriptorImpl]

'withHeaderImplementations' @ [89:80] ==> internal fun KtDeclaration.withHeaderImplementations(): List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [89:113] ==> public fun <T> listOf(element: KtDeclaration): List<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'declaration' @ [89:120] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences[ValueParameterDescriptorImpl]

'elementsToSearch' @ [90:20] ==> val elementsToSearch: List<KtDeclaration> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences[LocalVariableDescriptor]

'asSequence' @ [90:37] ==> public fun <T> Iterable<KtDeclaration>.asSequence(): Sequence<KtDeclaration> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'flatMap' @ [90:50] ==> public fun <T, R> Sequence<KtDeclaration>.flatMap(transform: (KtDeclaration) -> Sequence<(PsiReference..PsiReference?)>): Sequence<(PsiReference..PsiReference?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration
    <R> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'KotlinReferencesSearchParameters' @ [91:40] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[DeserializedClassConstructorDescriptor]

'it' @ [92:25] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [93:25] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences.<anonymous>[ValueParameterDescriptorImpl]

'useScope' @ [93:28] ==> public final val KtDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'KotlinReferencesSearchOptions' @ [94:41] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'search' @ [96:34] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'searchParameters' @ [96:41] ==> val searchParameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [97:26] ==> public fun <T> Iterable<(PsiReference..PsiReference?)>.asSequence(): Sequence<(PsiReference..PsiReference?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'filterNot' @ [98:26] ==> public fun <T> Sequence<(PsiReference..PsiReference?)>.filterNot(predicate: ((PsiReference..PsiReference?)) -> Boolean): Sequence<(PsiReference..PsiReference?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'getIgnoranceCondition' @ [98:51] ==> local final fun getIgnoranceCondition(): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'value' @ [98:75] ==> public abstract fun value(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.openapi.util.Condition[JavaMethodDescriptor]

'reference' @ [98:81] ==> value-parameter reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.searchKotlinDeclarationReferences.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [98:91] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameter' @ [103:33] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[ValueParameterDescriptorImpl]

'ownerFunction' @ [103:43] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'parameter' @ [104:25] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[ValueParameterDescriptorImpl]

'parameterIndex' @ [104:35] ==> public fun PsiElement.parameterIndex(): Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'searchKotlinDeclarationReferences' @ [105:31] ==> local final fun searchKotlinDeclarationReferences(declaration: KtDeclaration): Sequence<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'ownerFunction' @ [105:65] ==> val ownerFunction: KtFunction defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'reference' @ [106:30] ==> val reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'element' @ [106:40] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callee' @ [107:36] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'getResolvedCall' @ [107:43] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'callee' @ [107:59] ==> val callee: KtExpression defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'analyze' @ [107:66] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [108:43] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'candidateDescriptor' @ [108:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.candidateDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'valueParameters' @ [108:76] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [108:92] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'index' @ [108:102] ==> val index: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'resolvedCall' @ [109:40] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'valueArguments' @ [109:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'parameterDescriptor' @ [109:68] ==> val parameterDescriptor: ValueParameterDescriptor defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'resolvedArgument' @ [110:33] ==> val resolvedArgument: ResolvedValueArgument defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'arguments' @ [110:50] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [110:60] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<KtValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtValueArgument

'arguments' @ [111:21] ==> val arguments: List<KtValueArgument> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'isEmpty' @ [111:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'usages' @ [113:17] ==> value-parameter usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'add' @ [113:24] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'SafeDeleteValueArgumentListUsageInfo' @ [113:28] ==> public constructor SafeDeleteValueArgumentListUsageInfo(parameter: PsiElement, vararg valueArguments: KtValueArgument) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteValueArgumentListUsageInfo[ClassConstructorDescriptorImpl]

'parameter' @ [113:65] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[ValueParameterDescriptorImpl]

'arguments' @ [113:77] ==> val arguments: List<KtValueArgument> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinParameterUsages[LocalVariableDescriptor]

'toTypedArray' @ [113:87] ==> public inline fun <reified T> Collection<KtValueArgument>.toTypedArray(): Array<KtValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtValueArgument

'searchKotlinDeclarationReferences' @ [118:13] ==> local final fun searchKotlinDeclarationReferences(declaration: KtDeclaration): Sequence<PsiReference> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'declaration' @ [118:47] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages[ValueParameterDescriptorImpl]

'mapNotNullTo' @ [118:60] ==> public inline fun <T, R : Any, C : MutableCollection<in UsageInfo>> Sequence<PsiReference>.mapNotNullTo(destination: MutableList<UsageInfo>, transform: (PsiReference) -> UsageInfo?): MutableList<UsageInfo> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference
    <R : Any> -> UsageInfo
    <C : MutableCollection<in R>> -> MutableList<UsageInfo>

'usages' @ [118:73] ==> value-parameter usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'reference' @ [119:34] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [119:44] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'refElement' @ [120:17] ==> val refElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages.<anonymous>[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [120:28] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'let' @ [120:75] ==> @InlineOnly public inline fun <T, R> KtImportDirective.let(block: (KtImportDirective) -> SafeDeleteImportDirectiveUsageInfo): SafeDeleteImportDirectiveUsageInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> SafeDeleteImportDirectiveUsageInfo

'SafeDeleteImportDirectiveUsageInfo' @ [121:21] ==> public constructor SafeDeleteImportDirectiveUsageInfo(importDirective: KtImportDirective, declaration: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo[ClassConstructorDescriptorImpl]

'importDirective' @ [121:56] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [121:73] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'SafeDeleteReferenceSimpleDeleteUsageInfo' @ [122:22] ==> public constructor SafeDeleteReferenceSimpleDeleteUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: Boolean) defined in com.intellij.refactoring.safeDelete.usageInfo.SafeDeleteReferenceSimpleDeleteUsageInfo[JavaClassConstructorDescriptor]

'refElement' @ [122:63] ==> val refElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages.<anonymous>[LocalVariableDescriptor]

'declaration' @ [122:75] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages[ValueParameterDescriptorImpl]

'declaration' @ [125:17] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages[ValueParameterDescriptorImpl]

'findKotlinParameterUsages' @ [126:17] ==> local final fun findKotlinParameterUsages(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'declaration' @ [126:43] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages[ValueParameterDescriptorImpl]

'getSearchInfo' @ [129:20] ==> local final fun getSearchInfo(element: PsiElement): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'declaration' @ [129:34] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findKotlinDeclarationUsages[ValueParameterDescriptorImpl]

'ArrayList' @ [133:30] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'super' @ [134:30] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor[LazyClassReceiverParameterDescriptor]

'findUsages' @ [134:36] ==> @Nullable public open fun findUsages(@NotNull p0: PsiElement, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>), @NotNull p2: (MutableList<(UsageInfo..UsageInfo?)>..List<(UsageInfo..UsageInfo?)>)): NonCodeUsageSearchInfo? defined in com.intellij.refactoring.safeDelete.JavaSafeDeleteProcessor[JavaMethodDescriptor]

'element' @ [134:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'allElementsToDelete' @ [134:56] ==> value-parameter allElementsToDelete: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'javaUsages' @ [134:77] ==> val javaUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'javaUsages' @ [136:13] ==> val javaUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'filterIsInstance' @ [136:24] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<SafeDeleteOverridingMethodUsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> SafeDeleteOverridingMethodUsageInfo

'mapNotNullTo' @ [136:80] ==> public inline fun <T, R : Any, C : MutableCollection<in PsiElement>> Iterable<SafeDeleteOverridingMethodUsageInfo>.mapNotNullTo(destination: SmartSet<PsiElement>, transform: (SafeDeleteOverridingMethodUsageInfo) -> PsiElement?): SmartSet<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SafeDeleteOverridingMethodUsageInfo
    <R : Any> -> PsiElement
    <C : MutableCollection<in R>> -> SmartSet<PsiElement>

'deleteSet' @ [136:93] ==> val deleteSet: SmartSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[LocalVariableDescriptor]

'it' @ [136:106] ==> value-parameter it: SafeDeleteOverridingMethodUsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [136:109] ==> public final val SafeDeleteOverridingMethodUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'getIgnoranceCondition' @ [138:38] ==> local final fun getIgnoranceCondition(): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'javaUsages' @ [140:13] ==> val javaUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'mapNotNullTo' @ [140:24] ==> public inline fun <T, R : Any, C : MutableCollection<in UsageInfo>> Iterable<UsageInfo>.mapNotNullTo(destination: MutableList<UsageInfo>, transform: (UsageInfo) -> UsageInfo?): MutableList<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo
    <R : Any> -> UsageInfo
    <C : MutableCollection<in R>> -> MutableList<UsageInfo>

'usages' @ [140:37] ==> value-parameter usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'when (usageInfo) {
                    is SafeDeleteOverridingMethodUsageInfo ->
                        usageInfo.smartPointer.element?.let { usageElement ->
                            KotlinSafeDeleteOverridingUsageInfo(usageElement, usageInfo.referencedElement)
                        }

                    is SafeDeleteOverrideAnnotation ->
                        usageInfo.smartPointer.element?.let { usageElement ->
                            if (usageElement.toLightMethods().all { method -> method.findSuperMethods().isEmpty() }) {
                                KotlinSafeDeleteOverrideAnnotation(usageElement, usageInfo.referencedElement)
                            }
                            else null
                        }

                    is SafeDeleteReferenceJavaDeleteUsageInfo ->
                        usageInfo.element?.let { usageElement ->
                            when {
                                usageElement.getNonStrictParentOfType<KtValueArgumentName>() != null -> null
                                ignoranceCondition.value(usageElement) -> null
                                else -> {
                                    usageElement.getNonStrictParentOfType<KtImportDirective>()?.let { importDirective ->
                                        SafeDeleteImportDirectiveUsageInfo(importDirective, element)
                                    } ?: usageElement.getParentOfTypeAndBranch<KtSuperTypeEntry> { typeReference }?.let {
                                        if (element is PsiClass && element.isInterface) SafeDeleteSuperTypeUsageInfo(it, element) else usageInfo
                                    } ?: if (forceReferencedElementUnwrapping) {
                                        SafeDeleteReferenceJavaDeleteUsageInfo(usageElement, element.unwrapped, usageInfo.isSafeDelete)
                                    } else usageInfo
                                }
                            }
                        }

                    else -> usageInfo
                }' @ [141:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UsageInfo?, entry1: UsageInfo?, entry2: UsageInfo?, entry3: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageInfo?

'usageInfo' @ [141:23] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'usageInfo' @ [143:25] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'smartPointer' @ [143:35] ==> public final val SafeDeleteOverridingMethodUsageInfo.smartPointer: SmartPsiElementPointer<*>[MyPropertyDescriptor]

'element' @ [143:48] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<out (PsiElement..PsiElement?)>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)

'let' @ [143:57] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> KotlinSafeDeleteOverridingUsageInfo): KotlinSafeDeleteOverridingUsageInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KotlinSafeDeleteOverridingUsageInfo

'KotlinSafeDeleteOverridingUsageInfo' @ [144:29] ==> public constructor KotlinSafeDeleteOverridingUsageInfo(overridingElement: PsiElement, superElement: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteOverridingUsageInfo[ClassConstructorDescriptorImpl]

'usageElement' @ [144:65] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'usageInfo' @ [144:79] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'referencedElement' @ [144:89] ==> public final val SafeDeleteOverridingMethodUsageInfo.referencedElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'usageInfo' @ [148:25] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'smartPointer' @ [148:35] ==> public final val SafeDeleteOverrideAnnotation.smartPointer: SmartPsiElementPointer<*>[MyPropertyDescriptor]

'element' @ [148:48] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<out (PsiElement..PsiElement?)>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> Captured(*)

'let' @ [148:57] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> KotlinSafeDeleteOverrideAnnotation?): KotlinSafeDeleteOverrideAnnotation? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> KotlinSafeDeleteOverrideAnnotation?

'if (usageElement.toLightMethods().all { method -> method.findSuperMethods().isEmpty() }) {
                                KotlinSafeDeleteOverrideAnnotation(usageElement, usageInfo.referencedElement)
                            }
                            else null' @ [149:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinSafeDeleteOverrideAnnotation?, elseBranch: KotlinSafeDeleteOverrideAnnotation?): KotlinSafeDeleteOverrideAnnotation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinSafeDeleteOverrideAnnotation?

'usageElement' @ [149:33] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'toLightMethods' @ [149:46] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'all' @ [149:63] ==> public inline fun <T> Iterable<PsiMethod>.all(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'method' @ [149:79] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'findSuperMethods' @ [149:86] ==> @NotNull public abstract fun findSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'isEmpty' @ [149:105] ==> @InlineOnly public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'KotlinSafeDeleteOverrideAnnotation' @ [150:33] ==> public constructor KotlinSafeDeleteOverrideAnnotation(element: PsiElement, referencedElement: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteOverrideAnnotation[ClassConstructorDescriptorImpl]

'usageElement' @ [150:68] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'usageInfo' @ [150:82] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'referencedElement' @ [150:92] ==> public final val SafeDeleteOverrideAnnotation.referencedElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'usageInfo' @ [156:25] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [156:35] ==> public final val SafeDeleteReferenceJavaDeleteUsageInfo.element: PsiElement?[MyPropertyDescriptor]

'let' @ [156:44] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> SafeDeleteReferenceUsageInfo?): SafeDeleteReferenceUsageInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> SafeDeleteReferenceUsageInfo?

'when {
                                usageElement.getNonStrictParentOfType<KtValueArgumentName>() != null -> null
                                ignoranceCondition.value(usageElement) -> null
                                else -> {
                                    usageElement.getNonStrictParentOfType<KtImportDirective>()?.let { importDirective ->
                                        SafeDeleteImportDirectiveUsageInfo(importDirective, element)
                                    } ?: usageElement.getParentOfTypeAndBranch<KtSuperTypeEntry> { typeReference }?.let {
                                        if (element is PsiClass && element.isInterface) SafeDeleteSuperTypeUsageInfo(it, element) else usageInfo
                                    } ?: if (forceReferencedElementUnwrapping) {
                                        SafeDeleteReferenceJavaDeleteUsageInfo(usageElement, element.unwrapped, usageInfo.isSafeDelete)
                                    } else usageInfo
                                }
                            }' @ [157:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SafeDeleteReferenceUsageInfo?, entry1: SafeDeleteReferenceUsageInfo?, entry2: SafeDeleteReferenceUsageInfo?): SafeDeleteReferenceUsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SafeDeleteReferenceUsageInfo?

'usageElement' @ [158:33] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [158:46] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtValueArgumentName? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtValueArgumentName

'ignoranceCondition' @ [159:33] ==> val ignoranceCondition: Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'value' @ [159:52] ==> public abstract fun value(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.openapi.util.Condition[JavaMethodDescriptor]

'usageElement' @ [159:58] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'usageElement' @ [161:37] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [161:50] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtImportDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtImportDirective

'let' @ [161:97] ==> @InlineOnly public inline fun <T, R> KtImportDirective.let(block: (KtImportDirective) -> SafeDeleteImportDirectiveUsageInfo): SafeDeleteImportDirectiveUsageInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtImportDirective
    <R> -> SafeDeleteImportDirectiveUsageInfo

'SafeDeleteImportDirectiveUsageInfo' @ [162:41] ==> public constructor SafeDeleteImportDirectiveUsageInfo(importDirective: KtImportDirective, declaration: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteImportDirectiveUsageInfo[ClassConstructorDescriptorImpl]

'importDirective' @ [162:76] ==> value-parameter importDirective: KtImportDirective defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [162:93] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'usageElement' @ [163:42] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getParentOfTypeAndBranch' @ [163:55] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtSuperTypeEntry.() -> PsiElement?): KtSuperTypeEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeEntry

'typeReference' @ [163:100] ==> public final val KtSuperTypeEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [163:117] ==> @InlineOnly public inline fun <T, R> KtSuperTypeEntry.let(block: (KtSuperTypeEntry) -> SafeDeleteReferenceUsageInfo): SafeDeleteReferenceUsageInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeEntry
    <R> -> SafeDeleteReferenceUsageInfo

'if (element is PsiClass && element.isInterface) SafeDeleteSuperTypeUsageInfo(it, element) else usageInfo' @ [164:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SafeDeleteReferenceUsageInfo, elseBranch: SafeDeleteReferenceUsageInfo): SafeDeleteReferenceUsageInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SafeDeleteReferenceUsageInfo

'element' @ [164:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'element' @ [164:68] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'isInterface' @ [164:76] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'SafeDeleteSuperTypeUsageInfo' @ [164:89] ==> public constructor SafeDeleteSuperTypeUsageInfo(entry: KtSuperTypeEntry, referencedElement: PsiElement) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteSuperTypeUsageInfo[ClassConstructorDescriptorImpl]

'it' @ [164:118] ==> value-parameter it: KtSuperTypeEntry defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [164:122] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'usageInfo' @ [164:136] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'if (forceReferencedElementUnwrapping) {
                                        SafeDeleteReferenceJavaDeleteUsageInfo(usageElement, element.unwrapped, usageInfo.isSafeDelete)
                                    } else usageInfo' @ [165:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SafeDeleteReferenceJavaDeleteUsageInfo, elseBranch: SafeDeleteReferenceJavaDeleteUsageInfo): SafeDeleteReferenceJavaDeleteUsageInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SafeDeleteReferenceJavaDeleteUsageInfo

'forceReferencedElementUnwrapping' @ [165:46] ==> value-parameter forceReferencedElementUnwrapping: Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'SafeDeleteReferenceJavaDeleteUsageInfo' @ [166:41] ==> public constructor SafeDeleteReferenceJavaDeleteUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: Boolean) defined in com.intellij.refactoring.safeDelete.usageInfo.SafeDeleteReferenceJavaDeleteUsageInfo[JavaClassConstructorDescriptor]

'usageElement' @ [166:80] ==> value-parameter usageElement: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [166:94] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'unwrapped' @ [166:102] ==> public val PsiElement.unwrapped: PsiElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'usageInfo' @ [166:113] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'isSafeDelete' @ [166:123] ==> public final val SafeDeleteReferenceJavaDeleteUsageInfo.isSafeDelete: Boolean[MyPropertyDescriptor]

'usageInfo' @ [167:44] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'usageInfo' @ [172:29] ==> value-parameter usageInfo: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'searchInfo' @ [176:20] ==> val searchInfo: NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'elements' @ [180:17] ==> value-parameter elements: Sequence<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'mapNotNull' @ [181:26] ==> public fun <T, R : Any> Sequence<PsiElement>.mapNotNull(transform: (PsiElement) -> Condition<(PsiElement..PsiElement?)>?): Sequence<Condition<(PsiElement..PsiElement?)>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R : Any> -> Condition<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>

'findUsagesByJavaProcessor' @ [181:50] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [181:76] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'insideDeletedCondition' @ [181:92] ==> public final val NonCodeUsageSearchInfo.insideDeletedCondition: (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?)[MyPropertyDescriptor]

'fold' @ [182:26] ==> public inline fun <T, R> Sequence<Condition<(PsiElement..PsiElement?)>>.fold(initial: (Condition<PsiElement>..Condition<PsiElement>?), operation: (acc: (Condition<PsiElement>..Condition<PsiElement>?), Condition<(PsiElement..PsiElement?)>) -> (Condition<PsiElement>..Condition<PsiElement>?)): (Condition<PsiElement>..Condition<PsiElement>?) defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Condition<(com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)>
    <R> -> (com.intellij.openapi.util.Condition<com.intellij.psi.PsiElement>..com.intellij.openapi.util.Condition<com.intellij.psi.PsiElement>?)

'insideDeleted' @ [182:31] ==> value-parameter insideDeleted: Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'or' @ [182:85] ==> public open fun <T : (Any..Any?)> or(p0: (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?), p1: (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?)): (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?) defined in com.intellij.openapi.util.Conditions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'condition1' @ [182:88] ==> value-parameter condition1: Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'condition2' @ [182:100] ==> value-parameter condition2: Condition<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor.<anonymous>[ValueParameterDescriptorImpl]

'ktDeclaration' @ [185:33] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'toLightElements' @ [185:47] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'lightElements' @ [186:17] ==> val lightElements: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'isEmpty' @ [186:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'findKotlinDeclarationUsages' @ [187:24] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [187:52] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'NonCodeUsageSearchInfo' @ [189:20] ==> public constructor NonCodeUsageSearchInfo(p0: (Condition<(PsiElement..PsiElement?)>..Condition<(PsiElement..PsiElement?)>?), p1: (PsiElement..PsiElement?)) defined in com.intellij.refactoring.safeDelete.NonCodeUsageSearchInfo[JavaClassConstructorDescriptor]

'findUsagesByJavaProcessor' @ [190:21] ==> local final fun findUsagesByJavaProcessor(elements: Sequence<PsiElement>, insideDeleted: Condition<PsiElement>): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'lightElements' @ [191:29] ==> val lightElements: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[LocalVariableDescriptor]

'asSequence' @ [191:43] ==> public fun <T> Iterable<PsiNamedElement>.asSequence(): Sequence<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'getIgnoranceCondition' @ [192:29] ==> local final fun getIgnoranceCondition(): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'ktDeclaration' @ [194:21] ==> value-parameter ktDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findUsagesByJavaProcessor[ValueParameterDescriptorImpl]

'parameter' @ [199:25] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [199:35] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtTypeParameterListOwner? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtTypeParameterListOwner

'owner' @ [201:33] ==> val owner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'typeParameters' @ [201:39] ==> public final val KtTypeParameterListOwner.typeParameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'parameterList' @ [202:34] ==> val parameterList: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'indexOf' @ [202:48] ==> public abstract fun indexOf(element: (KtTypeParameter..KtTypeParameter?)): Int defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameter' @ [202:56] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[ValueParameterDescriptorImpl]

'iterator' @ [204:31] ==> public abstract fun iterator(): MutableIterator<(PsiReference..PsiReference?)> defined in com.intellij.util.Query[DeserializedSimpleFunctionDescriptor]

'search' @ [204:48] ==> @NotNull public open fun search(@NotNull p0: PsiElement): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'owner' @ [204:55] ==> val owner: KtTypeParameterListOwner defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'reference' @ [205:21] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'reference' @ [207:41] ==> val reference: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'element' @ [207:51] ==> public final val KtReference.element: KtElement[MyPropertyDescriptor]

'referencedElement' @ [209:31] ==> val referencedElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [209:49] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtUserType? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'typeArgumentList' @ [209:89] ==> public final val KtUserType.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'referencedElement' @ [210:34] ==> val referencedElement: KtElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'getNonStrictParentOfType' @ [210:52] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtCallExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallExpression

'typeArgumentList' @ [210:98] ==> public final val KtCallExpression.typeArgumentList: KtTypeArgumentList?[MyPropertyDescriptor]

'argList' @ [212:21] ==> val argList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'argList' @ [213:39] ==> val argList: KtTypeArgumentList? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'arguments' @ [213:47] ==> public final val KtTypeArgumentList.arguments: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>)[MyPropertyDescriptor]

'parameterIndex' @ [214:25] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'projections' @ [214:42] ==> val projections: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'size' @ [214:54] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'usages' @ [215:25] ==> value-parameter usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'add' @ [215:32] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'SafeDeleteTypeArgumentListUsageInfo' @ [215:36] ==> public constructor SafeDeleteTypeArgumentListUsageInfo(typeProjection: KtTypeProjection, parameter: KtTypeParameter) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.SafeDeleteTypeArgumentListUsageInfo[ClassConstructorDescriptorImpl]

'projections' @ [215:72] ==> val projections: (MutableList<(KtTypeProjection..KtTypeProjection?)>..List<(KtTypeProjection..KtTypeProjection?)>) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'parameterIndex' @ [215:84] ==> val parameterIndex: Int defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[LocalVariableDescriptor]

'parameter' @ [215:101] ==> value-parameter parameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findTypeParameterUsages[ValueParameterDescriptorImpl]

'when (element) {
                is PsiClass -> element.constructors
                is PsiMethod -> arrayOf(element)
                else -> return
            }' @ [222:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>), entry1: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>), entry2: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.Array<(com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)>..kotlin.Array<out (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)>)

'element' @ [222:38] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[ValueParameterDescriptorImpl]

'element' @ [223:32] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[ValueParameterDescriptorImpl]

'constructors' @ [223:40] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'arrayOf' @ [224:33] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiMethod): Array<PsiMethod> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiMethod

'element' @ [224:41] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[ValueParameterDescriptorImpl]

'constructors' @ [227:33] ==> val constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[LocalVariableDescriptor]

'constructor' @ [228:17] ==> val constructor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[LocalVariableDescriptor]

'processDelegationCallConstructorUsages' @ [228:29] ==> public fun PsiElement.processDelegationCallConstructorUsages(scope: SearchScope, process: (KtCallElement) -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'constructor' @ [228:68] ==> val constructor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[LocalVariableDescriptor]

'useScope' @ [228:80] ==> public final val PsiMethod.useScope: SearchScope[MyPropertyDescriptor]

'!' @ [229:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'getIgnoranceCondition' @ [229:26] ==> local final fun getIgnoranceCondition(): Condition<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'value' @ [229:50] ==> public abstract fun value(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.openapi.util.Condition[JavaMethodDescriptor]

'it' @ [229:56] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages.<anonymous>[ValueParameterDescriptorImpl]

'usages' @ [230:25] ==> value-parameter usages: MutableList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'add' @ [230:32] ==> public abstract fun add(element: UsageInfo): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'SafeDeleteReferenceSimpleDeleteUsageInfo' @ [230:36] ==> public constructor SafeDeleteReferenceSimpleDeleteUsageInfo(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?), p2: Boolean) defined in com.intellij.refactoring.safeDelete.usageInfo.SafeDeleteReferenceSimpleDeleteUsageInfo[JavaClassConstructorDescriptor]

'it' @ [230:77] ==> value-parameter it: KtCallElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [230:81] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.findDelegationCallUsages[ValueParameterDescriptorImpl]

'when (element) {
            is KtClassOrObject -> {
                element.toLightClass()?.let { klass ->
                    findDelegationCallUsages(klass)
                    findUsagesByJavaProcessor(klass, false)
                } ?: findKotlinDeclarationUsages(element)
            }

            is KtSecondaryConstructor -> {
                element.getRepresentativeLightMethod()?.let { method ->
                    findDelegationCallUsages(method)
                    findUsagesByJavaProcessor(method, false)
                } ?: findKotlinDeclarationUsages(element)
            }

            is KtNamedFunction -> {
                if (element.isLocal) {
                    findKotlinDeclarationUsages(element)
                }
                else {
                    val lightMethods = element.toLightMethods()
                    if (lightMethods.isNotEmpty()) {
                        lightMethods.map { method -> findUsagesByJavaProcessor(method, false) }.firstOrNull()
                    }
                    else {
                        findKotlinDeclarationUsages(element)
                    }
                }
            }

            is PsiMethod -> {
                findUsagesByJavaProcessor(element, false)
            }

            is PsiClass -> {
                findUsagesByJavaProcessor(element, false)
            }

            is KtProperty -> {
                if (element.isLocal) {
                    findKotlinDeclarationUsages(element)
                }
                else {
                    findUsagesByJavaProcessor(element)
                }
            }

            is KtTypeParameter -> {
                findTypeParameterUsages(element)
                findUsagesByJavaProcessor(element)
            }

            is KtParameter ->
                findUsagesByJavaProcessor(element)

            is KtTypeAlias -> {
                findKotlinDeclarationUsages(element)
            }

            else -> null
        }' @ [237:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: NonCodeUsageSearchInfo?, entry1: NonCodeUsageSearchInfo?, entry2: NonCodeUsageSearchInfo?, entry3: NonCodeUsageSearchInfo?, entry4: NonCodeUsageSearchInfo?, entry5: NonCodeUsageSearchInfo?, entry6: NonCodeUsageSearchInfo?, entry7: NonCodeUsageSearchInfo?, entry8: NonCodeUsageSearchInfo?, entry9: NonCodeUsageSearchInfo?): NonCodeUsageSearchInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> NonCodeUsageSearchInfo?

'element' @ [237:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'element' @ [239:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'toLightClass' @ [239:25] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [239:41] ==> @InlineOnly public inline fun <T, R> KtLightClass.let(block: (KtLightClass) -> NonCodeUsageSearchInfo?): NonCodeUsageSearchInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightClass
    <R> -> NonCodeUsageSearchInfo?

'findDelegationCallUsages' @ [240:21] ==> local final fun findDelegationCallUsages(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'klass' @ [240:46] ==> value-parameter klass: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [241:21] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'klass' @ [241:47] ==> value-parameter klass: KtLightClass defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'findKotlinDeclarationUsages' @ [242:22] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [242:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'element' @ [246:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'getRepresentativeLightMethod' @ [246:25] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [246:57] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> NonCodeUsageSearchInfo?): NonCodeUsageSearchInfo? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> NonCodeUsageSearchInfo?

'findDelegationCallUsages' @ [247:21] ==> local final fun findDelegationCallUsages(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'method' @ [247:46] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [248:21] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'method' @ [248:47] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'findKotlinDeclarationUsages' @ [249:22] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [249:50] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'if (element.isLocal) {
                    findKotlinDeclarationUsages(element)
                }
                else {
                    val lightMethods = element.toLightMethods()
                    if (lightMethods.isNotEmpty()) {
                        lightMethods.map { method -> findUsagesByJavaProcessor(method, false) }.firstOrNull()
                    }
                    else {
                        findKotlinDeclarationUsages(element)
                    }
                }' @ [253:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NonCodeUsageSearchInfo?, elseBranch: NonCodeUsageSearchInfo?): NonCodeUsageSearchInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NonCodeUsageSearchInfo?

'element' @ [253:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'isLocal' @ [253:29] ==> public final val KtNamedFunction.isLocal: Boolean[MyPropertyDescriptor]

'findKotlinDeclarationUsages' @ [254:21] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [254:49] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'element' @ [257:40] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'toLightMethods' @ [257:48] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'if (lightMethods.isNotEmpty()) {
                        lightMethods.map { method -> findUsagesByJavaProcessor(method, false) }.firstOrNull()
                    }
                    else {
                        findKotlinDeclarationUsages(element)
                    }' @ [258:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NonCodeUsageSearchInfo?, elseBranch: NonCodeUsageSearchInfo?): NonCodeUsageSearchInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NonCodeUsageSearchInfo?

'lightMethods' @ [258:25] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[LocalVariableDescriptor]

'isNotEmpty' @ [258:38] ==> @InlineOnly public inline fun <T> Collection<PsiMethod>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'lightMethods' @ [259:25] ==> val lightMethods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[LocalVariableDescriptor]

'map' @ [259:38] ==> public inline fun <T, R> Iterable<PsiMethod>.map(transform: (PsiMethod) -> NonCodeUsageSearchInfo?): List<NonCodeUsageSearchInfo?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> NonCodeUsageSearchInfo?

'findUsagesByJavaProcessor' @ [259:54] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'method' @ [259:80] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [259:97] ==> public fun <T> List<NonCodeUsageSearchInfo?>.firstOrNull(): NonCodeUsageSearchInfo? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NonCodeUsageSearchInfo?

'findKotlinDeclarationUsages' @ [262:25] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [262:53] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [268:17] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [268:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [272:17] ==> local final fun findUsagesByJavaProcessor(element: PsiElement, forceReferencedElementUnwrapping: Boolean): NonCodeUsageSearchInfo? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [272:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'if (element.isLocal) {
                    findKotlinDeclarationUsages(element)
                }
                else {
                    findUsagesByJavaProcessor(element)
                }' @ [276:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NonCodeUsageSearchInfo, elseBranch: NonCodeUsageSearchInfo): NonCodeUsageSearchInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NonCodeUsageSearchInfo

'element' @ [276:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'isLocal' @ [276:29] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'findKotlinDeclarationUsages' @ [277:21] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [277:49] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [280:21] ==> local final fun findUsagesByJavaProcessor(ktDeclaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [280:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findTypeParameterUsages' @ [285:17] ==> local final fun findTypeParameterUsages(parameter: KtTypeParameter): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [285:41] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [286:17] ==> local final fun findUsagesByJavaProcessor(ktDeclaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [286:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findUsagesByJavaProcessor' @ [290:17] ==> local final fun findUsagesByJavaProcessor(ktDeclaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [290:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'findKotlinDeclarationUsages' @ [293:17] ==> local final fun findKotlinDeclarationUsages(declaration: KtDeclaration): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [293:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'getSearchInfo' @ [297:14] ==> local final fun getSearchInfo(element: PsiElement): NonCodeUsageSearchInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[SimpleFunctionDescriptorImpl]

'element' @ [297:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findUsages[ValueParameterDescriptorImpl]

'element' @ [301:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'element' @ [301:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'element' @ [302:28] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'getNonStrictParentOfType' @ [302:36] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'jetClass' @ [303:17] ==> val jetClass: KtClass? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'jetClass' @ [303:37] ==> val jetClass: KtClass? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'getBody' @ [303:46] ==> public final fun getBody(): KtClassBody? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'element' @ [303:59] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'parent' @ [303:67] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'jetClass' @ [305:32] ==> val jetClass: KtClass? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'modifierList' @ [305:41] ==> public final val KtClass.modifierList: KtModifierList?[MyPropertyDescriptor]

'modifierList' @ [306:17] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'modifierList' @ [306:41] ==> val modifierList: KtModifierList? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'hasModifier' @ [306:54] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [306:75] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [308:35] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'analyze' @ [308:57] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [311:21] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [311:51] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [311:78] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [313:20] ==> val declarationDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'overriddenDescriptors' @ [313:42] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'asSequence' @ [314:22] ==> public fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.asSequence(): Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'filter' @ [315:22] ==> public fun <T> Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)>.filter(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'overridenDescriptor' @ [315:54] ==> value-parameter overridenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [315:74] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [315:95] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'mapTo' @ [316:22] ==> public inline fun <T, R, C : MutableCollection<in String>> Sequence<(CallableMemberDescriptor..CallableMemberDescriptor?)>.mapTo(destination: ArrayList<String>, transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> String): ArrayList<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R> -> String
    <C : MutableCollection<in R>> -> ArrayList<String>

'ArrayList' @ [316:28] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'message' @ [317:38] ==> @NotNull public open fun message(@NonNls @PropertyKey p0: (String..String?), vararg p1: (Any..Any?)): String defined in org.jetbrains.kotlin.idea.KotlinBundle[JavaMethodDescriptor]

'formatFunction' @ [319:33] ==> public fun formatFunction(functionDescriptor: DeclarationDescriptor, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [319:48] ==> val declarationDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'formatClass' @ [320:33] ==> public fun formatClass(classDescriptor: DeclarationDescriptor, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'declarationDescriptor' @ [320:45] ==> val declarationDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[LocalVariableDescriptor]

'containingDeclaration' @ [320:67] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'formatFunction' @ [321:33] ==> public fun formatFunction(functionDescriptor: DeclarationDescriptor, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'overridenDescriptor' @ [321:48] ==> value-parameter overridenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'formatClass' @ [322:33] ==> public fun formatClass(classDescriptor: DeclarationDescriptor, inCode: Boolean): String defined in org.jetbrains.kotlin.idea.refactoring in file renderingUtils.kt[SimpleFunctionDescriptorImpl]

'overridenDescriptor' @ [322:45] ==> value-parameter overridenDescriptor: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [322:65] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'super' @ [327:16] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor[LazyClassReceiverParameterDescriptor]

'findConflicts' @ [327:22] ==> public open fun findConflicts(@NotNull p0: PsiElement, @NotNull p1: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)): (MutableCollection<(String..String?)>?..Collection<(String..String?)>?) defined in com.intellij.refactoring.safeDelete.JavaSafeDeleteProcessor[JavaMethodDescriptor]

'element' @ [327:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'allElementsToDelete' @ [327:45] ==> value-parameter allElementsToDelete: Array<out PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.findConflicts[ValueParameterDescriptorImpl]

'ArrayList' @ [336:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'ArrayList' @ [337:38] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> UsageInfo

'usages' @ [339:23] ==> value-parameter usages: Array<out UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'if (usage is KotlinSafeDeleteOverridingUsageInfo) {
                overridingMethodUsages.add(usage)
            } else {
                result.add(usage)
            }' @ [340:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'usage' @ [340:17] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'overridingMethodUsages' @ [341:17] ==> val overridingMethodUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'add' @ [341:40] ==> public open fun add(element: UsageInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'usage' @ [341:44] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'result' @ [343:17] ==> val result: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'add' @ [343:24] ==> public open fun add(element: UsageInfo): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'usage' @ [343:28] ==> val usage: UsageInfo defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'!' @ [347:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overridingMethodUsages' @ [347:14] ==> val overridingMethodUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'isEmpty' @ [347:37] ==> public open fun isEmpty(): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'if (ApplicationManager.getApplication()!!.isUnitTestMode) {
                result.addAll(overridingMethodUsages)
            } else {
                val dialog = KotlinOverridingDialog(project, overridingMethodUsages)
                dialog.show()

                if (!dialog.isOK) return null

                result.addAll(dialog.selected)
            }' @ [348:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!!' @ [348:17] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [348:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [348:55] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'result' @ [349:17] ==> val result: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'addAll' @ [349:24] ==> public open fun addAll(elements: Collection<UsageInfo>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'overridingMethodUsages' @ [349:31] ==> val overridingMethodUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'KotlinOverridingDialog' @ [351:30] ==> public constructor KotlinOverridingDialog(project: (Project..Project?), overridingMethods: (MutableList<(UsageInfo..UsageInfo?)>..List<(UsageInfo..UsageInfo?)>?)) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinOverridingDialog[JavaClassConstructorDescriptor]

'project' @ [351:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[ValueParameterDescriptorImpl]

'overridingMethodUsages' @ [351:62] ==> val overridingMethodUsages: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'dialog' @ [352:17] ==> val dialog: KotlinOverridingDialog defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'show' @ [352:24] ==> public open fun show(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinOverridingDialog[JavaMethodDescriptor]

'!' @ [354:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dialog' @ [354:22] ==> val dialog: KotlinOverridingDialog defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'isOK' @ [354:29] ==> public final val KotlinOverridingDialog.isOK: Boolean[MyPropertyDescriptor]

'result' @ [356:17] ==> val result: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'addAll' @ [356:24] ==> public open fun addAll(elements: Collection<UsageInfo>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'dialog' @ [356:31] ==> val dialog: KotlinOverridingDialog defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'selected' @ [356:38] ==> public final val KotlinOverridingDialog.selected: (MutableList<(UsageInfo..UsageInfo?)>..List<(UsageInfo..UsageInfo?)>)[MyPropertyDescriptor]

'result' @ [360:16] ==> val result: ArrayList<UsageInfo> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.preprocessUsages[LocalVariableDescriptor]

'toTypedArray' @ [360:23] ==> public inline fun <reified T> Collection<UsageInfo>.toTypedArray(): Array<UsageInfo> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> UsageInfo

'element' @ [364:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'element' @ [365:13] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'headerImplementations' @ [365:21] ==> internal fun KtDeclaration.headerImplementations(): Set<KtDeclaration> defined in org.jetbrains.kotlin.idea.highlighter.markers in file ImplementedHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'forEach' @ [365:45] ==> @HidesMembers public inline fun <T> Iterable<KtDeclaration>.forEach(action: (KtDeclaration) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclaration

'if (it is KtParameter) {
                    (it.parent as? KtParameterList)?.removeParameter(it)
                }
                else {
                    it.removeModifier(KtTokens.IMPL_KEYWORD)
                }' @ [366:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'it' @ [366:21] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [367:22] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [367:25] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'removeParameter' @ [367:54] ==> public open fun removeParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'it' @ [367:70] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [370:21] ==> value-parameter it: KtDeclaration defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'removeModifier' @ [370:24] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [370:48] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (element) {
            is PsiMethod -> element.cleanUpOverrides()

            is KtNamedFunction ->
                if (!element.isLocal) {
                    element.getRepresentativeLightMethod()?.cleanUpOverrides()
                }

            is KtProperty ->
                if (!element.isLocal) {
                    element.toLightMethods().forEach(PsiMethod::cleanUpOverrides)
                }

            is KtTypeParameter ->
                element.deleteElementAndCleanParent()

            is KtParameter -> {
                element.ownerFunction?.let {
                    if (it.dropImplModifier == true) {
                        it.removeModifier(KtTokens.IMPL_KEYWORD)
                        it.dropImplModifier = null
                    }
                }
                (element.parent as KtParameterList).removeParameter(element)
            }
        }' @ [375:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [375:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'element' @ [376:29] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'cleanUpOverrides' @ [376:37] ==> public fun PsiMethod.cleanUpOverrides(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'!' @ [379:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [379:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'isLocal' @ [379:30] ==> public final val KtNamedFunction.isLocal: Boolean[MyPropertyDescriptor]

'element' @ [380:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'getRepresentativeLightMethod' @ [380:29] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'cleanUpOverrides' @ [380:61] ==> public fun PsiMethod.cleanUpOverrides(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'!' @ [384:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [384:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'isLocal' @ [384:30] ==> public final val KtProperty.isLocal: Boolean[MyPropertyDescriptor]

'element' @ [385:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'toLightMethods' @ [385:29] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'forEach' @ [385:46] ==> @HidesMembers public inline fun <T> Iterable<PsiMethod>.forEach(action: (PsiMethod) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'cleanUpOverrides' @ [385:65] ==> public fun PsiMethod.cleanUpOverrides(): Unit defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [389:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'deleteElementAndCleanParent' @ [389:25] ==> public fun PsiElement.deleteElementAndCleanParent(): Unit defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'element' @ [392:17] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'ownerFunction' @ [392:25] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'let' @ [392:40] ==> @InlineOnly public inline fun <T, R> KtDeclarationWithBody.let(block: (KtDeclarationWithBody) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDeclarationWithBody
    <R> -> Unit

'it' @ [393:25] ==> value-parameter it: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'dropImplModifier' @ [393:28] ==> private final var KtDeclaration.dropImplModifier: Boolean? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.Companion[PropertyDescriptorImpl]

'it' @ [394:25] ==> value-parameter it: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'removeModifier' @ [394:28] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'IMPL_KEYWORD' @ [394:52] ==> public final val IMPL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'it' @ [395:25] ==> value-parameter it: KtDeclarationWithBody defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion.<anonymous>[ValueParameterDescriptorImpl]

'dropImplModifier' @ [395:28] ==> private final var KtDeclaration.dropImplModifier: Boolean? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.Companion[PropertyDescriptorImpl]

'element' @ [398:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'parent' @ [398:26] ==> public final val KtParameter.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'removeParameter' @ [398:53] ==> public open fun removeParameter(@NotNull p0: KtParameter): Unit defined in org.jetbrains.kotlin.psi.KtParameterList[JavaMethodDescriptor]

'element' @ [398:69] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.prepareForDeletion[ValueParameterDescriptorImpl]

'getApplication' @ [404:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [404:49] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'parameter' @ [404:72] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.shouldAllowPropagationToHeader[ValueParameterDescriptorImpl]

'project' @ [404:82] ==> public final val KtParameter.project: Project[MyPropertyDescriptor]

'ALLOW_LIFTING_IMPL_PARAMETER_TO_HEADER' @ [404:90] ==> internal final var Project.ALLOW_LIFTING_IMPL_PARAMETER_TO_HEADER: (Boolean..Boolean?) defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.Companion[PropertyDescriptorImpl]

'==' @ [406:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'showYesNoDialog' @ [406:25] ==> @Messages.YesNoResult public open fun showYesNoDialog(p0: (String..String?), @NotNull @Nls p1: String, @Nullable p2: Icon?): Int defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'message' @ [408:35] ==> public open fun message(@PropertyKey p0: (String..String?)): (String..String?) defined in com.intellij.refactoring.RefactoringBundle[JavaMethodDescriptor]

'getQuestionIcon' @ [409:26] ==> @NotNull public open fun getQuestionIcon(): Icon defined in com.intellij.openapi.ui.Messages[JavaMethodDescriptor]

'YES' @ [410:23] ==> public const final val YES: Int defined in com.intellij.openapi.ui.Messages[JavaPropertyDescriptor]

'when (element) {
            is KtParameter -> {
                val headerParameter = element.liftToHeader() as? KtParameter
                if (headerParameter != null && headerParameter != element) {
                    if (shouldAllowPropagationToHeader(element)) {
                        return listOf(headerParameter)
                    } else {
                        element.ownerFunction?.dropImplModifier = true
                        return listOf(element)
                    }
                }

                return element.toPsiParameters().flatMap { psiParameter ->
                    checkParametersInMethodHierarchy(psiParameter) ?: emptyList()
                }.ifEmpty { listOf(element) }
            }

            is PsiParameter ->
                return checkParametersInMethodHierarchy(element)
        }' @ [416:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'element' @ [416:15] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'element' @ [418:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'liftToHeader' @ [418:47] ==> internal fun KtDeclaration.liftToHeader(): KtDeclaration? defined in org.jetbrains.kotlin.idea.highlighter.markers in file DeclaredHeaderMarker.kt[SimpleFunctionDescriptorImpl]

'headerParameter' @ [419:21] ==> val headerParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[LocalVariableDescriptor]

'headerParameter' @ [419:48] ==> val headerParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[LocalVariableDescriptor]

'element' @ [419:67] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'if (shouldAllowPropagationToHeader(element)) {
                        return listOf(headerParameter)
                    } else {
                        element.ownerFunction?.dropImplModifier = true
                        return listOf(element)
                    }' @ [420:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'shouldAllowPropagationToHeader' @ [420:25] ==> private final fun shouldAllowPropagationToHeader(parameter: KtParameter): Boolean defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor[SimpleFunctionDescriptorImpl]

'element' @ [420:56] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'listOf' @ [421:32] ==> public fun <T> listOf(element: KtParameter): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'headerParameter' @ [421:39] ==> val headerParameter: KtParameter? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[LocalVariableDescriptor]

'element' @ [423:25] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'ownerFunction' @ [423:33] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'dropImplModifier' @ [423:48] ==> private final var KtDeclaration.dropImplModifier: Boolean? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.Companion[PropertyDescriptorImpl]

'listOf' @ [424:32] ==> public fun <T> listOf(element: KtParameter): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'element' @ [424:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'element' @ [428:24] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'toPsiParameters' @ [428:32] ==> public fun KtParameter.toPsiParameters(): Collection<PsiParameter> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'flatMap' @ [428:50] ==> public inline fun <T, R> Iterable<PsiParameter>.flatMap(transform: (PsiParameter) -> Iterable<PsiElement>): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiParameter
    <R> -> PsiElement

'checkParametersInMethodHierarchy' @ [429:21] ==> public fun checkParametersInMethodHierarchy(parameter: PsiParameter): Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'psiParameter' @ [429:54] ==> value-parameter psiParameter: PsiParameter defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [429:71] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'ifEmpty' @ [430:19] ==> public inline fun <T, C : Collection<PsiElement>> List<PsiElement>.ifEmpty(body: () -> List<PsiElement>): List<PsiElement> defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <C : Collection<T>> -> List<PsiElement>

'listOf' @ [430:29] ==> public fun <T> listOf(element: KtParameter): List<KtParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameter

'element' @ [430:36] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'checkParametersInMethodHierarchy' @ [434:24] ==> public fun checkParametersInMethodHierarchy(parameter: PsiParameter): Collection<PsiElement>? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete in file utils.kt[SimpleFunctionDescriptorImpl]

'element' @ [434:57] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'!!' @ [437:13] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Application?): Application[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Application

'getApplication' @ [437:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [437:51] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'singletonList' @ [437:86] ==> public open fun <T : (Any..Any?)> singletonList(p0: (PsiElement..PsiElement?)): (MutableList<(PsiElement..PsiElement?)>..List<(PsiElement..PsiElement?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'element' @ [437:100] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'when (element) {
            is KtNamedFunction, is KtProperty -> checkSuperMethods(element as KtDeclaration, allElementsToDelete, "delete (with usage search)")
            else -> super.getElementsToSearch(element, module, allElementsToDelete)
        }' @ [439:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<PsiElement>?, entry1: Collection<PsiElement>?): Collection<PsiElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<PsiElement>?

'element' @ [439:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'checkSuperMethods' @ [440:50] ==> public fun checkSuperMethods(declaration: KtDeclaration, ignore: Collection<PsiElement>?, actionString: String): List<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [440:68] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'allElementsToDelete' @ [440:94] ==> value-parameter allElementsToDelete: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'super' @ [441:21] ==> <this> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor[LazyClassReceiverParameterDescriptor]

'getElementsToSearch' @ [441:27] ==> @Nullable public open fun getElementsToSearch(@NotNull p0: PsiElement, @Nullable p1: Module?, @NotNull p2: (MutableCollection<(PsiElement..PsiElement?)>..Collection<(PsiElement..PsiElement?)>)): (MutableCollection<out (PsiElement..PsiElement?)>?..Collection<(PsiElement..PsiElement?)>?) defined in com.intellij.refactoring.safeDelete.JavaSafeDeleteProcessor[JavaMethodDescriptor]

'element' @ [441:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'module' @ [441:56] ==> value-parameter module: Module? defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

'allElementsToDelete' @ [441:64] ==> value-parameter allElementsToDelete: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.safeDelete.KotlinSafeDeleteProcessor.getElementsToSearch[ValueParameterDescriptorImpl]

