'_file' @ [31:30] ==> private final val _file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoOccurrence[PropertyDescriptorImpl]

'_pattern' @ [32:33] ==> private final val _pattern: IndexPattern defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoOccurrence[PropertyDescriptorImpl]

'_textRange' @ [33:35] ==> private final val _textRange: TextRange defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoOccurrence[PropertyDescriptorImpl]

'QueryExecutorBase<IndexPatternOccurrence, IndexPatternSearch.SearchParameters>' @ [36:28] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> IndexPatternOccurrence
    <Params : (Any..Any?)> -> SearchParameters

'queryParameters' @ [38:23] ==> value-parameter queryParameters: IndexPatternSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[ValueParameterDescriptorImpl]

'pattern' @ [38:39] ==> public final val IndexPatternSearch.SearchParameters.pattern: (IndexPattern..IndexPattern?)[MyPropertyDescriptor]

'pattern' @ [39:13] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'!' @ [39:32] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'pattern' @ [39:33] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'patternString' @ [39:41] ==> public final var IndexPattern.patternString: String[MyPropertyDescriptor]

'contains' @ [39:55] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'pattern' @ [40:13] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'pattern' @ [41:13] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'queryParameters' @ [41:23] ==> value-parameter queryParameters: IndexPatternSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[ValueParameterDescriptorImpl]

'patternProvider' @ [41:39] ==> public final val IndexPatternSearch.SearchParameters.patternProvider: (IndexPatternProvider..IndexPatternProvider?)[MyPropertyDescriptor]

'indexPatterns' @ [41:55] ==> public final val IndexPatternProvider.indexPatterns: (Array<(IndexPattern..IndexPattern?)>..Array<out (IndexPattern..IndexPattern?)>)[MyPropertyDescriptor]

'firstOrNull' @ [41:69] ==> public inline fun <T> Array<out (IndexPattern..IndexPattern?)>.firstOrNull(predicate: ((IndexPattern..IndexPattern?)) -> Boolean): IndexPattern? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.search.IndexPattern..com.intellij.psi.search.IndexPattern?)

'it' @ [41:83] ==> value-parameter it: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery.<anonymous>[ValueParameterDescriptorImpl]

'patternString' @ [41:86] ==> public final var IndexPattern.patternString: String[MyPropertyDescriptor]

'contains' @ [41:100] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'queryParameters' @ [44:20] ==> value-parameter queryParameters: IndexPatternSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[ValueParameterDescriptorImpl]

'file' @ [44:36] ==> public final val IndexPatternSearch.SearchParameters.file: PsiFile[MyPropertyDescriptor]

'getInstance' @ [46:53] ==> public open fun getInstance(p0: (Project..Project?)): (TodoCacheManager..TodoCacheManager?) defined in com.intellij.psi.impl.cache.TodoCacheManager.SERVICE[JavaMethodDescriptor]

'file' @ [46:65] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'project' @ [46:70] ==> public final val PsiFile.project: Project[MyPropertyDescriptor]

'queryParameters' @ [47:31] ==> value-parameter queryParameters: IndexPatternSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[ValueParameterDescriptorImpl]

'patternProvider' @ [47:47] ==> public final val IndexPatternSearch.SearchParameters.patternProvider: (IndexPatternProvider..IndexPatternProvider?)[MyPropertyDescriptor]

'if (patternProvider != null) {
            cacheManager.getTodoCount(file.virtualFile, patternProvider)}
        else
            cacheManager.getTodoCount(file.virtualFile, pattern)' @ [48:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int, elseBranch: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int

'patternProvider' @ [48:25] ==> val patternProvider: (IndexPatternProvider..IndexPatternProvider?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'cacheManager' @ [49:13] ==> val cacheManager: (TodoCacheManager..TodoCacheManager?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'getTodoCount' @ [49:26] ==> public abstract fun getTodoCount(@NotNull p0: VirtualFile, @NotNull p1: IndexPatternProvider): Int defined in com.intellij.psi.impl.cache.TodoCacheManager[JavaMethodDescriptor]

'file' @ [49:39] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'virtualFile' @ [49:44] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'patternProvider' @ [49:57] ==> val patternProvider: (IndexPatternProvider..IndexPatternProvider?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'cacheManager' @ [51:13] ==> val cacheManager: (TodoCacheManager..TodoCacheManager?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'getTodoCount' @ [51:26] ==> public abstract fun getTodoCount(@NotNull p0: VirtualFile, @NotNull p1: IndexPattern): Int defined in com.intellij.psi.impl.cache.TodoCacheManager[JavaMethodDescriptor]

'file' @ [51:39] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'virtualFile' @ [51:44] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'pattern' @ [51:57] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'count' @ [52:13] ==> val count: Int defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'file' @ [54:9] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'accept' @ [54:14] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiFile[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [54:30] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [56:21] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [56:32] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'text' @ [56:50] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'consumer' @ [57:21] ==> value-parameter consumer: Processor<IndexPatternOccurrence> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[ValueParameterDescriptorImpl]

'process' @ [57:30] ==> public abstract fun process(p0: (IndexPatternOccurrence..IndexPatternOccurrence?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'KotlinTodoOccurrence' @ [57:38] ==> public constructor KotlinTodoOccurrence(_file: PsiFile, _textRange: TextRange, _pattern: IndexPattern) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoOccurrence[ClassConstructorDescriptorImpl]

'file' @ [57:59] ==> val file: PsiFile defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

'expression' @ [57:65] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'textRange' @ [57:76] ==> public final val KtCallExpression.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'pattern' @ [57:87] ==> var pattern: (IndexPattern..IndexPattern?) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinTodoSearcher.processQuery[LocalVariableDescriptor]

