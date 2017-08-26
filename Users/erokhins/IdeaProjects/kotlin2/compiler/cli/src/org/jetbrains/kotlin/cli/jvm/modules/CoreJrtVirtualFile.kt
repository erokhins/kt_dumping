'VirtualFile' @ [32:98] ==> protected/*protected and package*/ constructor VirtualFile() defined in com.intellij.openapi.vfs.VirtualFile[JavaClassConstructorDescriptor]

'readAttributes' @ [34:63] ==> public open fun <A : (BasicFileAttributes..BasicFileAttributes?)> readAttributes(p0: (Path..Path?), p1: (Class<(BasicFileAttributes..BasicFileAttributes?)>..Class<(BasicFileAttributes..BasicFileAttributes?)>?), vararg p2: (LinkOption..LinkOption?)): (BasicFileAttributes..BasicFileAttributes?) defined in java.nio.file.Files[JavaMethodDescriptor]
Inferred types:
    <A : (BasicFileAttributes..BasicFileAttributes?)> -> (java.nio.file.attribute.BasicFileAttributes..java.nio.file.attribute.BasicFileAttributes?)

'path' @ [34:78] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'java' @ [34:111] ==> public val <T> KClass<BasicFileAttributes>.java: Class<BasicFileAttributes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BasicFileAttributes

'handler' @ [36:55] ==> private final val handler: CoreJrtFileSystem.CoreJrtHandler defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'virtualFileSystem' @ [36:63] ==> public final val virtualFileSystem: CoreJrtFileSystem defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[PropertyDescriptorImpl]

'path' @ [39:13] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'fileName' @ [39:18] ==> public final val Path.fileName: (Path..Path?)[MyPropertyDescriptor]

'toString' @ [39:27] ==> public open fun toString(): String defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

