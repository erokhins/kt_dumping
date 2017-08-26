'getPluginVersion' @ [40:42] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'isSnapshotVersion' @ [41:26] ==> public open fun isSnapshotVersion(): Boolean defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'emptyList' @ [41:54] ==> public fun <T> emptyList(): List<VersionedLibrary> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary

'pluginVersion' @ [44:9] ==> val pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'getInstance' @ [44:46] ==> public open fun getInstance(p0: (Project..Project?)): (PropertiesComponent..PropertiesComponent?) defined in com.intellij.ide.util.PropertiesComponent[JavaMethodDescriptor]

'project' @ [44:58] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[ValueParameterDescriptorImpl]

'getValue' @ [44:67] ==> @Nullable public abstract fun getValue(@NonNls p0: (String..String?)): String? defined in com.intellij.ide.util.PropertiesComponent[JavaMethodDescriptor]

'SUPPRESSED_PROPERTY_NAME' @ [44:76] ==> private val SUPPRESSED_PROPERTY_NAME: String defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[PropertyDescriptorImpl]

'emptyList' @ [45:16] ==> public fun <T> emptyList(): List<VersionedLibrary> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary

'arrayListOf' @ [48:29] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<VersionedLibrary> /* = ArrayList<VersionedLibrary> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary

'component1' @ [50:11] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>.component1(): (Library..Library?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)
    <V> -> (kotlin.collections.MutableCollection<(com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)>..kotlin.collections.Collection<(com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)>?)

'component2' @ [50:20] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>.component2(): (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)
    <V> -> (kotlin.collections.MutableCollection<(com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)>..kotlin.collections.Collection<(com.intellij.openapi.module.Module..com.intellij.openapi.module.Module?)>?)

'findAllUsedLibraries' @ [50:32] ==> public fun findAllUsedLibraries(project: Project): MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'project' @ [50:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[ValueParameterDescriptorImpl]

'entrySet' @ [50:62] ==> @NotNull public open fun entrySet(): (MutableSet<(MutableMap.MutableEntry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>..Map.Entry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>?)>..Set<(MutableMap.MutableEntry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>..Map.Entry<(Library..Library?), (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?)>?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'getOutdatedRuntimeLibraryVersion' @ [51:9] ==> public fun getOutdatedRuntimeLibraryVersion(library: Library): String? defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'library' @ [51:42] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'let' @ [51:52] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Boolean

'outdatedLibraries' @ [52:13] ==> val outdatedLibraries: ArrayList<VersionedLibrary> /* = ArrayList<VersionedLibrary> */ defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'add' @ [52:31] ==> public open fun add(element: VersionedLibrary): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'VersionedLibrary' @ [52:35] ==> public constructor VersionedLibrary(library: Library, version: String?, usedInModules: Collection<Module>) defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[ClassConstructorDescriptorImpl]

'library' @ [52:52] ==> val library: (Library..Library?) defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'version' @ [52:61] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries.<anonymous>[ValueParameterDescriptorImpl]

'modules' @ [52:70] ==> val modules: (MutableCollection<(Module..Module?)>..Collection<(Module..Module?)>?) defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'outdatedLibraries' @ [56:12] ==> val outdatedLibraries: ArrayList<VersionedLibrary> /* = ArrayList<VersionedLibrary> */ defined in org.jetbrains.kotlin.idea.versions.findOutdatedKotlinLibraries[LocalVariableDescriptor]

'getKotlinLibraryVersion' @ [60:26] ==> private fun getKotlinLibraryVersion(library: Library): String? defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'library' @ [60:50] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.getOutdatedRuntimeLibraryVersion[ValueParameterDescriptorImpl]

