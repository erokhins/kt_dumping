'acceptCallableOverrides' @ [56:33] ==> public final val acceptCallableOverrides: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'acceptOverloads' @ [56:60] ==> public final val acceptOverloads: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'acceptExtensionsOfDeclarationClass' @ [56:79] ==> public final val acceptExtensionsOfDeclarationClass: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'KotlinReferencesSearchOptions' @ [59:21] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[ClassConstructorDescriptorImpl]

'runReadAction' @ [65:30] ==> public fun <T> runReadAction(action: () -> GlobalSearchScope): GlobalSearchScope defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> GlobalSearchScope

'elementToSearch' @ [65:46] ==> value-parameter elementToSearch: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters.<init>[ValueParameterDescriptorImpl]

'project' @ [65:62] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'allScope' @ [65:70] ==> public fun Project.allScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'KotlinReferencesSearchOptions' @ [68:60] ==> public companion object defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[FakeCallableDescriptorForObject]

'Empty' @ [68:90] ==> public final val Empty: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions.Companion[PropertyDescriptorImpl]

'ReferencesSearch.SearchParameters' @ [69:7] ==> public constructor SearchParameters(@NotNull p0: PsiElement, @NotNull p1: SearchScope, p2: Boolean, @Nullable p3: SearchRequestCollector?) defined in com.intellij.psi.search.searches.ReferencesSearch.SearchParameters[JavaClassConstructorDescriptor]

'elementToSearch' @ [69:41] ==> value-parameter elementToSearch: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters.<init>[ValueParameterDescriptorImpl]

'scope' @ [69:58] ==> value-parameter scope: SearchScope = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters.<init>[ValueParameterDescriptorImpl]

'ignoreAccessScope' @ [69:65] ==> value-parameter ignoreAccessScope: Boolean = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [69:84] ==> value-parameter optimizer: SearchRequestCollector? = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters.<init>[ValueParameterDescriptorImpl]

'QueryExecutorBase<PsiReference, ReferencesSearch.SearchParameters>' @ [71:34] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>() defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiReference
    <Params : (Any..Any?)> -> SearchParameters

'QueryProcessor' @ [73:25] ==> public constructor QueryProcessor(queryParameters: ReferencesSearch.SearchParameters, consumer: Processor<PsiReference>) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[ClassConstructorDescriptorImpl]

