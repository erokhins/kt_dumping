'JavaModuleGraph' @ [56:27] ==> public constructor JavaModuleGraph(finder: JavaModuleFinder) defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph[ClassConstructorDescriptorImpl]

'javaModuleFinder' @ [56:43] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'mutableListOf' @ [61:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JavaRoot> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaRoot

'ArrayList' @ [63:23] ==> public final fun <E> <init>(): ArrayList<JavaModule> /* = ArrayList<JavaModule> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> JavaModule

'contentRoots' @ [65:29] ==> value-parameter contentRoots: List<ContentRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[ValueParameterDescriptorImpl]

'contentRoot' @ [66:17] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'invoke' @ [67:24] ==> public abstract operator fun invoke(p1: JvmContentRoot): VirtualFile? defined in kotlin.Function1[FunctionInvokeDescriptor]

'contentRoot' @ [67:49] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'when (contentRoot) {
                is JavaSourceRoot -> {
                    val modularRoot = modularSourceRoot(root)
                    if (modularRoot != null) {
                        modules += modularRoot
                    }
                    else {
                        result += JavaRoot(root, JavaRoot.RootType.SOURCE, contentRoot.packagePrefix?.let { prefix ->
                            if (isValidJavaFqName(prefix)) FqName(prefix)
                            else null.also {
                                report(STRONG_WARNING, "Invalid package prefix name is ignored: $prefix")
                            }
                        })
                    }
                }
                is JvmClasspathRoot -> {
                    result += JavaRoot(root, JavaRoot.RootType.BINARY)
                }
                is JvmModulePathRoot -> {
                    val module = modularBinaryRoot(root, contentRoot.file)
                    if (module != null) {
                        modules += module
                    }
                }
                else -> error("Unknown root type: $contentRoot")
            }' @ [69:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'contentRoot' @ [69:19] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'modularSourceRoot' @ [71:39] ==> private final fun modularSourceRoot(root: VirtualFile): JavaModule.Explicit? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'root' @ [71:57] ==> val root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'if (modularRoot != null) {
                        modules += modularRoot
                    }
                    else {
                        result += JavaRoot(root, JavaRoot.RootType.SOURCE, contentRoot.packagePrefix?.let { prefix ->
                            if (isValidJavaFqName(prefix)) FqName(prefix)
                            else null.also {
                                report(STRONG_WARNING, "Invalid package prefix name is ignored: $prefix")
                            }
                        })
                    }' @ [72:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'modularRoot' @ [72:25] ==> val modularRoot: JavaModule.Explicit? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'modules' @ [73:25] ==> val modules: ArrayList<JavaModule> /* = ArrayList<JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'modularRoot' @ [73:36] ==> val modularRoot: JavaModule.Explicit? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'result' @ [76:25] ==> val result: MutableList<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'JavaRoot' @ [76:35] ==> public constructor JavaRoot(file: VirtualFile, type: JavaRoot.RootType, prefixFqName: FqName? = ...) defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[ClassConstructorDescriptorImpl]

'root' @ [76:44] ==> val root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'SOURCE' @ [76:68] ==> enum entry SOURCE defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'contentRoot' @ [76:76] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'packagePrefix' @ [76:88] ==> public final val packagePrefix: String? defined in org.jetbrains.kotlin.cli.jvm.config.JavaSourceRoot[PropertyDescriptorImpl]

'let' @ [76:103] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName?): FqName? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName?

'if (isValidJavaFqName(prefix)) FqName(prefix)
                            else null.also {
                                report(STRONG_WARNING, "Invalid package prefix name is ignored: $prefix")
                            }' @ [77:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FqName?, elseBranch: FqName?): FqName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FqName?

'isValidJavaFqName' @ [77:33] ==> public fun isValidJavaFqName(qualifiedName: String?): Boolean defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'prefix' @ [77:51] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots.<anonymous>[ValueParameterDescriptorImpl]

'FqName' @ [77:60] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'prefix' @ [77:67] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots.<anonymous>[ValueParameterDescriptorImpl]

'also' @ [78:39] ==> @InlineOnly @SinceKotlin public inline fun <T> Nothing?.also(block: (Nothing?) -> Unit): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing?

'report' @ [79:33] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'STRONG_WARNING' @ [79:40] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'prefix' @ [79:98] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [85:21] ==> val result: MutableList<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'JavaRoot' @ [85:31] ==> public constructor JavaRoot(file: VirtualFile, type: JavaRoot.RootType, prefixFqName: FqName? = ...) defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[ClassConstructorDescriptorImpl]

'root' @ [85:40] ==> val root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'BINARY' @ [85:64] ==> enum entry BINARY defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'modularBinaryRoot' @ [88:34] ==> private final fun modularBinaryRoot(root: VirtualFile, originalFile: File): JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'root' @ [88:52] ==> val root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'contentRoot' @ [88:58] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'file' @ [88:70] ==> public open val file: File defined in org.jetbrains.kotlin.cli.jvm.config.JvmModulePathRoot[PropertyDescriptorImpl]

'module' @ [89:25] ==> val module: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'modules' @ [90:25] ==> val modules: ArrayList<JavaModule> /* = ArrayList<JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'module' @ [90:36] ==> val module: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'error' @ [93:25] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'contentRoot' @ [93:52] ==> val contentRoot: ContentRoot defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'addModularRoots' @ [97:9] ==> private final fun addModularRoots(modules: List<JavaModule>, result: MutableList<JavaRoot>): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'modules' @ [97:25] ==> val modules: ArrayList<JavaModule> /* = ArrayList<JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'result' @ [97:34] ==> val result: MutableList<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'RootsAndModules' @ [99:16] ==> public constructor RootsAndModules(roots: List<JavaRoot>, modules: List<JavaModule>) defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.RootsAndModules[ClassConstructorDescriptorImpl]

'result' @ [99:32] ==> val result: MutableList<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'modules' @ [99:40] ==> val modules: ArrayList<JavaModule> /* = ArrayList<JavaModule> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots[LocalVariableDescriptor]

'when {
                    root.isDirectory -> root.findChild(PsiJavaModule.MODULE_INFO_FILE)
                    root.name == PsiJavaModule.MODULE_INFO_FILE -> root
                    else -> null
                }' @ [104:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: VirtualFile?, entry1: VirtualFile?, entry2: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> VirtualFile?

'root' @ [105:21] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[ValueParameterDescriptorImpl]

'isDirectory' @ [105:26] ==> public final val VirtualFile.isDirectory: Boolean[MyPropertyDescriptor]

'root' @ [105:41] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[ValueParameterDescriptorImpl]

'findChild' @ [105:46] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'MODULE_INFO_FILE' @ [105:70] ==> public const final val MODULE_INFO_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'root' @ [106:21] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[ValueParameterDescriptorImpl]

'name' @ [106:26] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'MODULE_INFO_FILE' @ [106:48] ==> public const final val MODULE_INFO_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'root' @ [106:68] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[ValueParameterDescriptorImpl]

'psiManager' @ [110:23] ==> private final val psiManager: PsiManager defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'findFile' @ [110:34] ==> @Nullable public abstract fun findFile(@NotNull p0: VirtualFile): PsiFile? defined in com.intellij.psi.PsiManager[JavaMethodDescriptor]

'moduleInfoFile' @ [110:43] ==> val moduleInfoFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[LocalVariableDescriptor]

'psiFile' @ [111:29] ==> val psiFile: PsiFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[LocalVariableDescriptor]

'children' @ [111:37] ==> public final val PsiFile.children: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [111:46] ==> public inline fun <T> Array<out (PsiElement..PsiElement?)>.singleOrNull(predicate: ((PsiElement..PsiElement?)) -> Boolean): PsiElement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'it' @ [111:61] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot.<anonymous>[ValueParameterDescriptorImpl]

'Explicit' @ [112:27] ==> public constructor Explicit(moduleInfo: JavaModuleInfo, moduleRoot: VirtualFile, moduleInfoFile: VirtualFile, isBinary: Boolean) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedClassConstructorDescriptor]

'create' @ [112:51] ==> public final fun create(psiJavaModule: PsiJavaModule): JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion[DeserializedSimpleFunctionDescriptor]

'psiJavaModule' @ [112:58] ==> val psiJavaModule: PsiJavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[LocalVariableDescriptor]

'root' @ [112:74] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[ValueParameterDescriptorImpl]

'moduleInfoFile' @ [112:80] ==> val moduleInfoFile: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularSourceRoot[LocalVariableDescriptor]

'root' @ [116:21] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'fileSystem' @ [116:26] ==> public final val VirtualFile.fileSystem: VirtualFileSystem[MyPropertyDescriptor]

'protocol' @ [116:37] ==> public final val VirtualFileSystem.protocol: String[MyPropertyDescriptor]

'JAR_PROTOCOL' @ [116:69] ==> public const final val JAR_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'getValue' @ [117:38] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'NONE' @ [117:43] ==> enum entry NONE defined in kotlin.LazyThreadSafetyMode[FakeCallableDescriptorForObject]

'readManifestAttributes' @ [117:51] ==> private final fun readManifestAttributes(jarRoot: VirtualFile): Attributes? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'root' @ [117:74] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'root' @ [120:17] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'findChild' @ [120:22] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'MODULE_INFO_CLS_FILE' @ [120:46] ==> public const final val MODULE_INFO_CLS_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

'root' @ [121:20] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'takeIf' @ [121:25] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'isJar' @ [121:34] ==> val isJar: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'findFileByRelativePath' @ [121:43] ==> @Nullable public open fun findFileByRelativePath(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'MULTI_RELEASE_MODULE_INFO_CLS_FILE' @ [121:66] ==> public const final val MULTI_RELEASE_MODULE_INFO_CLS_FILE: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.Companion[PropertyDescriptorImpl]

'takeIf' @ [121:103] ==> @InlineOnly @SinceKotlin public inline fun <T> VirtualFile.takeIf(predicate: (VirtualFile) -> Boolean): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'manifest' @ [122:21] ==> val manifest: Attributes? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'getValue' @ [122:31] ==> public open fun getValue(p0: (String..String?)): (String..String?) defined in java.util.jar.Attributes[JavaMethodDescriptor]

'IS_MULTI_RELEASE' @ [122:40] ==> public const final val IS_MULTI_RELEASE: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.Companion[PropertyDescriptorImpl]

'equals' @ [122:59] ==> public fun String?.equals(other: String?, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'moduleInfoFile' @ [125:13] ==> val moduleInfoFile: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'?:' @ [126:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JavaModuleInfo?, right: JavaModuleInfo): JavaModuleInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> JavaModuleInfo

'read' @ [126:45] ==> public final fun read(file: VirtualFile): JavaModuleInfo? defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Companion[DeserializedSimpleFunctionDescriptor]

'moduleInfoFile' @ [126:50] ==> val moduleInfoFile: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'Explicit' @ [127:31] ==> public constructor Explicit(moduleInfo: JavaModuleInfo, moduleRoot: VirtualFile, moduleInfoFile: VirtualFile, isBinary: Boolean) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedClassConstructorDescriptor]

'moduleInfo' @ [127:40] ==> val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'root' @ [127:52] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'moduleInfoFile' @ [127:58] ==> val moduleInfoFile: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'isJar' @ [131:13] ==> val isJar: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'manifest' @ [132:39] ==> val manifest: Attributes? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'getValue' @ [132:49] ==> public open fun getValue(p0: (String..String?)): (String..String?) defined in java.util.jar.Attributes[JavaMethodDescriptor]

'AUTOMATIC_MODULE_NAME' @ [132:58] ==> public const final val AUTOMATIC_MODULE_NAME: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.Companion[PropertyDescriptorImpl]

'automaticModuleName' @ [133:17] ==> val automaticModuleName: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'Automatic' @ [134:35] ==> public constructor Automatic(name: String, moduleRoot: VirtualFile) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Automatic[DeserializedClassConstructorDescriptor]

'automaticModuleName' @ [134:45] ==> val automaticModuleName: String? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'root' @ [134:66] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'moduleName' @ [137:46] ==> @NotNull public open fun moduleName(@NotNull p0: String): String defined in com.intellij.psi.impl.light.LightJavaModule[JavaMethodDescriptor]

'originalFile' @ [137:57] ==> value-parameter originalFile: File defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'nameWithoutExtension' @ [137:70] ==> public val File.nameWithoutExtension: String defined in kotlin.io[DeserializedPropertyDescriptor]

'moduleName' @ [138:17] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'isEmpty' @ [138:28] ==> @InlineOnly public inline fun CharSequence.isEmpty(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'report' @ [139:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'ERROR' @ [139:24] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'?:' @ [139:82] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile?

'getVirtualFileForJar' @ [139:94] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'root' @ [139:115] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'root' @ [139:124] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'Automatic' @ [142:31] ==> public constructor Automatic(name: String, moduleRoot: VirtualFile) defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Automatic[DeserializedClassConstructorDescriptor]

'moduleName' @ [142:41] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[LocalVariableDescriptor]

'root' @ [142:53] ==> value-parameter root: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.modularBinaryRoot[ValueParameterDescriptorImpl]

'jarRoot' @ [149:28] ==> value-parameter jarRoot: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.readManifestAttributes[ValueParameterDescriptorImpl]

'findChild' @ [149:36] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'findChild' @ [149:59] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'manifestFile' @ [151:13] ==> val manifestFile: VirtualFile? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.readManifestAttributes[LocalVariableDescriptor]

'inputStream' @ [151:27] ==> public final val VirtualFile.inputStream: (InputStream..InputStream?)[MyPropertyDescriptor]

'let' @ [151:40] ==> @InlineOnly public inline fun <T, R> InputStream.let(block: (InputStream) -> Manifest): Manifest defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InputStream
    <R> -> Manifest

'Manifest' @ [151:46] ==> public constructor Manifest(p0: (InputStream..InputStream?)) defined in java.util.jar.Manifest[JavaClassConstructorDescriptor]

'mainAttributes' @ [151:57] ==> public final val Manifest.mainAttributes: (Attributes..Attributes?)[MyPropertyDescriptor]

'modules' @ [159:29] ==> value-parameter modules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[ValueParameterDescriptorImpl]

'filterIsInstance' @ [159:37] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<JavaModule.Explicit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> Explicit

'filterNot' @ [159:77] ==> public inline fun <T> Iterable<JavaModule.Explicit>.filterNot(predicate: (JavaModule.Explicit) -> Boolean): List<JavaModule.Explicit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'isBinary' @ [159:99] ==> public abstract val isBinary: Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'sourceModules' @ [160:13] ==> val sourceModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'size' @ [160:27] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'sourceModules' @ [161:28] ==> val sourceModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'report' @ [162:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'ERROR' @ [162:24] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'module' @ [162:76] ==> val module: JavaModule.Explicit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleInfoFile' @ [162:83] ==> public open val moduleInfoFile: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'modules' @ [167:24] ==> value-parameter modules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[ValueParameterDescriptorImpl]

'javaModuleFinder' @ [168:28] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'findModule' @ [168:45] ==> public open fun findModule(name: String): JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'module' @ [168:56] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'name' @ [168:63] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'if (existing == null) {
                javaModuleFinder.addUserModule(module)
            }
            else if (module.moduleRoot != existing.moduleRoot) {
                val jar = VfsUtilCore.getVirtualFileForJar(module.moduleRoot) ?: module.moduleRoot
                val existingPath = (VfsUtilCore.getVirtualFileForJar(existing.moduleRoot) ?: existing.moduleRoot).path
                report(STRONG_WARNING, "The root is ignored because a module with the same name '${module.name}' " +
                                       "has been found earlier on the module path at: $existingPath", jar)
            }' @ [169:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'existing' @ [169:17] ==> val existing: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'javaModuleFinder' @ [170:17] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'addUserModule' @ [170:34] ==> public final fun addUserModule(module: JavaModule): Unit defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'module' @ [170:48] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'module' @ [172:22] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [172:29] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'existing' @ [172:43] ==> val existing: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [172:52] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'?:' @ [173:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'getVirtualFileForJar' @ [173:39] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'module' @ [173:60] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [173:67] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'module' @ [173:82] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [173:89] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'?:' @ [174:37] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: VirtualFile?, right: VirtualFile): VirtualFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> VirtualFile

'getVirtualFileForJar' @ [174:49] ==> @Nullable public open fun getVirtualFileForJar(@Nullable p0: VirtualFile?): VirtualFile? defined in com.intellij.openapi.vfs.VfsUtilCore[JavaMethodDescriptor]

'existing' @ [174:70] ==> val existing: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [174:79] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'existing' @ [174:94] ==> val existing: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [174:103] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'path' @ [174:115] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'report' @ [175:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'STRONG_WARNING' @ [175:24] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'+' @ [175:40] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'module' @ [175:100] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'name' @ [175:107] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'existingPath' @ [176:88] ==> val existingPath: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'jar' @ [176:103] ==> val jar: VirtualFile defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'javaModuleFinder' @ [180:13] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'allObservableModules' @ [180:30] ==> public final val allObservableModules: Sequence<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'none' @ [180:51] ==> public fun <T> Sequence<JavaModule>.none(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaModule

'in' @ [182:39] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'additionalModules' @ [182:60] ==> private final val additionalModules: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'addAllModulePathToRoots' @ [183:13] ==> val addAllModulePathToRoots: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'sourceModules' @ [183:40] ==> val sourceModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'isNotEmpty' @ [183:54] ==> @InlineOnly public inline fun <T> Collection<JavaModule.Explicit>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'report' @ [184:13] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'ERROR' @ [184:20] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'when {
            sourceModules.isNotEmpty() -> listOf(sourceModules.single().name) + additionalModules
            addAllModulePathToRoots -> modules.map(JavaModule::name)
            else -> computeDefaultRootModules() + additionalModules
        }' @ [188:27] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<String>, entry1: List<String>, entry2: List<String>): List<String>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<String>

'sourceModules' @ [189:13] ==> val sourceModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'isNotEmpty' @ [189:27] ==> @InlineOnly public inline fun <T> Collection<JavaModule.Explicit>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'listOf' @ [189:43] ==> public fun <T> listOf(element: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sourceModules' @ [189:50] ==> val sourceModules: List<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'single' @ [189:64] ==> public fun <T> List<JavaModule.Explicit>.single(): JavaModule.Explicit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit

'name' @ [189:73] ==> public open val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'additionalModules' @ [189:81] ==> private final val additionalModules: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'addAllModulePathToRoots' @ [190:13] ==> val addAllModulePathToRoots: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'modules' @ [190:40] ==> value-parameter modules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[ValueParameterDescriptorImpl]

'map' @ [190:48] ==> public inline fun <T, R> Iterable<JavaModule>.map(transform: (JavaModule) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaModule
    <R> -> String

'name' @ [190:64] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'computeDefaultRootModules' @ [191:21] ==> private final fun computeDefaultRootModules(): List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'additionalModules' @ [191:51] ==> private final val additionalModules: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'javaModuleGraph' @ [194:31] ==> public final val javaModuleGraph: JavaModuleGraph defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'getAllDependencies' @ [194:47] ==> public final fun getAllDependencies(moduleNames: List<String>): LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.modules.JavaModuleGraph[SimpleFunctionDescriptorImpl]

'rootModules' @ [194:66] ==> val rootModules: List<String> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'allDependencies' @ [195:13] ==> val allDependencies: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'any' @ [195:29] ==> public inline fun <T> Iterable<String>.any(predicate: (String) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javaModuleFinder' @ [195:49] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'findModule' @ [195:66] ==> public open fun findModule(name: String): JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'moduleName' @ [195:77] ==> value-parameter moduleName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots.<anonymous>[ValueParameterDescriptorImpl]

'modules' @ [199:28] ==> value-parameter modules: List<JavaModule> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[ValueParameterDescriptorImpl]

'module' @ [200:21] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'allDependencies' @ [201:21] ==> val allDependencies: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'module' @ [201:40] ==> val module: JavaModule defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'name' @ [201:47] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'report' @ [206:9] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'LOGGING' @ [206:16] ==> enum entry LOGGING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'allDependencies' @ [206:44] ==> val allDependencies: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'allDependencies' @ [208:28] ==> val allDependencies: LinkedHashSet<String> /* = LinkedHashSet<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'javaModuleFinder' @ [209:26] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'findModule' @ [209:43] ==> public open fun findModule(name: String): JavaModule? defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[SimpleFunctionDescriptorImpl]

'moduleName' @ [209:54] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'if (module == null) {
                report(ERROR, "Module $moduleName cannot be found in the module graph")
            }
            else {
                result.add(JavaRoot(
                        module.moduleRoot,
                        if (module.isBinary) JavaRoot.RootType.BINARY else JavaRoot.RootType.SOURCE
                ))
            }' @ [210:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'module' @ [210:17] ==> val module: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'report' @ [211:17] ==> private final fun report(severity: CompilerMessageSeverity, message: String, file: VirtualFile? = ...): Unit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[SimpleFunctionDescriptorImpl]

'ERROR' @ [211:24] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'moduleName' @ [211:40] ==> val moduleName: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'result' @ [214:17] ==> value-parameter result: MutableList<JavaRoot> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[ValueParameterDescriptorImpl]

'add' @ [214:24] ==> public abstract fun add(element: JavaRoot): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'JavaRoot' @ [214:28] ==> public constructor JavaRoot(file: VirtualFile, type: JavaRoot.RootType, prefixFqName: FqName? = ...) defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot[ClassConstructorDescriptorImpl]

'module' @ [215:25] ==> val module: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'moduleRoot' @ [215:32] ==> public abstract val moduleRoot: VirtualFile defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'if (module.isBinary) JavaRoot.RootType.BINARY else JavaRoot.RootType.SOURCE' @ [216:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JavaRoot.RootType, elseBranch: JavaRoot.RootType): JavaRoot.RootType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> RootType

'module' @ [216:29] ==> val module: JavaModule? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.addModularRoots[LocalVariableDescriptor]

'isBinary' @ [216:36] ==> public abstract val isBinary: Boolean defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'BINARY' @ [216:64] ==> enum entry BINARY defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'SOURCE' @ [216:94] ==> enum entry SOURCE defined in org.jetbrains.kotlin.cli.jvm.index.JavaRoot.RootType[FakeCallableDescriptorForObject]

'arrayListOf' @ [224:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<String> /* = ArrayList<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javaModuleFinder' @ [226:29] ==> private final val javaModuleFinder: CliJavaModuleFinder defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'systemModules' @ [226:46] ==> public final val systemModules: Sequence<JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.modules.CliJavaModuleFinder[PropertyDescriptorImpl]

'associateBy' @ [226:60] ==> public inline fun <T, K> Sequence<JavaModule.Explicit>.associateBy(keySelector: (JavaModule.Explicit) -> String): Map<String, JavaModule.Explicit> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Explicit
    <K> -> String

'name' @ [226:84] ==> public abstract val name: String defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule[DeserializedPropertyDescriptor]

'in' @ [227:28] ==> @InlineOnly public operator inline fun <@OnlyInputTypes K, V> Map<out String, JavaModule.Explicit>.contains(key: String): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes K> -> String
    <V> -> Explicit

'systemModules' @ [227:41] ==> val systemModules: Map<String, JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'javaSeExists' @ [228:13] ==> val javaSeExists: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'result' @ [230:13] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'add' @ [230:20] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'moduleInfo' @ [233:82] ==> public final val moduleInfo: JavaModuleInfo defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModule.Explicit[DeserializedPropertyDescriptor]

'exports' @ [233:93] ==> public final val exports: List<JavaModuleInfo.Exports> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo[DeserializedPropertyDescriptor]

'any' @ [233:101] ==> public inline fun <T> Iterable<JavaModuleInfo.Exports>.any(predicate: (JavaModuleInfo.Exports) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Exports

'it' @ [233:107] ==> value-parameter it: JavaModuleInfo.Exports defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules.exportsAtLeastOnePackageUnqualified.<anonymous>[ValueParameterDescriptorImpl]

'toModules' @ [233:110] ==> public final val toModules: List<String> defined in org.jetbrains.kotlin.resolve.jvm.modules.JavaModuleInfo.Exports[DeserializedPropertyDescriptor]

'isEmpty' @ [233:120] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [235:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'javaSeExists' @ [235:14] ==> val javaSeExists: Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'component1' @ [238:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JavaModule.Explicit>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Explicit

'component2' @ [238:25] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JavaModule.Explicit>.component2(): JavaModule.Explicit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Explicit

'systemModules' @ [238:36] ==> val systemModules: Map<String, JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'name' @ [239:21] ==> val name: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'startsWith' @ [239:26] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'module' @ [239:49] ==> val module: JavaModule.Explicit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'exportsAtLeastOnePackageUnqualified' @ [239:56] ==> local final fun JavaModule.Explicit.exportsAtLeastOnePackageUnqualified(): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[SimpleFunctionDescriptorImpl]

'result' @ [240:21] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'add' @ [240:28] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [240:32] ==> val name: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'component1' @ [245:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JavaModule.Explicit>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Explicit

'component2' @ [245:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JavaModule.Explicit>.component2(): JavaModule.Explicit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Explicit

'systemModules' @ [245:32] ==> val systemModules: Map<String, JavaModule.Explicit> defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'!' @ [248:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'name' @ [248:18] ==> val name: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'startsWith' @ [248:23] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'module' @ [248:46] ==> val module: JavaModule.Explicit defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'exportsAtLeastOnePackageUnqualified' @ [248:53] ==> local final fun JavaModule.Explicit.exportsAtLeastOnePackageUnqualified(): Boolean defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[SimpleFunctionDescriptorImpl]

'result' @ [249:17] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'add' @ [249:24] ==> public open fun add(element: String): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'name' @ [249:28] ==> val name: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'result' @ [253:16] ==> val result: ArrayList<String> /* = ArrayList<String> */ defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.computeDefaultRootModules[LocalVariableDescriptor]

'messageCollector' @ [257:13] ==> private final val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'IllegalStateException' @ [258:19] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'if (file != null) file.path + ":" else ""' @ [258:44] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'file' @ [258:48] ==> value-parameter file: VirtualFile? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'file' @ [258:62] ==> value-parameter file: VirtualFile? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'path' @ [258:67] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'severity' @ [258:87] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'message' @ [258:98] ==> value-parameter message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'messageCollector' @ [260:9] ==> private final val messageCollector: MessageCollector? defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver[PropertyDescriptorImpl]

'report' @ [260:26] ==> public abstract fun report(severity: CompilerMessageSeverity, message: String, location: CompilerMessageLocation? = ...): Unit defined in org.jetbrains.kotlin.cli.common.messages.MessageCollector[DeserializedSimpleFunctionDescriptor]

'severity' @ [261:17] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'message' @ [261:27] ==> value-parameter message: String defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'if (file == null) null else CompilerMessageLocation.create(MessageUtil.virtualFileToPath(file))' @ [262:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CompilerMessageLocation?, elseBranch: CompilerMessageLocation?): CompilerMessageLocation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CompilerMessageLocation?

'file' @ [262:21] ==> value-parameter file: VirtualFile? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'create' @ [262:69] ==> @JvmStatic public final fun create(path: String?): CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageLocation.Companion[DeserializedSimpleFunctionDescriptor]

'virtualFileToPath' @ [262:88] ==> @NotNull public open fun virtualFileToPath(@NotNull virtualFile: VirtualFile): String defined in org.jetbrains.kotlin.cli.common.messages.MessageUtil[JavaMethodDescriptor]

'file' @ [262:106] ==> value-parameter file: VirtualFile? = ... defined in org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.report[ValueParameterDescriptorImpl]

'MODULE_INFO_CLS_FILE' @ [267:93] ==> public const final val MODULE_INFO_CLS_FILE: String defined in com.intellij.psi.PsiJavaModule[JavaPropertyDescriptor]

