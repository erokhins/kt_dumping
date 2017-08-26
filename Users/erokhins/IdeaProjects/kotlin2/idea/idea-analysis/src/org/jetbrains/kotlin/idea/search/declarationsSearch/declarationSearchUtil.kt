'originalElement' @ [36:43] ==> public abstract val originalElement: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.SearchRequestWithElement[PropertyDescriptorImpl]

'project' @ [36:59] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'QueryFactory<T, R>' @ [39:83] ==> public constructor QueryFactory<Result : (Any..Any?), Parameters : (Any..Any?)>() defined in com.intellij.util.QueryFactory[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> T
    <Parameters : (Any..Any?)> -> R

'registerExecutor' @ [41:9] ==> public final fun registerExecutor(executor: QueryExecutor<T, R>): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[SimpleFunctionDescriptorImpl]

'QueryExecutorBase<T, R>' @ [42:26] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> T
    <Params : (Any..Any?)> -> R

'doSearch' @ [44:25] ==> protected abstract fun doSearch(request: R, consumer: Processor<T>): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[SimpleFunctionDescriptorImpl]

'queryParameters' @ [44:34] ==> value-parameter queryParameters: R defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch.<init>.<no name provided>.processQuery[ValueParameterDescriptorImpl]

'consumer' @ [44:51] ==> value-parameter consumer: Processor<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch.<init>.<no name provided>.processQuery[ValueParameterDescriptorImpl]

'super' @ [51:9] ==> <this> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[LazyClassReceiverParameterDescriptor]

'registerExecutor' @ [51:15] ==> public open fun registerExecutor(@NotNull p0: QueryExecutor<(T..T?), (R..R?)>): Unit defined in com.intellij.util.QueryFactory[JavaMethodDescriptor]

'executor' @ [51:32] ==> value-parameter executor: QueryExecutor<T, R> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch.registerExecutor[ValueParameterDescriptorImpl]

'if (isApplicable(request)) createUniqueResultsQuery(request) else EmptyQuery.getEmptyQuery<T>()' @ [57:40] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Query<T>, elseBranch: Query<T>): Query<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Query<T>

'isApplicable' @ [57:44] ==> protected open fun isApplicable(request: R): Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[SimpleFunctionDescriptorImpl]

'request' @ [57:57] ==> value-parameter request: R defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch.search[ValueParameterDescriptorImpl]

'createUniqueResultsQuery' @ [57:67] ==> @NotNull public final fun createUniqueResultsQuery(@NotNull p0: R): Query<(T..T?)> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[JavaMethodDescriptor]

'request' @ [57:92] ==> value-parameter request: R defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch.search[ValueParameterDescriptorImpl]

