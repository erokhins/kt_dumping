'KotlinFindUsagesHandler<KtClassOrObject>' @ [59:5] ==> public constructor KotlinFindUsagesHandler<T : PsiElement>(psiElement: KtClassOrObject, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtClassOrObject

'ktClass' @ [59:46] ==> value-parameter ktClass: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.<init>[ValueParameterDescriptorImpl]

'factory' @ [59:55] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.<init>[ValueParameterDescriptorImpl]

'KotlinFindClassUsagesDialog' @ [63:16] ==> public constructor KotlinFindClassUsagesDialog(classOrObject: (KtClassOrObject..KtClassOrObject?), project: (Project..Project?), findUsagesOptions: (FindUsagesOptions..FindUsagesOptions?), toShowInNewTab: Boolean, mustOpenInNewTab: Boolean, isSingleFile: Boolean, handler: (FindUsagesHandler..FindUsagesHandler?)) defined in org.jetbrains.kotlin.idea.findUsages.dialogs.KotlinFindClassUsagesDialog[JavaClassConstructorDescriptor]

'getElement' @ [63:44] ==> @Suppress public final fun getElement(): KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[SimpleFunctionDescriptorImpl]

'project' @ [64:44] ==> public final val KotlinFindClassUsagesHandler.project: Project[MyPropertyDescriptor]

'factory' @ [65:44] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[PropertyDescriptorImpl]

'findClassOptions' @ [65:52] ==> public final val findClassOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

'toShowInNewTab' @ [66:44] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [67:44] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'isSingleFile' @ [68:44] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'this' @ [69:44] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[LazyClassReceiverParameterDescriptor]

'MySearcher' @ [73:16] ==> public constructor MySearcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[ClassConstructorDescriptorImpl]

'element' @ [73:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'processor' @ [73:36] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'options' @ [73:47] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'Searcher' @ [78:9] ==> public constructor Searcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[ClassConstructorDescriptorImpl]

'element' @ [78:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'processor' @ [78:27] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [78:38] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [80:37] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'KotlinFindUsagesHandler' @ [81:42] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'createReferenceProcessor' @ [81:66] ==> internal final fun createReferenceProcessor(usageInfoProcessor: Processor<UsageInfo>): Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'processor' @ [81:91] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.<init>[ValueParameterDescriptorImpl]

'element' @ [84:33] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'kotlinOptions' @ [86:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isUsages' @ [86:31] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'kotlinOptions' @ [86:43] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchConstructorUsages' @ [86:57] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[PropertyDescriptorImpl]

'processClassReferencesLater' @ [87:17] ==> private final fun processClassReferencesLater(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'classOrObject' @ [87:45] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'kotlinOptions' @ [90:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isFieldsUsages' @ [90:31] ==> public final var isFieldsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'kotlinOptions' @ [90:49] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isMethodsUsages' @ [90:63] ==> public final var isMethodsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'processMemberReferencesLater' @ [91:17] ==> private final fun processMemberReferencesLater(classOrObject: KtClassOrObject): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'classOrObject' @ [91:46] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'kotlinOptions' @ [94:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isUsages' @ [94:31] ==> public final var isUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'classOrObject' @ [94:43] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'classOrObject' @ [94:83] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'isCompanion' @ [94:97] ==> public final fun isCompanion(): Boolean defined in org.jetbrains.kotlin.psi.KtObjectDeclaration[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [94:114] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'options' @ [94:131] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [94:139] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'!' @ [95:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processCompanionObjectInternalReferences' @ [95:22] ==> private final fun processCompanionObjectInternalReferences(companionObject: KtObjectDeclaration): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'classOrObject' @ [95:63] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'kotlinOptions' @ [98:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchConstructorUsages' @ [98:31] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[PropertyDescriptorImpl]

'classOrObject' @ [99:17] ==> val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList[LocalVariableDescriptor]

'toLightClass' @ [99:31] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'constructors' @ [99:47] ==> public final val KtLightClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [99:61] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<KtLightMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtLightMethod

'forEach' @ [99:96] ==> @HidesMembers public inline fun <T> Iterable<KtLightMethod>.forEach(action: (KtLightMethod) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtLightMethod

'constructor' @ [100:33] ==> value-parameter constructor: KtLightMethod defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[ValueParameterDescriptorImpl]

'useScope' @ [100:45] ==> public final val KtLightMethod.useScope: SearchScope[MyPropertyDescriptor]

'intersectWith' @ [100:54] ==> @NotNull public abstract fun intersectWith(@NotNull p0: SearchScope): SearchScope defined in com.intellij.psi.search.SearchScope[JavaMethodDescriptor]

'options' @ [100:68] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [100:76] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'search' @ [101:56] ==> public open fun search(@NotNull p0: PsiMethod, p1: (SearchScope..SearchScope?), p2: Boolean): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'constructor' @ [101:63] ==> value-parameter constructor: KtLightMethod defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [101:76] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[LocalVariableDescriptor]

'kotlinOptions' @ [102:25] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isSkipImportStatements' @ [102:39] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'query' @ [103:25] ==> var query: (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[LocalVariableDescriptor]

'FilteredQuery' @ [103:33] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'query' @ [103:47] ==> var query: (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[LocalVariableDescriptor]

'!' @ [103:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [103:57] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isImportUsage' @ [103:60] ==> public fun PsiReference.isImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'addTask' @ [105:21] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'query' @ [105:31] ==> var query: (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>[LocalVariableDescriptor]

'forEach' @ [105:37] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'Processor' @ [105:45] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<(PsiReference..PsiReference?)> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'referenceProcessor' @ [105:57] ==> private final val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'process' @ [105:76] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [105:84] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.buildTaskList.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'kotlinOptions' @ [109:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isDerivedClasses' @ [109:31] ==> public final var isDerivedClasses: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'kotlinOptions' @ [109:51] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isDerivedInterfaces' @ [109:65] ==> public final var isDerivedInterfaces: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'processInheritorsLater' @ [110:17] ==> private final fun processInheritorsLater(): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'HierarchySearchRequest' @ [117:27] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: PsiElement, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : PsiElement> -> PsiElement

'element' @ [117:50] ==> public final val element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'options' @ [117:59] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [117:67] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'kotlinOptions' @ [117:80] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isCheckDeepInheritance' @ [117:94] ==> public final var isCheckDeepInheritance: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'addTask' @ [118:13] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'request' @ [119:17] ==> val request: HierarchySearchRequest<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater[LocalVariableDescriptor]

'searchInheritors' @ [119:25] ==> public fun HierarchySearchRequest<*>.searchInheritors(): Query<PsiClass> defined in org.jetbrains.kotlin.idea.search.declarationsSearch[DeserializedSimpleFunctionDescriptor]

'forEach' @ [119:44] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiClass..PsiClass?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'PsiElementProcessorAdapter' @ [120:25] ==> public constructor PsiElementProcessorAdapter<T : (PsiElement..PsiElement?)>(p0: (PsiElementProcessor<(PsiClass..PsiClass?)>..PsiElementProcessor<(PsiClass..PsiClass?)>?)) defined in com.intellij.psi.search.PsiElementProcessorAdapter[JavaClassConstructorDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> (com.intellij.psi.PsiClass..com.intellij.psi.PsiClass?)

'PsiElementProcessor' @ [121:33] ==> public fun <T : (PsiElement..PsiElement?)> PsiElementProcessor(function: (PsiClass) -> Boolean): PsiElementProcessor<PsiClass> defined in com.intellij.psi.search[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiClass

'runReadAction' @ [122:37] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'!' @ [123:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [123:46] ==> value-parameter element: PsiClass defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [123:54] ==> public final val PsiClass.isValid: Boolean[MyPropertyDescriptor]

'element' @ [124:59] ==> value-parameter element: PsiClass defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isInterface' @ [124:67] ==> public final val PsiClass.isInterface: Boolean[MyPropertyDescriptor]

'when {
                                            isInterface && kotlinOptions.isDerivedInterfaces || !isInterface && kotlinOptions.isDerivedClasses ->
                                                KotlinFindUsagesHandler.processUsage(processor, element.navigationElement)
                                            else -> true
                                        }' @ [125:41] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'isInterface' @ [126:45] ==> val isInterface: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kotlinOptions' @ [126:60] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isDerivedInterfaces' @ [126:74] ==> public final var isDerivedInterfaces: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'!' @ [126:97] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInterface' @ [126:98] ==> val isInterface: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'kotlinOptions' @ [126:113] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isDerivedClasses' @ [126:127] ==> public final var isDerivedClasses: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'processUsage' @ [127:73] ==> internal final fun processUsage(processor: Processor<UsageInfo>, element: PsiElement): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'processor' @ [127:86] ==> public final val processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'element' @ [127:97] ==> value-parameter element: PsiClass defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processInheritorsLater.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'navigationElement' @ [127:105] ==> public final val PsiClass.navigationElement: PsiElement[MyPropertyDescriptor]

'KotlinReferencesSearchParameters' @ [138:36] ==> public constructor KotlinReferencesSearchParameters(elementToSearch: PsiElement, scope: SearchScope = ..., ignoreAccessScope: Boolean = ..., optimizer: SearchRequestCollector? = ..., kotlinOptions: KotlinReferencesSearchOptions = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchParameters[DeserializedClassConstructorDescriptor]

'classOrObject' @ [138:69] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[ValueParameterDescriptorImpl]

'options' @ [139:77] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [139:85] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'KotlinReferencesSearchOptions' @ [140:85] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'search' @ [141:48] ==> @NotNull public open fun search(@NotNull p0: ReferencesSearch.SearchParameters): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'searchParameters' @ [141:55] ==> val searchParameters: KotlinReferencesSearchParameters defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'kotlinOptions' @ [143:17] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isSkipImportStatements' @ [143:31] ==> public final var isSkipImportStatements: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'usagesQuery' @ [144:17] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'FilteredQuery' @ [144:31] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'usagesQuery' @ [144:45] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'!' @ [144:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [144:61] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater.<anonymous>[ValueParameterDescriptorImpl]

'isImportUsage' @ [144:64] ==> public fun PsiReference.isImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'if (!kotlinOptions.searchConstructorUsages) {
                usagesQuery = FilteredQuery(usagesQuery) { !it.isConstructorUsage(classOrObject) }
            }
            else if (!options.isUsages) {
                usagesQuery = FilteredQuery(usagesQuery) { it.isConstructorUsage(classOrObject) }
            }' @ [147:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [147:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kotlinOptions' @ [147:18] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchConstructorUsages' @ [147:32] ==> public final var searchConstructorUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[PropertyDescriptorImpl]

'usagesQuery' @ [148:17] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'FilteredQuery' @ [148:31] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'usagesQuery' @ [148:45] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'!' @ [148:60] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [148:61] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater.<anonymous>[ValueParameterDescriptorImpl]

'isConstructorUsage' @ [148:64] ==> public fun PsiReference.isConstructorUsage(ktClassOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [148:83] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[ValueParameterDescriptorImpl]

'!' @ [150:22] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'options' @ [150:23] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isUsages' @ [150:31] ==> public final var isUsages: Boolean defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'usagesQuery' @ [151:17] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'FilteredQuery' @ [151:31] ==> public constructor FilteredQuery<T : (Any..Any?)>(@NotNull p0: Query<(PsiReference..PsiReference?)>, @NotNull p1: ((PsiReference..PsiReference?)) -> Boolean) defined in com.intellij.util.FilteredQuery[SamAdapterClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'usagesQuery' @ [151:45] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'it' @ [151:60] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater.<anonymous>[ValueParameterDescriptorImpl]

'isConstructorUsage' @ [151:63] ==> public fun PsiReference.isConstructorUsage(ktClassOrObject: KtClassOrObject): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'classOrObject' @ [151:82] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[ValueParameterDescriptorImpl]

'addTask' @ [153:13] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'usagesQuery' @ [153:23] ==> var usagesQuery: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processClassReferencesLater[LocalVariableDescriptor]

'forEach' @ [153:35] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'referenceProcessor' @ [153:43] ==> private final val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'companionObject' @ [157:25] ==> value-parameter companionObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[ValueParameterDescriptorImpl]

'getStrictParentOfType' @ [157:41] ==> public inline fun <reified T : PsiElement> PsiElement.getStrictParentOfType(): KtClass? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtClass

'companionObject' @ [158:45] ==> value-parameter companionObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[ValueParameterDescriptorImpl]

'descriptor' @ [158:61] ==> public val KtDeclaration.descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedPropertyDescriptor]

'!' @ [159:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [159:21] ==> val klass: KtClass defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[LocalVariableDescriptor]

'anyDescendantOfType' @ [159:27] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtElement) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtElement

'element' @ [160:21] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[ValueParameterDescriptorImpl]

'companionObject' @ [160:32] ==> value-parameter companionObject: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[ValueParameterDescriptorImpl]

'element' @ [162:38] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[ValueParameterDescriptorImpl]

'analyze' @ [162:46] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [163:36] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[LocalVariableDescriptor]

'CALL' @ [163:66] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'element' @ [163:72] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[ValueParameterDescriptorImpl]

'getResolvedCall' @ [163:82] ==> public fun Call?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [163:98] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[LocalVariableDescriptor]

'==' @ [164:21] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [164:22] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[LocalVariableDescriptor]

'dispatchReceiver' @ [164:35] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'declarationDescriptor' @ [164:80] ==> public open val declarationDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'companionObjectDescriptor' @ [164:105] ==> val companionObjectDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[LocalVariableDescriptor]

'==' @ [165:24] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'resolvedCall' @ [165:25] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[LocalVariableDescriptor]

'extensionReceiver' @ [165:38] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'declarationDescriptor' @ [165:84] ==> public open val declarationDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitClassReceiver[DeserializedPropertyDescriptor]

'companionObjectDescriptor' @ [165:109] ==> val companionObjectDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences[LocalVariableDescriptor]

'element' @ [166:29] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>[ValueParameterDescriptorImpl]

'references' @ [166:37] ==> public final val KtElement.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'any' @ [166:48] ==> public inline fun <T> Array<out (PsiReference..PsiReference?)>.any(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'!' @ [166:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'referenceProcessor' @ [166:55] ==> private final val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'process' @ [166:74] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'it' @ [166:82] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processCompanionObjectInternalReferences.<no name provided>.<anonymous>[ValueParameterDescriptorImpl]

'classOrObject' @ [173:33] ==> value-parameter classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processMemberReferencesLater[ValueParameterDescriptorImpl]

'effectiveDeclarations' @ [173:47] ==> public fun KtClassOrObject.effectiveDeclarations(): List<KtDeclaration> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'declaration' @ [174:22] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processMemberReferencesLater[LocalVariableDescriptor]

'kotlinOptions' @ [174:56] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isMethodsUsages' @ [174:70] ==> public final var isMethodsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'declaration' @ [175:23] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processMemberReferencesLater[LocalVariableDescriptor]

'declaration' @ [175:52] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processMemberReferencesLater[LocalVariableDescriptor]

'kotlinOptions' @ [175:83] ==> private final val kotlinOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'isFieldsUsages' @ [175:97] ==> public final var isFieldsUsages: Boolean defined in org.jetbrains.kotlin.idea.findUsages.KotlinClassFindUsagesOptions[JavaPropertyDescriptor]

'addTask' @ [176:21] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[SimpleFunctionDescriptorImpl]

'search' @ [176:48] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [176:55] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher.processMemberReferencesLater[LocalVariableDescriptor]

'options' @ [176:68] ==> public final val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'searchScope' @ [176:76] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'forEach' @ [176:89] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'referenceProcessor' @ [176:97] ==> private final val referenceProcessor: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.MySearcher[PropertyDescriptorImpl]

'when (element) {
                           is PsiClass -> element
                           is KtClassOrObject -> getElement().toLightClass()
                           else -> null
                       }' @ [183:24] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiClass?, entry1: PsiClass?, entry2: PsiClass?): PsiClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiClass?

'element' @ [183:30] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getStringsToSearch[ValueParameterDescriptorImpl]

'element' @ [184:43] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getStringsToSearch[ValueParameterDescriptorImpl]

'getElement' @ [185:50] ==> @Suppress public final fun getElement(): KtClassOrObject defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[SimpleFunctionDescriptorImpl]

'toLightClass' @ [185:63] ==> public fun KtClassOrObject.toLightClass(): KtLightClass? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [187:48] ==> public final fun <T : (Any..Any?)> emptyList(): (MutableList<(String..String?)>..List<(String..String?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'getElementNames' @ [189:37] ==> @NotNull public open fun getElementNames(@NotNull p0: PsiElement): (MutableSet<(String..String?)>..Set<(String..String?)>) defined in com.intellij.find.findUsages.JavaFindUsagesHelper[JavaMethodDescriptor]

'psiClass' @ [189:53] ==> val psiClass: PsiClass defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.getStringsToSearch[LocalVariableDescriptor]

'!' @ [193:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSingleFile' @ [193:17] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler.isSearchForTextOccurencesAvailable[ValueParameterDescriptorImpl]

'factory' @ [197:16] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindClassUsagesHandler[PropertyDescriptorImpl]

'findClassOptions' @ [197:24] ==> public final val findClassOptions: KotlinClassFindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

