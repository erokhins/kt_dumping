'SimpleModificationTracker' @ [38:54] ==> public constructor SimpleModificationTracker() defined in com.intellij.openapi.util.SimpleModificationTracker[JavaClassConstructorDescriptor]

'JvmStatic' @ [40:9] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'!!' @ [41:45] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: LibraryModificationTracker?): LibraryModificationTracker[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> LibraryModificationTracker

'getService' @ [41:60] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(LibraryModificationTracker..LibraryModificationTracker?)>): (LibraryModificationTracker..LibraryModificationTracker?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker..org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker?)

'project' @ [41:71] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.Companion.getInstance[ValueParameterDescriptorImpl]

'LibraryModificationTracker' @ [41:80] ==> public companion object defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[FakeCallableDescriptorForObject]

'java' @ [41:114] ==> public val <T> KClass<LibraryModificationTracker>.java: Class<LibraryModificationTracker> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> LibraryModificationTracker

'project' @ [45:26] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[ValueParameterDescriptorImpl]

'messageBus' @ [45:34] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [45:45] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'connection' @ [46:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[LocalVariableDescriptor]

'subscribe' @ [46:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(BulkFileListener..BulkFileListener?)>, @NotNull p1: BulkFileListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.openapi.vfs.newvfs.BulkFileListener..com.intellij.openapi.vfs.newvfs.BulkFileListener?)

'VFS_CHANGES' @ [46:49] ==> public final val VFS_CHANGES: (Topic<(BulkFileListener..BulkFileListener?)>..Topic<(BulkFileListener..BulkFileListener?)>?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaPropertyDescriptor]

'BulkFileListener.Adapter' @ [46:71] ==> public constructor Adapter() defined in com.intellij.openapi.vfs.newvfs.BulkFileListener.Adapter[JavaClassConstructorDescriptor]

'events' @ [48:17] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.after[ValueParameterDescriptorImpl]

'filter' @ [48:24] ==> public inline fun <T> Iterable<VFileEvent>.filter(predicate: (VFileEvent) -> Boolean): List<VFileEvent> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent

'isRelevantEvent' @ [48:33] ==> private fun isRelevantEvent(vFileEvent: VFileEvent): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve in file LibraryModificationTracker.kt[SimpleFunctionDescriptorImpl]

'let' @ [48:50] ==> @InlineOnly public inline fun <T, R> List<VFileEvent>.let(block: (List<VFileEvent>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<VFileEvent>
    <R> -> Unit

'createEvents' @ [49:25] ==> value-parameter createEvents: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [49:38] ==> @InlineOnly public inline fun <T> Collection<VFileEvent>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent

'getApplication' @ [50:44] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [50:61] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'!' @ [51:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'project' @ [51:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[ValueParameterDescriptorImpl]

'isDisposed' @ [51:42] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'processBulk' @ [52:33] ==> private final inline fun processBulk(events: List<VFileEvent>, check: (VirtualFile) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[SimpleFunctionDescriptorImpl]

'createEvents' @ [52:45] ==> value-parameter createEvents: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.after.<anonymous>[ValueParameterDescriptorImpl]

'projectFileIndex' @ [53:37] ==> private final val projectFileIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[PropertyDescriptorImpl]

'isInLibraryClasses' @ [53:54] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'it' @ [53:73] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.after.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isLibraryArchiveRoot' @ [53:80] ==> private final fun isLibraryArchiveRoot(virtualFile: VirtualFile): Boolean defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[SimpleFunctionDescriptorImpl]

'it' @ [53:101] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.after.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'processBulk' @ [62:17] ==> private final inline fun processBulk(events: List<VFileEvent>, check: (VirtualFile) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[SimpleFunctionDescriptorImpl]

'events' @ [62:29] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.before[ValueParameterDescriptorImpl]

'projectFileIndex' @ [63:21] ==> private final val projectFileIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[PropertyDescriptorImpl]

'isInLibraryClasses' @ [63:38] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'it' @ [63:57] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>.<no name provided>.before.<anonymous>[ValueParameterDescriptorImpl]

'connection' @ [68:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[LocalVariableDescriptor]

'subscribe' @ [68:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>, @NotNull p1: DumbService.DumbModeListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.openapi.project.DumbService.DumbModeListener..com.intellij.openapi.project.DumbService.DumbModeListener?)

'DUMB_MODE' @ [68:42] ==> public final val DUMB_MODE: (Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>..Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>?) defined in com.intellij.openapi.project.DumbService[JavaPropertyDescriptor]

'incModificationCount' @ [70:17] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'incModificationCount' @ [74:17] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'connection' @ [78:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[LocalVariableDescriptor]

'subscribe' @ [78:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(FileTypeListener..FileTypeListener?)>, @NotNull p1: FileTypeListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> (com.intellij.openapi.fileTypes.FileTypeListener..com.intellij.openapi.fileTypes.FileTypeListener?)

'TOPIC' @ [78:46] ==> @NotNull public final val TOPIC: Topic<(FileTypeListener..FileTypeListener?)> defined in com.intellij.openapi.fileTypes.FileTypeManager[JavaPropertyDescriptor]

'incModificationCount' @ [80:17] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'incModificationCount' @ [84:17] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'getInstance' @ [89:61] ==> public open fun getInstance(p0: (Project..Project?)): (ProjectFileIndex..ProjectFileIndex?) defined in com.intellij.openapi.roots.ProjectFileIndex.SERVICE[JavaMethodDescriptor]

'project' @ [89:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.<init>[ValueParameterDescriptorImpl]

'events' @ [92:9] ==> value-parameter events: List<VFileEvent> defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.processBulk[ValueParameterDescriptorImpl]

'forEach' @ [92:16] ==> @HidesMembers public inline fun <T> Iterable<VFileEvent>.forEach(action: (VFileEvent) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VFileEvent

'event' @ [93:17] ==> value-parameter event: VFileEvent defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.processBulk.<anonymous>[ValueParameterDescriptorImpl]

'isValid' @ [93:23] ==> public final val VFileEvent.isValid: Boolean[MyPropertyDescriptor]

'event' @ [94:28] ==> value-parameter event: VFileEvent defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.processBulk.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [94:34] ==> public final val VFileEvent.file: VirtualFile?[MyPropertyDescriptor]

'file' @ [95:21] ==> val file: VirtualFile? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.processBulk.<anonymous>[LocalVariableDescriptor]

'invoke' @ [95:37] ==> public abstract operator fun invoke(p1: VirtualFile): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'file' @ [95:43] ==> val file: VirtualFile? defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.processBulk.<anonymous>[LocalVariableDescriptor]

'incModificationCount' @ [96:21] ==> public open fun incModificationCount(): Unit defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[JavaMethodDescriptor]

'virtualFile' @ [105:13] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.isLibraryArchiveRoot[ValueParameterDescriptorImpl]

'fileType' @ [105:25] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [105:53] ==> public final val INSTANCE: (ArchiveFileType..ArchiveFileType?) defined in com.intellij.ide.highlighter.ArchiveFileType[JavaPropertyDescriptor]

'?:' @ [107:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'getJarRootForLocalFile' @ [107:47] ==> @Nullable public open fun getJarRootForLocalFile(@NotNull p0: VirtualFile): VirtualFile? defined in com.intellij.openapi.vfs.StandardFileSystems[JavaMethodDescriptor]

'virtualFile' @ [107:70] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.isLibraryArchiveRoot[ValueParameterDescriptorImpl]

'projectFileIndex' @ [108:16] ==> private final val projectFileIndex: (ProjectFileIndex..ProjectFileIndex?) defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker[PropertyDescriptorImpl]

'isInLibraryClasses' @ [108:33] ==> public abstract fun isInLibraryClasses(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.roots.ProjectFileIndex[JavaMethodDescriptor]

'archiveRoot' @ [108:52] ==> val archiveRoot: VirtualFile defined in org.jetbrains.kotlin.idea.caches.resolve.LibraryModificationTracker.isLibraryArchiveRoot[LocalVariableDescriptor]

'vFileEvent' @ [112:55] ==> value-parameter vFileEvent: VFileEvent defined in org.jetbrains.kotlin.idea.caches.resolve.isRelevantEvent[ValueParameterDescriptorImpl]

'vFileEvent' @ [112:89] ==> value-parameter vFileEvent: VFileEvent defined in org.jetbrains.kotlin.idea.caches.resolve.isRelevantEvent[ValueParameterDescriptorImpl]

'vFileEvent' @ [112:121] ==> value-parameter vFileEvent: VFileEvent defined in org.jetbrains.kotlin.idea.caches.resolve.isRelevantEvent[ValueParameterDescriptorImpl]

