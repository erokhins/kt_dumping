'create' @ [45:30] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(Boolean..Boolean?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'mutableMapOf' @ [55:37] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<Module, Long> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Module
    <V> -> Long

'modificationTracker' @ [56:43] ==> value-parameter modificationTracker: PsiModificationTracker defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[ValueParameterDescriptorImpl]

'-' @ [59:46] ==> public final operator fun unaryMinus(): Long defined in kotlin.Long[DeserializedSimpleFunctionDescriptor]

'perModuleModCount' @ [66:16] ==> private final val perModuleModCount: MutableMap<Module, Long> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'module' @ [66:34] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.getModificationCount[ValueParameterDescriptorImpl]

'perModuleChangesHighwatermark' @ [67:16] ==> private final var perModuleChangesHighwatermark: Long? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'modificationTrackerImpl' @ [68:16] ==> private final val modificationTrackerImpl: PsiModificationTrackerImpl defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'outOfCodeBlockModificationCount' @ [68:40] ==> public final val PsiModificationTrackerImpl.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'perModuleChangesHighwatermark' @ [71:44] ==> private final var perModuleChangesHighwatermark: Long? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'getModel' @ [74:32] ==> @NotNull public open fun getModel(p0: (Project..Project?)): PomModel defined in com.intellij.pom.PomManager[JavaMethodDescriptor]

'project' @ [74:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[ValueParameterDescriptorImpl]

'project' @ [75:36] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[ValueParameterDescriptorImpl]

'messageBus' @ [75:44] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [75:55] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'model' @ [76:9] ==> val model: PomModel defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[LocalVariableDescriptor]

'addModelListener' @ [76:15] ==> public abstract fun addModelListener(@NotNull p0: PomModelListener): Unit defined in com.intellij.pom.PomModel[JavaMethodDescriptor]

'aspect' @ [78:24] ==> value-parameter aspect: PomModelAspect defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.isAspectChangeInteresting[ValueParameterDescriptorImpl]

'treeAspect' @ [78:34] ==> private final val treeAspect: TreeAspect defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'event' @ [82:33] ==> value-parameter event: PomModelEvent defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[ValueParameterDescriptorImpl]

'getChangeSet' @ [82:39] ==> @Nullable public open fun getChangeSet(p0: (PomModelAspect..PomModelAspect?)): PomChangeSet? defined in com.intellij.pom.event.PomModelEvent[JavaMethodDescriptor]

'treeAspect' @ [82:52] ==> private final val treeAspect: TreeAspect defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'changeSet' @ [83:28] ==> val changeSet: TreeChangeEvent defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'rootElement' @ [83:38] ==> public final val TreeChangeEvent.rootElement: ASTNode[MyPropertyDescriptor]

'psi' @ [83:50] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'containingFile' @ [83:54] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'changeSet' @ [84:39] ==> val changeSet: TreeChangeEvent defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'changedElements' @ [84:49] ==> public final val TreeChangeEvent.changedElements: (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>)[MyPropertyDescriptor]

'changedElements' @ [87:21] ==> val changedElements: (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'any' @ [87:37] ==> public inline fun <T> Array<out (ASTNode..ASTNode?)>.any(predicate: ((ASTNode..ASTNode?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'getInsideCodeBlockModificationScope' @ [87:43] ==> public final fun getInsideCodeBlockModificationScope(element: PsiElement): KtElement? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[SimpleFunctionDescriptorImpl]

'it' @ [87:79] ==> value-parameter it: (ASTNode..ASTNode?) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged.<anonymous>[ValueParameterDescriptorImpl]

'psi' @ [87:82] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'file' @ [88:22] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'changedElements' @ [88:49] ==> val changedElements: (Array<(ASTNode..ASTNode?)>..Array<out (ASTNode..ASTNode?)>) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'isEmpty' @ [88:65] ==> @InlineOnly public inline fun <T> Array<out (ASTNode..ASTNode?)>.isEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.lang.ASTNode..com.intellij.lang.ASTNode?)

'messageBusConnection' @ [89:21] ==> val messageBusConnection: MessageBusConnection defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[LocalVariableDescriptor]

'deliverImmediately' @ [89:42] ==> public abstract fun deliverImmediately(): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]

'file' @ [90:25] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'isPhysical' @ [90:30] ==> public final val KtFile.isPhysical: Boolean[MyPropertyDescriptor]

'!' @ [90:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isReplLine' @ [90:45] ==> private final fun isReplLine(file: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[SimpleFunctionDescriptorImpl]

'file' @ [90:56] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'virtualFile' @ [90:61] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'lastAffectedModule' @ [91:25] ==> private final var lastAffectedModule: Module? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'findModuleForPsiElement' @ [91:57] ==> @Nullable public open fun findModuleForPsiElement(@NotNull p0: PsiElement): Module? defined in com.intellij.openapi.module.ModuleUtil[JavaMethodDescriptor]

'file' @ [91:81] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'lastAffectedModuleModCount' @ [92:25] ==> private final var lastAffectedModuleModCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'modificationTrackerImpl' @ [92:54] ==> private final val modificationTrackerImpl: PsiModificationTrackerImpl defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'outOfCodeBlockModificationCount' @ [92:78] ==> public final val PsiModificationTrackerImpl.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'modificationTrackerImpl' @ [93:25] ==> private final val modificationTrackerImpl: PsiModificationTrackerImpl defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'incCounter' @ [93:49] ==> public open fun incCounter(): Unit defined in com.intellij.psi.impl.PsiModificationTrackerImpl[JavaMethodDescriptor]

'incOutOfBlockModificationCount' @ [95:21] ==> private final fun incOutOfBlockModificationCount(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[SimpleFunctionDescriptorImpl]

'file' @ [95:52] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<no name provided>.modelChanged[LocalVariableDescriptor]

'messageBusConnection' @ [100:9] ==> val messageBusConnection: MessageBusConnection defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>[LocalVariableDescriptor]

'subscribe' @ [100:30] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(PsiModificationTracker.Listener..PsiModificationTracker.Listener?)>, @NotNull p1: PsiModificationTracker.Listener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.psi.util.PsiModificationTracker.Listener..com.intellij.psi.util.PsiModificationTracker.Listener?)

'TOPIC' @ [100:63] ==> public final val TOPIC: (Topic<(PsiModificationTracker.Listener..PsiModificationTracker.Listener?)>..Topic<(PsiModificationTracker.Listener..PsiModificationTracker.Listener?)>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'Listener' @ [100:93] ==> public final fun Listener(function: () -> Unit): PsiModificationTracker.Listener defined in com.intellij.psi.util.PsiModificationTracker[SamConstructorDescriptorImpl]

'modificationTrackerImpl' @ [101:31] ==> private final val modificationTrackerImpl: PsiModificationTrackerImpl defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'outOfCodeBlockModificationCount' @ [101:55] ==> public final val PsiModificationTrackerImpl.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'lastAffectedModule' @ [102:34] ==> private final var lastAffectedModule: Module? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'if (affectedModule != null && newModCount == lastAffectedModuleModCount + 1) {
                if (perModuleChangesHighwatermark == null) {
                    perModuleChangesHighwatermark = lastAffectedModuleModCount
                }
                perModuleModCount[affectedModule] = newModCount
            }
            else {
                perModuleChangesHighwatermark = null
                perModuleModCount.clear()
            }' @ [103:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'affectedModule' @ [103:17] ==> val affectedModule: Module? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<anonymous>[LocalVariableDescriptor]

'newModCount' @ [103:43] ==> val newModCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<anonymous>[LocalVariableDescriptor]

'lastAffectedModuleModCount' @ [103:58] ==> private final var lastAffectedModuleModCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'perModuleChangesHighwatermark' @ [104:21] ==> private final var perModuleChangesHighwatermark: Long? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'perModuleChangesHighwatermark' @ [105:21] ==> private final var perModuleChangesHighwatermark: Long? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'lastAffectedModuleModCount' @ [105:53] ==> private final var lastAffectedModuleModCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'perModuleModCount' @ [107:17] ==> private final val perModuleModCount: MutableMap<Module, Long> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'affectedModule' @ [107:35] ==> val affectedModule: Module? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<anonymous>[LocalVariableDescriptor]

'newModCount' @ [107:53] ==> val newModCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.<init>.<anonymous>[LocalVariableDescriptor]

'perModuleChangesHighwatermark' @ [110:17] ==> private final var perModuleChangesHighwatermark: Long? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'perModuleModCount' @ [111:17] ==> private final val perModuleModCount: MutableMap<Module, Long> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[PropertyDescriptorImpl]

'clear' @ [111:35] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'file' @ [118:20] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.isReplLine[ValueParameterDescriptorImpl]

'getUserData' @ [118:25] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Boolean..Boolean?)>): Boolean? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Boolean..kotlin.Boolean?)

'KOTLIN_CONSOLE_KEY' @ [118:37] ==> public val KOTLIN_CONSOLE_KEY: Key<(Boolean..Boolean?)> defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'file' @ [122:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.incOutOfBlockModificationCount[ValueParameterDescriptorImpl]

'getUserData' @ [122:30] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Long..Long?)>): Long? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'FILE_OUT_OF_BLOCK_MODIFICATION_COUNT' @ [122:42] ==> private val FILE_OUT_OF_BLOCK_MODIFICATION_COUNT: Key<Long> defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'file' @ [123:13] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.incOutOfBlockModificationCount[ValueParameterDescriptorImpl]

'putUserData' @ [123:18] ==> public open fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(Long..Long?)>, @Nullable p1: Long?): Unit defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'FILE_OUT_OF_BLOCK_MODIFICATION_COUNT' @ [123:30] ==> private val FILE_OUT_OF_BLOCK_MODIFICATION_COUNT: Key<Long> defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'count' @ [123:68] ==> val count: Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.incOutOfBlockModificationCount[LocalVariableDescriptor]