'getEmptyQuery' @ [57:117] ==> public open fun <T : (Any..Any?)> getEmptyQuery(): (Query<(T..T?)>..Query<(T..T?)>?) defined in com.intellij.util.EmptyQuery[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'HierarchySearchRequest' @ [66:13] ==> public constructor HierarchySearchRequest<T : PsiElement>(originalElement: U, searchScope: SearchScope, searchDeeply: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> U

'newOriginalElement' @ [66:36] ==> value-parameter newOriginalElement: U defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest.copy[ValueParameterDescriptorImpl]

'searchScope' @ [66:56] ==> public open val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'searchDeeply' @ [66:69] ==> public final val searchDeeply: Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'Stack' @ [74:21] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'HashSet' @ [75:25] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> T

'stack' @ [77:9] ==> val stack: Stack<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'push' @ [77:15] ==> public open fun push(p0: (T..T?)): (T..T?) defined in java.util.Stack[JavaMethodDescriptor]

'initialElement' @ [77:20] ==> value-parameter initialElement: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[ValueParameterDescriptorImpl]

'!' @ [78:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'stack' @ [78:17] ==> val stack: Stack<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'isEmpty' @ [78:23] ==> public open fun isEmpty(): Boolean defined in java.util.Stack[JavaMethodDescriptor]

'checkCanceled' @ [79:39] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicatorProvider[JavaMethodDescriptor]

'stack' @ [81:27] ==> val stack: Stack<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'pop' @ [81:33] ==> public open fun pop(): (T..T?) defined in java.util.Stack[JavaMethodDescriptor]

'!' @ [82:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'processed' @ [82:18] ==> val processed: HashSet<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'add' @ [82:28] ==> public open fun add(element: T): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'current' @ [82:32] ==> val current: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'nextElements' @ [84:26] ==> public abstract fun nextElements(current: T): Iterable<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser[SimpleFunctionDescriptorImpl]

'current' @ [84:39] ==> val current: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'checkCanceled' @ [85:43] ==> public open fun checkCanceled(): Unit defined in com.intellij.openapi.progress.ProgressIndicatorProvider[JavaMethodDescriptor]

'invoke' @ [87:17] ==> public abstract operator fun invoke(p1: T): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'next' @ [87:22] ==> val next: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'shouldDescend' @ [89:21] ==> public abstract fun shouldDescend(element: T): Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser[SimpleFunctionDescriptorImpl]

'next' @ [89:35] ==> val next: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'stack' @ [90:21] ==> val stack: Stack<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'push' @ [90:27] ==> public open fun push(p0: (T..T?)): (T..T?) defined in java.util.Stack[JavaMethodDescriptor]

'next' @ [90:32] ==> val next: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser.forEach[LocalVariableDescriptor]

'traverser' @ [98:5] ==> value-parameter traverser: HierarchyTraverser<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.consumeHierarchy[ValueParameterDescriptorImpl]

'forEach' @ [98:15] ==> public open fun forEach(initialElement: T, body: (T) -> Unit): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchyTraverser[SimpleFunctionDescriptorImpl]

'request' @ [98:23] ==> value-parameter request: SearchRequestWithElement<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.consumeHierarchy[ValueParameterDescriptorImpl]

'originalElement' @ [98:31] ==> public abstract val originalElement: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.SearchRequestWithElement[PropertyDescriptorImpl]

'element' @ [99:13] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.consumeHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'request' @ [99:24] ==> value-parameter request: SearchRequestWithElement<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.consumeHierarchy[ValueParameterDescriptorImpl]

'searchScope' @ [99:32] ==> public abstract val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.declarationsSearch.SearchRequestWithElement[PropertyDescriptorImpl]

'process' @ [100:13] ==> public abstract fun process(p0: (T..T?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'element' @ [100:21] ==> value-parameter element: T defined in org.jetbrains.kotlin.idea.search.declarationsSearch.consumeHierarchy.<anonymous>[ValueParameterDescriptorImpl]

'DeclarationsSearch<T, HierarchySearchRequest<T>>' @ [107:4] ==> public constructor DeclarationsSearch<T : PsiElement, R : DeclarationSearchRequest<T>>() defined in org.jetbrains.kotlin.idea.search.declarationsSearch.DeclarationsSearch[ClassConstructorDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T
    <R : DeclarationSearchRequest<T>> -> HierarchySearchRequest<T>

'consumer' @ [109:9] ==> value-parameter consumer: Processor<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearchAll[ValueParameterDescriptorImpl]

'consumeHierarchy' @ [109:18] ==> public fun <T : PsiElement> Processor<T>.consumeHierarchy(request: SearchRequestWithElement<T>, traverser: HierarchyTraverser<T>): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> T

'request' @ [109:35] ==> value-parameter request: HierarchySearchRequest<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearchAll[ValueParameterDescriptorImpl]

'traverser' @ [109:44] ==> protected final val traverser: HierarchyTraverser<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch[PropertyDescriptorImpl]

'if (request.searchDeeply) {
            doSearchAll(request, consumer)
        }
        else {
            doSearchDirect(request, consumer)
        }' @ [115:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'request' @ [115:13] ==> value-parameter request: HierarchySearchRequest<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearch[ValueParameterDescriptorImpl]

'searchDeeply' @ [115:21] ==> public final val searchDeeply: Boolean defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearchRequest[PropertyDescriptorImpl]

'doSearchAll' @ [116:13] ==> protected open fun doSearchAll(request: HierarchySearchRequest<T>, consumer: Processor<T>): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch[SimpleFunctionDescriptorImpl]

'request' @ [116:25] ==> value-parameter request: HierarchySearchRequest<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearch[ValueParameterDescriptorImpl]

'consumer' @ [116:34] ==> value-parameter consumer: Processor<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearch[ValueParameterDescriptorImpl]

'doSearchDirect' @ [119:13] ==> protected abstract fun doSearchDirect(request: HierarchySearchRequest<T>, consumer: Processor<T>): Unit defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch[SimpleFunctionDescriptorImpl]

'request' @ [119:28] ==> value-parameter request: HierarchySearchRequest<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearch[ValueParameterDescriptorImpl]

'consumer' @ [119:37] ==> value-parameter consumer: Processor<T> defined in org.jetbrains.kotlin.idea.search.declarationsSearch.HierarchySearch.doSearch[ValueParameterDescriptorImpl]

