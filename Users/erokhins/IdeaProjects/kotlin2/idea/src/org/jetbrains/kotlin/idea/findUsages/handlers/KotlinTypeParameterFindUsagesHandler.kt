'KotlinFindUsagesHandler<KtNamedDeclaration>' @ [33:5] ==> public constructor KotlinFindUsagesHandler<T : PsiElement>(psiElement: KtNamedDeclaration, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> KtNamedDeclaration

'element' @ [33:49] ==> value-parameter element: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.<init>[ValueParameterDescriptorImpl]

'factory' @ [33:58] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.<init>[ValueParameterDescriptorImpl]

'KotlinTypeParameterFindUsagesDialog' @ [37:16] ==> public constructor KotlinTypeParameterFindUsagesDialog<T : (KtNamedDeclaration..KtNamedDeclaration?)>(element: (KtNamedDeclaration..KtNamedDeclaration?), project: (Project..Project?), findUsagesOptions: (FindUsagesOptions..FindUsagesOptions?), toShowInNewTab: Boolean, mustOpenInNewTab: Boolean, isSingleFile: Boolean, handler: (FindUsagesHandler..FindUsagesHandler?)) defined in org.jetbrains.kotlin.idea.findUsages.dialogs.KotlinTypeParameterFindUsagesDialog[JavaClassConstructorDescriptor]
Inferred types:
    <T : (KtNamedDeclaration..KtNamedDeclaration?)> -> KtNamedDeclaration

'getElement' @ [38:17] ==> @Suppress public final fun getElement(): KtNamedDeclaration defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler[SimpleFunctionDescriptorImpl]

'project' @ [38:31] ==> public final val KotlinTypeParameterFindUsagesHandler.project: Project[MyPropertyDescriptor]

'findUsagesOptions' @ [38:40] ==> public final val KotlinTypeParameterFindUsagesHandler.findUsagesOptions: FindUsagesOptions[MyPropertyDescriptor]

'toShowInNewTab' @ [38:59] ==> value-parameter toShowInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'mustOpenInNewTab' @ [38:75] ==> value-parameter mustOpenInNewTab: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'isSingleFile' @ [38:93] ==> value-parameter isSingleFile: Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.getFindUsagesDialog[ValueParameterDescriptorImpl]

'this' @ [38:107] ==> <this> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler[LazyClassReceiverParameterDescriptor]

'Searcher' @ [43:24] ==> public constructor Searcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[ClassConstructorDescriptorImpl]

'element' @ [43:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'processor' @ [43:42] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'options' @ [43:53] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'addTask' @ [45:17] ==> protected final fun addTask(task: () -> Boolean): Unit defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher.<no name provided>[SimpleFunctionDescriptorImpl]

'search' @ [46:38] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'element' @ [46:45] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'options' @ [46:54] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'searchScope' @ [46:62] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'all' @ [46:75] ==> public inline fun <T> Iterable<(PsiReference..PsiReference?)>.all(predicate: ((PsiReference..PsiReference?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'KotlinFindUsagesHandler' @ [46:81] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'processUsage' @ [46:105] ==> internal final fun processUsage(processor: Processor<UsageInfo>, ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'processor' @ [46:118] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher[ValueParameterDescriptorImpl]

'it' @ [46:129] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler.createSearcher.<no name provided>.buildTaskList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [54:16] ==> public final val factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinTypeParameterFindUsagesHandler[PropertyDescriptorImpl]

'defaultOptions' @ [54:24] ==> public final val defaultOptions: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.KotlinFindUsagesHandlerFactory[PropertyDescriptorImpl]

