'runReadAction' @ [48:16] ==> public fun <T> runReadAction(action: () -> KtFile?): KtFile? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile?

'findSourceFileForClass' @ [49:13] ==> public final fun findSourceFileForClass(project: Project, scopes: List<GlobalSearchScope>, className: JvmClassName, fileName: String): KtFile? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'project' @ [50:21] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'listOf' @ [51:21] ==> public fun <T> listOf(vararg elements: GlobalSearchScope): List<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GlobalSearchScope

'scope' @ [51:28] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'librarySources' @ [51:59] ==> @JvmStatic public final fun librarySources(delegate: GlobalSearchScope, project: Project): GlobalSearchScope defined in org.jetbrains.kotlin.idea.stubindex.KotlinSourceFilterScope.Companion[DeserializedSimpleFunctionDescriptor]

'allScope' @ [51:92] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [51:101] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'project' @ [51:111] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'className' @ [52:21] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'fileName' @ [53:21] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClassIncludeLibrarySources[ValueParameterDescriptorImpl]

'getExtension' @ [62:36] ==> @NotNull public open fun getExtension(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'fileName' @ [62:49] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'extension' @ [63:13] ==> val extension: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'KOTLIN_EXTENSIONS' @ [63:49] ==> public final val KOTLIN_EXTENSIONS: (Array<(String..String?)>..Array<out (String..String?)>?) defined in org.jetbrains.kotlin.idea.KotlinFileTypeFactory[JavaPropertyDescriptor]

'getInstance' @ [64:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [64:37] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'isDumb' @ [64:46] ==> public final val DumbService.isDumb: Boolean[MyPropertyDescriptor]

'scopes' @ [66:34] ==> value-parameter scopes: List<GlobalSearchScope> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'findFirstNotEmpty' @ [66:41] ==> private final fun <T, R> Collection<GlobalSearchScope>.findFirstNotEmpty(predicate: (GlobalSearchScope) -> Collection<KtFile>): Collection<KtFile>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> GlobalSearchScope
    <R> -> KtFile

'findFilesByNameInPackage' @ [66:61] ==> private final fun findFilesByNameInPackage(className: JvmClassName, fileName: String, project: Project, searchScope: GlobalSearchScope): List<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'className' @ [66:86] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'fileName' @ [66:97] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'project' @ [66:107] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'it' @ [66:116] ==> value-parameter it: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass.<anonymous>[ValueParameterDescriptorImpl]

'filesWithExactName' @ [68:13] ==> val filesWithExactName: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'isEmpty' @ [68:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'filesWithExactName' @ [70:13] ==> val filesWithExactName: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'size' @ [70:32] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'filesWithExactName' @ [71:20] ==> val filesWithExactName: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'single' @ [71:39] ==> public fun <T> Iterable<KtFile>.single(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'className' @ [75:26] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'fqNameForClassNameWithoutDollars' @ [75:36] ==> public final val JvmClassName.fqNameForClassNameWithoutDollars: FqName[MyPropertyDescriptor]

'scopes' @ [76:28] ==> value-parameter scopes: List<GlobalSearchScope> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'findFirstNotEmpty' @ [76:35] ==> private final fun <T, R> Collection<GlobalSearchScope>.findFirstNotEmpty(predicate: (GlobalSearchScope) -> Collection<KtFile>): Collection<KtFile>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> GlobalSearchScope
    <R> -> KtFile

'StaticFacadeIndexUtil' @ [76:55] ==> public object StaticFacadeIndexUtil defined in org.jetbrains.kotlin.idea.stubindex[FakeCallableDescriptorForObject]

'findFilesForFilePart' @ [76:77] ==> @JvmStatic public final fun findFilesForFilePart(partFqName: FqName, searchScope: GlobalSearchScope, project: Project): Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.StaticFacadeIndexUtil[DeserializedSimpleFunctionDescriptor]

'partFqName' @ [76:98] ==> val partFqName: FqName defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'it' @ [76:110] ==> value-parameter it: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [76:114] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'!' @ [77:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'filesForPart' @ [77:14] ==> val filesForPart: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'isEmpty' @ [77:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'filesForPart' @ [78:26] ==> val filesForPart: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'file' @ [79:21] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'name' @ [79:26] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'fileName' @ [79:34] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[ValueParameterDescriptorImpl]

'file' @ [80:28] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'filesWithExactName' @ [87:16] ==> val filesWithExactName: Collection<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findSourceFileForClass[LocalVariableDescriptor]

'first' @ [87:35] ==> public fun <T> Iterable<KtFile>.first(): KtFile defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'emptyList' @ [91:37] ==> public fun <T> emptyList(): List<R> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> R

'this' @ [92:19] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFirstNotEmpty[ReceiverParameterDescriptorImpl]

'result' @ [93:13] ==> var result: Collection<R> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFirstNotEmpty[LocalVariableDescriptor]

'invoke' @ [93:22] ==> public abstract operator fun invoke(p1: T): Collection<R> defined in kotlin.Function1[FunctionInvokeDescriptor]

'e' @ [93:32] ==> val e: T defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFirstNotEmpty[LocalVariableDescriptor]

'result' @ [94:17] ==> var result: Collection<R> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFirstNotEmpty[LocalVariableDescriptor]

'isNotEmpty' @ [94:24] ==> @InlineOnly public inline fun <T> Collection<R>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> R

'result' @ [96:16] ==> var result: Collection<R> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFirstNotEmpty[LocalVariableDescriptor]

'findFilesWithExactPackage' @ [100:15] ==> @JvmStatic public final fun findFilesWithExactPackage(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Collection<KtFile> defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[FunctionImportedFromObject]

'className' @ [100:41] ==> value-parameter className: JvmClassName defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFilesByNameInPackage[ValueParameterDescriptorImpl]

'packageFqName' @ [100:51] ==> public final val JvmClassName.packageFqName: FqName[MyPropertyDescriptor]

'searchScope' @ [100:66] ==> value-parameter searchScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFilesByNameInPackage[ValueParameterDescriptorImpl]

'project' @ [100:79] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFilesByNameInPackage[ValueParameterDescriptorImpl]

'filter' @ [100:88] ==> public inline fun <T> Iterable<KtFile>.filter(predicate: (KtFile) -> Boolean): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'it' @ [100:97] ==> value-parameter it: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFilesByNameInPackage.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [100:100] ==> public final var KtFile.name: String[MyPropertyDescriptor]

'fileName' @ [100:108] ==> value-parameter fileName: String defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.findFilesByNameInPackage[ValueParameterDescriptorImpl]

'HashSet' @ [108:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'analyzeElementWithInline' @ [109:23] ==> private final fun analyzeElementWithInline(resolutionFacade: ResolutionFacade, element: KtElement, deep: Int, analyzedElements: MutableSet<KtElement>, analyzeInlineFunctions: Boolean, fullResolveContext: BindingContext? = ...): BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'resolutionFacadeForFile' @ [110:17] ==> value-parameter resolutionFacadeForFile: ResolutionFacade defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[ValueParameterDescriptorImpl]

'file' @ [111:17] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[ValueParameterDescriptorImpl]

'analyzedElements' @ [113:17] ==> val analyzedElements: HashSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'!' @ [114:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analyzeOnlyReifiedInlineFunctions' @ [114:18] ==> value-parameter analyzeOnlyReifiedInlineFunctions: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[ValueParameterDescriptorImpl]

'bindingContext' @ [114:53] ==> value-parameter bindingContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[ValueParameterDescriptorImpl]

'LinkedHashSet' @ [119:25] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtFile

'toProcess' @ [120:9] ==> val toProcess: LinkedHashSet<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'add' @ [120:19] ==> public open fun add(element: KtFile): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'file' @ [120:23] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[ValueParameterDescriptorImpl]

'analyzedElements' @ [122:34] ==> val analyzedElements: HashSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'collectedElement' @ [123:34] ==> val collectedElement: KtElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'containingKtFile' @ [123:51] ==> public final val KtElement.containingKtFile: KtFile[MyPropertyDescriptor]

'toProcess' @ [124:13] ==> val toProcess: LinkedHashSet<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'add' @ [124:23] ==> public open fun add(element: KtFile): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'containingFile' @ [124:27] ==> val containingFile: KtFile defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'Pair' @ [127:16] ==> public constructor Pair<out A, out B>(first: BindingContext, second: List<KtFile>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> BindingContext
    <out B> -> List<KtFile>

'context' @ [127:51] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'ArrayList' @ [127:60] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (KtFile..KtFile?)>..Collection<(KtFile..KtFile?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtFile..org.jetbrains.kotlin.psi.KtFile?)

'toProcess' @ [127:70] ==> val toProcess: LinkedHashSet<KtFile> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeInlinedFunctions[LocalVariableDescriptor]

'HashSet' @ [131:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtElement

'analyzeElementWithInline' @ [132:9] ==> private final fun analyzeElementWithInline(resolutionFacade: ResolutionFacade, element: KtElement, deep: Int, analyzedElements: MutableSet<KtElement>, analyzeInlineFunctions: Boolean, fullResolveContext: BindingContext? = ...): BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'function' @ [132:34] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'getResolutionFacade' @ [132:43] ==> public fun KtElement.getResolutionFacade(): ResolutionFacade defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'function' @ [132:66] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyzedElements' @ [132:79] ==> val analyzedElements: HashSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'!' @ [132:97] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analyzeInlineFunctions' @ [132:98] ==> value-parameter analyzeInlineFunctions: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyzedElements' @ [133:16] ==> val analyzedElements: HashSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'element' @ [144:23] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'project' @ [144:31] ==> public final val KtElement.project: Project[MyPropertyDescriptor]

'HashSet' @ [145:31] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtNamedFunction

'ArrayList' @ [147:29] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> BindingContext

'innerContexts' @ [148:9] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'addIfNotNull' @ [148:23] ==> public fun <T : Any> MutableCollection<BindingContext>.addIfNotNull(t: BindingContext?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> BindingContext

'fullResolveContext' @ [148:36] ==> value-parameter fullResolveContext: BindingContext? = ... defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'element' @ [150:9] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'accept' @ [150:17] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'KtTreeVisitorVoid' @ [150:33] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [152:17] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpression' @ [152:23] ==> public open fun visitExpression(@NotNull p0: KtExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [152:39] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'resolutionFacade' @ [154:38] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyze' @ [154:55] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [154:63] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'innerContexts' @ [155:17] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'add' @ [155:31] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [155:35] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[LocalVariableDescriptor]

'bindingContext' @ [157:28] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[LocalVariableDescriptor]

'get' @ [157:43] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtElement..KtElement?), (Call..Call?)>..ReadOnlySlice<(KtElement..KtElement?), (Call..Call?)>?), p1: (KtElement..KtElement?)): Call? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtElement..org.jetbrains.kotlin.psi.KtElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)

'CALL' @ [157:62] ==> public final val CALL: (WritableSlice<(KtElement..KtElement?), (Call..Call?)>..WritableSlice<(KtElement..KtElement?), (Call..Call?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [157:68] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [159:36] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[LocalVariableDescriptor]

'get' @ [159:51] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..ReadOnlySlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?), p1: (Call..Call?)): ResolvedCall<*>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<*>?)

'RESOLVED_CALL' @ [159:70] ==> public final val RESOLVED_CALL: (WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>..WritableSlice<(Call..Call?), (ResolvedCall<*>..ResolvedCall<*>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'call' @ [159:85] ==> val call: Call defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[LocalVariableDescriptor]

'checkResolveCall' @ [160:17] ==> private final fun checkResolveCall(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [160:34] ==> val resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitExpression[LocalVariableDescriptor]

'super' @ [164:17] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDestructuringDeclaration' @ [164:23] ==> public open fun visitDestructuringDeclaration(@NotNull p0: KtDestructuringDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'destructuringDeclaration' @ [164:53] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'resolutionFacade' @ [166:38] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyze' @ [166:55] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'destructuringDeclaration' @ [166:63] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'innerContexts' @ [167:17] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'add' @ [167:31] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [167:35] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'destructuringDeclaration' @ [169:31] ==> value-parameter destructuringDeclaration: KtDestructuringDeclaration defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[ValueParameterDescriptorImpl]

'entries' @ [169:56] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'bindingContext' @ [170:40] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'get' @ [170:55] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'COMPONENT_RESOLVED_CALL' @ [170:74] ==> public final val COMPONENT_RESOLVED_CALL: (WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'entry' @ [170:99] ==> val entry: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'checkResolveCall' @ [171:21] ==> private final fun checkResolveCall(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [171:38] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitDestructuringDeclaration[LocalVariableDescriptor]

'super' @ [176:17] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitForExpression' @ [176:23] ==> public open fun visitForExpression(@NotNull p0: KtForExpression): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'expression' @ [176:42] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'resolutionFacade' @ [178:38] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyze' @ [178:55] ==> public abstract fun analyze(element: KtElement, bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.resolve.ResolutionFacade[DeserializedSimpleFunctionDescriptor]

'expression' @ [178:63] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'innerContexts' @ [179:17] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'add' @ [179:31] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'bindingContext' @ [179:35] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[LocalVariableDescriptor]

'checkResolveCall' @ [181:17] ==> private final fun checkResolveCall(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[SimpleFunctionDescriptorImpl]

'bindingContext' @ [181:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[LocalVariableDescriptor]

'get' @ [181:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_ITERATOR_RESOLVED_CALL' @ [181:68] ==> public final val LOOP_RANGE_ITERATOR_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [181:103] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [181:114] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'checkResolveCall' @ [182:17] ==> private final fun checkResolveCall(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[SimpleFunctionDescriptorImpl]

'bindingContext' @ [182:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[LocalVariableDescriptor]

'get' @ [182:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_HAS_NEXT_RESOLVED_CALL' @ [182:68] ==> public final val LOOP_RANGE_HAS_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [182:103] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [182:114] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'checkResolveCall' @ [183:17] ==> private final fun checkResolveCall(resolvedCall: ResolvedCall<*>?): Unit defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>[SimpleFunctionDescriptorImpl]

'bindingContext' @ [183:34] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[LocalVariableDescriptor]

'get' @ [183:49] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?), p1: (KtExpression..KtExpression?)): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>..org.jetbrains.kotlin.resolve.calls.model.ResolvedCall<(org.jetbrains.kotlin.descriptors.FunctionDescriptor..org.jetbrains.kotlin.descriptors.FunctionDescriptor?)>?)

'LOOP_RANGE_NEXT_RESOLVED_CALL' @ [183:68] ==> public final val LOOP_RANGE_NEXT_RESOLVED_CALL: (WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>..WritableSlice<(KtExpression..KtExpression?), (ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>..ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [183:99] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [183:110] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'resolvedCall' @ [187:21] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[ValueParameterDescriptorImpl]

'resolvedCall' @ [189:34] ==> value-parameter resolvedCall: ResolvedCall<*>? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[ValueParameterDescriptorImpl]

'resultingDescriptor' @ [189:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'descriptor' @ [190:21] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'isInline' @ [192:32] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [192:41] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'analyzeInlineFunctions' @ [192:57] ==> value-parameter analyzeInlineFunctions: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'hasReifiedTypeParameters' @ [192:83] ==> private final fun hasReifiedTypeParameters(descriptor: CallableDescriptor): Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [192:108] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'DescriptorToSourceUtilsIde' @ [193:39] ==> public object DescriptorToSourceUtilsIde defined in org.jetbrains.kotlin.idea.codeInsight[FakeCallableDescriptorForObject]

'getAnyDeclaration' @ [193:66] ==> public final fun getAnyDeclaration(project: Project, descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.idea.codeInsight.DescriptorToSourceUtilsIde[DeserializedSimpleFunctionDescriptor]

'project' @ [193:84] ==> val project: Project defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'descriptor' @ [193:93] ==> val descriptor: (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'declaration' @ [194:25] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'declaration' @ [194:48] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'!' @ [194:82] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'analyzedElements' @ [194:83] ==> value-parameter analyzedElements: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'contains' @ [194:100] ==> public abstract fun contains(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'declaration' @ [194:109] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'inlineFunctions' @ [195:25] ==> val inlineFunctions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'add' @ [195:41] ==> public open fun add(element: KtNamedFunction): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'declaration' @ [195:45] ==> val declaration: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline.<no name provided>.checkResolveCall[LocalVariableDescriptor]

'analyzedElements' @ [201:9] ==> value-parameter analyzedElements: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'add' @ [201:26] ==> public abstract fun add(element: KtElement): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'element' @ [201:30] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'!' @ [203:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'inlineFunctions' @ [203:14] ==> val inlineFunctions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'isEmpty' @ [203:30] ==> public open fun isEmpty(): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'deep' @ [203:43] ==> value-parameter deep: Int defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'inlineFunctions' @ [204:36] ==> val inlineFunctions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'inlineFunction' @ [205:28] ==> val inlineFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'bodyExpression' @ [205:43] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'body' @ [206:21] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'innerContexts' @ [207:21] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'add' @ [207:35] ==> public open fun add(element: BindingContext): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'analyzeElementWithInline' @ [207:39] ==> private final fun analyzeElementWithInline(resolutionFacade: ResolutionFacade, element: KtElement, deep: Int, analyzedElements: MutableSet<KtElement>, analyzeInlineFunctions: Boolean, fullResolveContext: BindingContext? = ...): BindingContext defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils[SimpleFunctionDescriptorImpl]

'resolutionFacade' @ [207:64] ==> value-parameter resolutionFacade: ResolutionFacade defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'inlineFunction' @ [207:82] ==> val inlineFunction: KtNamedFunction defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'deep' @ [207:98] ==> value-parameter deep: Int defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyzedElements' @ [207:108] ==> value-parameter analyzedElements: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyzeInlineFunctions' @ [207:126] ==> value-parameter analyzeInlineFunctions: Boolean defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'analyzedElements' @ [211:13] ==> value-parameter analyzedElements: MutableSet<KtElement> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[ValueParameterDescriptorImpl]

'addAll' @ [211:30] ==> public abstract fun addAll(elements: Collection<KtElement>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'inlineFunctions' @ [211:37] ==> val inlineFunctions: HashSet<KtNamedFunction> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'CompositeBindingContext' @ [214:16] ==> public companion object defined in org.jetbrains.kotlin.resolve.CompositeBindingContext[FakeCallableDescriptorForObject]

'create' @ [214:40] ==> public final fun create(delegates: List<BindingContext>): BindingContext defined in org.jetbrains.kotlin.resolve.CompositeBindingContext.Companion[DeserializedSimpleFunctionDescriptor]

'innerContexts' @ [214:47] ==> val innerContexts: ArrayList<BindingContext> defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.analyzeElementWithInline[LocalVariableDescriptor]

'descriptor' @ [218:16] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.hasReifiedTypeParameters[ValueParameterDescriptorImpl]

'typeParameters' @ [218:27] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'any' @ [218:42] ==> public inline fun <T> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.any(predicate: ((TypeParameterDescriptor..TypeParameterDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)

'it' @ [218:50] ==> value-parameter it: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.debugger.DebuggerUtils.hasReifiedTypeParameters.<anonymous>[ValueParameterDescriptorImpl]

'isReified' @ [218:53] ==> public final val TypeParameterDescriptor.isReified: Boolean[MyPropertyDescriptor]

