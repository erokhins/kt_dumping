'FindUsagesHandler' @ [37:7] ==> protected/*protected and package*/ constructor FindUsagesHandler(@NotNull p0: PsiElement) defined in com.intellij.find.findUsages.FindUsagesHandler[JavaClassConstructorDescriptor]

'psiElement' @ [37:25] ==> value-parameter psiElement: T defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.<init>[ValueParameterDescriptorImpl]

'Suppress' @ [39:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'psiElement' @ [40:16] ==> public final val <T : PsiElement> KotlinFindUsagesHandler<T>.psiElement: PsiElement[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> T

'this' @ [43:75] ==> public constructor KotlinFindUsagesHandler<T : PsiElement>(psiElement: T, elementsToSearch: Collection<PsiElement>, factory: KotlinFindUsagesHandlerFactory) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'psiElement' @ [43:80] ==> value-parameter psiElement: T defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [43:92] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'factory' @ [43:105] ==> value-parameter factory: KotlinFindUsagesHandlerFactory defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.<init>[ValueParameterDescriptorImpl]

'if (elementsToSearch.isEmpty())
            arrayOf(psiElement)
        else
            elementsToSearch.toTypedArray()' @ [46:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<PsiElement>, elseBranch: Array<PsiElement>): Array<PsiElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<PsiElement>

'elementsToSearch' @ [46:20] ==> private final val elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[PropertyDescriptorImpl]

'isEmpty' @ [46:37] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'arrayOf' @ [47:13] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: PsiElement): Array<PsiElement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> PsiElement

'psiElement' @ [47:21] ==> public final val <T : PsiElement> KotlinFindUsagesHandler<T>.psiElement: PsiElement[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> T

'elementsToSearch' @ [49:13] ==> private final val elementsToSearch: Collection<PsiElement> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[PropertyDescriptorImpl]

'toTypedArray' @ [49:30] ==> public inline fun <reified T> Collection<PsiElement>.toTypedArray(): Array<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> PsiElement

'options' @ [53:21] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'searchScope' @ [53:29] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'options' @ [55:13] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'isSearchForTextOccurrences' @ [55:21] ==> public final var isSearchForTextOccurrences: Boolean defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'scope' @ [55:51] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[LocalVariableDescriptor]

'options' @ [56:17] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'fastTrack' @ [56:25] ==> public final var fastTrack: (SearchRequestCollector..SearchRequestCollector?) defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'processUsagesInText' @ [57:24] ==> public open fun processUsagesInText(@NotNull p0: PsiElement, @NotNull p1: Processor<(UsageInfo..UsageInfo?)>, @NotNull p2: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[JavaMethodDescriptor]

'element' @ [57:44] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'processor' @ [57:53] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'scope' @ [57:64] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[LocalVariableDescriptor]

'options' @ [59:13] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'fastTrack' @ [59:21] ==> public final var fastTrack: (SearchRequestCollector..SearchRequestCollector?) defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'searchCustom' @ [59:31] ==> public final fun searchCustom(@NotNull p0: ((Processor<(PsiReference..PsiReference?)>..Processor<(PsiReference..PsiReference?)>?)) -> Boolean): Unit defined in com.intellij.psi.search.SearchRequestCollector[MyFunctionDescriptor]

'processUsagesInText' @ [60:17] ==> public open fun processUsagesInText(@NotNull p0: PsiElement, @NotNull p1: Processor<(UsageInfo..UsageInfo?)>, @NotNull p2: GlobalSearchScope): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[JavaMethodDescriptor]

'element' @ [60:37] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'processor' @ [60:46] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[ValueParameterDescriptorImpl]

'scope' @ [60:57] ==> val scope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchTextOccurrences[LocalVariableDescriptor]

'searchReferences' @ [67:16] ==> protected final fun searchReferences(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [67:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'processor' @ [67:42] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'options' @ [67:53] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'searchTextOccurrences' @ [67:65] ==> protected final fun searchTextOccurrences(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [67:87] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'processor' @ [67:96] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'options' @ [67:107] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.processElementUsages[ValueParameterDescriptorImpl]

'createSearcher' @ [71:24] ==> protected abstract fun createSearcher(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions): KotlinFindUsagesHandler.Searcher defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[SimpleFunctionDescriptorImpl]

'element' @ [71:39] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchReferences[ValueParameterDescriptorImpl]

'processor' @ [71:48] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchReferences[ValueParameterDescriptorImpl]

'options' @ [71:59] ==> value-parameter options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchReferences[ValueParameterDescriptorImpl]

'!' @ [72:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [72:14] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'searcher' @ [72:30] ==> val searcher: KotlinFindUsagesHandler.Searcher defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchReferences[LocalVariableDescriptor]

'buildTaskList' @ [72:39] ==> public abstract fun buildTaskList(): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[SimpleFunctionDescriptorImpl]

'searcher' @ [73:16] ==> val searcher: KotlinFindUsagesHandler.Searcher defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.searchReferences[LocalVariableDescriptor]

'executeTasks' @ [73:25] ==> public final fun executeTasks(): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[SimpleFunctionDescriptorImpl]

'synchronizedList' @ [79:35] ==> public open fun <T : (Any..Any?)> synchronizedList(p0: (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>?)): (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>?) defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'arrayListOf' @ [79:52] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<PsiReference> /* = ArrayList<PsiReference> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReference

'findUsagesOptions' @ [80:23] ==> public final val <T : PsiElement> KotlinFindUsagesHandler<T>.findUsagesOptions: FindUsagesOptions[MyPropertyDescriptor]
Inferred types:
    <T : PsiElement> -> T

'clone' @ [80:41] ==> public open fun clone(): FindUsagesOptions defined in com.intellij.find.findUsages.FindUsagesOptions[JavaMethodDescriptor]

'options' @ [81:9] ==> val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'searchScope' @ [81:17] ==> @NotNull public final var searchScope: SearchScope defined in com.intellij.find.findUsages.FindUsagesOptions[JavaPropertyDescriptor]

'searchScope' @ [81:31] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'searchReferences' @ [82:9] ==> protected final fun searchReferences(element: PsiElement, processor: Processor<UsageInfo>, options: FindUsagesOptions): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[SimpleFunctionDescriptorImpl]

'target' @ [82:26] ==> value-parameter target: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[ValueParameterDescriptorImpl]

'info' @ [84:33] ==> value-parameter info: UsageInfo defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight.<no name provided>.process[ValueParameterDescriptorImpl]

'reference' @ [84:38] ==> public final val UsageInfo.reference: PsiReference?[MyPropertyDescriptor]

'reference' @ [85:21] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight.<no name provided>.process[LocalVariableDescriptor]

'results' @ [86:21] ==> val results: (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'add' @ [86:29] ==> public abstract fun add(element: (PsiReference..PsiReference?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'reference' @ [86:33] ==> val reference: PsiReference? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight.<no name provided>.process[LocalVariableDescriptor]

'options' @ [90:12] ==> val options: FindUsagesOptions defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'results' @ [91:16] ==> val results: (MutableList<(PsiReference..PsiReference?)>..List<(PsiReference..PsiReference?)>?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.findReferencesToHighlight[LocalVariableDescriptor]

'ArrayList' @ [95:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Function0<Boolean>

'tasks' @ [101:13] ==> private final val tasks: ArrayList<() -> Boolean> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[PropertyDescriptorImpl]

'add' @ [101:19] ==> public open fun add(element: () -> Boolean): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'task' @ [101:23] ==> value-parameter task: () -> Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher.addTask[ValueParameterDescriptorImpl]

'tasks' @ [108:20] ==> private final val tasks: ArrayList<() -> Boolean> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Searcher[PropertyDescriptorImpl]

'all' @ [108:26] ==> public inline fun <T> Iterable<() -> Boolean>.all(predicate: (() -> Boolean) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<Boolean>

'invoke' @ [108:32] ==> public abstract operator fun invoke(): Boolean defined in kotlin.Function0[FunctionInvokeDescriptor]

'getInstance' @ [118:26] ==> @NotNull public open fun getInstance(@NotNull p0: raw (Class<(Any..Any?)>..Class<*>)): Logger defined in com.intellij.openapi.diagnostic.Logger[JavaMethodDescriptor]

'KotlinFindUsagesHandler' @ [118:38] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'java' @ [118:69] ==> public val <T> KClass<KotlinFindUsagesHandler<*>>.java: Class<KotlinFindUsagesHandler<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinFindUsagesHandler<*>

'processor' @ [121:13] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'processIfNotNull' @ [121:23] ==> private final fun Processor<UsageInfo>.processIfNotNull(callback: () -> UsageInfo?): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'if (ref.element.isValid) KotlinReferenceUsageInfo(ref) else null' @ [121:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageInfo?, elseBranch: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageInfo?

'ref' @ [121:46] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'element' @ [121:50] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'isValid' @ [121:58] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'KotlinReferenceUsageInfo' @ [121:67] ==> public constructor KotlinReferenceUsageInfo(reference: PsiReference) defined in org.jetbrains.kotlin.idea.findUsages.KotlinReferenceUsageInfo[ClassConstructorDescriptorImpl]

'ref' @ [121:92] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'processor' @ [124:13] ==> value-parameter processor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'processIfNotNull' @ [124:23] ==> private final fun Processor<UsageInfo>.processIfNotNull(callback: () -> UsageInfo?): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'if (element.isValid) UsageInfo(element) else null' @ [124:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UsageInfo?, elseBranch: UsageInfo?): UsageInfo?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UsageInfo?

'element' @ [124:46] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'isValid' @ [124:54] ==> public final val PsiElement.isValid: Boolean[MyPropertyDescriptor]

'UsageInfo' @ [124:63] ==> public constructor UsageInfo(@NotNull p0: PsiElement) defined in com.intellij.usageView.UsageInfo[JavaClassConstructorDescriptor]

'element' @ [124:73] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processUsage[ValueParameterDescriptorImpl]

'runReadAction' @ [127:29] ==> public fun <T> runReadAction(action: () -> UsageInfo?): UsageInfo? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageInfo?

'callback' @ [127:43] ==> value-parameter callback: () -> UsageInfo? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processIfNotNull[ValueParameterDescriptorImpl]

'if (usageInfo != null) process(usageInfo) else true' @ [128:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'usageInfo' @ [128:24] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processIfNotNull[LocalVariableDescriptor]

'process' @ [128:43] ==> public abstract fun process(p0: (UsageInfo..UsageInfo?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'usageInfo' @ [128:51] ==> val usageInfo: UsageInfo? defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.processIfNotNull[LocalVariableDescriptor]

'UniqueProcessor' @ [132:52] ==> public constructor UniqueProcessor<T : (Any..Any?)>(@NotNull p0: Processor<(UsageInfo..UsageInfo?)>) defined in com.intellij.util.CommonProcessors.UniqueProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.usageView.UsageInfo..com.intellij.usageView.UsageInfo?)

'usageInfoProcessor' @ [132:68] ==> value-parameter usageInfoProcessor: Processor<UsageInfo> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.createReferenceProcessor[ValueParameterDescriptorImpl]

'Processor' @ [134:20] ==> public fun <T : (Any..Any?)> Processor(function: ((PsiReference..PsiReference?)) -> Boolean): Processor<PsiReference> defined in com.intellij.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> PsiReference

'KotlinFindUsagesHandler' @ [134:32] ==> public companion object defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler[FakeCallableDescriptorForObject]

'processUsage' @ [134:56] ==> internal final fun processUsage(processor: Processor<UsageInfo>, ref: PsiReference): Boolean defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion[SimpleFunctionDescriptorImpl]

'uniqueProcessor' @ [134:69] ==> val uniqueProcessor: CommonProcessors.UniqueProcessor<(UsageInfo..UsageInfo?)> defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.createReferenceProcessor[LocalVariableDescriptor]

'it' @ [134:86] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.findUsages.handlers.KotlinFindUsagesHandler.Companion.createReferenceProcessor.<anonymous>[ValueParameterDescriptorImpl]