'bundledRuntimeVersion' @ [61:26] ==> public fun bundledRuntimeVersion(): String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'if (isRuntimeOutdated(libraryVersion, runtimeVersion)) libraryVersion else null' @ [63:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'isRuntimeOutdated' @ [63:16] ==> public fun isRuntimeOutdated(libraryVersion: String?, runtimeVersion: String): Boolean defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'libraryVersion' @ [63:34] ==> val libraryVersion: String defined in org.jetbrains.kotlin.idea.versions.getOutdatedRuntimeLibraryVersion[LocalVariableDescriptor]

'runtimeVersion' @ [63:50] ==> val runtimeVersion: String defined in org.jetbrains.kotlin.idea.versions.getOutdatedRuntimeLibraryVersion[LocalVariableDescriptor]

'libraryVersion' @ [63:67] ==> val libraryVersion: String defined in org.jetbrains.kotlin.idea.versions.getOutdatedRuntimeLibraryVersion[LocalVariableDescriptor]

'?:' @ [67:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String?

'getJavaRuntimeVersion' @ [67:34] ==> public open fun getJavaRuntimeVersion(@NotNull p0: Library): (String..String?) defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaMethodDescriptor]

'library' @ [67:56] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.getKotlinLibraryVersion[ValueParameterDescriptorImpl]

'JsLibraryStdDetectionUtil' @ [68:9] ==> public object JsLibraryStdDetectionUtil defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'getJsLibraryStdVersion' @ [68:35] ==> public final fun getJsLibraryStdVersion(library: Library): String? defined in org.jetbrains.kotlin.idea.framework.JsLibraryStdDetectionUtil[DeserializedSimpleFunctionDescriptor]

'library' @ [68:58] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.getKotlinLibraryVersion[ValueParameterDescriptorImpl]

'isKotlinRuntime' @ [70:82] ==> public fun isKotlinRuntime(library: Library): Boolean defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[SimpleFunctionDescriptorImpl]

'getInstance' @ [71:42] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'module' @ [71:54] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.findKotlinRuntimeLibrary[ValueParameterDescriptorImpl]

'orderEntries' @ [71:62] ==> public final val ModuleRootManager.orderEntries: (Array<(OrderEntry..OrderEntry?)>..Array<out (OrderEntry..OrderEntry?)>)[MyPropertyDescriptor]

'filterIsInstance' @ [71:75] ==> public inline fun <reified R> Array<*>.filterIsInstance(): List<LibraryOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LibraryOrderEntry

'orderEntries' @ [72:12] ==> val orderEntries: List<LibraryOrderEntry> defined in org.jetbrains.kotlin.idea.versions.findKotlinRuntimeLibrary[LocalVariableDescriptor]

'asSequence' @ [72:25] ==> public fun <T> Iterable<LibraryOrderEntry>.asSequence(): Sequence<LibraryOrderEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryOrderEntry

'mapNotNull' @ [73:14] ==> public fun <T, R : Any> Sequence<LibraryOrderEntry>.mapNotNull(transform: (LibraryOrderEntry) -> Library?): Sequence<Library> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LibraryOrderEntry
    <R : Any> -> Library

'it' @ [73:27] ==> value-parameter it: LibraryOrderEntry defined in org.jetbrains.kotlin.idea.versions.findKotlinRuntimeLibrary.<anonymous>[ValueParameterDescriptorImpl]

'library' @ [73:30] ==> public final val LibraryOrderEntry.library: Library?[MyPropertyDescriptor]

'firstOrNull' @ [74:14] ==> public inline fun <T> Sequence<Library>.firstOrNull(predicate: (Library) -> Boolean): Library? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'predicate' @ [74:26] ==> value-parameter predicate: (Library) -> Boolean = ... defined in org.jetbrains.kotlin.idea.versions.findKotlinRuntimeLibrary[ValueParameterDescriptorImpl]

'isKotlinJavaRuntime' @ [77:41] ==> public fun isKotlinJavaRuntime(library: Library): Boolean defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'library' @ [77:61] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.isKotlinRuntime[ValueParameterDescriptorImpl]

'isKotlinJsRuntime' @ [77:73] ==> public fun isKotlinJsRuntime(library: Library): Boolean defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'library' @ [77:91] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.isKotlinRuntime[ValueParameterDescriptorImpl]

'!=' @ [80:9] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.openapi.vfs.VirtualFile[DeserializedSimpleFunctionDescriptor]

'getRuntimeJar' @ [80:34] ==> @Nullable public open fun getRuntimeJar(@NotNull p0: (MutableList<(VirtualFile..VirtualFile?)>..List<(VirtualFile..VirtualFile?)>)): VirtualFile? defined in org.jetbrains.kotlin.idea.framework.JavaRuntimeDetectionUtil[JavaMethodDescriptor]

'library' @ [80:48] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.isKotlinJavaRuntime[ValueParameterDescriptorImpl]

'getFiles' @ [80:56] ==> @NotNull public abstract fun getFiles(@NotNull p0: OrderRootType): (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>) defined in com.intellij.openapi.roots.libraries.Library[JavaMethodDescriptor]

'CLASSES' @ [80:79] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'asList' @ [80:88] ==> public fun <T> Array<out (VirtualFile..VirtualFile?)>.asList(): List<(VirtualFile..VirtualFile?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.vfs.VirtualFile..com.intellij.openapi.vfs.VirtualFile?)

'JsLibraryStdDetectionUtil' @ [83:9] ==> public object JsLibraryStdDetectionUtil defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'hasJsStdlibJar' @ [83:35] ==> public final fun hasJsStdlibJar(library: Library, ignoreKind: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.framework.JsLibraryStdDetectionUtil[DeserializedSimpleFunctionDescriptor]

'library' @ [83:50] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.isKotlinJsRuntime[ValueParameterDescriptorImpl]

'libraries' @ [86:5] ==> value-parameter libraries: List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions.collectModulesWithOutdatedRuntime[ValueParameterDescriptorImpl]

'flatMap' @ [86:15] ==> public inline fun <T, R> Iterable<VersionedLibrary>.flatMap(transform: (VersionedLibrary) -> Iterable<Module>): List<Module> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary
    <R> -> Module

'it' @ [86:25] ==> value-parameter it: VersionedLibrary defined in org.jetbrains.kotlin.idea.versions.collectModulesWithOutdatedRuntime.<anonymous>[ValueParameterDescriptorImpl]

'usedInModules' @ [86:28] ==> public final val usedInModules: Collection<Module> defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[PropertyDescriptorImpl]

'getPluginVersion' @ [89:42] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'if (outdatedLibraries.size == 1) {
        val versionedLibrary = outdatedLibraries.first()

        val version = versionedLibrary.version
        val readableVersion = version ?: "unknown"
        val libraryName = versionedLibrary.library.name

        "<p>Your version of Kotlin runtime in '$libraryName' library is $readableVersion, while plugin version is $pluginVersion.</p>" +
        "<p>Runtime library should be updated to avoid compatibility problems.</p>" +
        "<p><a href=\"update\">Update Runtime</a> <a href=\"ignore\">Ignore</a></p>"
    }
    else {
        val libraryNames = outdatedLibraries.joinToString { it.library.name ?: "unknown library" }

        "<p>Version of Kotlin runtime is outdated in several libraries ($libraryNames). Plugin version is $pluginVersion.</p>" +
        "<p>Runtime libraries should be updated to avoid compatibility problems.</p>" +
        "<p><a href=\"update\">Update All</a> <a href=\"ignore\">Ignore</a></p>"
    }' @ [90:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'outdatedLibraries' @ [90:31] ==> value-parameter outdatedLibraries: Collection<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'size' @ [90:49] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'outdatedLibraries' @ [91:32] ==> value-parameter outdatedLibraries: Collection<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'first' @ [91:50] ==> public fun <T> Iterable<VersionedLibrary>.first(): VersionedLibrary defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary

'versionedLibrary' @ [93:23] ==> val versionedLibrary: VersionedLibrary defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'version' @ [93:40] ==> public final val version: String? defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[PropertyDescriptorImpl]

'version' @ [94:31] ==> val version: String? defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'versionedLibrary' @ [95:27] ==> val versionedLibrary: VersionedLibrary defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'library' @ [95:44] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[PropertyDescriptorImpl]

'name' @ [95:52] ==> public final val Library.name: String?[MyPropertyDescriptor]

'+' @ [97:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'libraryName' @ [97:49] ==> val libraryName: String? defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'readableVersion' @ [97:74] ==> val readableVersion: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'pluginVersion' @ [97:116] ==> val pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'outdatedLibraries' @ [102:28] ==> value-parameter outdatedLibraries: Collection<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'joinToString' @ [102:46] ==> public fun <T> Iterable<VersionedLibrary>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((VersionedLibrary) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary

'it' @ [102:61] ==> value-parameter it: VersionedLibrary defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[ValueParameterDescriptorImpl]

'library' @ [102:64] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[PropertyDescriptorImpl]

'name' @ [102:72] ==> public final val Library.name: String?[MyPropertyDescriptor]

'+' @ [104:9] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'libraryNames' @ [104:74] ==> val libraryNames: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'pluginVersion' @ [104:108] ==> val pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'notify' @ [110:23] ==> public open fun notify(@NotNull p0: Notification, @Nullable p1: Project?): Unit defined in com.intellij.notification.Notifications.Bus[JavaMethodDescriptor]

'Notification' @ [110:30] ==> public constructor Notification(@NotNull p0: String, @NotNull p1: String, @NotNull p2: String, @NotNull p3: NotificationType, @Nullable p4: NotificationListener?) defined in com.intellij.notification.Notification[JavaClassConstructorDescriptor]

'OUTDATED_RUNTIME_GROUP_DISPLAY_ID' @ [110:43] ==> private val OUTDATED_RUNTIME_GROUP_DISPLAY_ID: String defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[PropertyDescriptorImpl]

'message' @ [110:105] ==> val message: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'WARNING' @ [111:60] ==> enum entry WARNING defined in com.intellij.notification.NotificationType[FakeCallableDescriptorForObject]

'NotificationListener' @ [111:69] ==> public fun NotificationListener(function: (Notification, HyperlinkEvent) -> Unit): NotificationListener defined in com.intellij.notification[SimpleFunctionDescriptorImpl]

'event' @ [112:13] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[ValueParameterDescriptorImpl]

'eventType' @ [112:19] ==> public final val HyperlinkEvent.eventType: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?)[MyPropertyDescriptor]

'ACTIVATED' @ [112:57] ==> public final val ACTIVATED: (HyperlinkEvent.EventType..HyperlinkEvent.EventType?) defined in javax.swing.event.HyperlinkEvent.EventType[JavaPropertyDescriptor]

'when {
                "update" == event.description -> {
                    val outdatedLibraries = findOutdatedKotlinLibraries(project).map { it.library }
                    ApplicationManager.getApplication().invokeLater {
                        updateLibraries(project, outdatedLibraries)
                    }
                }
                "ignore" == event.description -> {
                    PropertiesComponent.getInstance(project).setValue(SUPPRESSED_PROPERTY_NAME, pluginVersion)
                }
                else -> {
                    throw AssertionError()
                }
            }' @ [113:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'==' @ [114:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'event' @ [114:29] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [114:35] ==> public final val HyperlinkEvent.description: (String..String?)[MyPropertyDescriptor]

'findOutdatedKotlinLibraries' @ [115:45] ==> public fun findOutdatedKotlinLibraries(project: Project): List<VersionedLibrary> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'project' @ [115:73] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'map' @ [115:82] ==> public inline fun <T, R> Iterable<VersionedLibrary>.map(transform: (VersionedLibrary) -> Library): List<Library> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VersionedLibrary
    <R> -> Library

'it' @ [115:88] ==> value-parameter it: VersionedLibrary defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'library' @ [115:91] ==> public final val library: Library defined in org.jetbrains.kotlin.idea.versions.VersionedLibrary[PropertyDescriptorImpl]

'getApplication' @ [116:40] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [116:57] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'updateLibraries' @ [117:25] ==> public fun updateLibraries(project: Project, libraries: Collection<Library>): Unit defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'project' @ [117:41] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'outdatedLibraries' @ [117:50] ==> val outdatedLibraries: List<Library> defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[LocalVariableDescriptor]

'==' @ [120:17] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'event' @ [120:29] ==> value-parameter event: HyperlinkEvent defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[ValueParameterDescriptorImpl]

'description' @ [120:35] ==> public final val HyperlinkEvent.description: (String..String?)[MyPropertyDescriptor]

'getInstance' @ [121:41] ==> public open fun getInstance(p0: (Project..Project?)): (PropertiesComponent..PropertiesComponent?) defined in com.intellij.ide.util.PropertiesComponent[JavaMethodDescriptor]

'project' @ [121:53] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'setValue' @ [121:62] ==> public abstract fun setValue(@NotNull p0: String, @Nullable p1: String?): Unit defined in com.intellij.ide.util.PropertiesComponent[JavaMethodDescriptor]

'SUPPRESSED_PROPERTY_NAME' @ [121:71] ==> private val SUPPRESSED_PROPERTY_NAME: String defined in org.jetbrains.kotlin.idea.versions in file OutdatedKotlinRuntimeChecker.kt[PropertyDescriptorImpl]

'pluginVersion' @ [121:97] ==> val pluginVersion: String defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[LocalVariableDescriptor]

'AssertionError' @ [124:27] ==> public final fun <init>(): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'notification' @ [127:13] ==> value-parameter notification: Notification defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime.<anonymous>[ValueParameterDescriptorImpl]

'expire' @ [127:26] ==> public open fun expire(): Unit defined in com.intellij.notification.Notification[JavaMethodDescriptor]

'project' @ [129:9] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.notifyOutdatedKotlinRuntime[ValueParameterDescriptorImpl]

'libraryVersion' @ [136:12] ==> value-parameter libraryVersion: String? defined in org.jetbrains.kotlin.idea.versions.isRuntimeOutdated[ValueParameterDescriptorImpl]

'libraryVersion' @ [136:38] ==> value-parameter libraryVersion: String? defined in org.jetbrains.kotlin.idea.versions.isRuntimeOutdated[ValueParameterDescriptorImpl]

'startsWith' @ [136:53] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'runtimeVersion' @ [136:80] ==> value-parameter runtimeVersion: String defined in org.jetbrains.kotlin.idea.versions.isRuntimeOutdated[ValueParameterDescriptorImpl]

'startsWith' @ [136:95] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'>' @ [137:12] ==> public open fun compareTo(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'compare' @ [137:34] ==> public open fun compare(p0: (String..String?), p1: (String..String?)): Int defined in com.intellij.util.text.VersionComparatorUtil[JavaMethodDescriptor]

'runtimeVersion' @ [137:42] ==> value-parameter runtimeVersion: String defined in org.jetbrains.kotlin.idea.versions.isRuntimeOutdated[ValueParameterDescriptorImpl]

'substringBefore' @ [137:57] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'libraryVersion' @ [137:87] ==> value-parameter libraryVersion: String? defined in org.jetbrains.kotlin.idea.versions.isRuntimeOutdated[ValueParameterDescriptorImpl]