'toSystemIndependentName' @ [42:22] ==> @NotNull public open fun toSystemIndependentName(@NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'handler' @ [42:46] ==> private final val handler: CoreJrtFileSystem.CoreJrtHandler defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'jdkHomePath' @ [42:54] ==> public final val jdkHomePath: String defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtFileSystem.CoreJrtHandler[PropertyDescriptorImpl]

'JAR_SEPARATOR' @ [42:76] ==> public const final val JAR_SEPARATOR: String defined in com.intellij.util.io.URLUtil[JavaPropertyDescriptor]

'path' @ [42:92] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'isDirectory' @ [46:49] ==> public open fun isDirectory(p0: (Path..Path?), vararg p1: (LinkOption..LinkOption?)): Boolean defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [46:61] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'path' @ [51:26] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'parent' @ [51:31] ==> public final val Path.parent: (Path..Path?)[MyPropertyDescriptor]

'if (parentPath != null) CoreJrtVirtualFile(handler, parentPath) else null' @ [52:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'parentPath' @ [52:20] ==> val parentPath: (Path..Path?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.getParent[LocalVariableDescriptor]

'CoreJrtVirtualFile' @ [52:40] ==> public constructor CoreJrtVirtualFile(handler: CoreJrtFileSystem.CoreJrtHandler, path: Path) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[ClassConstructorDescriptorImpl]

'handler' @ [52:59] ==> private final val handler: CoreJrtFileSystem.CoreJrtHandler defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'parentPath' @ [52:68] ==> val parentPath: (Path..Path?) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.getParent[LocalVariableDescriptor]

'newDirectoryStream' @ [57:19] ==> public open fun newDirectoryStream(p0: (Path..Path?)): (DirectoryStream<(Path..Path?)>..DirectoryStream<(Path..Path?)>?) defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [57:38] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'use' @ [57:44] ==> @InlineOnly public inline fun <T : Closeable?, R> (DirectoryStream<(Path..Path?)>..DirectoryStream<(Path..Path?)>?).use(block: ((DirectoryStream<(Path..Path?)>..DirectoryStream<(Path..Path?)>?)) -> List<Path>): List<Path> defined in kotlin.io[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Closeable?> -> (java.nio.file.DirectoryStream<(java.nio.file.Path..java.nio.file.Path?)>..java.nio.file.DirectoryStream<(java.nio.file.Path..java.nio.file.Path?)>?)
    <R> -> List<Path>

'Iterable' @ [57:48] ==> @InlineOnly public inline fun <T> Iterable(crossinline iterator: () -> Iterator<???>): Iterable<???> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@7125e0a6

'toList' @ [57:64] ==> public fun <T> Iterable<Path>.toList(): List<Path> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'emptyList' @ [60:13] ==> public fun <T> emptyList(): List<Path> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path

'when {
            paths.isEmpty() -> VirtualFile.EMPTY_ARRAY
            else -> paths.map { path -> CoreJrtVirtualFile(handler, path) }.toTypedArray()
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Array<out VirtualFile>, entry1: Array<out VirtualFile>): Array<out VirtualFile>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Array<out VirtualFile>

'paths' @ [63:13] ==> val paths: List<Path> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.getChildren[LocalVariableDescriptor]

'isEmpty' @ [63:19] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'EMPTY_ARRAY' @ [63:44] ==> public final val EMPTY_ARRAY: (Array<(VirtualFile..VirtualFile?)>..Array<out (VirtualFile..VirtualFile?)>?) defined in com.intellij.openapi.vfs.VirtualFile[JavaPropertyDescriptor]

'paths' @ [64:21] ==> val paths: List<Path> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.getChildren[LocalVariableDescriptor]

'map' @ [64:27] ==> public inline fun <T, R> Iterable<Path>.map(transform: (Path) -> CoreJrtVirtualFile): List<CoreJrtVirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Path
    <R> -> CoreJrtVirtualFile

'CoreJrtVirtualFile' @ [64:41] ==> public constructor CoreJrtVirtualFile(handler: CoreJrtFileSystem.CoreJrtHandler, path: Path) defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[ClassConstructorDescriptorImpl]

'handler' @ [64:60] ==> private final val handler: CoreJrtFileSystem.CoreJrtHandler defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'path' @ [64:69] ==> value-parameter path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.getChildren.<anonymous>[ValueParameterDescriptorImpl]

'toTypedArray' @ [64:77] ==> public inline fun <reified T> Collection<CoreJrtVirtualFile>.toTypedArray(): Array<CoreJrtVirtualFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> CoreJrtVirtualFile

'UnsupportedOperationException' @ [69:19] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'readAllBytes' @ [72:19] ==> public open fun readAllBytes(p0: (Path..Path?)): (ByteArray..ByteArray?) defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [72:32] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'attributes' @ [75:13] ==> private final val attributes: BasicFileAttributes defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'lastModifiedTime' @ [75:24] ==> public abstract fun lastModifiedTime(): (FileTime..FileTime?) defined in java.nio.file.attribute.BasicFileAttributes[JavaMethodDescriptor]

'toMillis' @ [75:43] ==> public open fun toMillis(): Long defined in java.nio.file.attribute.FileTime[JavaMethodDescriptor]

'attributes' @ [77:38] ==> private final val attributes: BasicFileAttributes defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'size' @ [77:49] ==> public abstract fun size(): Long defined in java.nio.file.attribute.BasicFileAttributes[JavaMethodDescriptor]

'inputStreamSkippingBOM' @ [82:25] ==> @NotNull public open fun inputStreamSkippingBOM(@NotNull p0: InputStream, @NotNull p1: VirtualFile): InputStream defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'newInputStream' @ [82:54] ==> public open fun newInputStream(p0: (Path..Path?), vararg p1: (OpenOption..OpenOption?)): (InputStream..InputStream?) defined in java.nio.file.Files[JavaMethodDescriptor]

'path' @ [82:69] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'buffered' @ [82:75] ==> @InlineOnly public inline fun InputStream.buffered(bufferSize: Int = ...): BufferedInputStream defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'this' @ [82:87] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[LazyClassReceiverParameterDescriptor]

'other' @ [87:13] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.equals[ValueParameterDescriptorImpl]

'path' @ [87:44] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'other' @ [87:52] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.equals[ValueParameterDescriptorImpl]

'path' @ [87:58] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'fileSystem' @ [87:66] ==> public final val CoreJrtVirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'other' @ [87:80] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile.equals[ValueParameterDescriptorImpl]

'fileSystem' @ [87:86] ==> public final val CoreJrtVirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'path' @ [90:13] ==> private final val path: Path defined in org.jetbrains.kotlin.cli.jvm.modules.CoreJrtVirtualFile[PropertyDescriptorImpl]

'hashCode' @ [90:18] ==> public open fun hashCode(): Int defined in java.nio.file.Path[DeserializedSimpleFunctionDescriptor]

