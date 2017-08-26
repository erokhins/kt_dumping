'project' @ [50:26] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener[PropertyDescriptorImpl]

'messageBus' @ [50:34] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [50:45] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'connection' @ [52:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>[LocalVariableDescriptor]

'subscribe' @ [52:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(BulkFileListener..BulkFileListener?)>, @NotNull p1: BulkFileListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.openapi.vfs.newvfs.BulkFileListener..com.intellij.openapi.vfs.newvfs.BulkFileListener?)

'VFS_CHANGES' @ [52:49] ==> public final val VFS_CHANGES: (Topic<(BulkFileListener..BulkFileListener?)>..Topic<(BulkFileListener..BulkFileListener?)>?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaPropertyDescriptor]

'onEvents' @ [53:72] ==> public final fun onEvents(events: List<VFileEvent>, eventPredicate: (VFileEvent) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'events' @ [53:81] ==> value-parameter events: MutableList<out VFileEvent> defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.before[ValueParameterDescriptorImpl]

'it' @ [53:91] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.before.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [53:117] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.before.<anonymous>[ValueParameterDescriptorImpl]

'onEvents' @ [54:60] ==> public final fun onEvents(events: List<VFileEvent>, eventPredicate: (VFileEvent) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>[SimpleFunctionDescriptorImpl]

'events' @ [54:69] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.after[ValueParameterDescriptorImpl]

'it' @ [54:79] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [54:103] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [54:129] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'project' @ [58:31] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener[PropertyDescriptorImpl]

'service' @ [58:39] ==> public inline fun <reified T : Any> Project.service(): PerModulePackageCacheService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PerModulePackageCacheService

'if (events.size >= FULL_DROP_THRESHOLD) {
                    service.onTooComplexChange()
                }
                else {
                    events
                            .asSequence()
                            .filter(eventPredicate)
                            .mapNotNull { it.file }
                            .filter { FileTypeRegistry.getInstance().getFileTypeByFileName(it.name) == KotlinFileType.INSTANCE }
                            .forEach { file -> service.notifyPackageChange(file) }
                }' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'events' @ [59:21] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents[ValueParameterDescriptorImpl]

'size' @ [59:28] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'FULL_DROP_THRESHOLD' @ [59:36] ==> public final val FULL_DROP_THRESHOLD: Int defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.Companion[PropertyImportedFromObject]

'service' @ [60:21] ==> val service: PerModulePackageCacheService defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents[LocalVariableDescriptor]

'onTooComplexChange' @ [60:29] ==> internal final fun onTooComplexChange(): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'events' @ [63:21] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents[ValueParameterDescriptorImpl]

'asSequence' @ [64:30] ==> public fun <T> Iterable<VFileEvent>.asSequence(): Sequence<VFileEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent

'filter' @ [65:30] ==> public fun <T> Sequence<VFileEvent>.filter(predicate: (VFileEvent) -> Boolean): Sequence<VFileEvent> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent

'eventPredicate' @ [65:37] ==> value-parameter eventPredicate: (VFileEvent) -> Boolean defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents[ValueParameterDescriptorImpl]

'mapNotNull' @ [66:30] ==> public fun <T, R : Any> Sequence<VFileEvent>.mapNotNull(transform: (VFileEvent) -> VirtualFile?): Sequence<VirtualFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent
    <R : Any> -> VirtualFile

'it' @ [66:43] ==> value-parameter it: VFileEvent defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [66:46] ==> public final val VFileEvent.file: VirtualFile?[MyPropertyDescriptor]

'filter' @ [67:30] ==> public fun <T> Sequence<VirtualFile>.filter(predicate: (VirtualFile) -> Boolean): Sequence<VirtualFile> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'==' @ [67:39] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.fileTypes.FileType[DeserializedSimpleFunctionDescriptor]

'getInstance' @ [67:56] ==> public open fun getInstance(): (FileTypeRegistry..FileTypeRegistry?) defined in com.intellij.openapi.fileTypes.FileTypeRegistry[JavaMethodDescriptor]

'getFileTypeByFileName' @ [67:70] ==> @NotNull public abstract fun getFileTypeByFileName(@NotNull @NonNls p0: String): FileType defined in com.intellij.openapi.fileTypes.FileTypeRegistry[JavaMethodDescriptor]

'it' @ [67:92] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [67:95] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'INSTANCE' @ [67:119] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'forEach' @ [68:30] ==> public inline fun <T> Sequence<VirtualFile>.forEach(action: (VirtualFile) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'service' @ [68:48] ==> val service: PerModulePackageCacheService defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents[LocalVariableDescriptor]

'notifyPackageChange' @ [68:56] ==> internal final fun notifyPackageChange(file: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'file' @ [68:76] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.KotlinPackageContentModificationListener.<init>.<no name provided>.onEvents.<anonymous>[ValueParameterDescriptorImpl]

'event' @ [77:20] ==> value-parameter event: PsiTreeChangeEventImpl defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[ValueParameterDescriptorImpl]

'file' @ [77:26] ==> public final var PsiTreeChangeEventImpl.file: PsiFile?[MyPropertyDescriptor]

'when (event.code) {
            PsiTreeChangeEventImpl.PsiEventType.CHILD_ADDED,
            PsiTreeChangeEventImpl.PsiEventType.CHILD_MOVED,
            PsiTreeChangeEventImpl.PsiEventType.CHILD_REPLACED,
            PsiTreeChangeEventImpl.PsiEventType.CHILD_REMOVED -> {
                val child = event.child ?: return
                if (child.getParentOfType<KtPackageDirective>(false) != null)
                    project.service<PerModulePackageCacheService>().notifyPackageChange(file)
            }
            PsiTreeChangeEventImpl.PsiEventType.CHILDREN_CHANGED -> {
                val parent = event.parent ?: return
                if (parent.getChildrenOfType<KtPackageDirective>().any())
                    project.service<PerModulePackageCacheService>().notifyPackageChange(file)
            }
            else -> {
            }
        }' @ [79:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'event' @ [79:15] ==> value-parameter event: PsiTreeChangeEventImpl defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[ValueParameterDescriptorImpl]

'code' @ [79:21] ==> public final var PsiTreeChangeEventImpl.code: (PsiTreeChangeEventImpl.PsiEventType..PsiTreeChangeEventImpl.PsiEventType?)[MyPropertyDescriptor]

'CHILD_ADDED' @ [80:49] ==> enum entry CHILD_ADDED defined in com.intellij.psi.impl.PsiTreeChangeEventImpl.PsiEventType[FakeCallableDescriptorForObject]

'CHILD_MOVED' @ [81:49] ==> enum entry CHILD_MOVED defined in com.intellij.psi.impl.PsiTreeChangeEventImpl.PsiEventType[FakeCallableDescriptorForObject]

'CHILD_REPLACED' @ [82:49] ==> enum entry CHILD_REPLACED defined in com.intellij.psi.impl.PsiTreeChangeEventImpl.PsiEventType[FakeCallableDescriptorForObject]

'CHILD_REMOVED' @ [83:49] ==> enum entry CHILD_REMOVED defined in com.intellij.psi.impl.PsiTreeChangeEventImpl.PsiEventType[FakeCallableDescriptorForObject]

'event' @ [84:29] ==> value-parameter event: PsiTreeChangeEventImpl defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[ValueParameterDescriptorImpl]

'child' @ [84:35] ==> public final var PsiTreeChangeEventImpl.child: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [85:21] ==> val child: PsiElement defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[LocalVariableDescriptor]

'getParentOfType' @ [85:27] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtPackageDirective? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPackageDirective

'project' @ [86:21] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor[PropertyDescriptorImpl]

'service' @ [86:29] ==> public inline fun <reified T : Any> Project.service(): PerModulePackageCacheService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PerModulePackageCacheService

'notifyPackageChange' @ [86:69] ==> internal final fun notifyPackageChange(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'file' @ [86:89] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[LocalVariableDescriptor]

'CHILDREN_CHANGED' @ [88:49] ==> enum entry CHILDREN_CHANGED defined in com.intellij.psi.impl.PsiTreeChangeEventImpl.PsiEventType[FakeCallableDescriptorForObject]

'event' @ [89:30] ==> value-parameter event: PsiTreeChangeEventImpl defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[ValueParameterDescriptorImpl]

'parent' @ [89:36] ==> public final var PsiTreeChangeEventImpl.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [90:21] ==> val parent: PsiElement defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[LocalVariableDescriptor]

'getChildrenOfType' @ [90:28] ==> public inline fun <reified T : PsiElement> PsiElement.getChildrenOfType(): Array<KtPackageDirective> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtPackageDirective

'any' @ [90:68] ==> public fun <T> Array<out KtPackageDirective>.any(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtPackageDirective

'project' @ [91:21] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor[PropertyDescriptorImpl]

'service' @ [91:29] ==> public inline fun <reified T : Any> Project.service(): PerModulePackageCacheService defined in com.intellij.openapi.components[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> PerModulePackageCacheService

'notifyPackageChange' @ [91:69] ==> internal final fun notifyPackageChange(file: KtFile): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'file' @ [91:89] ==> val file: KtFile defined in org.jetbrains.kotlin.idea.caches.KotlinPackageStatementPsiTreeChangePreprocessor.treeChanged[LocalVariableDescriptor]

'createConcurrentWeakMap' @ [101:39] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentWeakMap(): ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ModuleInfo
    <V : (Any..Any?)> -> Ref<ConcurrentMap<FqName, Boolean>>

'mutableSetOf' @ [103:68] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'mutableSetOf' @ [104:60] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'projectScope' @ [106:50] ==> @NotNull public open fun projectScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [106:63] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'synchronized' @ [108:41] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [108:54] ==> <this> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[LazyClassReceiverParameterDescriptor]

'pendingDirectoryChanges' @ [109:9] ==> private final val pendingDirectoryChanges: MutableSet<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'clear' @ [109:33] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'pendingKtFileChanges' @ [110:9] ==> private final val pendingKtFileChanges: MutableSet<KtFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'clear' @ [110:30] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'cache' @ [111:9] ==> private final val cache: ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'values' @ [111:15] ==> public abstract val values: MutableCollection<(Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in java.util.concurrent.ConcurrentMap[DeserializedPropertyDescriptor]

'forEach' @ [111:22] ==> @HidesMembers public inline fun <T> Iterable<(Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)>.forEach(action: ((Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>..com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>?)

'it' @ [111:32] ==> value-parameter it: (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?) defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.onTooComplexChange.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'set' @ [111:35] ==> public final fun set(@Nullable p0: ConcurrentMap<FqName, Boolean>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'synchronized' @ [114:65] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [114:78] ==> <this> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[LazyClassReceiverParameterDescriptor]

'if (file.isDirectory) {
            pendingDirectoryChanges += file
        }
        else if (file.parent != null && file.parent.isDirectory) {
            notifyPackageChange(file.parent)
        }' @ [115:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'file' @ [115:13] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'isDirectory' @ [115:18] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'pendingDirectoryChanges' @ [116:13] ==> private final val pendingDirectoryChanges: MutableSet<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'file' @ [116:40] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'file' @ [118:18] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'parent' @ [118:23] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [118:41] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'parent' @ [118:46] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'isDirectory' @ [118:53] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'notifyPackageChange' @ [119:13] ==> internal final fun notifyPackageChange(file: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'file' @ [119:33] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'parent' @ [119:38] ==> public final val VirtualFile.parent: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'synchronized' @ [123:60] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [123:73] ==> <this> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[LazyClassReceiverParameterDescriptor]

'pendingKtFileChanges' @ [124:9] ==> private final val pendingKtFileChanges: MutableSet<KtFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'file' @ [124:33] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.notifyPackageChange[ValueParameterDescriptorImpl]

'cache' @ [128:9] ==> private final val cache: ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'moduleSourceInfo' @ [128:15] ==> value-parameter moduleSourceInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.invalidateCacheForModule[ValueParameterDescriptorImpl]

'set' @ [128:34] ==> public final fun set(@Nullable p0: ConcurrentMap<FqName, Boolean>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'synchronized' @ [131:42] ==> @InlineOnly public inline fun <R> synchronized(lock: Any, block: () -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> Unit

'this' @ [131:55] ==> <this> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[LazyClassReceiverParameterDescriptor]

'if (pendingDirectoryChanges.size + pendingKtFileChanges.size >= FULL_DROP_THRESHOLD) {
            onTooComplexChange()
        }
        else {
            pendingDirectoryChanges.forEach { vfile ->
                if (vfile !in projectScope) return@forEach
                (getModuleInfoByVirtualFile(project, vfile) as? ModuleSourceInfo)?.let { invalidateCacheForModule(it) }
            }
            pendingDirectoryChanges.clear()

            pendingKtFileChanges.forEach { file ->
                if (file.virtualFile != null && file.virtualFile !in projectScope) return@forEach
                (file.getNullableModuleInfo() as? ModuleSourceInfo)?.let { invalidateCacheForModule(it) }
            }
            pendingKtFileChanges.clear()
        }' @ [132:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'pendingDirectoryChanges' @ [132:13] ==> private final val pendingDirectoryChanges: MutableSet<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'size' @ [132:37] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'pendingKtFileChanges' @ [132:44] ==> private final val pendingKtFileChanges: MutableSet<KtFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'size' @ [132:65] ==> public abstract val size: Int defined in kotlin.collections.MutableSet[DeserializedPropertyDescriptor]

'FULL_DROP_THRESHOLD' @ [132:73] ==> public final val FULL_DROP_THRESHOLD: Int defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.Companion[PropertyDescriptorImpl]

'onTooComplexChange' @ [133:13] ==> internal final fun onTooComplexChange(): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'pendingDirectoryChanges' @ [136:13] ==> private final val pendingDirectoryChanges: MutableSet<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'forEach' @ [136:37] ==> @HidesMembers public inline fun <T> Iterable<VirtualFile>.forEach(action: (VirtualFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'vfile' @ [137:21] ==> value-parameter vfile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'projectScope' @ [137:31] ==> private final val projectScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'getModuleInfoByVirtualFile' @ [138:18] ==> public fun getModuleInfoByVirtualFile(project: Project, virtualFile: VirtualFile): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'project' @ [138:45] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'vfile' @ [138:54] ==> value-parameter vfile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [138:84] ==> @InlineOnly public inline fun <T, R> ModuleSourceInfo.let(block: (ModuleSourceInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo
    <R> -> Unit

'invalidateCacheForModule' @ [138:90] ==> internal final fun invalidateCacheForModule(moduleSourceInfo: ModuleSourceInfo): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'it' @ [138:115] ==> value-parameter it: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'pendingDirectoryChanges' @ [140:13] ==> private final val pendingDirectoryChanges: MutableSet<VirtualFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'clear' @ [140:37] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'pendingKtFileChanges' @ [142:13] ==> private final val pendingKtFileChanges: MutableSet<KtFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'forEach' @ [142:34] ==> @HidesMembers public inline fun <T> Iterable<KtFile>.forEach(action: (KtFile) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'file' @ [143:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [143:26] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'file' @ [143:49] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [143:54] ==> public final val KtFile.virtualFile: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'projectScope' @ [143:70] ==> private final val projectScope: GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'file' @ [144:18] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'getNullableModuleInfo' @ [144:23] ==> public fun PsiElement.getNullableModuleInfo(): IdeaModuleInfo? defined in org.jetbrains.kotlin.idea.caches.resolve in file getModuleInfo.kt[SimpleFunctionDescriptorImpl]

'let' @ [144:70] ==> @InlineOnly public inline fun <T, R> ModuleSourceInfo.let(block: (ModuleSourceInfo) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModuleSourceInfo
    <R> -> Unit

'invalidateCacheForModule' @ [144:76] ==> internal final fun invalidateCacheForModule(moduleSourceInfo: ModuleSourceInfo): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'it' @ [144:101] ==> value-parameter it: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.checkPendingChanges.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'pendingKtFileChanges' @ [146:13] ==> private final val pendingKtFileChanges: MutableSet<KtFile> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'clear' @ [146:34] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'moduleInfo' @ [152:22] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'module' @ [152:33] ==> public abstract val module: Module defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[PropertyDescriptorImpl]

'checkPendingChanges' @ [153:9] ==> internal final fun checkPendingChanges(): Unit defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[SimpleFunctionDescriptorImpl]

'module' @ [158:30] ==> val module: Module defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[LocalVariableDescriptor]

'getUserData' @ [158:37] ==> @Nullable public abstract fun <T : (Any..Any?)> getUserData(@NotNull p0: Key<(ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>..ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?)>): ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>? defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.analyzer.ModuleInfo, com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>>..java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.analyzer.ModuleInfo, com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>>?)

'PER_MODULE_PACKAGE_CACHE' @ [158:78] ==> private final val PER_MODULE_PACKAGE_CACHE: Key<(ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>..ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?)> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.Companion[PropertyDescriptorImpl]

'run' @ [158:107] ==> @InlineOnly public inline fun <T, R> PerModulePackageCacheService.run(block: PerModulePackageCacheService.() -> ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)>): ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PerModulePackageCacheService
    <R> -> ConcurrentMap<(org.jetbrains.kotlin.analyzer.ModuleInfo..org.jetbrains.kotlin.analyzer.ModuleInfo?), (com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>..com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>?)>

'createConcurrentSoftMap' @ [159:27] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftMap(): ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ModuleInfo
    <V : (Any..Any?)> -> Ref<ConcurrentMap<FqName, Boolean>>

'apply' @ [160:22] ==> @InlineOnly public inline fun <T> ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)>.apply(block: (ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)>).() -> Unit): ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConcurrentMap<(org.jetbrains.kotlin.analyzer.ModuleInfo..org.jetbrains.kotlin.analyzer.ModuleInfo?), (com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>..com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>?)>

'module' @ [160:30] ==> val module: Module defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[LocalVariableDescriptor]

'putUserData' @ [160:37] ==> public abstract fun <T : (Any..Any?)> putUserData(@NotNull p0: Key<(ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>..ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?)>, @Nullable p1: ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?): Unit defined in com.intellij.openapi.module.Module[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.analyzer.ModuleInfo, com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>>..java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.analyzer.ModuleInfo, com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>>?)

'PER_MODULE_PACKAGE_CACHE' @ [160:78] ==> private final val PER_MODULE_PACKAGE_CACHE: Key<(ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>..ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?)> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.Companion[PropertyDescriptorImpl]

'this' @ [160:104] ==> <this> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'moduleOwnCache' @ [162:22] ==> val moduleOwnCache: ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[LocalVariableDescriptor]

'getOrPut' @ [162:37] ==> public inline fun <K, V> ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>.getOrPut(key: ModuleInfo, defaultValue: () -> Ref<ConcurrentMap<FqName, Boolean>>): Ref<ConcurrentMap<FqName, Boolean>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ModuleInfo
    <V> -> Ref<ConcurrentMap<FqName, Boolean>>

'moduleInfo' @ [162:46] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'cache' @ [162:60] ==> private final val cache: ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)> defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'getOrPut' @ [162:66] ==> public inline fun <K, V> ConcurrentMap<(ModuleInfo..ModuleInfo?), (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)>.getOrPut(key: (ModuleInfo..ModuleInfo?), defaultValue: () -> (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?)): (Ref<ConcurrentMap<FqName, Boolean>>..Ref<ConcurrentMap<FqName, Boolean>>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.analyzer.ModuleInfo..org.jetbrains.kotlin.analyzer.ModuleInfo?)
    <V> -> (com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>..com.intellij.openapi.util.Ref<java.util.concurrent.ConcurrentMap<org.jetbrains.kotlin.name.FqName, kotlin.Boolean>>?)

'moduleInfo' @ [162:75] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'Ref' @ [162:89] ==> public constructor Ref<T : (Any..Any?)>() defined in com.intellij.openapi.util.Ref[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConcurrentMap<FqName, Boolean>

'apply' @ [163:18] ==> @InlineOnly public inline fun <T> Ref<ConcurrentMap<FqName, Boolean>>.apply(block: Ref<ConcurrentMap<FqName, Boolean>>.() -> Unit): Ref<ConcurrentMap<FqName, Boolean>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Ref<ConcurrentMap<FqName, Boolean>>

'isNull' @ [163:30] ==> public final val <T : (Any..Any?)> Ref<ConcurrentMap<FqName, Boolean>>.isNull: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConcurrentMap<FqName, Boolean>

'set' @ [163:38] ==> public final fun set(@Nullable p0: ConcurrentMap<FqName, Boolean>?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'createConcurrentSoftMap' @ [163:56] ==> @NotNull @Contract public open fun <K : (Any..Any?), V : (Any..Any?)> createConcurrentSoftMap(): ConcurrentMap<(FqName..FqName?), (Boolean..Boolean?)> defined in com.intellij.util.containers.ContainerUtil[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FqName
    <V : (Any..Any?)> -> Boolean

'get' @ [164:18] ==> public final fun get(): (ConcurrentMap<FqName, Boolean>..ConcurrentMap<FqName, Boolean>?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'cached' @ [167:16] ==> val cached: (ConcurrentMap<FqName, Boolean>..ConcurrentMap<FqName, Boolean>?) defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[LocalVariableDescriptor]

'getOrPut' @ [167:23] ==> public inline fun <K, V> ConcurrentMap<FqName, Boolean>.getOrPut(key: FqName, defaultValue: () -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> Boolean

'packageFqName' @ [167:32] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'PackageIndexUtil' @ [168:13] ==> public object PackageIndexUtil defined in org.jetbrains.kotlin.idea.stubindex in file PackageIndexUtil.kt[FakeCallableDescriptorForObject]

'packageExists' @ [168:30] ==> @JvmStatic public final fun packageExists(packageFqName: FqName, searchScope: GlobalSearchScope, project: Project): Boolean defined in org.jetbrains.kotlin.idea.stubindex.PackageIndexUtil[SimpleFunctionDescriptorImpl]

'packageFqName' @ [168:44] ==> value-parameter packageFqName: FqName defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'moduleInfo' @ [168:59] ==> value-parameter moduleInfo: ModuleSourceInfo defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService.packageExists[ValueParameterDescriptorImpl]

'contentScope' @ [168:70] ==> public abstract fun contentScope(): GlobalSearchScope defined in org.jetbrains.kotlin.idea.caches.resolve.ModuleSourceInfo[SimpleFunctionDescriptorImpl]

'project' @ [168:86] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.caches.PerModulePackageCacheService[PropertyDescriptorImpl]

'create' @ [173:52] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>..ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ConcurrentMap<ModuleInfo, Ref<ConcurrentMap<FqName, Boolean>>>

