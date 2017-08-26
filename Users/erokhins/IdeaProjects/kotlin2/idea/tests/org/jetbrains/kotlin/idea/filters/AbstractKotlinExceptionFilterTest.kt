'+' @ [43:36] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getTestDataPathBase' @ [43:55] ==> @NotNull public open fun getTestDataPathBase(): String defined in org.jetbrains.kotlin.idea.test.PluginTestCaseBase[JavaMethodDescriptor]

'KotlinCodeInsightTestCase' @ [45:52] ==> public constructor KotlinCodeInsightTestCase() defined in org.jetbrains.kotlin.idea.test.KotlinCodeInsightTestCase[JavaClassConstructorDescriptor]

'File' @ [49:23] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'path' @ [49:28] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[ValueParameterDescriptorImpl]

'File' @ [50:24] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'rootDir' @ [50:29] ==> val rootDir: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'rootDir' @ [50:38] ==> val rootDir: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'name' @ [50:46] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'rootDir' @ [51:9] ==> val rootDir: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'listFiles' @ [51:17] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'filter' @ [51:29] ==> public inline fun <T> Array<out (File..File?)>.filter(predicate: ((File..File?)) -> Boolean): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'it' @ [51:38] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'mainFile' @ [51:44] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'forEach' @ [51:55] ==> @HidesMembers public inline fun <T> Iterable<(File..File?)>.forEach(action: ((File..File?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'configureByFile' @ [51:65] ==> protected/*protected and package*/ open fun configureByFile(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest[JavaMethodDescriptor]

'it' @ [51:81] ==> value-parameter it: (File..File?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'canonicalPath' @ [51:84] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'configureByFile' @ [52:9] ==> protected/*protected and package*/ open fun configureByFile(p0: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest[JavaMethodDescriptor]

'mainFile' @ [52:25] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'canonicalPath' @ [52:34] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'file' @ [54:24] ==> public final val AbstractKotlinExceptionFilterTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'text' @ [54:29] ==> public final val PsiFile.text: (String..String?)[MyPropertyDescriptor]

'runWriteAction' @ [56:22] ==> public inline fun <T> runWriteAction(crossinline runnable: () -> VirtualFile): VirtualFile defined in com.intellij.openapi.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile

'project' @ [57:13] ==> public final val AbstractKotlinExceptionFilterTest.project: (Project..Project?)[MyPropertyDescriptor]

'baseDir' @ [57:21] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'findChild' @ [57:29] ==> @Nullable public open fun findChild(@NotNull p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'project' @ [57:49] ==> public final val AbstractKotlinExceptionFilterTest.project: (Project..Project?)[MyPropertyDescriptor]

'baseDir' @ [57:57] ==> public final val Project.baseDir: (VirtualFile..VirtualFile?)[MyPropertyDescriptor]

'createChildDirectory' @ [57:65] ==> @NotNull public open fun createChildDirectory(p0: (Any..Any?), @NotNull p1: String): VirtualFile defined in com.intellij.openapi.vfs.VirtualFile[JavaMethodDescriptor]

'this' @ [57:86] ==> <this> defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest[LazyClassReceiverParameterDescriptor]

'setCompilerOutputPath' @ [59:21] ==> public open fun setCompilerOutputPath(p0: (Module..Module?), p1: (String..String?), p2: Boolean): Unit defined in com.intellij.testFramework.PsiTestUtil[JavaMethodDescriptor]

'module' @ [59:43] ==> public final val AbstractKotlinExceptionFilterTest.module: (Module..Module?)[MyPropertyDescriptor]

'outDir' @ [59:51] ==> val outDir: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'url' @ [59:58] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'if (InTextDirectivesUtils.getPrefixedBoolean(fileText, "// WITH_MOCK_LIBRARY: ") ?: false) {
            if (MOCK_LIBRARY_JAR == null) {
                MOCK_LIBRARY_JAR = MockLibraryUtil.compileJvmLibraryToJar(MOCK_LIBRARY_SOURCES, "mockLibrary", addSources = true)
            }

            val mockLibraryJar = MOCK_LIBRARY_JAR ?: throw AssertionError("Mock library JAR is null")
            val mockLibraryPath = FileUtilRt.toSystemIndependentName(mockLibraryJar.canonicalPath)
            val libRootUrl = "jar://$mockLibraryPath!/"

            ApplicationManager.getApplication().runWriteAction {
                val moduleModel = ModuleRootManager.getInstance(myModule).modifiableModel
                with(moduleModel.moduleLibraryTable.modifiableModel.createLibrary("mockLibrary").modifiableModel) {
                    addRoot(libRootUrl, OrderRootType.CLASSES)
                    addRoot(libRootUrl + "src/", OrderRootType.SOURCES)
                    commit()
                }
                moduleModel.commit()
            }
            MockLibraryUtil.compileKotlin(path, File(outDir.path), extraClasspath = mockLibraryPath)
            classLoader = URLClassLoader(
                    arrayOf(URL(outDir.url + "/"), mockLibraryJar.toURI().toURL()),
                    ForTestCompileRuntime.runtimeJarClassLoader())
        }
        else {
            MockLibraryUtil.compileKotlin(path, File(outDir.path))
            classLoader = URLClassLoader(
                    arrayOf(URL(outDir.url + "/")),
                    ForTestCompileRuntime.runtimeJarClassLoader())
        }' @ [62:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'?:' @ [62:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'getPrefixedBoolean' @ [62:35] ==> @Nullable public open fun getPrefixedBoolean(p0: (String..String?), p1: (String..String?)): Boolean? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [62:54] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'MOCK_LIBRARY_JAR' @ [63:17] ==> private var MOCK_LIBRARY_JAR: File? defined in org.jetbrains.kotlin.idea.filters in file AbstractKotlinExceptionFilterTest.kt[PropertyDescriptorImpl]

'MOCK_LIBRARY_JAR' @ [64:17] ==> private var MOCK_LIBRARY_JAR: File? defined in org.jetbrains.kotlin.idea.filters in file AbstractKotlinExceptionFilterTest.kt[PropertyDescriptorImpl]

'MockLibraryUtil' @ [64:36] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileJvmLibraryToJar' @ [64:52] ==> @JvmStatic @JvmOverloads public final fun compileJvmLibraryToJar(sourcesPath: String, jarName: String, addSources: Boolean = ..., allowKotlinSources: Boolean = ..., extraOptions: List<String> = ..., extraClasspath: List<String> = ..., useJava9: Boolean = ...): File defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'MOCK_LIBRARY_SOURCES' @ [64:75] ==> private val MOCK_LIBRARY_SOURCES: String defined in org.jetbrains.kotlin.idea.filters in file AbstractKotlinExceptionFilterTest.kt[PropertyDescriptorImpl]

'MOCK_LIBRARY_JAR' @ [67:34] ==> private var MOCK_LIBRARY_JAR: File? defined in org.jetbrains.kotlin.idea.filters in file AbstractKotlinExceptionFilterTest.kt[PropertyDescriptorImpl]

'AssertionError' @ [67:60] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'toSystemIndependentName' @ [68:46] ==> @NotNull public open fun toSystemIndependentName(@NonNls @NotNull p0: String): String defined in com.intellij.openapi.util.io.FileUtilRt[JavaMethodDescriptor]

'mockLibraryJar' @ [68:70] ==> val mockLibraryJar: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'canonicalPath' @ [68:85] ==> public final val File.canonicalPath: (String..String?)[MyPropertyDescriptor]

'mockLibraryPath' @ [69:38] ==> val mockLibraryPath: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'getApplication' @ [71:32] ==> public open fun getApplication(): (Application..Application?) defined in com.intellij.openapi.application.ApplicationManager[JavaMethodDescriptor]

'runWriteAction' @ [71:49] ==> public final fun runWriteAction(@NotNull p0: () -> Unit): Unit defined in com.intellij.openapi.application.Application[MyFunctionDescriptor]

'getInstance' @ [72:53] ==> public open fun getInstance(@NotNull p0: Module): (ModuleRootManager..ModuleRootManager?) defined in com.intellij.openapi.roots.ModuleRootManager[JavaMethodDescriptor]

'myModule' @ [72:65] ==> protected/*protected and package*/ final var myModule: (Module..Module?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest[JavaPropertyDescriptor]

'modifiableModel' @ [72:75] ==> public final val ModuleRootManager.modifiableModel: ModifiableRootModel[MyPropertyDescriptor]

'with' @ [73:17] ==> @InlineOnly public inline fun <T, R> with(receiver: Library.ModifiableModel, block: (Library.ModifiableModel).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ModifiableModel
    <R> -> Unit

'moduleModel' @ [73:22] ==> val moduleModel: ModifiableRootModel defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest.<anonymous>[LocalVariableDescriptor]

'moduleLibraryTable' @ [73:34] ==> public final val ModifiableRootModel.moduleLibraryTable: LibraryTable[MyPropertyDescriptor]

'modifiableModel' @ [73:53] ==> public final val LibraryTable.modifiableModel: LibraryTable.ModifiableModel[MyPropertyDescriptor]

'createLibrary' @ [73:69] ==> public abstract fun createLibrary(p0: (String..String?)): (Library..Library?) defined in com.intellij.openapi.roots.libraries.LibraryTable.ModifiableModel[JavaMethodDescriptor]

'modifiableModel' @ [73:98] ==> public final val Library.modifiableModel: Library.ModifiableModel[MyPropertyDescriptor]

'addRoot' @ [74:21] ==> public abstract fun addRoot(@NonNls @NotNull p0: String, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'libRootUrl' @ [74:29] ==> val libRootUrl: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'CLASSES' @ [74:55] ==> public final val CLASSES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'addRoot' @ [75:21] ==> public abstract fun addRoot(@NonNls @NotNull p0: String, @NotNull p1: OrderRootType): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'libRootUrl' @ [75:29] ==> val libRootUrl: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'SOURCES' @ [75:64] ==> public final val SOURCES: (OrderRootType..OrderRootType?) defined in com.intellij.openapi.roots.OrderRootType[JavaPropertyDescriptor]

'commit' @ [76:21] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.libraries.Library.ModifiableModel[JavaMethodDescriptor]

'moduleModel' @ [78:17] ==> val moduleModel: ModifiableRootModel defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest.<anonymous>[LocalVariableDescriptor]

'commit' @ [78:29] ==> public abstract fun commit(): Unit defined in com.intellij.openapi.roots.ModifiableRootModel[JavaMethodDescriptor]

'MockLibraryUtil' @ [80:13] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileKotlin' @ [80:29] ==> @JvmStatic @JvmOverloads public final fun compileKotlin(sourcesPath: String, outDir: File, extraOptions: List<String> = ..., vararg extraClasspath: String): Unit defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'path' @ [80:43] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[ValueParameterDescriptorImpl]

'File' @ [80:49] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [80:54] ==> val outDir: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'path' @ [80:61] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'mockLibraryPath' @ [80:85] ==> val mockLibraryPath: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'classLoader' @ [81:13] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'URLClassLoader' @ [81:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [82:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'URL' @ [82:29] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'outDir' @ [82:33] ==> val outDir: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'url' @ [82:40] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'mockLibraryJar' @ [82:52] ==> val mockLibraryJar: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'toURI' @ [82:67] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [82:75] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'runtimeJarClassLoader' @ [83:43] ==> @NotNull public open fun runtimeJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'MockLibraryUtil' @ [86:13] ==> public object MockLibraryUtil defined in org.jetbrains.kotlin.test[FakeCallableDescriptorForObject]

'compileKotlin' @ [86:29] ==> @JvmStatic @JvmOverloads public final fun compileKotlin(sourcesPath: String, outDir: File, extraOptions: List<String> = ..., vararg extraClasspath: String): Unit defined in org.jetbrains.kotlin.test.MockLibraryUtil[DeserializedSimpleFunctionDescriptor]

'path' @ [86:43] ==> value-parameter path: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[ValueParameterDescriptorImpl]

'File' @ [86:49] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'outDir' @ [86:54] ==> val outDir: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'path' @ [86:61] ==> public final val VirtualFile.path: String[MyPropertyDescriptor]

'classLoader' @ [87:13] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'URLClassLoader' @ [87:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [88:21] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: URL): Array<URL> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> URL

'URL' @ [88:29] ==> public constructor URL(p0: (String..String?)) defined in java.net.URL[JavaClassConstructorDescriptor]

'outDir' @ [88:33] ==> val outDir: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'url' @ [88:40] ==> public final val VirtualFile.url: String[MyPropertyDescriptor]

'runtimeJarClassLoader' @ [89:43] ==> @NotNull public open fun runtimeJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'NoResolveFileClassesProvider' @ [93:29] ==> public object NoResolveFileClassesProvider : JvmFileClassesProvider defined in org.jetbrains.kotlin.fileClasses[FakeCallableDescriptorForObject]

'getFileClassFqName' @ [93:58] ==> public fun JvmFileClassesProvider.getFileClassFqName(file: KtFile): FqName defined in org.jetbrains.kotlin.fileClasses[DeserializedSimpleFunctionDescriptor]

'file' @ [93:77] ==> public final val AbstractKotlinExceptionFilterTest.file: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'classLoader' @ [94:25] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'loadClass' @ [94:37] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'className' @ [94:47] ==> val className: FqName defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'asString' @ [94:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'clazz' @ [95:13] ==> val clazz: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'getMethod' @ [95:19] ==> @CallerSensitive public open fun getMethod(p0: (String..String?), vararg p1: (Class<*>..Class<*>?)): (Method..Method?) defined in java.lang.Class[JavaMethodDescriptor]

'invoke' @ [95:37] ==> @CallerSensitive public open operator fun invoke(p0: (Any..Any?), vararg p1: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Method[JavaMethodDescriptor]

'AssertionError' @ [96:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'className' @ [96:43] ==> val className: FqName defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'asString' @ [96:53] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'e' @ [99:13] ==> val e: InvocationTargetException defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'targetException' @ [99:15] ==> public final val InvocationTargetException.targetException: (Throwable..Throwable?)[MyPropertyDescriptor]

'stackTrace' @ [99:31] ==> public final var Throwable.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'KotlinExceptionFilterFactory' @ [102:22] ==> public constructor KotlinExceptionFilterFactory() defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilterFactory[JavaClassConstructorDescriptor]

'create' @ [102:53] ==> @NotNull public open fun create(@NotNull p0: GlobalSearchScope): Filter defined in org.jetbrains.kotlin.idea.filters.KotlinExceptionFilterFactory[JavaMethodDescriptor]

'allScope' @ [102:78] ==> @NotNull public open fun allScope(@NotNull p0: Project): GlobalSearchScope defined in com.intellij.psi.search.GlobalSearchScope[JavaMethodDescriptor]

'project' @ [102:87] ==> public final val AbstractKotlinExceptionFilterTest.project: (Project..Project?)[MyPropertyDescriptor]

'?:' @ [103:22] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'findStringWithPrefixes' @ [103:44] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [103:67] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'stackTraceElement' @ [104:32] ==> val stackTraceElement: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'toString' @ [104:50] ==> public open fun toString(): String defined in java.lang.StackTraceElement[JavaMethodDescriptor]

'filter' @ [105:22] ==> val filter: Filter defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'applyFilter' @ [105:29] ==> @Nullable public abstract fun applyFilter(p0: (String..String?), p1: Int): Filter.Result? defined in com.intellij.execution.filters.Filter[JavaMethodDescriptor]

'prefix' @ [105:43] ==> val prefix: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'stackTraceString' @ [105:51] ==> val stackTraceString: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'AssertionError' @ [105:82] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'stackTraceElement' @ [105:124] ==> val stackTraceElement: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'isDirectiveDefined' @ [107:35] ==> public open fun isDirectiveDefined(p0: (String..String?), p1: (String..String?)): Boolean defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [107:54] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'result' @ [108:37] ==> var result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'firstHyperlinkInfo' @ [108:44] ==> public final val Filter.Result.firstHyperlinkInfo: HyperlinkInfo?[MyPropertyDescriptor]

'fileHyperlinkInfo' @ [109:30] ==> val fileHyperlinkInfo: FileHyperlinkInfo defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'descriptor' @ [109:48] ==> public final val FileHyperlinkInfo.descriptor: OpenFileDescriptor?[MyPropertyDescriptor]

'descriptor' @ [111:24] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'file' @ [111:35] ==> public final val OpenFileDescriptor.file: VirtualFile[MyPropertyDescriptor]

'descriptor' @ [112:24] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'line' @ [112:35] ==> public final val OpenFileDescriptor.line: Int[MyPropertyDescriptor]

'stackTraceString' @ [114:34] ==> val stackTraceString: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'replace' @ [115:22] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'mainFile' @ [115:30] ==> val mainFile: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'name' @ [115:39] ==> public final val File.name: (String..String?)[MyPropertyDescriptor]

'file' @ [115:45] ==> val file: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'name' @ [115:50] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'replace' @ [116:22] ==> @InlineOnly public inline fun CharSequence.replace(regex: Regex, replacement: String): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'Regex' @ [116:30] ==> public constructor Regex(pattern: String) defined in kotlin.text.Regex[DeserializedClassConstructorDescriptor]

'line' @ [116:54] ==> val line: Int defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'result' @ [118:13] ==> var result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'filter' @ [118:22] ==> val filter: Filter defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'applyFilter' @ [118:29] ==> @Nullable public abstract fun applyFilter(p0: (String..String?), p1: Int): Filter.Result? defined in com.intellij.execution.filters.Filter[JavaMethodDescriptor]

'prefix' @ [118:43] ==> val prefix: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'newStackString' @ [118:51] ==> val newStackString: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'AssertionError' @ [118:80] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'stackTraceElement' @ [118:122] ==> val stackTraceElement: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'result' @ [121:20] ==> var result: Filter.Result defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'firstHyperlinkInfo' @ [121:27] ==> public final val Filter.Result.firstHyperlinkInfo: HyperlinkInfo?[MyPropertyDescriptor]

'info' @ [122:26] ==> val info: FileHyperlinkInfo defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'descriptor' @ [122:31] ==> public final val FileHyperlinkInfo.descriptor: OpenFileDescriptor?[MyPropertyDescriptor]

'!!' @ [124:32] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: String?): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> String

'findStringWithPrefixes' @ [124:54] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [124:77] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'File' @ [125:35] ==> public constructor File(p0: (File..File?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'rootDir' @ [125:40] ==> val rootDir: File defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'expectedFileName' @ [125:49] ==> val expectedFileName: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'toVirtualFile' @ [125:67] ==> public fun File.toVirtualFile(): VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'File' @ [126:44] ==> public constructor File(p0: (String..String?), p1: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'MOCK_LIBRARY_SOURCES' @ [126:49] ==> private val MOCK_LIBRARY_SOURCES: String defined in org.jetbrains.kotlin.idea.filters in file AbstractKotlinExceptionFilterTest.kt[PropertyDescriptorImpl]

'expectedFileName' @ [126:71] ==> val expectedFileName: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'toVirtualFile' @ [126:89] ==> public fun File.toVirtualFile(): VirtualFile? defined in org.jetbrains.kotlin.idea.refactoring[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [127:50] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'expectedFileName' @ [127:94] ==> val expectedFileName: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'!!' @ [128:34] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Int?): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Int

'getPrefixedInt' @ [128:56] ==> @Nullable public open fun getPrefixedInt(p0: (String..String?), p1: (String..String?)): Int? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'fileText' @ [128:71] ==> val fileText: (String..String?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'!!' @ [131:24] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Document?): Document[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Document

'getInstance' @ [131:44] ==> @NotNull public open fun getInstance(): FileDocumentManager defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'getDocument' @ [131:58] ==> @Nullable public abstract fun getDocument(@NotNull p0: VirtualFile): Document? defined in com.intellij.openapi.fileEditor.FileDocumentManager[JavaMethodDescriptor]

'expectedVirtualFile' @ [131:70] ==> val expectedVirtualFile: VirtualFile defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'document' @ [132:30] ==> val document: Document defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'getLineStartOffset' @ [132:39] ==> @Contract public abstract fun getLineStartOffset(p0: Int): Int defined in com.intellij.openapi.editor.Document[JavaMethodDescriptor]

'expectedLineNumber' @ [132:58] ==> val expectedLineNumber: Int defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'assertEquals' @ [135:9] ==> public open fun assertEquals(p0: (String..String?), p1: (String..String?), p2: (String..String?)): Unit defined in org.jetbrains.kotlin.idea.test.KotlinCodeInsightTestCase[JavaMethodDescriptor]

'stackTraceElement' @ [135:46] ==> val stackTraceElement: (StackTraceElement..StackTraceElement?) defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'expectedFileName' @ [135:66] ==> val expectedFileName: String defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'expectedOffset' @ [135:91] ==> val expectedOffset: Int defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'descriptor' @ [135:107] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'file' @ [135:118] ==> public final val OpenFileDescriptor.file: VirtualFile[MyPropertyDescriptor]

'name' @ [135:123] ==> public final val VirtualFile.name: String[MyPropertyDescriptor]

'descriptor' @ [135:136] ==> val descriptor: OpenFileDescriptor defined in org.jetbrains.kotlin.idea.filters.AbstractKotlinExceptionFilterTest.doTest[LocalVariableDescriptor]

'offset' @ [135:147] ==> public final val OpenFileDescriptor.offset: Int[MyPropertyDescriptor]

