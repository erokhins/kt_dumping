'KotlinDebuggerCaches' @ [46:46] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'getOrCreateTypeMapper' @ [46:67] ==> public final fun getOrCreateTypeMapper(psiElement: PsiElement): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [46:89] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'bindingContext' @ [46:102] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'if (!checkIfInline(declaration, bindingContext)) {
            return ComputedClassNames.EMPTY
        }
        else {
            val searchResult = hashSetOf<PsiElement>()
            val declarationName = runReadAction { declaration.name }

            val task = Runnable {
                ReferencesSearch.search(declaration, getScopeForInlineDeclarationUsages(declaration)).forEach {
                    if (!runReadAction { it.isImportUsage() }) {
                        val usage = (it.element as? KtElement)?.let(::getRelevantElement)
                        if (usage != null) {
                            searchResult.add(usage)
                        }
                    }
                }
            }

            var isSuccess = true
            val applicationEx = ApplicationManagerEx.getApplicationEx()
            if (!applicationEx.isUnitTestMode && (!applicationEx.holdsReadLock() || applicationEx.isDispatchThread)) {
                applicationEx.invokeAndWait(
                        {
                            isSuccess = ProgressManager.getInstance().runProcessWithProgressSynchronously(
                                    task,
                                    "Compute class names for declaration $declarationName",
                                    true,
                                    myDebugProcess.project)
                        }, ModalityState.NON_MODAL)
            }
            else {
                // Pooled thread with read lock. Can't invoke task under UI progress, so call it directly.
                task.run()
            }

            if (!isSuccess) {
                XDebugSessionImpl.NOTIFICATION_GROUP.createNotification(
                        "Debugger can skip some executions of $declarationName because the computation of class names was interrupted",
                        MessageType.WARNING
                ).notify(myDebugProcess.project)
            }

            val results = searchResult.map { transformer(it) }
            return ComputedClassNames(results.flatMap { it.classNames }, shouldBeCached = results.all { it.shouldBeCached })
        }' @ [49:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'!' @ [49:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkIfInline' @ [49:14] ==> private final fun checkIfInline(declaration: KtDeclaration, bindingContext: BindingContext): Boolean defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[SimpleFunctionDescriptorImpl]

'declaration' @ [49:28] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'bindingContext' @ [49:41] ==> value-parameter bindingContext: BindingContext = ... defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'ComputedClassNames' @ [50:20] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[FakeCallableDescriptorForObject]

'EMPTY' @ [50:39] ==> public final val EMPTY: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames.Companion[PropertyDescriptorImpl]

'hashSetOf' @ [53:32] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'runReadAction' @ [54:35] ==> public fun <T> runReadAction(action: () -> String?): String? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String?

'declaration' @ [54:51] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'name' @ [54:63] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'Runnable' @ [56:24] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SamConstructorDescriptorImpl]

'search' @ [57:34] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'declaration' @ [57:41] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'getScopeForInlineDeclarationUsages' @ [57:54] ==> private final fun getScopeForInlineDeclarationUsages(inlineDeclaration: KtDeclaration): GlobalSearchScope defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[SimpleFunctionDescriptorImpl]

'declaration' @ [57:89] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[ValueParameterDescriptorImpl]