'element' @ [127:26] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[ValueParameterDescriptorImpl]

'getTopmostParentOfType' @ [127:34] ==> public inline fun <reified T : PsiElement> PsiElement.getTopmostParentOfType(): KtLambdaExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtLambdaExpression

'lambda' @ [128:17] ==> val lambda: KtLambdaExpression? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'lambda' @ [129:17] ==> val lambda: KtLambdaExpression? defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'getTopmostParentOfType' @ [129:24] ==> public inline fun <reified T : PsiElement> PsiElement.getTopmostParentOfType(): KtSuperTypeCallEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSuperTypeCallEntry

'let' @ [130:27] ==> @InlineOnly public inline fun <T, R> KtSuperTypeCallEntry.let(block: (KtSuperTypeCallEntry) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtSuperTypeCallEntry
    <R> -> Nothing

'it' @ [130:40] ==> value-parameter it: KtSuperTypeCallEntry defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [133:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PsiElement?, right: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PsiElement

'getTopmostParentOfTypes' @ [133:46] ==> @Nullable @Contract public open fun getTopmostParentOfTypes(@Nullable p0: PsiElement?, @NotNull vararg p1: (Class<out (PsiElement..PsiElement?)>..Class<out (PsiElement..PsiElement?)>?)): PsiElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'element' @ [133:70] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[ValueParameterDescriptorImpl]

'BLOCK_DECLARATION_TYPES' @ [133:80] ==> private final val BLOCK_DECLARATION_TYPES: Array<Class<out KtDeclaration>> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[PropertyDescriptorImpl]

'blockDeclaration' @ [134:17] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'parents' @ [134:34] ==> public val PsiElement.parents: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'any' @ [134:42] ==> public inline fun <T> Sequence<PsiElement>.any(predicate: (PsiElement) -> Boolean): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [134:48] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [134:70] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [134:96] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'when (blockDeclaration) {
                is KtNamedFunction -> {
                    if (blockDeclaration.hasBlockBody()) {
                        return blockDeclaration.bodyExpression?.takeIf { it.isAncestor(element) }
                    }
                    else if (blockDeclaration.hasDeclaredReturnType()) {
                        return blockDeclaration.initializer?.takeIf { it.isAncestor(element) }
                    }
                }

                is KtProperty -> {
                    if (blockDeclaration.typeReference != null) {
                        for (accessor in blockDeclaration.accessors) {
                            (accessor.initializer ?: accessor.bodyExpression)
                                    ?.takeIf { it.isAncestor(element) }
                                    ?.let { return it }
                        }
                    }
                }

                else -> throw IllegalStateException()
            }' @ [136:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'blockDeclaration' @ [136:19] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'if (blockDeclaration.hasBlockBody()) {
                        return blockDeclaration.bodyExpression?.takeIf { it.isAncestor(element) }
                    }
                    else if (blockDeclaration.hasDeclaredReturnType()) {
                        return blockDeclaration.initializer?.takeIf { it.isAncestor(element) }
                    }' @ [138:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'blockDeclaration' @ [138:25] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'hasBlockBody' @ [138:42] ==> public open fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'blockDeclaration' @ [139:32] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'bodyExpression' @ [139:49] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'takeIf' @ [139:65] ==> @InlineOnly @SinceKotlin public inline fun <T> KtExpression.takeIf(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [139:74] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [139:77] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [139:88] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[ValueParameterDescriptorImpl]

'blockDeclaration' @ [141:30] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'hasDeclaredReturnType' @ [141:47] ==> public open fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'blockDeclaration' @ [142:32] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'initializer' @ [142:49] ==> public final val KtNamedFunction.initializer: KtExpression?[MyPropertyDescriptor]

'takeIf' @ [142:62] ==> @InlineOnly @SinceKotlin public inline fun <T> KtExpression.takeIf(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [142:71] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [142:74] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [142:85] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[ValueParameterDescriptorImpl]

'blockDeclaration' @ [147:25] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'typeReference' @ [147:42] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'blockDeclaration' @ [148:42] ==> val blockDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'accessors' @ [148:59] ==> public final val KtProperty.accessors: (MutableList<(KtPropertyAccessor..KtPropertyAccessor?)>..List<(KtPropertyAccessor..KtPropertyAccessor?)>)[MyPropertyDescriptor]

'accessor' @ [149:30] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'initializer' @ [149:39] ==> public final val KtPropertyAccessor.initializer: KtExpression?[MyPropertyDescriptor]

'accessor' @ [149:54] ==> val accessor: (KtPropertyAccessor..KtPropertyAccessor?) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[LocalVariableDescriptor]

'bodyExpression' @ [149:63] ==> public final val KtPropertyAccessor.bodyExpression: KtExpression?[MyPropertyDescriptor]

'takeIf' @ [150:39] ==> @InlineOnly @SinceKotlin public inline fun <T> KtExpression.takeIf(predicate: (KtExpression) -> Boolean): KtExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'it' @ [150:48] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'isAncestor' @ [150:51] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'element' @ [150:62] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope[ValueParameterDescriptorImpl]

'let' @ [151:39] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'it' @ [151:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInsideCodeBlockModificationScope.<anonymous>[ValueParameterDescriptorImpl]

'IllegalStateException' @ [156:31] ==> public final fun <init>(): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'BLOCK_DECLARATION_TYPES' @ [163:20] ==> private final val BLOCK_DECLARATION_TYPES: Array<Class<out KtDeclaration>> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[PropertyDescriptorImpl]

'any' @ [163:44] ==> public inline fun <T> Array<out Class<out KtDeclaration>>.any(predicate: (Class<out KtDeclaration>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out KtDeclaration>

'it' @ [163:50] ==> value-parameter it: Class<out KtDeclaration> defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.isBlockDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'isInstance' @ [163:53] ==> public open fun isInstance(p0: (Any..Any?)): Boolean defined in java.lang.Class[JavaMethodDescriptor]

'declaration' @ [163:64] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.isBlockDeclaration[ValueParameterDescriptorImpl]

'arrayOf' @ [166:47] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<out KtDeclaration>): Array<Class<out KtDeclaration>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<out KtDeclaration>

'java' @ [167:35] ==> public val <T> KClass<KtProperty>.java: Class<KtProperty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtProperty

'java' @ [168:40] ==> public val <T> KClass<KtNamedFunction>.java: Class<KtNamedFunction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtNamedFunction

'project' @ [171:45] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion.getInstance[ValueParameterDescriptorImpl]

'getComponent' @ [171:53] ==> public abstract fun <T : (Any..Any?)> getComponent(@NotNull p0: Class<(KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?)>): (KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?) defined in com.intellij.openapi.project.Project[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener..org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener?)

'KotlinCodeBlockModificationListener' @ [171:66] ==> public companion object defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[FakeCallableDescriptorForObject]

'java' @ [171:109] ==> public val <T> KClass<KotlinCodeBlockModificationListener>.java: Class<KotlinCodeBlockModificationListener> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KotlinCodeBlockModificationListener

'Key' @ [175:52] ==> public constructor Key<T : (Any..Any?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.util.Key[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Long

'getUserData' @ [178:13] ==> public open fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(Long..Long?)>): Long? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Long..kotlin.Long?)

'FILE_OUT_OF_BLOCK_MODIFICATION_COUNT' @ [178:25] ==> private val FILE_OUT_OF_BLOCK_MODIFICATION_COUNT: Key<Long> defined in org.jetbrains.kotlin.idea.project in file KotlinCodeBlockModificationListener.kt[PropertyDescriptorImpl]

'KotlinCodeBlockModificationListener' @ [181:42] ==> public companion object defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[FakeCallableDescriptorForObject]

'getInstance' @ [181:78] ==> public final fun getInstance(project: Project): (KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?) defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener.Companion[SimpleFunctionDescriptorImpl]

'module' @ [181:90] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'project' @ [181:97] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getInstance' @ [182:73] ==> public open fun getInstance(p0: (Project..Project?)): (PsiModificationTracker..PsiModificationTracker?) defined in com.intellij.psi.util.PsiModificationTracker.SERVICE[JavaMethodDescriptor]

'module' @ [182:85] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'project' @ [182:92] ==> public final val Module.project: Project[MyPropertyDescriptor]

'getValue' @ [183:33] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'module' @ [184:9] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'cached' @ [184:16] ==> public fun <T> Module.cached(provider: CachedValueProvider<(HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */)>): (HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */) defined in org.jetbrains.kotlin.idea.caches.resolve[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.collections.HashSet<com.intellij.openapi.module.Module> /* = java.util.HashSet<com.intellij.openapi.module.Module> */..kotlin.collections.HashSet<com.intellij.openapi.module.Module>? /* = java.util.HashSet<com.intellij.openapi.module.Module>? */)

'CachedValueProvider' @ [184:23] ==> @FunctionalInterface public fun <T : (Any..Any?)> CachedValueProvider(function: () -> CachedValueProvider.Result<(HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */)>?): CachedValueProvider<(HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */)> defined in com.intellij.psi.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.collections.HashSet<com.intellij.openapi.module.Module> /* = java.util.HashSet<com.intellij.openapi.module.Module> */..kotlin.collections.HashSet<com.intellij.openapi.module.Module>? /* = java.util.HashSet<com.intellij.openapi.module.Module>? */)

'create' @ [185:40] ==> public open fun <T : (Any..Any?)> create(@Nullable p0: HashSet<Module>? /* = HashSet<Module>? */, @NotNull vararg p1: (Any..Any?)): (CachedValueProvider.Result<(HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */)>..CachedValueProvider.Result<(HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HashSet<Module>

'HashSet' @ [186:21] ==> public final fun <E> <init>(): HashSet<Module> /* = HashSet<Module> */ defined in kotlin.collections.HashSet[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> Module

'apply' @ [186:39] ==> @InlineOnly public inline fun <T> HashSet<Module> /* = HashSet<Module> */.apply(block: HashSet<Module> /* = HashSet<Module> */.() -> Unit): HashSet<Module> /* = HashSet<Module> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HashSet<Module>

'getInstance' @ [187:43] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [187:55] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'orderEntries' @ [187:63] ==> @NotNull public abstract fun orderEntries(): OrderEnumerator defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'recursively' @ [187:78] ==> public abstract fun recursively(): (OrderEnumerator..OrderEnumerator?) defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'forEachModule' @ [187:92] ==> public abstract fun forEachModule(@NotNull p0: Processor<(Module..Module?)>): Unit defined in com.intellij.openapi.roots.OrderEnumerator[JavaMethodDescriptor]

'CollectProcessor' @ [188:50] ==> public constructor CollectProcessor<T : (Any..Any?)>(@NotNull p0: (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>)) defined in com.intellij.util.CommonProcessors.CollectProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)

'this' @ [188:67] ==> <this> defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.dependencies.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'getInstance' @ [190:52] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectRootModificationTracker..ProjectRootModificationTracker?) defined in com.intellij.openapi.roots.ProjectRootModificationTracker[JavaMethodDescriptor]

'module' @ [190:64] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'project' @ [190:71] ==> public final val Module.project: Project[MyPropertyDescriptor]

'psiModificationTracker' @ [196:34] ==> private final val psiModificationTracker: (PsiModificationTracker..PsiModificationTracker?) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'outOfCodeBlockModificationCount' @ [196:57] ==> public final val PsiModificationTracker.outOfCodeBlockModificationCount: Long[MyPropertyDescriptor]

'kotlinModCountListener' @ [198:13] ==> private final val kotlinModCountListener: (KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'hasPerModuleModificationCounts' @ [198:36] ==> public final fun hasPerModuleModificationCounts(): Boolean defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[SimpleFunctionDescriptorImpl]

'kotlinModCountListener' @ [199:29] ==> private final val kotlinModCountListener: (KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'getModificationCount' @ [199:52] ==> public final fun getModificationCount(module: Module): Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[SimpleFunctionDescriptorImpl]

'module' @ [199:73] ==> public final val module: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'selfCount' @ [200:17] ==> val selfCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'currentGlobalCount' @ [200:30] ==> val currentGlobalCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'selfCount' @ [200:57] ==> val selfCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'selfCount' @ [201:28] ==> val selfCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'dependencies' @ [202:32] ==> private final val dependencies: (HashSet<Module> /* = HashSet<Module> */..HashSet<Module>? /* = HashSet<Module>? */) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'kotlinModCountListener' @ [203:32] ==> private final val kotlinModCountListener: (KotlinCodeBlockModificationListener..KotlinCodeBlockModificationListener?) defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker[PropertyDescriptorImpl]

'getModificationCount' @ [203:55] ==> public final fun getModificationCount(module: Module): Long defined in org.jetbrains.kotlin.idea.project.KotlinCodeBlockModificationListener[SimpleFunctionDescriptorImpl]

'dependency' @ [203:76] ==> val dependency: Module defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'depCount' @ [204:21] ==> val depCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'currentGlobalCount' @ [204:33] ==> val currentGlobalCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'currentGlobalCount' @ [204:60] ==> val currentGlobalCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'depCount' @ [205:21] ==> val depCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'maxCount' @ [205:32] ==> var maxCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'maxCount' @ [205:42] ==> var maxCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'depCount' @ [205:53] ==> val depCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'maxCount' @ [207:20] ==> var maxCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

'currentGlobalCount' @ [209:16] ==> val currentGlobalCount: Long defined in org.jetbrains.kotlin.idea.project.KotlinModuleModificationTracker.getModificationCount[LocalVariableDescriptor]

