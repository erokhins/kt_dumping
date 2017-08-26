'LibraryType<DummyLibraryProperties>' @ [38:23] ==> protected/*protected and package*/ constructor LibraryType<P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>(@NotNull p0: PersistentLibraryKind<(DummyLibraryProperties..DummyLibraryProperties?)>) defined in com.intellij.openapi.roots.libraries.LibraryType[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> -> DummyLibraryProperties

'JSLibraryKind' @ [38:59] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'getInstance' @ [46:35] ==> public open fun getInstance(): (LibraryTypeService..LibraryTypeService?) defined in com.intellij.openapi.roots.libraries.LibraryTypeService[JavaMethodDescriptor]

'createLibraryFromFiles' @ [46:49] ==> @Nullable public abstract fun createLibraryFromFiles(@NotNull p0: LibraryRootsComponentDescriptor, @NotNull p1: JComponent, @Nullable p2: VirtualFile?, @Nullable p3: LibraryType<*>?, @Nullable p4: Project?): NewLibraryConfiguration? defined in com.intellij.openapi.roots.libraries.LibraryTypeService[JavaMethodDescriptor]

'RootsComponentDescriptor' @ [46:72] ==> public object RootsComponentDescriptor : DefaultLibraryRootsComponentDescriptor defined in org.jetbrains.kotlin.idea.framework.JSLibraryType[FakeCallableDescriptorForObject]

'parentComponent' @ [47:72] ==> value-parameter parentComponent: JComponent defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.createNewLibrary[ValueParameterDescriptorImpl]

'contextDirectory' @ [47:89] ==> value-parameter contextDirectory: VirtualFile? defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.createNewLibrary[ValueParameterDescriptorImpl]

'this' @ [47:107] ==> <this> defined in org.jetbrains.kotlin.idea.framework.JSLibraryType[LazyClassReceiverParameterDescriptor]

'project' @ [48:72] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.createNewLibrary[ValueParameterDescriptorImpl]

'JS' @ [51:77] ==> public final val JS: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.KotlinIcons[JavaPropertyDescriptor]

'findExtension' @ [54:40] ==> @NotNull public open fun <T : (Any..Any?), U : (LibraryType<*>..LibraryType<*>?)> findExtension(@NotNull p0: ExtensionPointName<(LibraryType<*>..LibraryType<*>?)>, @NotNull p1: Class<(JSLibraryType..JSLibraryType?)>): JSLibraryType defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (com.intellij.openapi.roots.libraries.LibraryType<*>..com.intellij.openapi.roots.libraries.LibraryType<*>?)
    <U : (T..T?)> -> (org.jetbrains.kotlin.idea.framework.JSLibraryType..org.jetbrains.kotlin.idea.framework.JSLibraryType?)

'EP_NAME' @ [54:54] ==> public final val EP_NAME: (ExtensionPointName<(LibraryType<*>..LibraryType<*>?)>..ExtensionPointName<(LibraryType<*>..LibraryType<*>?)>?) defined in com.intellij.openapi.roots.libraries.LibraryType[JavaPropertyDescriptor]

'JSLibraryType' @ [54:63] ==> public companion object defined in org.jetbrains.kotlin.idea.framework.JSLibraryType[FakeCallableDescriptorForObject]

'java' @ [54:84] ==> public val <T> KClass<JSLibraryType>.java: Class<JSLibraryType> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JSLibraryType

'DefaultLibraryRootsComponentDescriptor' @ [57:39] ==> public constructor DefaultLibraryRootsComponentDescriptor() defined in com.intellij.openapi.roots.ui.configuration.libraryEditor.DefaultLibraryRootsComponentDescriptor[JavaClassConstructorDescriptor]

'FileChooserDescriptor' @ [59:30] ==> public constructor FileChooserDescriptor(p0: Boolean, p1: Boolean, p2: Boolean, p3: Boolean, p4: Boolean, p5: Boolean) defined in com.intellij.openapi.fileChooser.FileChooserDescriptor[JavaClassConstructorDescriptor]

'withFileFilter' @ [59:89] ==> public final fun withFileFilter(@Nullable p0: (((VirtualFile..VirtualFile?)) -> Boolean)?): (FileChooserDescriptor..FileChooserDescriptor?) defined in com.intellij.openapi.fileChooser.FileChooserDescriptor[MyFunctionDescriptor]

'isArchive' @ [60:29] ==> public open fun isArchive(@Nullable p0: VirtualFile?): Boolean defined in com.intellij.openapi.fileChooser.FileElement[JavaMethodDescriptor]

'it' @ [60:39] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'isAcceptedForJsLibrary' @ [60:46] ==> private fun isAcceptedForJsLibrary(extension: String?): Boolean defined in org.jetbrains.kotlin.idea.framework in file JSLibraryType.kt[SimpleFunctionDescriptorImpl]

'it' @ [60:69] ==> value-parameter it: (VirtualFile..VirtualFile?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'extension' @ [60:72] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'descriptor' @ [62:13] ==> val descriptor: (FileChooserDescriptor..FileChooserDescriptor?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor[LocalVariableDescriptor]

'title' @ [62:24] ==> public final var FileChooserDescriptor.title: (String..String?)[MyPropertyDescriptor]

'if (StringUtil.isEmpty(libraryName))
                ProjectBundle.message("library.attach.files.action")
            else
                ProjectBundle.message("library.attach.files.to.library.action", libraryName!!)' @ [62:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (String..String?), elseBranch: (String..String?)): (String..String?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.String..kotlin.String?)

'isEmpty' @ [62:47] ==> @Contract public open fun isEmpty(@Nullable p0: String?): Boolean defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'libraryName' @ [62:55] ==> value-parameter libraryName: String? defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor[ValueParameterDescriptorImpl]

'message' @ [63:31] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.openapi.project.ProjectBundle[JavaMethodDescriptor]

'message' @ [65:31] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.openapi.project.ProjectBundle[JavaMethodDescriptor]

'libraryName' @ [65:81] ==> value-parameter libraryName: String? defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor[ValueParameterDescriptorImpl]

'descriptor' @ [66:13] ==> val descriptor: (FileChooserDescriptor..FileChooserDescriptor?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor[LocalVariableDescriptor]

'description' @ [66:24] ==> public final var FileChooserDescriptor.description: (String..String?)[MyPropertyDescriptor]

'message' @ [66:52] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.openapi.project.ProjectBundle[JavaMethodDescriptor]

'descriptor' @ [67:20] ==> val descriptor: (FileChooserDescriptor..FileChooserDescriptor?) defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.RootsComponentDescriptor.createAttachFilesChooserDescriptor[LocalVariableDescriptor]

'arrayOf' @ [70:39] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (OrderRootType..OrderRootType?)): Array<(OrderRootType..OrderRootType?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (com.intellij.openapi.roots.OrderRootType..com.intellij.openapi.roots.OrderRootType?)

'CLASSES' @ [70:61] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'SOURCES' @ [70:84] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'arrayListOf' @ [73:20] ==> public fun <T> arrayListOf(vararg elements: FileTypeBasedRootFilter): ArrayList<FileTypeBasedRootFilter> /* = ArrayList<FileTypeBasedRootFilter> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FileTypeBasedRootFilter

'JSRootFilter' @ [74:21] ==> public object JSRootFilter : FileTypeBasedRootFilter defined in org.jetbrains.kotlin.idea.framework.JSLibraryType[FakeCallableDescriptorForObject]

'FileTypeBasedRootFilter' @ [75:21] ==> public constructor FileTypeBasedRootFilter(p0: (OrderRootType..OrderRootType?), p1: Boolean, @NotNull p2: FileType, p3: (String..String?)) defined in com.intellij.openapi.roots.libraries.ui.FileTypeBasedRootFilter[JavaClassConstructorDescriptor]

'SOURCES' @ [75:59] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'INSTANCE' @ [75:90] ==> public final val INSTANCE: (KotlinFileType..KotlinFileType?) defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'FileTypeBasedRootFilter' @ [80:27] ==> public constructor FileTypeBasedRootFilter(p0: (OrderRootType..OrderRootType?), p1: Boolean, @NotNull p2: FileType, p3: (String..String?)) defined in com.intellij.openapi.roots.libraries.ui.FileTypeBasedRootFilter[JavaClassConstructorDescriptor]

'CLASSES' @ [80:65] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'INSTANCE' @ [80:99] ==> public final val INSTANCE: (PlainTextFileType..PlainTextFileType?) defined in com.intellij.openapi.fileTypes.PlainTextFileType[JavaPropertyDescriptor]

'isAcceptedForJsLibrary' @ [81:65] ==> private fun isAcceptedForJsLibrary(extension: String?): Boolean defined in org.jetbrains.kotlin.idea.framework in file JSLibraryType.kt[SimpleFunctionDescriptorImpl]

'virtualFile' @ [81:88] ==> value-parameter virtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.framework.JSLibraryType.JSRootFilter.isFileAccepted[ValueParameterDescriptorImpl]

'extension' @ [81:100] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'extension' @ [86:58] ==> value-parameter extension: String? defined in org.jetbrains.kotlin.idea.framework.isAcceptedForJsLibrary[ValueParameterDescriptorImpl]

'extension' @ [86:79] ==> value-parameter extension: String? defined in org.jetbrains.kotlin.idea.framework.isAcceptedForJsLibrary[ValueParameterDescriptorImpl]

'when(this) {
        TargetPlatformKind.JavaScript -> JSLibraryKind
        TargetPlatformKind.Common -> CommonLibraryKind
        else -> null
    }' @ [89:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentLibraryKind<*>?, entry1: PersistentLibraryKind<*>?, entry2: PersistentLibraryKind<*>?): PersistentLibraryKind<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentLibraryKind<*>?

'this' @ [89:18] ==> <this> defined in org.jetbrains.kotlin.idea.framework.libraryKind[ReceiverParameterDescriptorImpl]

'TargetPlatformKind' @ [90:9] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'JavaScript' @ [90:28] ==> public object JavaScript : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'JSLibraryKind' @ [90:42] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

'TargetPlatformKind' @ [91:9] ==> public companion object defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'Common' @ [91:28] ==> public object Common : TargetPlatformKind<TargetPlatformVersion.NoVersion> defined in org.jetbrains.kotlin.config.TargetPlatformKind[FakeCallableDescriptorForObject]

'CommonLibraryKind' @ [91:38] ==> public object CommonLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework[FakeCallableDescriptorForObject]