'forEach' @ [57:103] ==> @HidesMembers public inline fun <T> Iterable<(PsiReference..PsiReference?)>.forEach(action: ((PsiReference..PsiReference?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'!' @ [58:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'runReadAction' @ [58:26] ==> public fun <T> runReadAction(action: () -> Boolean): Boolean defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Boolean

'it' @ [58:42] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isImportUsage' @ [58:45] ==> public fun PsiReference.isImportUsage(): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch[DeserializedSimpleFunctionDescriptor]

'it' @ [59:38] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [59:41] ==> public final val PsiReference.element: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [59:65] ==> @InlineOnly public inline fun <T, R> KtElement.let(block: (KtElement) -> PsiElement?): PsiElement? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement
    <R> -> PsiElement?

'getRelevantElement' @ [59:71] ==> internal final fun getRelevantElement(element: PsiElement): PsiElement? defined in org.jetbrains.kotlin.idea.debugger.DebuggerClassNameProvider.Companion[FunctionImportedFromObject]

'usage' @ [60:29] ==> val usage: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>.<anonymous>[LocalVariableDescriptor]

'searchResult' @ [61:29] ==> val searchResult: HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'add' @ [61:42] ==> public open fun add(element: PsiElement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'usage' @ [61:46] ==> val usage: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getApplicationEx' @ [68:54] ==> public open fun getApplicationEx(): (ApplicationEx..ApplicationEx?) defined in com.intellij.openapi.application.ex.ApplicationManagerEx[JavaMethodDescriptor]

'if (!applicationEx.isUnitTestMode && (!applicationEx.holdsReadLock() || applicationEx.isDispatchThread)) {
                applicationEx.invokeAndWait(
                        {
                            isSuccess = ProgressManager.getInstance().runProcessWithProgressSynchronously(
                                    task,
                                    "Compute class names for declaration $declarationName",
                                    true,
                                    myDebugProcess.project)
                        }, ModalityState.NON_MODAL)
            }
            else {
                // Pooled thread with read lock. Can't invoke task under UI progress, so call it directly.
                task.run()
            }' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [69:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'applicationEx' @ [69:18] ==> val applicationEx: (ApplicationEx..ApplicationEx?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'isUnitTestMode' @ [69:32] ==> public final val ApplicationEx.isUnitTestMode: Boolean[MyPropertyDescriptor]

'!' @ [69:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'applicationEx' @ [69:52] ==> val applicationEx: (ApplicationEx..ApplicationEx?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'holdsReadLock' @ [69:66] ==> public abstract fun holdsReadLock(): Boolean defined in com.intellij.openapi.application.ex.ApplicationEx[JavaMethodDescriptor]

'applicationEx' @ [69:85] ==> val applicationEx: (ApplicationEx..ApplicationEx?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'isDispatchThread' @ [69:99] ==> public final val ApplicationEx.isDispatchThread: Boolean[MyPropertyDescriptor]

'applicationEx' @ [70:17] ==> val applicationEx: (ApplicationEx..ApplicationEx?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'invokeAndWait' @ [70:31] ==> public final fun invokeAndWait(@NotNull p0: () -> Unit, @NotNull p1: ModalityState): Unit defined in com.intellij.openapi.application.ex.ApplicationEx[MyFunctionDescriptor]

'isSuccess' @ [72:29] ==> var isSuccess: Boolean defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'getInstance' @ [72:57] ==> @NotNull public open fun getInstance(): ProgressManager defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'runProcessWithProgressSynchronously' @ [72:71] ==> public abstract fun runProcessWithProgressSynchronously(@NotNull p0: Runnable, @NotNull @Nls p1: String, p2: Boolean, @Nullable p3: Project?): Boolean defined in com.intellij.openapi.progress.ProgressManager[JavaMethodDescriptor]

'task' @ [73:37] ==> val task: Runnable defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'declarationName' @ [74:75] ==> val declarationName: String? defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'myDebugProcess' @ [76:37] ==> private final val myDebugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[PropertyDescriptorImpl]

'project' @ [76:52] ==> public final val DebugProcess.project: (Project..Project?)[MyPropertyDescriptor]

'NON_MODAL' @ [77:42] ==> @NotNull public final val NON_MODAL: ModalityState defined in com.intellij.openapi.application.ModalityState[JavaPropertyDescriptor]

'task' @ [81:17] ==> val task: Runnable defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'run' @ [81:22] ==> public abstract fun run(): Unit defined in java.lang.Runnable[JavaMethodDescriptor]

'!' @ [84:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSuccess' @ [84:18] ==> var isSuccess: Boolean defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'NOTIFICATION_GROUP' @ [85:35] ==> public final val NOTIFICATION_GROUP: (NotificationGroup..NotificationGroup?) defined in com.intellij.xdebugger.impl.XDebugSessionImpl[JavaPropertyDescriptor]

'createNotification' @ [85:54] ==> public open fun createNotification(@NotNull p0: String, @NotNull p1: MessageType): (Notification..Notification?) defined in com.intellij.notification.NotificationGroup[JavaMethodDescriptor]

'declarationName' @ [86:64] ==> val declarationName: String? defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'WARNING' @ [87:37] ==> public final val WARNING: (MessageType..MessageType?) defined in com.intellij.openapi.ui.MessageType[JavaPropertyDescriptor]

'notify' @ [88:19] ==> public open fun notify(@Nullable p0: Project?): Unit defined in com.intellij.notification.Notification[JavaMethodDescriptor]

'myDebugProcess' @ [88:26] ==> private final val myDebugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[PropertyDescriptorImpl]

'project' @ [88:41] ==> public final val DebugProcess.project: (Project..Project?)[MyPropertyDescriptor]

'searchResult' @ [91:27] ==> val searchResult: HashSet<PsiElement> /* = HashSet<PsiElement> */ defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'map' @ [91:40] ==> public inline fun <T, R> Iterable<PsiElement>.map(transform: (PsiElement) -> KotlinDebuggerCaches.ComputedClassNames): List<KotlinDebuggerCaches.ComputedClassNames> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> ComputedClassNames

'invoke' @ [91:46] ==> public abstract operator fun invoke(p1: PsiElement): KotlinDebuggerCaches.ComputedClassNames defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [91:58] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>[ValueParameterDescriptorImpl]

'ComputedClassNames' @ [92:20] ==> public constructor ComputedClassNames(classNames: List<String>, shouldBeCached: Boolean) defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[ClassConstructorDescriptorImpl]

'results' @ [92:39] ==> val results: List<KotlinDebuggerCaches.ComputedClassNames> defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'flatMap' @ [92:47] ==> public inline fun <T, R> Iterable<KotlinDebuggerCaches.ComputedClassNames>.flatMap(transform: (KotlinDebuggerCaches.ComputedClassNames) -> Iterable<String>): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComputedClassNames
    <R> -> String

'it' @ [92:57] ==> value-parameter it: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>[ValueParameterDescriptorImpl]

'classNames' @ [92:60] ==> public final val classNames: List<String> defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'results' @ [92:91] ==> val results: List<KotlinDebuggerCaches.ComputedClassNames> defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls[LocalVariableDescriptor]

'all' @ [92:99] ==> public inline fun <T> Iterable<KotlinDebuggerCaches.ComputedClassNames>.all(predicate: (KotlinDebuggerCaches.ComputedClassNames) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ComputedClassNames

'it' @ [92:105] ==> value-parameter it: KotlinDebuggerCaches.ComputedClassNames defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.findInlinedCalls.<anonymous>[ValueParameterDescriptorImpl]

'shouldBeCached' @ [92:108] ==> public final val shouldBeCached: Boolean defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.ComputedClassNames[PropertyDescriptorImpl]

'bindingContext' @ [97:26] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.checkIfInline[ValueParameterDescriptorImpl]

'get' @ [97:41] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?), p1: (PsiElement..PsiElement?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'DECLARATION_TO_DESCRIPTOR' @ [97:60] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'declaration' @ [97:87] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.checkIfInline[ValueParameterDescriptorImpl]

'when (descriptor) {
            is FunctionDescriptor -> InlineUtil.isInline(descriptor)
            is PropertyDescriptor -> InlineUtil.hasInlineAccessors(descriptor)
            else -> false
        }' @ [98:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'descriptor' @ [98:22] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.checkIfInline[LocalVariableDescriptor]

'isInline' @ [99:49] ==> public open fun isInline(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [99:58] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.checkIfInline[LocalVariableDescriptor]

'hasInlineAccessors' @ [100:49] ==> public open fun hasInlineAccessors(@NotNull p0: PropertyDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'descriptor' @ [100:68] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.checkIfInline[LocalVariableDescriptor]

'runReadAction' @ [106:27] ==> public fun <T> runReadAction(action: () -> (VirtualFile..VirtualFile?)): (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'inlineDeclaration' @ [106:43] ==> value-parameter inlineDeclaration: KtDeclaration defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.getScopeForInlineDeclarationUsages[ValueParameterDescriptorImpl]

'containingFile' @ [106:61] ==> public final val KtDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'virtualFile' @ [106:76] ==> public final val PsiFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'if (virtualFile != null && ProjectRootsUtil.isLibraryFile(myDebugProcess.project, virtualFile)) {
            GlobalSearchScope.union(scopes.toTypedArray())
        }
        else {
            myDebugProcess.searchScope
        }' @ [107:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: GlobalSearchScope, elseBranch: GlobalSearchScope): GlobalSearchScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> GlobalSearchScope

'virtualFile' @ [107:20] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.getScopeForInlineDeclarationUsages[LocalVariableDescriptor]

'ProjectRootsUtil' @ [107:43] ==> public object ProjectRootsUtil defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'isLibraryFile' @ [107:60] ==> @JvmStatic public final fun isLibraryFile(project: Project, file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.util.ProjectRootsUtil[DeserializedSimpleFunctionDescriptor]

'myDebugProcess' @ [107:74] ==> private final val myDebugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[PropertyDescriptorImpl]

'project' @ [107:89] ==> public final val DebugProcess.project: (Project..Project?)[MyPropertyDescriptor]

'virtualFile' @ [107:98] ==> val virtualFile: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher.getScopeForInlineDeclarationUsages[LocalVariableDescriptor]

'union' @ [108:31] ==> @NotNull @Contract public open fun union(@NotNull p0: (Array<(GlobalSearchScope..GlobalSearchScope?)>..Array<out (GlobalSearchScope..GlobalSearchScope?)>)): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'scopes' @ [108:37] ==> public final val scopes: List<GlobalSearchScope> defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[PropertyDescriptorImpl]

'toTypedArray' @ [108:44] ==> public inline fun <reified T> Collection<GlobalSearchScope>.toTypedArray(): Array<GlobalSearchScope> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> GlobalSearchScope

'myDebugProcess' @ [111:13] ==> private final val myDebugProcess: DebugProcess defined in org.jetbrains.kotlin.idea.debugger.InlineCallableUsagesSearcher[PropertyDescriptorImpl]

'searchScope' @ [111:28] ==> public final val DebugProcess.searchScope: GlobalSearchScope[MyPropertyDescriptor]