'queryParameters' @ [73:40] ==> value-parameter queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'consumer' @ [73:57] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'runReadAction' @ [74:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Unit

'processor' @ [74:25] ==> val processor: KotlinReferencesSearcher.QueryProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.processQuery[LocalVariableDescriptor]

'processInReadAction' @ [74:35] ==> public final fun processInReadAction(): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'processor' @ [75:9] ==> val processor: KotlinReferencesSearcher.QueryProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.processQuery[LocalVariableDescriptor]

'executeLongRunningTasks' @ [75:19] ==> public final fun executeLongRunningTasks(): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'?:' @ [80:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KotlinReferencesSearchOptions?, right: KotlinReferencesSearchOptions): KotlinReferencesSearchOptions[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KotlinReferencesSearchOptions

'queryParameters' @ [80:38] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'kotlinOptions' @ [80:93] ==> public final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[PropertyDescriptorImpl]

'Empty' @ [81:70] ==> public final val Empty: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions.Companion[PropertyDescriptorImpl]

'ArrayList' @ [83:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function0<Unit>

'longTasks' @ [86:13] ==> private final val longTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'forEach' @ [86:23] ==> @HidesMembers public inline fun <T> Iterable<() -> Unit>.forEach(action: (() -> Unit) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Unit>

'invoke' @ [86:33] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'queryParameters' @ [90:27] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'elementToSearch' @ [90:43] ==> public final val ReferencesSearch.SearchParameters.elementToSearch: PsiElement[MyPropertyDescriptor]

'!' @ [91:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [91:18] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'isValid' @ [91:26] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'element' @ [93:36] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'namedUnwrappedElement' @ [93:44] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'run' @ [95:40] ==> @InlineOnly public inline fun <T, R> KotlinReferencesSearcher.QueryProcessor.run(block: KotlinReferencesSearcher.QueryProcessor.() -> SearchScope): SearchScope defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QueryProcessor
    <R> -> SearchScope

'if (unwrappedElement is KtDeclaration && !isOnlyKotlinSearch(queryParameters.scopeDeterminedByUser)) {
                    unwrappedElement.toLightElements()
                }
                else {
                    listOf(unwrappedElement)
                }' @ [96:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<PsiNamedElement>, elseBranch: List<PsiNamedElement>): List<PsiNamedElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<PsiNamedElement>

'unwrappedElement' @ [96:36] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'!' @ [96:73] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isOnlyKotlinSearch' @ [96:74] ==> private final fun isOnlyKotlinSearch(searchScope: SearchScope): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'queryParameters' @ [96:93] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'scopeDeterminedByUser' @ [96:109] ==> public final val ReferencesSearch.SearchParameters.scopeDeterminedByUser: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'unwrappedElement' @ [97:21] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'toLightElements' @ [97:38] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'listOf' @ [100:21] ==> public fun <T> listOf(element: PsiNamedElement): List<PsiNamedElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'unwrappedElement' @ [100:28] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'elements' @ [103:17] ==> val elements: List<PsiNamedElement> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction.<anonymous>[LocalVariableDescriptor]

'fold' @ [103:26] ==> public inline fun <T, R> Iterable<PsiNamedElement>.fold(initial: SearchScope, operation: (acc: SearchScope, PsiNamedElement) -> SearchScope): SearchScope defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement
    <R> -> SearchScope

'queryParameters' @ [103:31] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'effectiveSearchScope' @ [103:47] ==> public final val ReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'scope' @ [104:21] ==> value-parameter scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'unionSafe' @ [104:27] ==> public fun SearchScope.unionSafe(other: SearchScope): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'queryParameters' @ [104:37] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'effectiveSearchScope' @ [104:53] ==> public fun ReferencesSearch.SearchParameters.effectiveSearchScope(element: PsiElement): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'e' @ [104:74] ==> value-parameter e: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when (unwrappedElement) {
                is KtParameter -> ({ ref: PsiReference -> !ref.isNamedArgumentReference()/* they are processed later*/ })
                else -> ({ true })
            }' @ [108:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (PsiReference) -> Boolean, entry1: (PsiReference) -> Boolean): (PsiReference) -> Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Function1<PsiReference, Boolean>

'unwrappedElement' @ [108:62] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'!' @ [109:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'ref' @ [109:60] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction.<anonymous>[ValueParameterDescriptorImpl]

'isNamedArgumentReference' @ [109:64] ==> private final fun PsiReference.isNamedArgumentReference(): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'KotlinRequestResultProcessor' @ [113:35] ==> public constructor KotlinRequestResultProcessor(unwrappedElement: PsiElement, originalElement: PsiElement = ..., filter: (PsiReference) -> Boolean = ..., options: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[ClassConstructorDescriptorImpl]

'unwrappedElement' @ [113:64] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'refFilter' @ [113:91] ==> val refFilter: (PsiReference) -> Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'kotlinOptions' @ [113:112] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'unwrappedElement' @ [115:24] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'name' @ [115:41] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'kotlinOptions' @ [116:17] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'anyEnabled' @ [116:31] ==> public final fun anyEnabled(): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[SimpleFunctionDescriptorImpl]

'name' @ [117:21] ==> val name: String? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'queryParameters' @ [118:21] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [118:37] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'searchWord' @ [118:47] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'name' @ [119:29] ==> val name: String? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'effectiveSearchScope' @ [119:35] ==> val effectiveSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'IN_CODE' @ [119:76] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'unwrappedElement' @ [119:91] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'resultProcessor' @ [119:109] ==> val resultProcessor: KotlinRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'unwrappedElement' @ [124:47] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'getClassNameForCompanionObject' @ [124:64] ==> public fun PsiNamedElement.getClassNameForCompanionObject(): String? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file searchHelpers.kt[SimpleFunctionDescriptorImpl]

'classNameForCompanionObject' @ [125:17] ==> val classNameForCompanionObject: String? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'queryParameters' @ [126:17] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [126:33] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'searchWord' @ [126:43] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'classNameForCompanionObject' @ [127:25] ==> val classNameForCompanionObject: String? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'effectiveSearchScope' @ [127:54] ==> val effectiveSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'ANY' @ [127:95] ==> public const final val ANY: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'unwrappedElement' @ [127:106] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'resultProcessor' @ [127:124] ==> val resultProcessor: KotlinRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'unwrappedElement' @ [130:17] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'kotlinOptions' @ [130:52] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'searchNamedArguments' @ [130:66] ==> public final val searchNamedArguments: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'searchNamedArguments' @ [131:17] ==> private final fun searchNamedArguments(parameter: KtParameter): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'unwrappedElement' @ [131:38] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'!' @ [134:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'unwrappedElement' @ [134:19] ==> val unwrappedElement: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'isOnlyKotlinSearch' @ [134:52] ==> private final fun isOnlyKotlinSearch(searchScope: SearchScope): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'effectiveSearchScope' @ [134:71] ==> val effectiveSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'searchLightElements' @ [135:17] ==> private final fun searchLightElements(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [135:37] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'element' @ [138:17] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'element' @ [138:42] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'OperatorReferenceSearcher' @ [139:41] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[FakeCallableDescriptorForObject]

'create' @ [139:67] ==> public final fun create(declaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions): OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[SimpleFunctionDescriptorImpl]

'element' @ [140:25] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'effectiveSearchScope' @ [140:34] ==> val effectiveSearchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'consumer' @ [140:56] ==> public final val consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'queryParameters' @ [140:66] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [140:82] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'kotlinOptions' @ [140:93] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'referenceSearcher' @ [141:21] ==> val referenceSearcher: OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'longTasks' @ [142:21] ==> private final val longTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'add' @ [142:31] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'referenceSearcher' @ [142:37] ==> val referenceSearcher: OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'run' @ [142:55] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'kotlinOptions' @ [146:17] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'searchForComponentConventions' @ [146:31] ==> public final val searchForComponentConventions: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'when (element) {
                    is KtParameter -> {
                        val componentFunctionDescriptor = element.dataClassComponentFunction()
                        if (componentFunctionDescriptor != null) {
                            val containingClass = element.getStrictParentOfType<KtClassOrObject>()?.toLightClass()
                            searchDataClassComponentUsages(containingClass, componentFunctionDescriptor, kotlinOptions)
                        }
                    }

                    is KtLightParameter -> {
                        val componentFunctionDescriptor = element.kotlinOrigin?.dataClassComponentFunction()
                        if (componentFunctionDescriptor != null) {
                            searchDataClassComponentUsages(element.method.containingClass, componentFunctionDescriptor, kotlinOptions)
                        }
                    }
                }' @ [147:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [147:23] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'element' @ [149:59] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'dataClassComponentFunction' @ [149:67] ==> public fun KtParameter.dataClassComponentFunction(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file searchHelpers.kt[SimpleFunctionDescriptorImpl]

'componentFunctionDescriptor' @ [150:29] ==> val componentFunctionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'element' @ [151:51] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'getStrictParentOfType' @ [151:59] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClassOrObject

'toLightClass' @ [151:101] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'searchDataClassComponentUsages' @ [152:29] ==> private final fun searchDataClassComponentUsages(containingClass: PsiClass?, componentFunctionDescriptor: FunctionDescriptor, kotlinOptions: KotlinReferencesSearchOptions): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'containingClass' @ [152:60] ==> val containingClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'componentFunctionDescriptor' @ [152:77] ==> val componentFunctionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'kotlinOptions' @ [152:106] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'element' @ [157:59] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'kotlinOrigin' @ [157:67] ==> public open val kotlinOrigin: KtParameter? defined in org.jetbrains.kotlin.asJava.elements.KtLightParameter[JavaPropertyDescriptor]

'dataClassComponentFunction' @ [157:81] ==> public fun KtParameter.dataClassComponentFunction(): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch in file searchHelpers.kt[SimpleFunctionDescriptorImpl]

'componentFunctionDescriptor' @ [158:29] ==> val componentFunctionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'searchDataClassComponentUsages' @ [159:29] ==> private final fun searchDataClassComponentUsages(containingClass: PsiClass?, componentFunctionDescriptor: FunctionDescriptor, kotlinOptions: KotlinReferencesSearchOptions): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [159:60] ==> val element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'method' @ [159:68] ==> public final val KtLightParameter.method: (KtLightMethod..KtLightMethod?)[MyPropertyDescriptor]

'containingClass' @ [159:75] ==> public final val KtLightMethod.containingClass: KtLightClass[MyPropertyDescriptor]

'componentFunctionDescriptor' @ [159:92] ==> val componentFunctionDescriptor: FunctionDescriptor? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processInReadAction[LocalVariableDescriptor]

'kotlinOptions' @ [159:121] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'parameter' @ [167:33] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[ValueParameterDescriptorImpl]

'name' @ [167:43] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'parameter' @ [168:28] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[ValueParameterDescriptorImpl]

'ownerFunction' @ [168:38] ==> public final val KtParameter.ownerFunction: KtDeclarationWithBody?[MyPropertyDescriptor]

'function' @ [169:17] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'nameAsName' @ [169:26] ==> public final val KtFunction.nameAsName: Name?[MyPropertyDescriptor]

'isSpecial' @ [169:38] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'function' @ [170:27] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'project' @ [170:36] ==> public final val KtFunction.project: Project[MyPropertyDescriptor]

'function' @ [171:34] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'useScope' @ [171:43] ==> public final val KtFunction.useScope: SearchScope[MyPropertyDescriptor]

'intersectWith' @ [171:52] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'queryParameters' @ [171:66] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'scopeDeterminedByUser' @ [171:82] ==> public final val ReferencesSearch.SearchParameters.scopeDeterminedByUser: (SearchScope..SearchScope?)[MyPropertyDescriptor]

'namedArgsScope' @ [173:17] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'namedArgsScope' @ [174:17] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'KotlinSourceFilterScope' @ [174:34] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'sourcesAndLibraries' @ [174:58] ==> @JvmStatic public final fun sourcesAndLibraries(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[SimpleFunctionDescriptorImpl]

'namedArgsScope' @ [174:78] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'project' @ [174:94] ==> val project: Project defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'getInstance' @ [176:66] ==> public open fun getInstance(p0: (Project..Project?)): (CacheManager..CacheManager?) defined in com.intellij.psi.impl.cache.CacheManager.SERVICE[JavaMethodDescriptor]

'project' @ [176:78] ==> val project: Project defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'getVirtualFilesWithWord' @ [176:87] ==> @NotNull public abstract fun getVirtualFilesWithWord(@NotNull p0: String, p1: Short, @NotNull p2: GlobalSearchScope, p3: Boolean): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.psi.impl.cache.CacheManager[JavaMethodDescriptor]

'function' @ [177:25] ==> val function: KtFunction defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'name' @ [177:34] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'IN_CODE' @ [177:61] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'namedArgsScope' @ [177:70] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'namedArgsScope' @ [178:17] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'filesScope' @ [178:52] ==> @NotNull public open fun filesScope(@NotNull p0: Project, @NotNull p1: (MutableCollection<(VirtualFile..VirtualFile?)>..Collection<(VirtualFile..VirtualFile?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [178:63] ==> val project: Project defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'filesWithFunctionName' @ [178:72] ==> val filesWithFunctionName: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'asList' @ [178:94] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.asList(): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'KotlinRequestResultProcessor' @ [181:29] ==> public constructor KotlinRequestResultProcessor(unwrappedElement: PsiElement, originalElement: PsiElement = ..., filter: (PsiReference) -> Boolean = ..., options: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[ClassConstructorDescriptorImpl]

'parameter' @ [181:58] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[ValueParameterDescriptorImpl]

'it' @ [181:80] ==> value-parameter it: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments.<anonymous>[ValueParameterDescriptorImpl]

'isNamedArgumentReference' @ [181:83] ==> private final fun PsiReference.isNamedArgumentReference(): Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'queryParameters' @ [182:13] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [182:29] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'searchWord' @ [182:39] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'parameterName' @ [182:50] ==> val parameterName: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'namedArgsScope' @ [183:50] ==> var namedArgsScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'KOTLIN_NAMED_ARGUMENT_SEARCH_CONTEXT' @ [184:50] ==> public val KOTLIN_NAMED_ARGUMENT_SEARCH_CONTEXT: Short defined in org.jetbrains.kotlin.idea.search in file KotlinIndexers.kt[PropertyDescriptorImpl]

'parameter' @ [186:50] ==> value-parameter parameter: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[ValueParameterDescriptorImpl]

'processor' @ [187:50] ==> val processor: KotlinRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedArguments[LocalVariableDescriptor]

'when (element) {
                is KtClassOrObject -> {
                    processKtClassOrObject(element)
                }

                is KtNamedFunction, is KtSecondaryConstructor -> {
                    val name = (element as KtFunction).name
                    if (name != null) {
                        val methods = LightClassUtil.getLightClassMethods(element)
                        for (method in methods) {
                            searchNamedElement(method)
                        }
                    }

                    processStaticsFromCompanionObject(element)
                }

                is KtProperty -> {
                    val propertyMethods = LightClassUtil.getLightClassPropertyMethods(element)
                    propertyMethods.allDeclarations.forEach { searchNamedElement(it) }
                    processStaticsFromCompanionObject(element)
                }

                is KtParameter -> {
                    searchPropertyAccessorMethods(element)
                }

                is KtLightMethod -> {
                    val declaration = element.kotlinOrigin
                    if (declaration is KtProperty || (declaration is KtParameter && declaration.hasValOrVar())) {
                        searchNamedElement(declaration as PsiNamedElement)
                        processStaticsFromCompanionObject(declaration)
                    }
                    else if (declaration is KtPropertyAccessor) {
                        val property = declaration.getStrictParentOfType<KtProperty>()
                        searchNamedElement(property)
                    }
                    else if (declaration is KtFunction) {
                        processStaticsFromCompanionObject(declaration)
                    }
                }

                is KtLightParameter -> {
                    val origin = element.kotlinOrigin ?: return
                    searchPropertyAccessorMethods(origin)
                }
            }' @ [191:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit, entry5: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'element' @ [191:19] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'processKtClassOrObject' @ [193:21] ==> private final fun processKtClassOrObject(element: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [193:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'element' @ [197:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'name' @ [197:56] ==> public final val KtFunction.name: String?[MyPropertyDescriptor]

'name' @ [198:25] ==> val name: String? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'LightClassUtil' @ [199:39] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassMethods' @ [199:54] ==> public final fun getLightClassMethods(function: KtFunction): List<PsiMethod> defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [199:75] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'methods' @ [200:40] ==> val methods: List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'searchNamedElement' @ [201:29] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'method' @ [201:48] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'processStaticsFromCompanionObject' @ [205:21] ==> private final fun processStaticsFromCompanionObject(element: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [205:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'LightClassUtil' @ [209:43] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightClassPropertyMethods' @ [209:58] ==> public final fun getLightClassPropertyMethods(property: KtProperty): LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [209:87] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'propertyMethods' @ [210:21] ==> val propertyMethods: LightClassUtil.PropertyAccessorsPsiMethods defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'allDeclarations' @ [210:37] ==> public final val allDeclarations: List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava.LightClassUtil.PropertyAccessorsPsiMethods[DeserializedPropertyDescriptor]

'forEach' @ [210:53] ==> @HidesMembers public inline fun <T> Iterable<PsiNamedElement>.forEach(action: (PsiNamedElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'searchNamedElement' @ [210:63] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'it' @ [210:82] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements.<anonymous>[ValueParameterDescriptorImpl]

'processStaticsFromCompanionObject' @ [211:21] ==> private final fun processStaticsFromCompanionObject(element: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [211:55] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'searchPropertyAccessorMethods' @ [215:21] ==> private final fun searchPropertyAccessorMethods(origin: KtParameter): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [215:51] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'element' @ [219:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [219:47] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'if (declaration is KtProperty || (declaration is KtParameter && declaration.hasValOrVar())) {
                        searchNamedElement(declaration as PsiNamedElement)
                        processStaticsFromCompanionObject(declaration)
                    }
                    else if (declaration is KtPropertyAccessor) {
                        val property = declaration.getStrictParentOfType<KtProperty>()
                        searchNamedElement(property)
                    }
                    else if (declaration is KtFunction) {
                        processStaticsFromCompanionObject(declaration)
                    }' @ [220:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [220:25] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'declaration' @ [220:55] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'declaration' @ [220:85] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'hasValOrVar' @ [220:97] ==> public open fun hasValOrVar(): Boolean defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'searchNamedElement' @ [221:25] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [221:44] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'processStaticsFromCompanionObject' @ [222:25] ==> private final fun processStaticsFromCompanionObject(element: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [222:59] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'if (declaration is KtPropertyAccessor) {
                        val property = declaration.getStrictParentOfType<KtProperty>()
                        searchNamedElement(property)
                    }
                    else if (declaration is KtFunction) {
                        processStaticsFromCompanionObject(declaration)
                    }' @ [224:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'declaration' @ [224:30] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'declaration' @ [225:40] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'getStrictParentOfType' @ [225:52] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'searchNamedElement' @ [226:25] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'property' @ [226:44] ==> val property: KtProperty? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'declaration' @ [228:30] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'processStaticsFromCompanionObject' @ [229:25] ==> private final fun processStaticsFromCompanionObject(element: KtDeclaration): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'declaration' @ [229:59] ==> val declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'element' @ [234:34] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [234:42] ==> public open val kotlinOrigin: KtParameter? defined in org.jetbrains.kotlin.asJava.elements.KtLightParameter[JavaPropertyDescriptor]

'searchPropertyAccessorMethods' @ [235:21] ==> private final fun searchPropertyAccessorMethods(origin: KtParameter): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'origin' @ [235:51] ==> val origin: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchLightElements[LocalVariableDescriptor]

'origin' @ [241:13] ==> value-parameter origin: KtParameter defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchPropertyAccessorMethods[ValueParameterDescriptorImpl]

'toLightElements' @ [241:20] ==> public fun KtElement.toLightElements(): List<PsiNamedElement> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'forEach' @ [241:38] ==> @HidesMembers public inline fun <T> Iterable<PsiNamedElement>.forEach(action: (PsiNamedElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiNamedElement

'searchNamedElement' @ [241:48] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'it' @ [241:67] ==> value-parameter it: PsiNamedElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchPropertyAccessorMethods.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [245:29] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'name' @ [245:37] ==> public final val KtClassOrObject.name: String?[MyPropertyDescriptor]

'element' @ [246:30] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'toLightClass' @ [246:38] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'searchNamedElement' @ [247:13] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'lightClass' @ [247:32] ==> val lightClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'className' @ [247:44] ==> val className: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'element' @ [249:17] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'element' @ [249:51] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'isCompanion' @ [249:59] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'LightClassUtil' @ [250:17] ==> public object LightClassUtil defined in org.jetbrains.kotlin.asJava[FakeCallableDescriptorForObject]

'getLightFieldForCompanionObject' @ [250:32] ==> public final fun getLightFieldForCompanionObject(companionObject: KtClassOrObject): PsiField? defined in org.jetbrains.kotlin.asJava.LightClassUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [250:64] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'let' @ [250:74] ==> @InlineOnly public inline fun <T, R> PsiField.let(block: (PsiField) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiField
    <R> -> Unit

'searchNamedElement' @ [250:80] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'it' @ [250:99] ==> value-parameter it: PsiField defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOptions' @ [252:21] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'acceptCompanionObjectMembers' @ [252:35] ==> public final val acceptCompanionObjectMembers: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[PropertyDescriptorImpl]

'element' @ [253:44] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [253:52] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'toLightClass' @ [253:86] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'originLightClass' @ [254:25] ==> val originLightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'originLightClass' @ [256:33] ==> val originLightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'methods' @ [256:50] ==> public final val KtLightClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'map' @ [256:58] ==> public inline fun <T, R> Array<out (PsiMethod..PsiMethod?)>.map(transform: ((PsiMethod..PsiMethod?)) -> KtLightMethod?): List<KtLightMethod?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)
    <R> -> KtLightMethod?

'it' @ [256:64] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'originLightClass' @ [257:33] ==> val originLightClass: KtLightClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'fields' @ [257:50] ==> public final val KtLightClass.fields: (Array<(PsiField..PsiField?)>..Array<out (PsiField..PsiField?)>)[MyPropertyDescriptor]

'map' @ [257:57] ==> public inline fun <T, R> Array<out (PsiField..PsiField?)>.map(transform: ((PsiField..PsiField?)) -> KtLightField?): List<KtLightField?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiField..com.intellij.psi.PsiField?)
    <R> -> KtLightField?

'it' @ [257:63] ==> value-parameter it: (PsiField..PsiField?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [259:45] ==> value-parameter element: KtClassOrObject defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[ValueParameterDescriptorImpl]

'declarations' @ [259:53] ==> public final val KtObjectDeclaration.declarations: List<KtDeclaration>[MyPropertyDescriptor]

'lightDeclarations' @ [260:29] ==> val lightDeclarations: List<KtLightMember<*>?> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'firstOrNull' @ [261:38] ==> public inline fun <T> Iterable<KtLightMember<*>?>.firstOrNull(predicate: (KtLightMember<*>?) -> Boolean): KtLightMember<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightMember<*>?

'it' @ [261:52] ==> value-parameter it: KtLightMember<*>? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [261:56] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMember[DeserializedPropertyDescriptor]

'declaration' @ [261:72] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject[LocalVariableDescriptor]

'let' @ [262:39] ==> @InlineOnly public inline fun <T, R> KtLightMember<*>.let(block: (KtLightMember<*>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightMember<*>
    <R> -> Unit

'searchNamedElement' @ [262:45] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'it' @ [262:64] ==> value-parameter it: KtLightMember<*> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processKtClassOrObject.<anonymous>[ValueParameterDescriptorImpl]

'containingClass' @ [273:37] ==> value-parameter containingClass: PsiClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[ValueParameterDescriptorImpl]

'methods' @ [273:54] ==> public final val PsiClass.methods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'firstOrNull' @ [273:63] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.firstOrNull(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [274:17] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [274:20] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'componentFunctionDescriptor' @ [274:28] ==> value-parameter componentFunctionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[ValueParameterDescriptorImpl]

'name' @ [274:56] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [274:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [274:75] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages.<anonymous>[ValueParameterDescriptorImpl]

'parameterList' @ [274:78] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [274:92] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'componentFunction' @ [276:17] ==> val componentFunction: PsiMethod? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[LocalVariableDescriptor]

'searchNamedElement' @ [277:17] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'componentFunction' @ [277:36] ==> val componentFunction: PsiMethod? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[LocalVariableDescriptor]

'OperatorReferenceSearcher' @ [279:32] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[FakeCallableDescriptorForObject]

'create' @ [279:58] ==> public final fun create(declaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions): OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[SimpleFunctionDescriptorImpl]

'componentFunction' @ [280:25] ==> val componentFunction: PsiMethod? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[LocalVariableDescriptor]

'queryParameters' @ [280:44] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'effectiveSearchScope' @ [280:60] ==> public final val ReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'consumer' @ [280:82] ==> public final val consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'queryParameters' @ [280:92] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [280:108] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'kotlinOptions' @ [280:119] ==> value-parameter kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[ValueParameterDescriptorImpl]

'longTasks' @ [281:17] ==> private final val longTasks: ArrayList<() -> Unit> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'add' @ [281:27] ==> public open fun add(element: () -> Unit): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'searcher' @ [281:33] ==> val searcher: OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchDataClassComponentUsages[LocalVariableDescriptor]

'run' @ [281:44] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'searchScope' @ [286:20] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.isOnlyKotlinSearch[ValueParameterDescriptorImpl]

'searchScope' @ [286:55] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.isOnlyKotlinSearch[ValueParameterDescriptorImpl]

'scope' @ [286:67] ==> public final val LocalSearchScope.scope: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'all' @ [286:73] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.all(predicate: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [286:79] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.isOnlyKotlinSearch.<anonymous>[ValueParameterDescriptorImpl]

'containingFile' @ [286:82] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'findStaticMethodsFromCompanionObject' @ [290:13] ==> private final fun findStaticMethodsFromCompanionObject(declaration: KtDeclaration): List<PsiMethod> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'element' @ [290:50] ==> value-parameter element: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processStaticsFromCompanionObject[ValueParameterDescriptorImpl]

'forEach' @ [290:59] ==> @HidesMembers public inline fun <T> Iterable<PsiMethod>.forEach(action: (PsiMethod) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'searchNamedElement' @ [290:69] ==> private final fun searchNamedElement(element: PsiNamedElement?, name: String? = ...): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[SimpleFunctionDescriptorImpl]

'it' @ [290:88] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.processStaticsFromCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [294:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[ValueParameterDescriptorImpl]

'parents' @ [294:44] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'dropWhile' @ [295:41] ==> public fun <T> Sequence<PsiElement>.dropWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [295:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'firstOrNull' @ [296:41] ==> public fun <T> Sequence<PsiElement>.firstOrNull(): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'emptyList' @ [296:89] ==> public fun <T> emptyList(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'!' @ [297:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'originObject' @ [297:18] ==> val originObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[LocalVariableDescriptor]

'isCompanion' @ [297:31] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [297:53] ==> public fun <T> emptyList(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'originObject' @ [298:31] ==> val originObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[LocalVariableDescriptor]

'getStrictParentOfType' @ [298:44] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'originClass' @ [299:36] ==> val originClass: KtClass? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[LocalVariableDescriptor]

'toLightClass' @ [299:49] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [299:74] ==> public fun <T> emptyList(): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'originLightClass' @ [300:30] ==> val originLightClass: KtLightClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[LocalVariableDescriptor]

'allMethods' @ [300:47] ==> public final val KtLightClass.allMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'allMethods' @ [301:20] ==> val allMethods: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[LocalVariableDescriptor]

'filter' @ [301:31] ==> public inline fun <T> Array<out (PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [301:40] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [301:63] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOrigin' @ [301:66] ==> public abstract val kotlinOrigin: KtDeclaration? defined in org.jetbrains.kotlin.asJava.elements.KtLightMethod[DeserializedPropertyDescriptor]

'declaration' @ [301:82] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.findStaticMethodsFromCompanionObject[ValueParameterDescriptorImpl]

'element' @ [304:83] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'name' @ [304:92] ==> public final val PsiNamedElement.name: String?[MyPropertyDescriptor]

'name' @ [305:17] ==> value-parameter name: String? = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'element' @ [305:33] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'queryParameters' @ [306:29] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'effectiveSearchScope' @ [306:45] ==> public fun ReferencesSearch.SearchParameters.effectiveSearchScope(element: PsiElement): SearchScope defined in org.jetbrains.kotlin.idea.search in file searchUtil.kt[SimpleFunctionDescriptorImpl]

'element' @ [306:66] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'+' @ [307:31] ==> public final operator fun plus(other: Short): Int defined in kotlin.Short[DeserializedSimpleFunctionDescriptor]

'IN_CODE' @ [307:50] ==> public const final val IN_CODE: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'IN_FOREIGN_LANGUAGES' @ [307:79] ==> public const final val IN_FOREIGN_LANGUAGES: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'IN_COMMENTS' @ [307:121] ==> public const final val IN_COMMENTS: Short defined in com.intellij.psi.search.UsageSearchContext[JavaPropertyDescriptor]

'KotlinRequestResultProcessor' @ [308:39] ==> public constructor KotlinRequestResultProcessor(unwrappedElement: PsiElement, originalElement: PsiElement = ..., filter: (PsiReference) -> Boolean = ..., options: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinRequestResultProcessor[ClassConstructorDescriptorImpl]

'element' @ [308:68] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'queryParameters' @ [309:68] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'elementToSearch' @ [309:84] ==> public final val ReferencesSearch.SearchParameters.elementToSearch: PsiElement[MyPropertyDescriptor]

'namedUnwrappedElement' @ [309:100] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'element' @ [309:125] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'kotlinOptions' @ [310:78] ==> private final val kotlinOptions: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'queryParameters' @ [311:17] ==> public final val queryParameters: ReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor[PropertyDescriptorImpl]

'optimizer' @ [311:33] ==> public final val ReferencesSearch.SearchParameters.optimizer: SearchRequestCollector[MyPropertyDescriptor]

'searchWord' @ [311:43] ==> public open fun searchWord(@NotNull p0: String, @NotNull p1: SearchScope, p2: Short, p3: Boolean, @NotNull p4: PsiElement, @NotNull p5: RequestResultProcessor): Unit defined in com.intellij.psi.search.SearchRequestCollector[JavaMethodDescriptor]

'name' @ [311:54] ==> value-parameter name: String? = ... defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'scope' @ [311:60] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[LocalVariableDescriptor]

'context' @ [311:67] ==> val context: Int defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[LocalVariableDescriptor]

'toShort' @ [311:75] ==> public open fun toShort(): Short defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'element' @ [311:92] ==> value-parameter element: PsiNamedElement? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[ValueParameterDescriptorImpl]

'resultProcessor' @ [311:101] ==> val resultProcessor: KotlinRequestResultProcessor defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.searchNamedElement[LocalVariableDescriptor]

'this' @ [316:20] ==> <this> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearcher.QueryProcessor.isNamedArgumentReference[ReceiverParameterDescriptorImpl]

'expression' @ [316:53] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[PropertyDescriptorImpl]

'parent' @ [316:64] ==> public final val KtSimpleNameExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

