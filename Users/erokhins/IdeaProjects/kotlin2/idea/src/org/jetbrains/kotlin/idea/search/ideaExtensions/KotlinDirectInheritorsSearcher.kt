'QueryExecutorBase<PsiClass, DirectClassInheritorsSearch.SearchParameters>' @ [32:45] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiClass
    <Params : (Any..Any?)> -> SearchParameters

'queryParameters' @ [34:25] ==> value-parameter queryParameters: DirectClassInheritorsSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[ValueParameterDescriptorImpl]

'classToProcess' @ [34:41] ==> public final val DirectClassInheritorsSearch.SearchParameters.classToProcess: PsiClass[MyPropertyDescriptor]

'baseClass' @ [36:20] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'name' @ [36:30] ==> public final val PsiClass.name: String?[MyPropertyDescriptor]

'queryParameters' @ [38:29] ==> value-parameter queryParameters: DirectClassInheritorsSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[ValueParameterDescriptorImpl]

'scope' @ [38:45] ==> public final val DirectClassInheritorsSearch.SearchParameters.scope: SearchScope[MyPropertyDescriptor]

'originalScope' @ [39:21] ==> val originalScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'baseClass' @ [39:60] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'containingFile' @ [39:70] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'fileScope' @ [39:86] ==> public fun PsiFile.fileScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'baseClass' @ [41:20] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'containingFile' @ [41:30] ==> public final val PsiClass.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'mutableSetOf' @ [43:21] ==> public fun <T> mutableSetOf(vararg elements: String): MutableSet<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'name' @ [43:34] ==> val name: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'file' @ [44:23] ==> val file: (PsiFile..PsiFile?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'project' @ [44:28] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'KotlinTypeAliasByExpansionShortNameIndex' @ [46:30] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinTypeAliasByExpansionShortNameIndex[FakeCallableDescriptorForObject]

'getInstance' @ [46:71] ==> @JvmStatic public final fun getInstance(): KotlinTypeAliasByExpansionShortNameIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinTypeAliasByExpansionShortNameIndex.Companion[DeserializedSimpleFunctionDescriptor]

'checkCanceled' @ [49:29] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'typeAliasIndex' @ [50:13] ==> val typeAliasIndex: KotlinTypeAliasByExpansionShortNameIndex defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'typeName' @ [50:28] ==> value-parameter typeName: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.searchForTypeAliasesRecursively[ValueParameterDescriptorImpl]

'project' @ [50:38] ==> val project: Project defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'scope' @ [50:47] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'asSequence' @ [50:54] ==> public fun <T> Iterable<KtTypeAlias>.asSequence(): Sequence<KtTypeAlias> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias

'map' @ [51:22] ==> public fun <T, R> Sequence<KtTypeAlias>.map(transform: (KtTypeAlias) -> String?): Sequence<String?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeAlias
    <R> -> String?

'it' @ [51:28] ==> value-parameter it: KtTypeAlias defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.searchForTypeAliasesRecursively.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [51:31] ==> public final val KtTypeAlias.name: String?[MyPropertyDescriptor]

'filterNotNull' @ [52:22] ==> public fun <T : Any> Sequence<String?>.filterNotNull(): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> String

'filter' @ [53:22] ==> public fun <T> Sequence<String>.filter(predicate: (String) -> Boolean): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [53:31] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.searchForTypeAliasesRecursively.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [53:38] ==> val names: MutableSet<String> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'onEach' @ [54:22] ==> @SinceKotlin public fun <T> Sequence<String>.onEach(action: (String) -> Unit): Sequence<String> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'names' @ [54:31] ==> val names: MutableSet<String> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'add' @ [54:37] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [54:41] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.searchForTypeAliasesRecursively.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [55:22] ==> public inline fun <T> Sequence<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'searchForTypeAliasesRecursively' @ [58:9] ==> local final fun searchForTypeAliasesRecursively(typeName: String): Unit defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[SimpleFunctionDescriptorImpl]

'name' @ [58:41] ==> val name: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'runReadAction' @ [60:9] ==> public fun <T> runReadAction(action: () -> Unit): Unit defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'KotlinSourceFilterScope' @ [61:40] ==> public companion object defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope[FakeCallableDescriptorForObject]

'projectSourceAndClassFiles' @ [61:64] ==> @JvmStatic public final fun projectSourceAndClassFiles(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'scope' @ [61:91] ==> val scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'baseClass' @ [61:98] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'project' @ [61:108] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'names' @ [63:13] ==> val names: MutableSet<String> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'forEach' @ [63:19] ==> @HidesMembers public inline fun <T> Iterable<String>.forEach(action: (String) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getInstance' @ [64:39] ==> @NotNull public open fun getInstance(): KotlinSuperClassIndex defined in org.jetbrains.kotlin.idea.stubindex.KotlinSuperClassIndex[JavaMethodDescriptor]

'get' @ [65:26] ==> @NotNull public open fun get(@NotNull p0: String, @NotNull p1: Project, @NotNull p2: GlobalSearchScope): (MutableCollection<(KtClassOrObject..KtClassOrObject?)>..Collection<(KtClassOrObject..KtClassOrObject?)>) defined in org.jetbrains.kotlin.idea.stubindex.KotlinSuperClassIndex[JavaMethodDescriptor]

'name' @ [65:30] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'baseClass' @ [65:36] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'project' @ [65:46] ==> public final val PsiClass.project: Project[MyPropertyDescriptor]

'noLibrarySourceScope' @ [65:55] ==> val noLibrarySourceScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.<anonymous>[LocalVariableDescriptor]

'asSequence' @ [65:77] ==> public fun <T> Iterable<(KtClassOrObject..KtClassOrObject?)>.asSequence(): Sequence<(KtClassOrObject..KtClassOrObject?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)

'mapNotNull' @ [66:26] ==> public fun <T, R : Any> Sequence<(KtClassOrObject..KtClassOrObject?)>.mapNotNull(transform: ((KtClassOrObject..KtClassOrObject?)) -> PsiClass?): Sequence<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtClassOrObject..org.jetbrains.kotlin.psi.KtClassOrObject?)
    <R : Any> -> PsiClass

'SourceNavigationHelper' @ [66:52] ==> public object SourceNavigationHelper defined in org.jetbrains.kotlin.idea.decompiler.navigation[FakeCallableDescriptorForObject]

'getOriginalPsiClassOrCreateLightClass' @ [66:75] ==> public final fun getOriginalPsiClassOrCreateLightClass(classOrObject: KtClassOrObject): PsiClass? defined in org.jetbrains.kotlin.idea.decompiler.navigation.SourceNavigationHelper[DeserializedSimpleFunctionDescriptor]

'candidate' @ [66:113] ==> value-parameter candidate: (KtClassOrObject..KtClassOrObject?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [67:26] ==> public fun <T> Sequence<PsiClass>.filter(predicate: (PsiClass) -> Boolean): Sequence<PsiClass> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'candidate' @ [67:48] ==> value-parameter candidate: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isInheritor' @ [67:58] ==> public abstract fun isInheritor(@NotNull p0: PsiClass, p1: Boolean): Boolean defined in com.intellij.psi.PsiClass[JavaMethodDescriptor]

'baseClass' @ [67:70] ==> val baseClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[LocalVariableDescriptor]

'forEach' @ [68:26] ==> public inline fun <T> Sequence<PsiClass>.forEach(action: (PsiClass) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiClass

'consumer' @ [68:49] ==> value-parameter consumer: Processor<PsiClass> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery[ValueParameterDescriptorImpl]

'process' @ [68:58] ==> public abstract fun process(p0: (PsiClass..PsiClass?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'candidate' @ [68:66] ==> value-parameter candidate: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinDirectInheritorsSearcher.processQuery.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

