'PersistentLibraryKind<DummyLibraryProperties>' @ [48:24] ==> public constructor PersistentLibraryKind<P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.roots.libraries.PersistentLibraryKind[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> -> DummyLibraryProperties

'!!' @ [49:46] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: DummyLibraryProperties?): DummyLibraryProperties[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> DummyLibraryProperties

'INSTANCE' @ [49:69] ==> public final val INSTANCE: (DummyLibraryProperties..DummyLibraryProperties?) defined in com.intellij.openapi.roots.libraries.DummyLibraryProperties[JavaPropertyDescriptor]

'PersistentLibraryKind<DummyLibraryProperties>' @ [52:28] ==> public constructor PersistentLibraryKind<P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)>(@NotNull @NonNls p0: String) defined in com.intellij.openapi.roots.libraries.PersistentLibraryKind[JavaClassConstructorDescriptor]
Inferred types:
    <P : raw (LibraryProperties<(Any..Any?)>..LibraryProperties<*>?)> -> DummyLibraryProperties

'!!' @ [53:46] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: DummyLibraryProperties?): DummyLibraryProperties[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> DummyLibraryProperties

'INSTANCE' @ [53:69] ==> public final val INSTANCE: (DummyLibraryProperties..DummyLibraryProperties?) defined in com.intellij.openapi.roots.libraries.DummyLibraryProperties[JavaPropertyDescriptor]

'library' @ [57:5] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.framework.getLibraryPlatform[ValueParameterDescriptorImpl]

'JvmPlatform' @ [57:37] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'library' @ [58:9] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.framework.getLibraryPlatform[ValueParameterDescriptorImpl]

'isDisposed' @ [58:17] ==> public final val LibraryEx.isDisposed: Boolean[MyPropertyDescriptor]

'JvmPlatform' @ [58:36] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'when (library.kind) {
        JSLibraryKind -> JsPlatform
        CommonLibraryKind -> TargetPlatform.Default
        else -> JvmPlatform
    }' @ [60:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TargetPlatform, entry1: TargetPlatform, entry2: TargetPlatform): TargetPlatform[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TargetPlatform

'library' @ [60:18] ==> value-parameter library: Library defined in org.jetbrains.kotlin.idea.framework.getLibraryPlatform[ValueParameterDescriptorImpl]

'kind' @ [60:26] ==> public final val LibraryEx.kind: PersistentLibraryKind<*>?[MyPropertyDescriptor]

'JSLibraryKind' @ [61:9] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'JsPlatform' @ [61:26] ==> public object JsPlatform : TargetPlatform defined in org.jetbrains.kotlin.js.resolve[FakeCallableDescriptorForObject]

'CommonLibraryKind' @ [62:9] ==> public object CommonLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'Default' @ [62:45] ==> public object Default : TargetPlatform defined in org.jetbrains.kotlin.resolve.TargetPlatform[FakeCallableDescriptorForObject]

'JvmPlatform' @ [63:17] ==> public object JvmPlatform : TargetPlatform defined in org.jetbrains.kotlin.resolve.jvm.platform[FakeCallableDescriptorForObject]

'roots' @ [68:19] ==> value-parameter roots: Array<VirtualFile> defined in org.jetbrains.kotlin.idea.framework.detectLibraryKind[ValueParameterDescriptorImpl]

'firstOrNull' @ [68:25] ==> public fun <T> Array<out VirtualFile>.firstOrNull(): VirtualFile? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'jarFile' @ [69:9] ==> val jarFile: VirtualFile defined in org.jetbrains.kotlin.idea.framework.detectLibraryKind[LocalVariableDescriptor]

'fileSystem' @ [69:17] ==> public final val VirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'detectLibraryKindFromJarContents' @ [70:16] ==> private fun detectLibraryKindFromJarContents(jarRoot: VirtualFile): PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[SimpleFunctionDescriptorImpl]

'jarFile' @ [70:49] ==> val jarFile: VirtualFile defined in org.jetbrains.kotlin.idea.framework.detectLibraryKind[LocalVariableDescriptor]

'when (jarFile.extension) {
        "js", "kjsm" -> JSLibraryKind
        MetadataPackageFragment.METADATA_FILE_EXTENSION -> CommonLibraryKind
        else -> null
    }' @ [73:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PersistentLibraryKind<*>?, entry1: PersistentLibraryKind<*>?, entry2: PersistentLibraryKind<*>?): PersistentLibraryKind<*>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PersistentLibraryKind<*>?

'jarFile' @ [73:18] ==> val jarFile: VirtualFile defined in org.jetbrains.kotlin.idea.framework.detectLibraryKind[LocalVariableDescriptor]

'extension' @ [73:26] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'JSLibraryKind' @ [74:25] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'MetadataPackageFragment' @ [75:9] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[FakeCallableDescriptorForObject]

'METADATA_FILE_EXTENSION' @ [75:33] ==> public final val METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[DeserializedPropertyDescriptor]

'CommonLibraryKind' @ [75:60] ==> public object CommonLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'visitChildrenRecursively' @ [82:13] ==> @NotNull public open fun visitChildrenRecursively(@NotNull p0: VirtualFile, @NotNull p1: VirtualFileVisitor<*>): VirtualFileVisitor.Result defined in com.intellij.openapi.vfs.VfsUtil[JavaMethodDescriptor]

'jarRoot' @ [82:38] ==> value-parameter jarRoot: VirtualFile defined in org.jetbrains.kotlin.idea.framework.detectLibraryKindFromJarContents[ValueParameterDescriptorImpl]

'VirtualFileVisitor<PersistentLibraryKind<*>>' @ [82:56] ==> protected/*protected and package*/ constructor VirtualFileVisitor<T : (Any..Any?)>(@NotNull vararg p0: (VirtualFileVisitor.Option..VirtualFileVisitor.Option?)) defined in com.intellij.openapi.vfs.VirtualFileVisitor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PersistentLibraryKind<*>

'when (file.extension) {
                    "class" -> false

                    "kjsm" -> {
                        result = JSLibraryKind
                        false
                    }

                    MetadataPackageFragment.METADATA_FILE_EXTENSION -> {
                        result = CommonLibraryKind
                        false
                    }

                    else -> true
                }' @ [84:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'file' @ [84:23] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.idea.framework.detectLibraryKindFromJarContents.<no name provided>.visitFile[ValueParameterDescriptorImpl]

'extension' @ [84:28] ==> public final val VirtualFile.extension: String?[MyPropertyDescriptor]

'result' @ [88:25] ==> var result: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework.detectLibraryKindFromJarContents[LocalVariableDescriptor]

'JSLibraryKind' @ [88:34] ==> public object JSLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'MetadataPackageFragment' @ [92:21] ==> public companion object defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment[FakeCallableDescriptorForObject]

'METADATA_FILE_EXTENSION' @ [92:45] ==> public final val METADATA_FILE_EXTENSION: String defined in org.jetbrains.kotlin.serialization.deserialization.MetadataPackageFragment.Companion[DeserializedPropertyDescriptor]

'result' @ [93:25] ==> var result: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework.detectLibraryKindFromJarContents[LocalVariableDescriptor]

'CommonLibraryKind' @ [93:34] ==> public object CommonLibraryKind : PersistentLibraryKind<DummyLibraryProperties> defined in org.jetbrains.kotlin.idea.framework in file LibraryKinds.kt[FakeCallableDescriptorForObject]

'result' @ [100:12] ==> var result: PersistentLibraryKind<*>? defined in org.jetbrains.kotlin.idea.framework.detectLibraryKindFromJarContents[LocalVariableDescriptor]

