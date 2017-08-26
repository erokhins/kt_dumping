'EditorNotifications.Provider<EditorNotificationPanel>' @ [62:86] ==> public constructor Provider<T : (JComponent..JComponent?)>() defined in com.intellij.ui.EditorNotifications.Provider[JavaClassConstructorDescriptor]
Inferred types:
    <T : (JComponent..JComponent?)> -> EditorNotificationPanel

'project' @ [65:26] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'messageBus' @ [65:34] ==> public final val Project.messageBus: MessageBus[MyPropertyDescriptor]

'connect' @ [65:45] ==> @NotNull public abstract fun connect(): MessageBusConnection defined in com.intellij.util.messages.MessageBus[JavaMethodDescriptor]

'connection' @ [66:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.<init>[LocalVariableDescriptor]

'subscribe' @ [66:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(ModuleRootListener..ModuleRootListener?)>, @NotNull p1: ModuleRootListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> ModuleRootListener

'PROJECT_ROOTS' @ [66:44] ==> public final val PROJECT_ROOTS: (Topic<(ModuleRootListener..ModuleRootListener?)>..Topic<(ModuleRootListener..ModuleRootListener?)>?) defined in com.intellij.ProjectTopics[JavaPropertyDescriptor]

'ModuleRootAdapter' @ [66:68] ==> public constructor ModuleRootAdapter() defined in com.intellij.openapi.roots.ModuleRootAdapter[JavaClassConstructorDescriptor]

'updateNotifications' @ [68:17] ==> private final fun updateNotifications(): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'connection' @ [71:9] ==> val connection: MessageBusConnection defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.<init>[LocalVariableDescriptor]

'subscribe' @ [71:20] ==> public abstract fun <L : (Any..Any?)> subscribe(@NotNull p0: Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>, @NotNull p1: DumbService.DumbModeListener): Unit defined in com.intellij.util.messages.MessageBusConnection[JavaMethodDescriptor]
Inferred types:
    <L : (Any..Any?)> -> DumbModeListener

'DUMB_MODE' @ [71:42] ==> public final val DUMB_MODE: (Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>..Topic<(DumbService.DumbModeListener..DumbService.DumbModeListener?)>?) defined in com.intellij.openapi.project.DumbService[JavaPropertyDescriptor]

'updateNotifications' @ [76:17] ==> private final fun updateNotifications(): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'ErrorNotificationPanel' @ [82:22] ==> public constructor ErrorNotificationPanel() defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[ClassConstructorDescriptorImpl]

'badVersionedRoots' @ [83:28] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'map' @ [83:46] ==> public inline fun <T, R> Iterable<BinaryVersionedFile<BinaryVersion>>.map(transform: (BinaryVersionedFile<BinaryVersion>) -> VirtualFile): List<VirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>
    <R> -> VirtualFile

'it' @ [83:52] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [83:55] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'findAllUsedLibraries' @ [85:31] ==> public fun findAllUsedLibraries(project: Project): MultiMap<Library, Module> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'project' @ [85:52] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'keySet' @ [85:61] ==> @NotNull public open fun keySet(): (MutableSet<(Library..Library?)>..Set<(Library..Library?)>) defined in com.intellij.util.containers.MultiMap[JavaMethodDescriptor]

'kotlinLibraries' @ [86:35] ==> val kotlinLibraries: (MutableSet<(Library..Library?)>..Set<(Library..Library?)>) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'filter' @ [86:51] ==> public inline fun <T> Iterable<(Library..Library?)>.filter(predicate: ((Library..Library?)) -> Boolean): List<(Library..Library?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.libraries.Library..com.intellij.openapi.roots.libraries.Library?)

'getLocalJar' @ [87:30] ==> public fun getLocalJar(kotlinRuntimeJar: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'findExistingJar' @ [87:75] ==> public open fun findExistingJar(library: Library): VirtualFile? defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'library' @ [87:91] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'getLocalJar' @ [88:28] ==> public fun getLocalJar(kotlinRuntimeJar: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'findExistingJar' @ [88:75] ==> public open fun findExistingJar(library: Library): VirtualFile? defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'library' @ [88:91] ==> value-parameter library: (Library..Library?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'badRootFiles' @ [89:13] ==> val badRootFiles: List<VirtualFile> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'contains' @ [89:26] ==> public operator fun <@OnlyInputTypes T> Iterable<VirtualFile?>.contains(element: VirtualFile?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> VirtualFile?

'runtimeJar' @ [89:35] ==> val runtimeJar: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[LocalVariableDescriptor]

'badRootFiles' @ [89:50] ==> val badRootFiles: List<VirtualFile> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'contains' @ [89:63] ==> public operator fun <@OnlyInputTypes T> Iterable<VirtualFile?>.contains(element: VirtualFile?): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> VirtualFile?

'jsLibJar' @ [89:72] ==> val jsLibJar: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[LocalVariableDescriptor]

'badVersionedRoots' @ [92:38] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'all' @ [92:56] ==> public inline fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.all(predicate: (BinaryVersionedFile<BinaryVersion>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'it' @ [92:62] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'supportedVersion' @ [92:65] ==> public final val supportedVersion: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'it' @ [92:84] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [92:87] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'badVersionedRoots' @ [93:38] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'all' @ [93:56] ==> public inline fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.all(predicate: (BinaryVersionedFile<BinaryVersion>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'it' @ [93:62] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'supportedVersion' @ [93:65] ==> public final val supportedVersion: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'it' @ [93:84] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [93:87] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'if (!badRuntimeLibraries.isEmpty()) {
            val badRootsInRuntimeLibraries = findBadRootsInRuntimeLibraries(badRuntimeLibraries, badVersionedRoots)
            val otherBadRootsCount = badVersionedRoots.size - badRootsInRuntimeLibraries.size

            val text = MessageFormat.format("<html><b>{0,choice,0#|1#|1<Some }Kotlin runtime librar{0,choice,0#|1#y|1<ies}</b>" +
                                            "{1,choice,0#|1# and one other jar|1< and {1} other jars} " +
                                            "{1,choice,0#has|0<have} an unsupported binary format.</html>",
                                            badRuntimeLibraries.size,
                                            otherBadRootsCount)

            answer.setText(text)

            if (isPluginOldForAllRoots) {
                createUpdatePluginLink(answer)
            }

            val isPluginOldForAllRuntimeLibraries = badRootsInRuntimeLibraries.all { it.supportedVersion < it.version }
            val isPluginNewForAllRuntimeLibraries = badRootsInRuntimeLibraries.all { it.supportedVersion > it.version }

            val updateAction = when {
                isPluginNewForAllRuntimeLibraries -> "Update"
                isPluginOldForAllRuntimeLibraries -> "Downgrade"
                else -> "Replace"
            }

            val actionLabelText = MessageFormat.format("$updateAction {0,choice,0#|1#|1<all }Kotlin runtime librar{0,choice,0#|1#y|1<ies} ", badRuntimeLibraries.size)
            answer.createActionLabel(actionLabelText) {
                ApplicationManager.getApplication().invokeLater {
                    updateLibraries(project, badRuntimeLibraries)
                }
            }
        }
        else if (badVersionedRoots.size == 1) {
            val badVersionedRoot = badVersionedRoots.first()
            val presentableName = badVersionedRoot.file.presentableName

            when {
                isPluginOldForAllRoots -> {
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> was compiled with a newer Kotlin compiler and can't be read. Please update Kotlin plugin.</html>")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> has outdated binary format and can't be read by current plugin. Please update the library.</html>")

                else -> {
                    throw IllegalStateException("Bad root with compatible version found: $badVersionedRoot")
                }
            }

            answer.createActionLabel("Go to " + presentableName) { navigateToLibraryRoot(project, badVersionedRoot.file) }
        }
        else {
            when {
                isPluginOldForAllRoots -> {
                    answer.setText("Some Kotlin libraries attached to this project were compiled with a newer Kotlin compiler and can't be read. " +
                                   "Please update Kotlin plugin.")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("Some Kotlin libraries attached to this project have outdated binary format and can't be read by current plugin. " +
                                   "Please update found libraries.")

                else ->
                    answer.setText("Some Kotlin libraries attached to this project have unsupported binary format. Please update the libraries or the plugin.")
            }
        }' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'!' @ [95:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'badRuntimeLibraries' @ [95:14] ==> val badRuntimeLibraries: List<(Library..Library?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'isEmpty' @ [95:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'findBadRootsInRuntimeLibraries' @ [96:46] ==> private final fun findBadRootsInRuntimeLibraries(badRuntimeLibraries: List<Library>, badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>>): ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'badRuntimeLibraries' @ [96:77] ==> val badRuntimeLibraries: List<(Library..Library?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'badVersionedRoots' @ [96:98] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'badVersionedRoots' @ [97:38] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'size' @ [97:56] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'badRootsInRuntimeLibraries' @ [97:63] ==> val badRootsInRuntimeLibraries: ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'size' @ [97:90] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'format' @ [99:38] ==> public open fun format(p0: (String..String?), vararg p1: (Any..Any?)): (String..String?) defined in java.text.MessageFormat[JavaMethodDescriptor]

'+' @ [99:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'badRuntimeLibraries' @ [102:45] ==> val badRuntimeLibraries: List<(Library..Library?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'size' @ [102:65] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'otherBadRootsCount' @ [103:45] ==> val otherBadRootsCount: Int defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [105:13] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [105:20] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'text' @ [105:28] ==> val text: (String..String?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'isPluginOldForAllRoots' @ [107:17] ==> val isPluginOldForAllRoots: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'createUpdatePluginLink' @ [108:17] ==> private final fun createUpdatePluginLink(answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'answer' @ [108:40] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'badRootsInRuntimeLibraries' @ [111:53] ==> val badRootsInRuntimeLibraries: ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'all' @ [111:80] ==> public inline fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.all(predicate: (BinaryVersionedFile<BinaryVersion>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'it' @ [111:86] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'supportedVersion' @ [111:89] ==> public final val supportedVersion: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'it' @ [111:108] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [111:111] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'badRootsInRuntimeLibraries' @ [112:53] ==> val badRootsInRuntimeLibraries: ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'all' @ [112:80] ==> public inline fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.all(predicate: (BinaryVersionedFile<BinaryVersion>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'it' @ [112:86] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'supportedVersion' @ [112:89] ==> public final val supportedVersion: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'it' @ [112:108] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [112:111] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'when {
                isPluginNewForAllRuntimeLibraries -> "Update"
                isPluginOldForAllRuntimeLibraries -> "Downgrade"
                else -> "Replace"
            }' @ [114:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'isPluginNewForAllRuntimeLibraries' @ [115:17] ==> val isPluginNewForAllRuntimeLibraries: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'isPluginOldForAllRuntimeLibraries' @ [116:17] ==> val isPluginOldForAllRuntimeLibraries: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'format' @ [120:49] ==> public open fun format(p0: (String..String?), vararg p1: (Any..Any?)): (String..String?) defined in java.text.MessageFormat[JavaMethodDescriptor]

'updateAction' @ [120:58] ==> val updateAction: String defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'badRuntimeLibraries' @ [120:142] ==> val badRuntimeLibraries: List<(Library..Library?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'size' @ [120:162] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'answer' @ [121:13] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'createActionLabel' @ [121:20] ==> public final fun createActionLabel(p0: (String..String?), p1: (() -> Unit..(() -> Unit)?)): (HyperlinkLabel..HyperlinkLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[MyFunctionDescriptor]

'actionLabelText' @ [121:38] ==> val actionLabelText: (String..String?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'getApplication' @ [122:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [122:53] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'updateLibraries' @ [123:21] ==> public fun updateLibraries(project: Project, libraries: Collection<Library>): Unit defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'project' @ [123:37] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'badRuntimeLibraries' @ [123:46] ==> val badRuntimeLibraries: List<(Library..Library?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'if (badVersionedRoots.size == 1) {
            val badVersionedRoot = badVersionedRoots.first()
            val presentableName = badVersionedRoot.file.presentableName

            when {
                isPluginOldForAllRoots -> {
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> was compiled with a newer Kotlin compiler and can't be read. Please update Kotlin plugin.</html>")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> has outdated binary format and can't be read by current plugin. Please update the library.</html>")

                else -> {
                    throw IllegalStateException("Bad root with compatible version found: $badVersionedRoot")
                }
            }

            answer.createActionLabel("Go to " + presentableName) { navigateToLibraryRoot(project, badVersionedRoot.file) }
        }
        else {
            when {
                isPluginOldForAllRoots -> {
                    answer.setText("Some Kotlin libraries attached to this project were compiled with a newer Kotlin compiler and can't be read. " +
                                   "Please update Kotlin plugin.")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("Some Kotlin libraries attached to this project have outdated binary format and can't be read by current plugin. " +
                                   "Please update found libraries.")

                else ->
                    answer.setText("Some Kotlin libraries attached to this project have unsupported binary format. Please update the libraries or the plugin.")
            }
        }' @ [127:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'badVersionedRoots' @ [127:18] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'size' @ [127:36] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'badVersionedRoots' @ [128:36] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'first' @ [128:54] ==> public fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.first(): BinaryVersionedFile<BinaryVersion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'badVersionedRoot' @ [129:35] ==> val badVersionedRoot: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'file' @ [129:52] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'presentableName' @ [129:57] ==> public final val VirtualFile.presentableName: (String..String?)[MyPropertyDescriptor]

'when {
                isPluginOldForAllRoots -> {
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> was compiled with a newer Kotlin compiler and can't be read. Please update Kotlin plugin.</html>")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("<html>Kotlin library <b>'$presentableName'</b> has outdated binary format and can't be read by current plugin. Please update the library.</html>")

                else -> {
                    throw IllegalStateException("Bad root with compatible version found: $badVersionedRoot")
                }
            }' @ [131:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'isPluginOldForAllRoots' @ [132:17] ==> val isPluginOldForAllRoots: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [133:21] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [133:28] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'presentableName' @ [133:63] ==> val presentableName: (String..String?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'createUpdatePluginLink' @ [134:21] ==> private final fun createUpdatePluginLink(answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'answer' @ [134:44] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'isPluginNewForAllRoots' @ [137:17] ==> val isPluginNewForAllRoots: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [138:21] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [138:28] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'presentableName' @ [138:63] ==> val presentableName: (String..String?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'IllegalStateException' @ [141:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'badVersionedRoot' @ [141:91] ==> val badVersionedRoot: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [145:13] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'createActionLabel' @ [145:20] ==> public final fun createActionLabel(p0: (String..String?), p1: (() -> Unit..(() -> Unit)?)): (HyperlinkLabel..HyperlinkLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[MyFunctionDescriptor]

'+' @ [145:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'presentableName' @ [145:49] ==> val presentableName: (String..String?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'navigateToLibraryRoot' @ [145:68] ==> private final fun navigateToLibraryRoot(project: Project, root: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [145:90] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'badVersionedRoot' @ [145:99] ==> val badVersionedRoot: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'file' @ [145:116] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'when {
                isPluginOldForAllRoots -> {
                    answer.setText("Some Kotlin libraries attached to this project were compiled with a newer Kotlin compiler and can't be read. " +
                                   "Please update Kotlin plugin.")
                    createUpdatePluginLink(answer)
                }

                isPluginNewForAllRoots ->
                    answer.setText("Some Kotlin libraries attached to this project have outdated binary format and can't be read by current plugin. " +
                                   "Please update found libraries.")

                else ->
                    answer.setText("Some Kotlin libraries attached to this project have unsupported binary format. Please update the libraries or the plugin.")
            }' @ [148:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'isPluginOldForAllRoots' @ [149:17] ==> val isPluginOldForAllRoots: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [150:21] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [150:28] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'+' @ [150:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'createUpdatePluginLink' @ [152:21] ==> private final fun createUpdatePluginLink(answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'answer' @ [152:44] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'isPluginNewForAllRoots' @ [155:17] ==> val isPluginNewForAllRoots: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [156:21] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [156:28] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'+' @ [156:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'answer' @ [160:21] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'setText' @ [160:28] ==> public open fun setText(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaMethodDescriptor]

'createShowPathsActionLabel' @ [164:9] ==> private final fun createShowPathsActionLabel(module: Module, answer: EditorNotificationPanel, labelText: String): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'module' @ [164:36] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[ValueParameterDescriptorImpl]

'answer' @ [164:44] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [166:16] ==> val answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.doCreate[LocalVariableDescriptor]

'answer' @ [170:9] ==> value-parameter answer: EditorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel[ValueParameterDescriptorImpl]

'createComponentActionLabel' @ [170:16] ==> public fun EditorNotificationPanel.createComponentActionLabel(labelText: String, callback: (HyperlinkLabel) -> Unit): Unit defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'labelText' @ [170:43] ==> value-parameter labelText: String defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel[ValueParameterDescriptorImpl]

'getInstance' @ [171:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [171:37] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'tryRunReadActionInSmartMode' @ [171:46] ==> @Nullable public final fun <T : (Any..Any?)> tryRunReadActionInSmartMode(@NotNull p0: () -> (Any..Any?), @Nullable p1: String?): Any? defined in com.intellij.openapi.project.DumbService[MyFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'collectBadRoots' @ [172:32] ==> public final fun collectBadRoots(module: Module): Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [172:48] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel[ValueParameterDescriptorImpl]

'assert' @ [173:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [173:24] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'badRoots' @ [173:25] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'isEmpty' @ [173:34] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'LibraryRootsPopupModel' @ [175:38] ==> public constructor LibraryRootsPopupModel(title: String, project: Project, roots: Collection<BinaryVersionedFile<BinaryVersion>>) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel[ClassConstructorDescriptorImpl]

'+' @ [175:61] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getPluginVersion' @ [175:119] ==> @NotNull public open fun getPluginVersion(): String defined in org.jetbrains.kotlin.idea.KotlinPluginUtil[JavaMethodDescriptor]

'project' @ [175:139] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'badRoots' @ [175:148] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'getInstance' @ [176:44] ==> public open fun getInstance(): (JBPopupFactory..JBPopupFactory?) defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'createListPopup' @ [176:58] ==> @NotNull public abstract fun createListPopup(@NotNull p0: raw (ListPopupStep<(Any..Any?)>..ListPopupStep<*>)): ListPopup defined in com.intellij.openapi.ui.popup.JBPopupFactory[JavaMethodDescriptor]

'listPopupModel' @ [176:74] ==> val listPopupModel: UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'popup' @ [177:17] ==> val popup: ListPopup defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel.<anonymous>.<anonymous>[LocalVariableDescriptor]

'showUnderneathOf' @ [177:23] ==> public abstract fun showUnderneathOf(@NotNull p0: Component): Unit defined in com.intellij.openapi.ui.popup.ListPopup[JavaMethodDescriptor]

'label' @ [177:40] ==> value-parameter label: HyperlinkLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createShowPathsActionLabel.<anonymous>[ValueParameterDescriptorImpl]

'answer' @ [185:9] ==> value-parameter answer: UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink[ValueParameterDescriptorImpl]

'createProgressAction' @ [185:16] ==> public final fun createProgressAction(text: String, successLinkText: String, updater: (JLabel, HyperlinkLabel) -> Unit): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[SimpleFunctionDescriptorImpl]

'KotlinPluginUpdater' @ [186:13] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [186:33] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'runCachedUpdate' @ [186:47] ==> public final fun runCachedUpdate(callback: (PluginUpdateStatus) -> Boolean): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'when (pluginUpdateStatus) {
                    is PluginUpdateStatus.Update -> {
                        link.isVisible = false
                        updateLink.isVisible = true

                        updateLink.addHyperlinkListener(object : HyperlinkAdapter() {
                            override fun hyperlinkActivated(e: HyperlinkEvent) {
                                KotlinPluginUpdater.getInstance().installPluginUpdate(pluginUpdateStatus)
                            }
                        })
                    }
                    is PluginUpdateStatus.LatestVersionInstalled -> {
                        link.text = "No updates found"
                    }
                }' @ [187:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'pluginUpdateStatus' @ [187:23] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'link' @ [189:25] ==> value-parameter link: JLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [189:30] ==> public final var JLabel.isVisible: Boolean[MyPropertyDescriptor]

'updateLink' @ [190:25] ==> value-parameter updateLink: HyperlinkLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>[ValueParameterDescriptorImpl]

'isVisible' @ [190:36] ==> public final var HyperlinkLabel.isVisible: Boolean[MyPropertyDescriptor]

'updateLink' @ [192:25] ==> value-parameter updateLink: HyperlinkLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>[ValueParameterDescriptorImpl]

'addHyperlinkListener' @ [192:36] ==> public open fun addHyperlinkListener(p0: (HyperlinkListener..HyperlinkListener?)): Unit defined in com.intellij.ui.HyperlinkLabel[JavaMethodDescriptor]

'HyperlinkAdapter' @ [192:66] ==> public constructor HyperlinkAdapter() defined in com.intellij.ui.HyperlinkAdapter[JavaClassConstructorDescriptor]

'KotlinPluginUpdater' @ [194:33] ==> public companion object defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[FakeCallableDescriptorForObject]

'getInstance' @ [194:53] ==> public final fun getInstance(): KotlinPluginUpdater defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater.Companion[SimpleFunctionDescriptorImpl]

'installPluginUpdate' @ [194:67] ==> public final fun installPluginUpdate(update: PluginUpdateStatus.Update, cancelCallback: () -> Unit = ...): Unit defined in org.jetbrains.kotlin.idea.KotlinPluginUpdater[SimpleFunctionDescriptorImpl]

'pluginUpdateStatus' @ [194:87] ==> value-parameter pluginUpdateStatus: PluginUpdateStatus defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'link' @ [199:25] ==> value-parameter link: JLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createUpdatePluginLink.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [199:30] ==> public final var JLabel.text: (String..String?)[MyPropertyDescriptor]

'KEY' @ [208:59] ==> private final val KEY: Key<(EditorNotificationPanel..EditorNotificationPanel?)> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[PropertyDescriptorImpl]

'isDumb' @ [212:29] ==> public open fun isDumb(@NotNull p0: Project): Boolean defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [212:36] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'getApplication' @ [213:36] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'isUnitTestMode' @ [213:53] ==> public final val Application.isUnitTestMode: Boolean[MyPropertyDescriptor]

'file' @ [214:17] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'fileType' @ [214:22] ==> public final val VirtualFile.fileType: FileType[MyPropertyDescriptor]

'INSTANCE' @ [214:50] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'getInstance' @ [216:33] ==> public open fun getInstance(p0: (Project..Project?)): (CompilerManager..CompilerManager?) defined in com.intellij.openapi.compiler.CompilerManager[JavaMethodDescriptor]

'project' @ [216:45] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'isExcludedFromCompilation' @ [216:54] ==> public abstract fun isExcludedFromCompilation(@NotNull p0: VirtualFile): Boolean defined in com.intellij.openapi.compiler.CompilerManager[JavaMethodDescriptor]

'file' @ [216:80] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'?:' @ [218:26] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Module?, right: Module): Module[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Module

'findModuleForFile' @ [218:41] ==> @Nullable public open fun findModuleForFile(@NotNull p0: VirtualFile, @NotNull p1: Project): Module? defined in com.intellij.openapi.module.ModuleUtilCore[JavaMethodDescriptor]

'file' @ [218:59] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createNotificationPanel[ValueParameterDescriptorImpl]

'project' @ [218:65] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'checkAndCreate' @ [220:20] ==> public final fun checkAndCreate(module: Module): EditorNotificationPanel? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'module' @ [220:35] ==> val module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.createNotificationPanel[LocalVariableDescriptor]

'getInstance' @ [226:25] ==> public open fun getInstance(@NotNull p0: Project): (DumbService..DumbService?) defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'project' @ [226:37] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'runWhenSmart' @ [226:46] ==> public abstract fun runWhenSmart(@NotNull p0: Runnable): Unit defined in com.intellij.openapi.project.DumbService[JavaMethodDescriptor]

'updateNotifications' @ [226:59] ==> private final val updateNotifications: Runnable defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'getService' @ [233:36] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(SuppressNotificationState..SuppressNotificationState?)>): (SuppressNotificationState..SuppressNotificationState?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SuppressNotificationState

'project' @ [233:47] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'SuppressNotificationState' @ [233:56] ==> public constructor SuppressNotificationState() defined in org.jetbrains.kotlin.idea.versions.SuppressNotificationState[JavaClassConstructorDescriptor]

'java' @ [233:89] ==> public val <T> KClass<SuppressNotificationState>.java: Class<SuppressNotificationState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SuppressNotificationState

'state' @ [233:95] ==> public final val SuppressNotificationState.state: SuppressNotificationState?[MyPropertyDescriptor]

'state' @ [234:13] ==> val state: SuppressNotificationState? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[LocalVariableDescriptor]

'state' @ [234:30] ==> val state: SuppressNotificationState? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[LocalVariableDescriptor]

'isSuppressed' @ [234:36] ==> public final var isSuppressed: Boolean defined in org.jetbrains.kotlin.idea.versions.SuppressNotificationState[JavaPropertyDescriptor]

'collectBadRoots' @ [238:24] ==> public final fun collectBadRoots(module: Module): Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[SimpleFunctionDescriptorImpl]

'module' @ [238:40] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[ValueParameterDescriptorImpl]

'!' @ [239:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'badRoots' @ [239:14] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[LocalVariableDescriptor]

'isEmpty' @ [239:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'doCreate' @ [240:20] ==> private final fun doCreate(module: Module, badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>>): EditorNotificationPanel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'module' @ [240:29] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[ValueParameterDescriptorImpl]

'badRoots' @ [240:37] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.checkAndCreate[LocalVariableDescriptor]

'ArrayList' @ [249:35] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> BinaryVersionedFile<BinaryVersion>

'file' @ [252:17] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.addToBadRoots[ValueParameterDescriptorImpl]

'badVersionedRoots' @ [253:41] ==> value-parameter badVersionedRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries[ValueParameterDescriptorImpl]

'firstOrNull' @ [253:59] ==> public inline fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.firstOrNull(predicate: (BinaryVersionedFile<BinaryVersion>) -> Boolean): BinaryVersionedFile<BinaryVersion>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'it' @ [253:73] ==> value-parameter it: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.addToBadRoots.<anonymous>[ValueParameterDescriptorImpl]

'file' @ [253:76] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'file' @ [253:84] ==> value-parameter file: VirtualFile? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.addToBadRoots[ValueParameterDescriptorImpl]

'runtimeJarBadRoot' @ [254:21] ==> val runtimeJarBadRoot: BinaryVersionedFile<BinaryVersion>? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.addToBadRoots[LocalVariableDescriptor]

'badRootsInLibraries' @ [255:21] ==> val badRootsInLibraries: ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries[LocalVariableDescriptor]

'add' @ [255:41] ==> public open fun add(element: BinaryVersionedFile<BinaryVersion>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'runtimeJarBadRoot' @ [255:45] ==> val runtimeJarBadRoot: BinaryVersionedFile<BinaryVersion>? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.addToBadRoots[LocalVariableDescriptor]

'badRuntimeLibraries' @ [260:9] ==> value-parameter badRuntimeLibraries: List<Library> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries[ValueParameterDescriptorImpl]

'forEach' @ [260:29] ==> @HidesMembers public inline fun <T> Iterable<Library>.forEach(action: (Library) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Library

'iterator' @ [261:32] ==> public final operator fun iterator(): Iterator<LibraryJarDescriptor> defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'values' @ [261:53] ==> public final fun values(): Array<LibraryJarDescriptor> defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'addToBadRoots' @ [262:17] ==> local final fun addToBadRoots(file: VirtualFile?): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries[SimpleFunctionDescriptorImpl]

'getLocalJar' @ [262:31] ==> public fun getLocalJar(kotlinRuntimeJar: VirtualFile?): VirtualFile? defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [262:43] ==> val descriptor: LibraryJarDescriptor defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.<anonymous>[LocalVariableDescriptor]

'findExistingJar' @ [262:54] ==> public open fun findExistingJar(library: Library): VirtualFile? defined in org.jetbrains.kotlin.idea.versions.LibraryJarDescriptor[SimpleFunctionDescriptorImpl]

'library' @ [262:70] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries.<anonymous>[ValueParameterDescriptorImpl]

'badRootsInLibraries' @ [266:16] ==> val badRootsInLibraries: ArrayList<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.findBadRootsInRuntimeLibraries[LocalVariableDescriptor]

'BaseListPopupStep<BinaryVersionedFile<BinaryVersion>>' @ [273:9] ==> @SafeVarargs public constructor BaseListPopupStep<T : (Any..Any?)>(@Nullable p0: String?, @NotNull vararg p1: (BinaryVersionedFile<BinaryVersion>..BinaryVersionedFile<BinaryVersion>?)) defined in com.intellij.openapi.ui.popup.util.BaseListPopupStep[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> BinaryVersionedFile<BinaryVersion>

'title' @ [273:63] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.<init>[ValueParameterDescriptorImpl]

'roots' @ [273:71] ==> value-parameter roots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.<init>[ValueParameterDescriptorImpl]

'toTypedArray' @ [273:77] ==> public inline fun <reified T> Collection<BinaryVersionedFile<BinaryVersion>>.toTypedArray(): Array<BinaryVersionedFile<BinaryVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> BinaryVersionedFile<BinaryVersion>

'getRelativePath' @ [276:44] ==> @Nullable public open fun getRelativePath(@NotNull p0: VirtualFile, @NotNull p1: VirtualFile, p2: Char): String? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'root' @ [276:60] ==> value-parameter root: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getTextFor[ValueParameterDescriptorImpl]

'file' @ [276:65] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'project' @ [276:71] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel[PropertyDescriptorImpl]

'baseDir' @ [276:79] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'relativePath' @ [277:23] ==> val relativePath: String? defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getTextFor[LocalVariableDescriptor]

'root' @ [277:39] ==> value-parameter root: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getTextFor[ValueParameterDescriptorImpl]

'file' @ [277:44] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'path' @ [277:49] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'root' @ [277:58] ==> value-parameter root: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getTextFor[ValueParameterDescriptorImpl]

'version' @ [277:63] ==> public final val version: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'root' @ [277:87] ==> value-parameter root: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getTextFor[ValueParameterDescriptorImpl]

'supportedVersion' @ [277:92] ==> public final val supportedVersion: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'aValue' @ [281:17] ==> value-parameter aValue: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.getIconFor[ValueParameterDescriptorImpl]

'file' @ [281:24] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'isDirectory' @ [281:29] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'Folder' @ [282:39] ==> public final val Folder: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Nodes[JavaPropertyDescriptor]

'Archive' @ [284:39] ==> public final val Archive: (Icon..Icon?) defined in com.intellij.icons.AllIcons.FileTypes[JavaPropertyDescriptor]

'navigateToLibraryRoot' @ [288:13] ==> private final fun navigateToLibraryRoot(project: Project, root: VirtualFile): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion[SimpleFunctionDescriptorImpl]

'project' @ [288:35] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel[PropertyDescriptorImpl]

'selectedValue' @ [288:44] ==> value-parameter selectedValue: BinaryVersionedFile<BinaryVersion> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.LibraryRootsPopupModel.onChosen[ValueParameterDescriptorImpl]

'file' @ [288:58] ==> public final val file: VirtualFile defined in org.jetbrains.kotlin.idea.versions.BinaryVersionedFile[PropertyDescriptorImpl]

'FINAL_CHOICE' @ [289:30] ==> public final val FINAL_CHOICE: raw (PopupStep<(Any..Any?)>..PopupStep<*>?) defined in com.intellij.openapi.ui.popup.PopupStep[JavaPropertyDescriptor]

'EditorNotificationPanel' @ [295:44] ==> public constructor EditorNotificationPanel() defined in com.intellij.ui.EditorNotificationPanel[JavaClassConstructorDescriptor]

'myLabel' @ [297:13] ==> protected/*protected and package*/ final val myLabel: (JLabel..JLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaPropertyDescriptor]

'icon' @ [297:21] ==> public final var JLabel.icon: (Icon..Icon?)[MyPropertyDescriptor]

'Error' @ [297:45] ==> public final val Error: (Icon..Icon?) defined in com.intellij.icons.AllIcons.General[JavaPropertyDescriptor]

'JLabel' @ [301:25] ==> public constructor JLabel(p0: (String..String?)) defined in javax.swing.JLabel[JavaClassConstructorDescriptor]

'text' @ [301:32] ==> value-parameter text: String defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[ValueParameterDescriptorImpl]

'myLinksPanel' @ [302:13] ==> protected/*protected and package*/ final val myLinksPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaPropertyDescriptor]

'add' @ [302:26] ==> public open fun add(p0: (Component..Component?)): (Component..Component?) defined in javax.swing.JPanel[JavaMethodDescriptor]

'label' @ [302:30] ==> val label: JLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[LocalVariableDescriptor]

'createActionLabel' @ [304:31] ==> public final fun createActionLabel(p0: (String..String?), p1: (() -> Unit..(() -> Unit)?)): (HyperlinkLabel..HyperlinkLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[MyFunctionDescriptor]

'successLinkText' @ [304:49] ==> value-parameter successLinkText: String defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[ValueParameterDescriptorImpl]

'successLink' @ [305:13] ==> val successLink: (HyperlinkLabel..HyperlinkLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[LocalVariableDescriptor]

'isVisible' @ [305:25] ==> public final var HyperlinkLabel.isVisible: Boolean[MyPropertyDescriptor]

'myLinksPanel' @ [309:13] ==> protected/*protected and package*/ final val myLinksPanel: (JPanel..JPanel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel[JavaPropertyDescriptor]

'addComponentListener' @ [309:26] ==> public open fun addComponentListener(p0: (ComponentListener..ComponentListener?)): Unit defined in javax.swing.JPanel[JavaMethodDescriptor]

'ComponentAdapter' @ [309:56] ==> public constructor ComponentAdapter() defined in java.awt.event.ComponentAdapter[JavaClassConstructorDescriptor]

'!' @ [312:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUpdaterCalled' @ [312:26] ==> public final var isUpdaterCalled: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction.<no name provided>[PropertyDescriptorImpl]

'isUpdaterCalled' @ [313:25] ==> public final var isUpdaterCalled: Boolean defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction.<no name provided>[PropertyDescriptorImpl]

'invoke' @ [314:25] ==> public abstract operator fun invoke(p1: JLabel, p2: HyperlinkLabel): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'label' @ [314:33] ==> val label: JLabel defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[LocalVariableDescriptor]

'successLink' @ [314:40] ==> val successLink: (HyperlinkLabel..HyperlinkLabel?) defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.ErrorNotificationPanel.createProgressAction[LocalVariableDescriptor]

'Runnable' @ [321:39] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SimpleFunctionDescriptorImpl]

'updateNotifications' @ [321:50] ==> private final fun updateNotifications(): Unit defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[SimpleFunctionDescriptorImpl]

'getApplication' @ [324:28] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'invokeLater' @ [324:45] ==> public final fun invokeLater(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'!' @ [325:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'project' @ [325:18] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'isDisposed' @ [325:26] ==> public final val Project.isDisposed: Boolean[MyPropertyDescriptor]

'getInstance' @ [326:37] ==> public open fun getInstance(p0: (Project..Project?)): (EditorNotifications..EditorNotifications?) defined in com.intellij.ui.EditorNotifications[JavaMethodDescriptor]

'project' @ [326:49] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider[PropertyDescriptorImpl]

'updateAllNotifications' @ [326:58] ==> public abstract fun updateAllNotifications(): Unit defined in com.intellij.ui.EditorNotifications[JavaMethodDescriptor]

'create' @ [332:31] ==> @NotNull public open fun <T : (Any..Any?)> create(@NotNull @NonNls p0: String): Key<(EditorNotificationPanel..EditorNotificationPanel?)> defined in com.intellij.openapi.util.Key[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EditorNotificationPanel

'OpenFileDescriptor' @ [335:13] ==> public constructor OpenFileDescriptor(@NotNull p0: Project, @NotNull p1: VirtualFile) defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaClassConstructorDescriptor]

'project' @ [335:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.navigateToLibraryRoot[ValueParameterDescriptorImpl]

'root' @ [335:41] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.navigateToLibraryRoot[ValueParameterDescriptorImpl]

'navigate' @ [335:47] ==> public open fun navigate(p0: Boolean): Unit defined in com.intellij.openapi.fileEditor.OpenFileDescriptor[JavaMethodDescriptor]

'when (TargetPlatformDetector.getPlatform(module)) {
                JvmPlatform -> getLibraryRootsWithAbiIncompatibleKotlinClasses(module)
                JsPlatform -> getLibraryRootsWithAbiIncompatibleForKotlinJs(module)
                else -> return emptyList()
            }' @ [339:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<BinaryVersionedFile<BinaryVersion>>, entry1: Collection<BinaryVersionedFile<BinaryVersion>>, entry2: Collection<BinaryVersionedFile<BinaryVersion>>): Collection<BinaryVersionedFile<BinaryVersion>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<BinaryVersionedFile<BinaryVersion>>

'getPlatform' @ [339:57] ==> @NotNull public open fun getPlatform(@NotNull p0: Module): TargetPlatform defined in org.jetbrains.kotlin.idea.project.TargetPlatformDetector[JavaMethodDescriptor]

'module' @ [339:69] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.collectBadRoots[ValueParameterDescriptorImpl]

'JvmPlatform' @ [340:17] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'getLibraryRootsWithAbiIncompatibleKotlinClasses' @ [340:32] ==> public fun getLibraryRootsWithAbiIncompatibleKotlinClasses(module: Module): Collection<BinaryVersionedFile<JvmMetadataVersion>> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'module' @ [340:80] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.collectBadRoots[ValueParameterDescriptorImpl]

'JsPlatform' @ [341:17] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'getLibraryRootsWithAbiIncompatibleForKotlinJs' @ [341:31] ==> public fun getLibraryRootsWithAbiIncompatibleForKotlinJs(module: Module): Collection<BinaryVersionedFile<JsMetadataVersion>> defined in org.jetbrains.kotlin.idea.versions[SimpleFunctionDescriptorImpl]

'module' @ [341:77] ==> value-parameter module: Module defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.collectBadRoots[ValueParameterDescriptorImpl]

'emptyList' @ [342:32] ==> public fun <T> emptyList(): List<BinaryVersionedFile<BinaryVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'if (badRoots.isEmpty()) emptyList() else badRoots.toHashSet()' @ [345:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<BinaryVersionedFile<BinaryVersion>>, elseBranch: Collection<BinaryVersionedFile<BinaryVersion>>): Collection<BinaryVersionedFile<BinaryVersion>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<BinaryVersionedFile<BinaryVersion>>

'badRoots' @ [345:24] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.collectBadRoots[LocalVariableDescriptor]

'isEmpty' @ [345:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [345:44] ==> public fun <T> emptyList(): List<BinaryVersionedFile<BinaryVersion>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'badRoots' @ [345:61] ==> val badRoots: Collection<BinaryVersionedFile<BinaryVersion>> defined in org.jetbrains.kotlin.idea.versions.UnsupportedAbiVersionNotificationPanelProvider.Companion.collectBadRoots[LocalVariableDescriptor]

'toHashSet' @ [345:70] ==> public fun <T> Iterable<BinaryVersionedFile<BinaryVersion>>.toHashSet(): HashSet<BinaryVersionedFile<BinaryVersion>> /* = HashSet<BinaryVersionedFile<BinaryVersion>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BinaryVersionedFile<BinaryVersion>

'create' @ [351:42] ==> @NotNull public open fun <T : (Any..Any?)> create(): Ref<(HyperlinkLabel..HyperlinkLabel?)> defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> HyperlinkLabel

'Runnable' @ [352:18] ==> @FunctionalInterface public fun Runnable(function: () -> Unit): Runnable defined in java.lang[SimpleFunctionDescriptorImpl]

'invoke' @ [353:9] ==> public abstract operator fun invoke(p1: HyperlinkLabel): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'label' @ [353:18] ==> val label: Ref<HyperlinkLabel> defined in org.jetbrains.kotlin.idea.versions.createComponentActionLabel[LocalVariableDescriptor]

'get' @ [353:24] ==> public final fun get(): (HyperlinkLabel..HyperlinkLabel?) defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'label' @ [355:5] ==> val label: Ref<HyperlinkLabel> defined in org.jetbrains.kotlin.idea.versions.createComponentActionLabel[LocalVariableDescriptor]

'set' @ [355:11] ==> public final fun set(@Nullable p0: HyperlinkLabel?): Unit defined in com.intellij.openapi.util.Ref[JavaMethodDescriptor]

'createActionLabel' @ [355:15] ==> public open fun createActionLabel(p0: (String..String?), p1: (Runnable..Runnable?)): (HyperlinkLabel..HyperlinkLabel?) defined in com.intellij.ui.EditorNotificationPanel[JavaMethodDescriptor]

'labelText' @ [355:33] ==> value-parameter labelText: String defined in org.jetbrains.kotlin.idea.versions.createComponentActionLabel[ValueParameterDescriptorImpl]

'action' @ [355:44] ==> val action: Runnable defined in org.jetbrains.kotlin.idea.versions.createComponentActionLabel[LocalVariableDescriptor]

'..' @ [359:15] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [359:18] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'max' @ [359:23] ==> public open fun max(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'numbers' @ [359:27] ==> public final val numbers: IntArray defined in org.jetbrains.kotlin.serialization.deserialization.BinaryVersion[DeserializedPropertyDescriptor]

'size' @ [359:35] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'other' @ [359:41] ==> value-parameter other: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.compareTo[ValueParameterDescriptorImpl]

'numbers' @ [359:47] ==> public final val numbers: IntArray defined in org.jetbrains.kotlin.serialization.deserialization.BinaryVersion[DeserializedPropertyDescriptor]

'size' @ [359:55] ==> public final val size: Int defined in kotlin.IntArray[DeserializedPropertyDescriptor]

'numbers' @ [360:24] ==> public final val numbers: IntArray defined in org.jetbrains.kotlin.serialization.deserialization.BinaryVersion[DeserializedPropertyDescriptor]

'getOrNull' @ [360:32] ==> public fun IntArray.getOrNull(index: Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'i' @ [360:42] ==> val i: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

'-' @ [360:48] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'other' @ [361:25] ==> value-parameter other: BinaryVersion defined in org.jetbrains.kotlin.idea.versions.compareTo[ValueParameterDescriptorImpl]

'numbers' @ [361:31] ==> public final val numbers: IntArray defined in org.jetbrains.kotlin.serialization.deserialization.BinaryVersion[DeserializedPropertyDescriptor]

'getOrNull' @ [361:39] ==> public fun IntArray.getOrNull(index: Int): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]

'i' @ [361:49] ==> val i: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

'-' @ [361:55] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'thisPart' @ [363:13] ==> val thisPart: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

'otherPart' @ [363:25] ==> val otherPart: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

'thisPart' @ [364:20] ==> val thisPart: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

'otherPart' @ [364:31] ==> val otherPart: Int defined in org.jetbrains.kotlin.idea.versions.compareTo[LocalVariableDescriptor]

