'!!' @ [73:35] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFileSystem?): VirtualFileSystem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFileSystem

'getInstance' @ [73:54] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'getFileSystem' @ [73:68] ==> public abstract fun getFileSystem(p0: (String..String?)): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'FILE_PROTOCOL' @ [73:102] ==> public const final val FILE_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'!!' @ [74:33] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: VirtualFileSystem?): VirtualFileSystem[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> VirtualFileSystem

'getInstance' @ [74:52] ==> @NotNull public open fun getInstance(): VirtualFileManager defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'getFileSystem' @ [74:66] ==> public abstract fun getFileSystem(p0: (String..String?)): (VirtualFileSystem..VirtualFileSystem?) defined in com.intellij.openapi.vfs.VirtualFileManager[JavaMethodDescriptor]

'JAR_PROTOCOL' @ [74:100] ==> public const final val JAR_PROTOCOL: String defined in com.intellij.openapi.vfs.StandardFileSystems[JavaPropertyDescriptor]

'getService' @ [77:74] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(JavacWrapper..JavacWrapper?)>): (JavacWrapper..JavacWrapper?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.javac.JavacWrapper..org.jetbrains.kotlin.javac.JavacWrapper?)

'project' @ [77:85] ==> value-parameter project: Project defined in org.jetbrains.kotlin.javac.JavacWrapper.Companion.getInstance[ValueParameterDescriptorImpl]

'JavacWrapper' @ [77:94] ==> public companion object defined in org.jetbrains.kotlin.javac.JavacWrapper[FakeCallableDescriptorForObject]

'java' @ [77:114] ==> public val <T> KClass<JavacWrapper>.java: Class<JavacWrapper> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavacWrapper

'findClassInSymbols' @ [81:13] ==> private final fun findClassInSymbols(fqName: String): SymbolBasedClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [81:32] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.createCommonClassifierType[ValueParameterDescriptorImpl]

'let' @ [81:41] ==> @InlineOnly public inline fun <T, R> SymbolBasedClass.let(block: (SymbolBasedClass) -> SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>): SymbolBasedClassifierType<(TypeMirror..TypeMirror?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass
    <R> -> SymbolBasedClassifierType<(javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)>

'SymbolBasedClassifierType' @ [82:17] ==> public constructor SymbolBasedClassifierType<out T : TypeMirror>(typeMirror: (TypeMirror..TypeMirror?), javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClassifierType[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : TypeMirror> -> (javax.lang.model.type.TypeMirror..javax.lang.model.type.TypeMirror?)

'it' @ [82:43] ==> value-parameter it: SymbolBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.createCommonClassifierType.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [82:46] ==> public final val element: TypeElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'asType' @ [82:54] ==> public abstract fun asType(): (TypeMirror..TypeMirror?) defined in javax.lang.model.element.TypeElement[JavaMethodDescriptor]

'this' @ [82:64] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'getValue' @ [85:29] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'createCommonClassifierType' @ [86:9] ==> private final fun createCommonClassifierType(fqName: String): SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'JAVA_LANG_OBJECT' @ [86:53] ==> @NonNls public const final val JAVA_LANG_OBJECT: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'getValue' @ [89:27] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'createCommonClassifierType' @ [90:9] ==> private final fun createCommonClassifierType(fqName: String): SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'JAVA_LANG_ENUM' @ [90:53] ==> @NonNls public const final val JAVA_LANG_ENUM: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'getValue' @ [93:44] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'createCommonClassifierType' @ [94:9] ==> private final fun createCommonClassifierType(fqName: String): SymbolBasedClassifierType<(TypeMirror..TypeMirror?)>? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'JAVA_LANG_ANNOTATION_ANNOTATION' @ [94:53] ==> @NonNls public const final val JAVA_LANG_ANNOTATION_ANNOTATION: String defined in com.intellij.psi.CommonClassNames[JavaPropertyDescriptor]

'arguments' @ [98:9] ==> value-parameter arguments: Array<String>? defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>[ValueParameterDescriptorImpl]

'toList' @ [98:20] ==> public fun <T> Array<out String>.toList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'let' @ [98:30] ==> @InlineOnly public inline fun <T, R> List<String>.let(block: (List<String>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<String>
    <R> -> Unit

'JavacOptionsMapper' @ [98:36] ==> public object JavacOptionsMapper defined in org.jetbrains.kotlin.javac in file JavacOptionsMapper.kt[FakeCallableDescriptorForObject]

'map' @ [98:55] ==> public final fun map(options: Options, arguments: List<String>): Unit defined in org.jetbrains.kotlin.javac.JavacOptionsMapper[SimpleFunctionDescriptorImpl]

'instance' @ [98:67] ==> public open fun instance(p0: (Context..Context?)): (Options..Options?) defined in com.sun.tools.javac.util.Options[JavaMethodDescriptor]

'context' @ [98:76] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'it' @ [98:86] ==> value-parameter it: List<String> defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>.<anonymous>[ValueParameterDescriptorImpl]

'JavaCompiler' @ [101:34] ==> public constructor JavaCompiler(p0: (Context..Context?)) defined in com.sun.tools.javac.main.JavaCompiler[JavaClassConstructorDescriptor]

'context' @ [101:47] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'compilationUnits' @ [102:69] ==> private final val compilationUnits: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'context' @ [105:31] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'java' @ [105:62] ==> public val <T> KClass<JavaFileManager>.java: Class<JavaFileManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaFileManager

'fileManager' @ [109:9] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'setSymbolFileEnabled' @ [109:21] ==> public open fun setSymbolFileEnabled(p0: Boolean): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'fileManager' @ [110:9] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'setLocation' @ [110:21] ==> public open fun setLocation(p0: (JavaFileManager.Location..JavaFileManager.Location?), p1: (MutableIterable<(File..File?)>..Iterable<(File..File?)>?)): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'CLASS_PATH' @ [110:50] ==> enum entry CLASS_PATH defined in javax.tools.StandardLocation[FakeCallableDescriptorForObject]

'jvmClasspathRoots' @ [110:62] ==> value-parameter jvmClasspathRoots: List<File> defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>[ValueParameterDescriptorImpl]

'instance' @ [113:31] ==> public open fun instance(p0: (Context..Context?)): (Names..Names?) defined in com.sun.tools.javac.util.Names[JavaMethodDescriptor]

'context' @ [113:40] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'instance' @ [114:34] ==> public open fun instance(p0: (Context..Context?)): (Symtab..Symtab?) defined in com.sun.tools.javac.code.Symtab[JavaMethodDescriptor]

'context' @ [114:43] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'instance' @ [115:36] ==> public open fun instance(p0: (Context..Context?)): (JavacTrees..JavacTrees?) defined in com.sun.tools.javac.api.JavacTrees[JavaMethodDescriptor]

'context' @ [115:45] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'instance' @ [116:42] ==> public open fun instance(p0: (Context..Context?)): (JavacElements..JavacElements?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'context' @ [116:51] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'instance' @ [117:36] ==> public open fun instance(p0: (Context..Context?)): (JavacTypes..JavacTypes?) defined in com.sun.tools.javac.model.JavacTypes[JavaMethodDescriptor]

'context' @ [117:45] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fileManager' @ [118:31] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getJavaFileObjectsFromFiles' @ [118:43] ==> public open fun getJavaFileObjectsFromFiles(p0: (MutableIterable<(File..File?)>..Iterable<(File..File?)>?)): (MutableIterable<(JavaFileObject..JavaFileObject?)>..Iterable<(JavaFileObject..JavaFileObject?)>?) defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'javaFiles' @ [118:71] ==> value-parameter javaFiles: Collection<File> defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>[ValueParameterDescriptorImpl]

'toJavacList' @ [118:82] ==> private final inline fun <reified T> Iterable<(JavaFileObject..JavaFileObject?)>.toJavacList(): (List<(JavaFileObject..JavaFileObject?)>..List<(JavaFileObject..JavaFileObject?)>?) defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> (javax.tools.JavaFileObject..javax.tools.JavaFileObject?)

'fileObjects' @ [119:73] ==> private final val fileObjects: (List<(JavaFileObject..JavaFileObject?)>..List<(JavaFileObject..JavaFileObject?)>?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'map' @ [119:85] ==> public inline fun <T, R> Iterable<(JavaFileObject..JavaFileObject?)>.map(transform: ((JavaFileObject..JavaFileObject?)) -> (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)): List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.tools.JavaFileObject..javax.tools.JavaFileObject?)
    <R> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'javac' @ [119:89] ==> private final val javac: <no name provided> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'parse' @ [119:96] ==> public open fun parse(p0: (JavaFileObject..JavaFileObject?)): (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javac.<no name provided>[JavaMethodDescriptor]

'toJavacList' @ [119:103] ==> private final inline fun <reified T> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.toJavacList(): (List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>..List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>?) defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'compilationUnits' @ [121:31] ==> private final val compilationUnits: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'flatMap' @ [122:14] ==> public inline fun <T, R> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.flatMap(transform: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> Iterable<TreeBasedClass>): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)
    <R> -> TreeBasedClass

'unit' @ [123:17] ==> value-parameter unit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClasses.<anonymous>[ValueParameterDescriptorImpl]

'typeDecls' @ [123:22] ==> public final val JCTree.JCCompilationUnit.typeDecls: (List<(JCTree..JCTree?)>..List<(JCTree..JCTree?)>?)[MyPropertyDescriptor]

'flatMap' @ [123:32] ==> public inline fun <T, R> Iterable<(JCTree..JCTree?)>.flatMap(transform: ((JCTree..JCTree?)) -> Iterable<TreeBasedClass>): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)
    <R> -> TreeBasedClass

'TreeBasedClass' @ [124:21] ==> public constructor TreeBasedClass(tree: JCTree.JCClassDecl, treePath: TreePath, javac: JavacWrapper, file: JavaFileObject) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[ClassConstructorDescriptorImpl]

'classDecl' @ [124:36] ==> value-parameter classDecl: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'trees' @ [125:36] ==> private final val trees: (JavacTrees..JavacTrees?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPath' @ [125:42] ==> public open fun getPath(p0: (CompilationUnitTree..CompilationUnitTree?), p1: (Tree..Tree?)): (TreePath..TreePath?) defined in com.sun.tools.javac.api.JavacTrees[JavaMethodDescriptor]

'unit' @ [125:50] ==> value-parameter unit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClasses.<anonymous>[ValueParameterDescriptorImpl]

'classDecl' @ [125:56] ==> value-parameter classDecl: (JCTree..JCTree?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClasses.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [126:36] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'unit' @ [127:36] ==> value-parameter unit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClasses.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [127:41] ==> public final val JCTree.JCCompilationUnit.sourceFile: (JavaFileObject..JavaFileObject?)[MyPropertyDescriptor]

'withInnerClasses' @ [127:53] ==> private final fun TreeBasedClass.withInnerClasses(): List<TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'associateBy' @ [130:14] ==> public inline fun <T, K> Iterable<TreeBasedClass>.associateBy(keySelector: (TreeBasedClass) -> FqName?): Map<FqName?, TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <K> -> FqName?

'fqName' @ [130:37] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'javaClasses' @ [133:13] ==> private final val javaClasses: Map<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'values' @ [133:25] ==> public abstract val values: Collection<TreeBasedClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'associateBy' @ [133:32] ==> public inline fun <T, K> Iterable<TreeBasedClass>.associateBy(keySelector: (TreeBasedClass) -> ClassId?): Map<ClassId?, TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <K> -> ClassId?

'it' @ [133:46] ==> value-parameter it: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.javaClassesAssociatedByClassId.<anonymous>[ValueParameterDescriptorImpl]

'computeClassId' @ [133:49] ==> public fun JavaClass.computeClassId(): ClassId? defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'compilationUnits' @ [135:32] ==> private final val compilationUnits: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'mapNotNullTo' @ [136:14] ==> public inline fun <T, R : Any, C : MutableCollection<in TreeBasedPackage>> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.mapNotNullTo(destination: HashSet<TreeBasedPackage> /* = HashSet<TreeBasedPackage> */, transform: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> TreeBasedPackage?): HashSet<TreeBasedPackage> /* = HashSet<TreeBasedPackage> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)
    <R : Any> -> TreeBasedPackage
    <C : MutableCollection<in R>> -> HashSet<TreeBasedPackage>

'hashSetOf' @ [136:27] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<TreeBasedPackage> /* = HashSet<TreeBasedPackage> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedPackage

'unit' @ [137:17] ==> value-parameter unit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaPackages.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [137:22] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'toString' @ [137:35] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCExpression[JavaMethodDescriptor]

'let' @ [137:47] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> TreeBasedPackage): TreeBasedPackage defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> TreeBasedPackage

'TreeBasedPackage' @ [138:21] ==> public constructor TreeBasedPackage(name: String, javac: JavacWrapper, file: JavaFileObject) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPackage[ClassConstructorDescriptorImpl]

'packageName' @ [138:38] ==> value-parameter packageName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.javaPackages.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [138:51] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'unit' @ [138:57] ==> value-parameter unit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.javaPackages.<anonymous>[ValueParameterDescriptorImpl]

'sourcefile' @ [138:62] ==> public final var sourcefile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.tree.JCTree.JCCompilationUnit[JavaPropertyDescriptor]

'associateBy' @ [141:14] ==> public inline fun <T, K> Iterable<TreeBasedPackage>.associateBy(keySelector: (TreeBasedPackage) -> FqName): Map<FqName, TreeBasedPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedPackage
    <K> -> FqName

'TreeBasedPackage' @ [141:26] ==> public constructor TreeBasedPackage(name: String, javac: JavacWrapper, file: JavaFileObject) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPackage[ClassConstructorDescriptorImpl]

'fqName' @ [141:44] ==> public open val fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPackage[PropertyDescriptorImpl]

'compilationUnits' @ [143:44] ==> private final val compilationUnits: List<JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'filter' @ [144:14] ==> public inline fun <T> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.filter(predicate: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> Boolean): List<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)

'it' @ [145:17] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'sourceFile' @ [145:20] ==> public final val JCTree.JCCompilationUnit.sourceFile: (JavaFileObject..JavaFileObject?)[MyPropertyDescriptor]

'isNameCompatible' @ [145:31] ==> public abstract fun isNameCompatible(p0: (String..String?), p1: (JavaFileObject.Kind..JavaFileObject.Kind?)): Boolean defined in javax.tools.JavaFileObject[JavaMethodDescriptor]

'SOURCE' @ [145:84] ==> enum entry SOURCE defined in javax.tools.JavaFileObject.Kind[FakeCallableDescriptorForObject]

'it' @ [146:17] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [146:20] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'associateBy' @ [147:15] ==> public inline fun <T, K, V> Iterable<(JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)>.associateBy(keySelector: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> FqName, valueTransform: ((JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?)) -> List<TreeBasedAnnotation>): Map<FqName, List<TreeBasedAnnotation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCCompilationUnit..com.sun.tools.javac.tree.JCTree.JCCompilationUnit?)
    <K> -> FqName
    <V> -> List<TreeBasedAnnotation>

'FqName' @ [147:29] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'it' @ [147:36] ==> value-parameter it: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'packageName' @ [147:39] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'toString' @ [147:53] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCExpression[JavaMethodDescriptor]

'compilationUnit' @ [148:17] ==> value-parameter compilationUnit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'packageAnnotations' @ [148:33] ==> public final var packageAnnotations: (List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>..List<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>?) defined in com.sun.tools.javac.tree.JCTree.JCCompilationUnit[JavaPropertyDescriptor]

'map' @ [148:52] ==> public inline fun <T, R> Iterable<(JCTree.JCAnnotation..JCTree.JCAnnotation?)>.map(transform: ((JCTree.JCAnnotation..JCTree.JCAnnotation?)) -> TreeBasedAnnotation): List<TreeBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCAnnotation..com.sun.tools.javac.tree.JCTree.JCAnnotation?)
    <R> -> TreeBasedAnnotation

'TreeBasedAnnotation' @ [148:58] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, compilationUnit: CompilationUnitTree, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [148:78] ==> value-parameter it: (JCTree.JCAnnotation..JCTree.JCAnnotation?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'compilationUnit' @ [148:82] ==> value-parameter compilationUnit: (JCTree.JCCompilationUnit..JCTree.JCCompilationUnit?) defined in org.jetbrains.kotlin.javac.JavacWrapper.packageSourceAnnotations.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [148:99] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'KotlinClassifiersCache' @ [151:42] ==> public constructor KotlinClassifiersCache(sourceFiles: Collection<KtFile>, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[ClassConstructorDescriptorImpl]

'if (javaFiles.isNotEmpty()) kotlinFiles else emptyList()' @ [151:65] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<KtFile>, elseBranch: Collection<KtFile>): Collection<KtFile>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<KtFile>

'javaFiles' @ [151:69] ==> value-parameter javaFiles: Collection<File> defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [151:79] ==> @InlineOnly public inline fun <T> Collection<File>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'kotlinFiles' @ [151:93] ==> value-parameter kotlinFiles: Collection<KtFile> defined in org.jetbrains.kotlin.javac.JavacWrapper.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [151:110] ==> public fun <T> emptyList(): List<KtFile> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtFile

'this' @ [151:123] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'TreePathResolverCache' @ [152:41] ==> public constructor TreePathResolverCache(javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[ClassConstructorDescriptorImpl]

'this' @ [152:63] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'hashMapOf' @ [153:43] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, SymbolBasedClass?> /* = HashMap<String, SymbolBasedClass?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> SymbolBasedClass?

'hashMapOf' @ [154:44] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, SymbolBasedPackage?> /* = HashMap<String, SymbolBasedPackage?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> SymbolBasedPackage?

'with' @ [156:50] ==> @InlineOnly public inline fun <T, R> with(receiver: <no name provided>, block: <no name provided>.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>
    <R> -> Boolean

'javac' @ [156:55] ==> private final val javac: <no name provided> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'errorCount' @ [157:13] ==> public open fun errorCount(): Int defined in org.jetbrains.kotlin.javac.JavacWrapper.javac.<no name provided>[JavaMethodDescriptor]

'fileObjects' @ [159:31] ==> private final val fileObjects: (List<(JavaFileObject..JavaFileObject?)>..List<(JavaFileObject..JavaFileObject?)>?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'length' @ [159:43] ==> public open fun length(): Int defined in com.sun.tools.javac.util.List[JavaMethodDescriptor]

'javaFilesNumber' @ [160:13] ==> val javaFilesNumber: Int defined in org.jetbrains.kotlin.javac.JavacWrapper.compile.<anonymous>[LocalVariableDescriptor]

'fileManager' @ [162:9] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'setClassPathForCompilation' @ [162:21] ==> private final fun JavacFileManager.setClassPathForCompilation(outDir: File?): JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'outDir' @ [162:48] ==> value-parameter outDir: File? = ... defined in org.jetbrains.kotlin.javac.JavacWrapper.compile[ValueParameterDescriptorImpl]

'context' @ [163:9] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'get' @ [163:17] ==> public open operator fun <T : (Any..Any?)> get(p0: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?)): (PrintWriter..PrintWriter?) defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.io.PrintWriter..java.io.PrintWriter?)

'outKey' @ [163:25] ==> public final val outKey: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?) defined in com.sun.tools.javac.util.Log[JavaPropertyDescriptor]

'println' @ [163:34] ==> public open fun println(p0: (String..String?)): Unit defined in java.io.PrintWriter[JavaMethodDescriptor]

'+' @ [163:42] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'javaFilesNumber' @ [163:54] ==> val javaFilesNumber: Int defined in org.jetbrains.kotlin.javac.JavacWrapper.compile.<anonymous>[LocalVariableDescriptor]

'fileManager' @ [164:50] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getLocation' @ [164:62] ==> public open fun getLocation(p0: (JavaFileManager.Location..JavaFileManager.Location?)): (MutableIterable<(File..File?)>..Iterable<(File..File?)>?) defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'CLASS_OUTPUT' @ [164:91] ==> enum entry CLASS_OUTPUT defined in javax.tools.StandardLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [164:106] ==> public fun <T> Iterable<(File..File?)>.firstOrNull(): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'path' @ [164:121] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'compile' @ [165:9] ==> public open fun compile(p0: (List<(JavaFileObject..JavaFileObject?)>..List<(JavaFileObject..JavaFileObject?)>?)): Unit defined in org.jetbrains.kotlin.javac.JavacWrapper.javac.<no name provided>[JavaMethodDescriptor]

'fileObjects' @ [165:17] ==> private final val fileObjects: (List<(JavaFileObject..JavaFileObject?)>..List<(JavaFileObject..JavaFileObject?)>?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'errorCount' @ [166:9] ==> public open fun errorCount(): Int defined in org.jetbrains.kotlin.javac.JavacWrapper.javac.<no name provided>[JavaMethodDescriptor]

'fileManager' @ [170:9] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'close' @ [170:21] ==> public open fun close(): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'javac' @ [171:9] ==> private final val javac: <no name provided> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'close' @ [171:15] ==> public open fun close(): Unit defined in org.jetbrains.kotlin.javac.JavacWrapper.javac.<no name provided>[JavaMethodDescriptor]

'EverythingGlobalScope' @ [174:62] ==> public constructor EverythingGlobalScope() defined in com.intellij.psi.search.EverythingGlobalScope[JavaClassConstructorDescriptor]

'javaClasses' @ [175:9] ==> private final val javaClasses: Map<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [175:21] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'let' @ [175:30] ==> @InlineOnly public inline fun <T, R> TreeBasedClass.let(block: (TreeBasedClass) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <R> -> Unit?

'javaClass' @ [176:13] ==> value-parameter javaClass: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [176:23] ==> public open val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'let' @ [176:36] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'it' @ [176:46] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [176:52] ==> value-parameter scope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'javaClass' @ [176:66] ==> value-parameter javaClass: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'findClassInSymbols' @ [179:9] ==> private final fun findClassInSymbols(fqName: String): SymbolBasedClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [179:28] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'asString' @ [179:35] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [179:48] ==> @InlineOnly public inline fun <T, R> SymbolBasedClass.let(block: (SymbolBasedClass) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass
    <R> -> Unit?

'javaClass' @ [180:13] ==> value-parameter javaClass: SymbolBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [180:23] ==> public open val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'let' @ [180:36] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'it' @ [180:46] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [180:52] ==> value-parameter scope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'javaClass' @ [180:66] ==> value-parameter javaClass: SymbolBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'EverythingGlobalScope' @ [186:64] ==> public constructor EverythingGlobalScope() defined in com.intellij.psi.search.EverythingGlobalScope[JavaClassConstructorDescriptor]

'javaClassesAssociatedByClassId' @ [187:9] ==> private final val javaClassesAssociatedByClassId: Map<ClassId?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'classId' @ [187:40] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'let' @ [187:50] ==> @InlineOnly public inline fun <T, R> TreeBasedClass.let(block: (TreeBasedClass) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <R> -> Unit?

'javaClass' @ [188:13] ==> value-parameter javaClass: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [188:23] ==> public open val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'let' @ [188:36] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'it' @ [188:46] ==> value-parameter it: VirtualFile defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [188:52] ==> value-parameter scope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'javaClass' @ [188:66] ==> value-parameter javaClass: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'findPackageInSymbols' @ [191:9] ==> private final fun findPackageInSymbols(fqName: String): SymbolBasedPackage? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'classId' @ [191:30] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'packageFqName' @ [191:38] ==> public final val ClassId.packageFqName: FqName[MyPropertyDescriptor]

'asString' @ [191:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [191:65] ==> @InlineOnly public inline fun <T, R> SymbolBasedPackage.let(block: (SymbolBasedPackage) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedPackage
    <R> -> Unit?

'it' @ [192:14] ==> value-parameter it: SymbolBasedPackage defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'element' @ [192:17] ==> public final val element: PackageElement defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[PropertyDescriptorImpl]

'findClass' @ [192:50] ==> private final fun Symbol.PackageSymbol.findClass(name: String): SymbolBasedClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'classId' @ [192:60] ==> value-parameter classId: ClassId defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'relativeClassName' @ [192:68] ==> public final val ClassId.relativeClassName: FqName[MyPropertyDescriptor]

'asString' @ [192:86] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [192:99] ==> @InlineOnly public inline fun <T, R> SymbolBasedClass.let(block: (SymbolBasedClass) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass
    <R> -> Unit?

'javaClass' @ [193:17] ==> value-parameter javaClass: SymbolBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [193:27] ==> public open val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[PropertyDescriptorImpl]

'let' @ [193:40] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'file' @ [194:25] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [194:33] ==> value-parameter scope: GlobalSearchScope = ... defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'javaClass' @ [194:47] ==> value-parameter javaClass: SymbolBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaPackages' @ [204:9] ==> private final val javaPackages: Map<FqName, TreeBasedPackage> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [204:22] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage[ValueParameterDescriptorImpl]

'let' @ [204:31] ==> @InlineOnly public inline fun <T, R> TreeBasedPackage.let(block: (TreeBasedPackage) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedPackage
    <R> -> Unit?

'javaPackage' @ [205:13] ==> value-parameter javaPackage: TreeBasedPackage defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage.<anonymous>[ValueParameterDescriptorImpl]

'virtualFile' @ [205:25] ==> public final val virtualFile: VirtualFile? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedPackage[PropertyDescriptorImpl]

'let' @ [205:38] ==> @InlineOnly public inline fun <T, R> VirtualFile.let(block: (VirtualFile) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VirtualFile
    <R> -> Unit

'file' @ [206:21] ==> value-parameter file: VirtualFile defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'scope' @ [206:29] ==> value-parameter scope: GlobalSearchScope defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage[ValueParameterDescriptorImpl]

'javaPackage' @ [206:43] ==> value-parameter javaPackage: TreeBasedPackage defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage.<anonymous>[ValueParameterDescriptorImpl]

'findPackageInSymbols' @ [210:16] ==> private final fun findPackageInSymbols(fqName: String): SymbolBasedPackage? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [210:37] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackage[ValueParameterDescriptorImpl]

'asString' @ [210:44] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'symbols' @ [214:13] ==> private final val symbols: (Symtab..Symtab?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'packages' @ [214:21] ==> public final val packages: (MutableMap<(Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)>..Map<(Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)>?) defined in com.sun.tools.javac.code.Symtab[JavaPropertyDescriptor]

'filterKeys' @ [215:22] ==> public inline fun <K, V> Map<out (Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)>.filterKeys(predicate: ((Name..Name?)) -> Boolean): Map<(Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.sun.tools.javac.util.Name..com.sun.tools.javac.util.Name?)
    <V> -> (com.sun.tools.javac.code.Symbol.PackageSymbol..com.sun.tools.javac.code.Symbol.PackageSymbol?)

'it' @ [215:35] ==> value-parameter it: (Name..Name?) defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [215:38] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'startsWith' @ [215:49] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'fqName' @ [215:62] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages[ValueParameterDescriptorImpl]

'map' @ [216:22] ==> public inline fun <K, V, R> Map<out (Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)>.map(transform: (Map.Entry<(Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)>) -> SymbolBasedPackage): List<SymbolBasedPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (com.sun.tools.javac.util.Name..com.sun.tools.javac.util.Name?)
    <V> -> (com.sun.tools.javac.code.Symbol.PackageSymbol..com.sun.tools.javac.code.Symbol.PackageSymbol?)
    <R> -> SymbolBasedPackage

'SymbolBasedPackage' @ [216:28] ==> public constructor SymbolBasedPackage(element: PackageElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[ClassConstructorDescriptorImpl]

'it' @ [216:47] ==> value-parameter it: Map.Entry<(Name..Name?), (Symbol.PackageSymbol..Symbol.PackageSymbol?)> defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [216:50] ==> public abstract val value: (Symbol.PackageSymbol..Symbol.PackageSymbol?) defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'this' @ [216:57] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'javaPackages' @ [217:13] ==> private final val javaPackages: Map<FqName, TreeBasedPackage> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'filterKeys' @ [218:22] ==> public inline fun <K, V> Map<out FqName, TreeBasedPackage>.filterKeys(predicate: (FqName) -> Boolean): Map<FqName, TreeBasedPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> TreeBasedPackage

'it' @ [218:35] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'isSubpackageOf' @ [218:38] ==> public fun FqName.isSubpackageOf(packageName: FqName): Boolean defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'fqName' @ [218:53] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages[ValueParameterDescriptorImpl]

'it' @ [218:64] ==> value-parameter it: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [218:70] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages[ValueParameterDescriptorImpl]

'map' @ [219:22] ==> public inline fun <K, V, R> Map<out FqName, TreeBasedPackage>.map(transform: (Map.Entry<FqName, TreeBasedPackage>) -> TreeBasedPackage): List<TreeBasedPackage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName
    <V> -> TreeBasedPackage
    <R> -> TreeBasedPackage

'it' @ [219:28] ==> value-parameter it: Map.Entry<FqName, TreeBasedPackage> defined in org.jetbrains.kotlin.javac.JavacWrapper.findSubPackages.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [219:31] ==> public abstract val value: TreeBasedPackage defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'packageSourceAnnotations' @ [222:13] ==> private final val packageSourceAnnotations: Map<FqName, List<TreeBasedAnnotation>> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [222:38] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.getPackageAnnotationsFromSources[ValueParameterDescriptorImpl]

'emptyList' @ [222:49] ==> public fun <T> emptyList(): List<JavaAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'javaClasses' @ [225:13] ==> private final val javaClasses: Map<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'filterKeys' @ [226:22] ==> public inline fun <K, V> Map<out FqName?, TreeBasedClass>.filterKeys(predicate: (FqName?) -> Boolean): Map<FqName?, TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName?
    <V> -> TreeBasedClass

'it' @ [226:35] ==> value-parameter it: FqName? defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage.<anonymous>[ValueParameterDescriptorImpl]

'parentOrNull' @ [226:39] ==> public fun FqName.parentOrNull(): FqName? defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'fqName' @ [226:57] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage[ValueParameterDescriptorImpl]

'flatMap' @ [227:22] ==> public inline fun <K, V, R> Map<out FqName?, TreeBasedClass>.flatMap(transform: (Map.Entry<FqName?, TreeBasedClass>) -> Iterable<TreeBasedClass>): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName?
    <V> -> TreeBasedClass
    <R> -> TreeBasedClass

'it' @ [227:32] ==> value-parameter it: Map.Entry<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [227:35] ==> public abstract val value: TreeBasedClass defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'withInnerClasses' @ [227:41] ==> private final fun TreeBasedClass.withInnerClasses(): List<TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'elements' @ [228:13] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPackageElement' @ [228:22] ==> public open fun getPackageElement(p0: (CharSequence..CharSequence?)): (Symbol.PackageSymbol..Symbol.PackageSymbol?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'fqName' @ [228:40] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage[ValueParameterDescriptorImpl]

'asString' @ [228:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'members' @ [229:23] ==> public open fun members(): (Scope..Scope?) defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaMethodDescriptor]

'elements' @ [230:23] ==> public final val Scope.elements: (MutableIterable<(Symbol..Symbol?)>..Iterable<(Symbol..Symbol?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [231:23] ==> public fun <R> Iterable<*>.filterIsInstance(klass: Class<Symbol.ClassSymbol>): List<Symbol.ClassSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <R> -> ClassSymbol

'java' @ [231:66] ==> public val <T> KClass<Symbol.ClassSymbol>.java: Class<Symbol.ClassSymbol> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClassSymbol

'map' @ [232:23] ==> public inline fun <T, R> Iterable<Symbol.ClassSymbol>.map(transform: (Symbol.ClassSymbol) -> SymbolBasedClass): List<SymbolBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'SymbolBasedClass' @ [232:29] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'it' @ [232:46] ==> value-parameter it: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [232:50] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'it' @ [232:56] ==> value-parameter it: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassesFromPackage.<anonymous>[ValueParameterDescriptorImpl]

'classfile' @ [232:59] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'orEmpty' @ [233:22] ==> @InlineOnly public inline fun <T> List<SymbolBasedClass>?.orEmpty(): List<SymbolBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass

'javaClasses' @ [236:13] ==> private final val javaClasses: Map<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'filterKeys' @ [236:25] ==> public inline fun <K, V> Map<out FqName?, TreeBasedClass>.filterKeys(predicate: (FqName?) -> Boolean): Map<FqName?, TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName?
    <V> -> TreeBasedClass

'it' @ [236:38] ==> value-parameter it: FqName? defined in org.jetbrains.kotlin.javac.JavacWrapper.knownClassNamesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'parentOrNull' @ [236:42] ==> public fun FqName.parentOrNull(): FqName? defined in org.jetbrains.kotlin.name[DeserializedSimpleFunctionDescriptor]

'fqName' @ [236:60] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.knownClassNamesInPackage[ValueParameterDescriptorImpl]

'mapTo' @ [237:22] ==> public inline fun <K, V, R, C : MutableCollection<in String>> Map<out FqName?, TreeBasedClass>.mapTo(destination: HashSet<String> /* = HashSet<String> */, transform: (Map.Entry<FqName?, TreeBasedClass>) -> String): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FqName?
    <V> -> TreeBasedClass
    <R> -> String
    <C : MutableCollection<in R>> -> HashSet<String>

'hashSetOf' @ [237:28] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'it' @ [237:43] ==> value-parameter it: Map.Entry<FqName?, TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper.knownClassNamesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [237:46] ==> public abstract val value: TreeBasedClass defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'name' @ [237:52] ==> public open val name: Name defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'asString' @ [237:57] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'elements' @ [238:13] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPackageElement' @ [238:22] ==> public open fun getPackageElement(p0: (CharSequence..CharSequence?)): (Symbol.PackageSymbol..Symbol.PackageSymbol?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'fqName' @ [238:40] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.knownClassNamesInPackage[ValueParameterDescriptorImpl]

'asString' @ [238:47] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'members_field' @ [239:23] ==> public final var members_field: (Scope..Scope?) defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaPropertyDescriptor]

'elements' @ [240:23] ==> public final val Scope.elements: (MutableIterable<(Symbol..Symbol?)>..Iterable<(Symbol..Symbol?)>?)[MyPropertyDescriptor]

'filterIsInstance' @ [241:23] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Symbol.ClassSymbol> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassSymbol

'map' @ [242:23] ==> public inline fun <T, R> Iterable<Symbol.ClassSymbol>.map(transform: (Symbol.ClassSymbol) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> String

'it' @ [242:29] ==> value-parameter it: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.knownClassNamesInPackage.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [242:32] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'toString' @ [242:37] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'orEmpty' @ [243:22] ==> @InlineOnly public inline fun <T> List<String>?.orEmpty(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'trees' @ [246:13] ==> private final val trees: (JavacTrees..JavacTrees?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPath' @ [246:19] ==> public open fun getPath(p0: (CompilationUnitTree..CompilationUnitTree?), p1: (Tree..Tree?)): (TreePath..TreePath?) defined in com.sun.tools.javac.api.JavacTrees[JavaMethodDescriptor]

'compilationUnit' @ [246:27] ==> value-parameter compilationUnit: CompilationUnitTree defined in org.jetbrains.kotlin.javac.JavacWrapper.getTreePath[ValueParameterDescriptorImpl]

'tree' @ [246:44] ==> value-parameter tree: JCTree defined in org.jetbrains.kotlin.javac.JavacWrapper.getTreePath[ValueParameterDescriptorImpl]

'kotlinClassifiersCache' @ [249:13] ==> private final val kotlinClassifiersCache: KotlinClassifiersCache defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getKotlinClassifier' @ [249:36] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.KotlinClassifiersCache[SimpleFunctionDescriptorImpl]

'fqName' @ [249:56] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.JavacWrapper.getKotlinClassifier[ValueParameterDescriptorImpl]

'elements' @ [251:42] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'isDeprecated' @ [251:51] ==> public open fun isDeprecated(p0: (Element..Element?)): Boolean defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'element' @ [251:64] ==> value-parameter element: Element defined in org.jetbrains.kotlin.javac.JavacWrapper.isDeprecated[ValueParameterDescriptorImpl]

'isDeprecated' @ [253:48] ==> public final fun isDeprecated(element: Element): Boolean defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'types' @ [253:61] ==> private final val types: (JavacTypes..JavacTypes?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'asElement' @ [253:67] ==> public open fun asElement(p0: (TypeMirror..TypeMirror?)): (Element..Element?) defined in com.sun.tools.javac.model.JavacTypes[JavaMethodDescriptor]

'typeMirror' @ [253:77] ==> value-parameter typeMirror: TypeMirror defined in org.jetbrains.kotlin.javac.JavacWrapper.isDeprecated[ValueParameterDescriptorImpl]

'treePathResolverCache' @ [256:13] ==> private final val treePathResolverCache: TreePathResolverCache defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'resolve' @ [256:35] ==> public final fun resolve(treePath: TreePath): JavaClassifier? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'treePath' @ [256:43] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.JavacWrapper.resolve[ValueParameterDescriptorImpl]

'javaFileObject' @ [259:13] ==> value-parameter javaFileObject: JavaFileObject defined in org.jetbrains.kotlin.javac.JavacWrapper.toVirtualFile[ValueParameterDescriptorImpl]

'toUri' @ [259:28] ==> public abstract fun toUri(): (URI..URI?) defined in javax.tools.JavaFileObject[JavaMethodDescriptor]

'let' @ [259:36] ==> @InlineOnly public inline fun <T, R> (URI..URI?).let(block: ((URI..URI?)) -> VirtualFile?): VirtualFile? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.net.URI..java.net.URI?)
    <R> -> VirtualFile?

'if (uri.scheme == "jar") {
                    jarFileSystem.findFileByPath(uri.schemeSpecificPart.substring("file:".length))
                }
                else {
                    localFileSystem.findFileByPath(uri.schemeSpecificPart)
                }' @ [260:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: VirtualFile?, elseBranch: VirtualFile?): VirtualFile?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VirtualFile?

'uri' @ [260:21] ==> value-parameter uri: (URI..URI?) defined in org.jetbrains.kotlin.javac.JavacWrapper.toVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'scheme' @ [260:25] ==> public final val URI.scheme: (String..String?)[MyPropertyDescriptor]

'jarFileSystem' @ [261:21] ==> private final val jarFileSystem: VirtualFileSystem defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'findFileByPath' @ [261:35] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'uri' @ [261:50] ==> value-parameter uri: (URI..URI?) defined in org.jetbrains.kotlin.javac.JavacWrapper.toVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'schemeSpecificPart' @ [261:54] ==> public final val URI.schemeSpecificPart: (String..String?)[MyPropertyDescriptor]

'substring' @ [261:73] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'length' @ [261:91] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

'localFileSystem' @ [264:21] ==> private final val localFileSystem: VirtualFileSystem defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'findFileByPath' @ [264:37] ==> @Nullable public abstract fun findFileByPath(@NotNull @NonNls p0: String): VirtualFile? defined in com.intellij.openapi.vfs.VirtualFileSystem[JavaMethodDescriptor]

'uri' @ [264:52] ==> value-parameter uri: (URI..URI?) defined in org.jetbrains.kotlin.javac.JavacWrapper.toVirtualFile.<anonymous>[ValueParameterDescriptorImpl]

'schemeSpecificPart' @ [264:56] ==> public final val URI.schemeSpecificPart: (String..String?)[MyPropertyDescriptor]

'from' @ [268:74] ==> public open fun <A : (Any..Any?)> from(p0: (MutableIterable<(T..T?)>..Iterable<(T..T?)>?)): (List<(T..T?)>..List<(T..T?)>?) defined in com.sun.tools.javac.util.List[JavaMethodDescriptor]
Inferred types:
    <A : (Any..Any?)> -> (T..T?)

'this' @ [268:79] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper.toJavacList[ReceiverParameterDescriptorImpl]

'symbolBasedClassesCache' @ [271:13] ==> private final val symbolBasedClassesCache: HashMap<String, SymbolBasedClass?> /* = HashMap<String, SymbolBasedClass?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'containsKey' @ [271:37] ==> public open fun containsKey(key: String): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'fqName' @ [271:49] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols[ValueParameterDescriptorImpl]

'symbolBasedClassesCache' @ [271:65] ==> private final val symbolBasedClassesCache: HashMap<String, SymbolBasedClass?> /* = HashMap<String, SymbolBasedClass?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [271:89] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols[ValueParameterDescriptorImpl]

'elements' @ [273:9] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getTypeElement' @ [273:18] ==> public open fun getTypeElement(p0: (CharSequence..CharSequence?)): (Symbol.ClassSymbol..Symbol.ClassSymbol?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'fqName' @ [273:33] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols[ValueParameterDescriptorImpl]

'let' @ [273:42] ==> @InlineOnly public inline fun <T, R> Symbol.ClassSymbol.let(block: (Symbol.ClassSymbol) -> SymbolBasedClass): SymbolBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'SymbolBasedClass' @ [274:13] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'symbol' @ [274:30] ==> value-parameter symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [274:38] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'symbol' @ [274:44] ==> value-parameter symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'classfile' @ [274:51] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'let' @ [275:11] ==> @InlineOnly public inline fun <T, R> SymbolBasedClass?.let(block: (SymbolBasedClass?) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedClass?
    <R> -> Nothing

'symbolBasedClassesCache' @ [276:13] ==> private final val symbolBasedClassesCache: HashMap<String, SymbolBasedClass?> /* = HashMap<String, SymbolBasedClass?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [276:37] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols[ValueParameterDescriptorImpl]

'symbolBasedClass' @ [276:47] ==> value-parameter symbolBasedClass: SymbolBasedClass? defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'symbolBasedClass' @ [277:20] ==> value-parameter symbolBasedClass: SymbolBasedClass? defined in org.jetbrains.kotlin.javac.JavacWrapper.findClassInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'symbolBasedPackagesCache' @ [282:13] ==> private final val symbolBasedPackagesCache: HashMap<String, SymbolBasedPackage?> /* = HashMap<String, SymbolBasedPackage?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'containsKey' @ [282:38] ==> public open fun containsKey(key: String): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'fqName' @ [282:50] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols[ValueParameterDescriptorImpl]

'symbolBasedPackagesCache' @ [282:66] ==> private final val symbolBasedPackagesCache: HashMap<String, SymbolBasedPackage?> /* = HashMap<String, SymbolBasedPackage?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [282:91] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols[ValueParameterDescriptorImpl]

'elements' @ [284:9] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPackageElement' @ [284:18] ==> public open fun getPackageElement(p0: (CharSequence..CharSequence?)): (Symbol.PackageSymbol..Symbol.PackageSymbol?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'fqName' @ [284:36] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols[ValueParameterDescriptorImpl]

'let' @ [284:45] ==> @InlineOnly public inline fun <T, R> Symbol.PackageSymbol.let(block: (Symbol.PackageSymbol) -> SymbolBasedPackage): SymbolBasedPackage defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageSymbol
    <R> -> SymbolBasedPackage

'SymbolBasedPackage' @ [285:13] ==> public constructor SymbolBasedPackage(element: PackageElement, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedPackage[ClassConstructorDescriptorImpl]

'symbol' @ [285:32] ==> value-parameter symbol: Symbol.PackageSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [285:40] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'let' @ [286:11] ==> @InlineOnly public inline fun <T, R> SymbolBasedPackage?.let(block: (SymbolBasedPackage?) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SymbolBasedPackage?
    <R> -> Nothing

'symbolBasedPackagesCache' @ [287:13] ==> private final val symbolBasedPackagesCache: HashMap<String, SymbolBasedPackage?> /* = HashMap<String, SymbolBasedPackage?> */ defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fqName' @ [287:38] ==> value-parameter fqName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols[ValueParameterDescriptorImpl]

'symbolBasedPackage' @ [287:48] ==> value-parameter symbolBasedPackage: SymbolBasedPackage? defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'symbolBasedPackage' @ [288:20] ==> value-parameter symbolBasedPackage: SymbolBasedPackage? defined in org.jetbrains.kotlin.javac.JavacWrapper.findPackageInSymbols.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [292:78] ==> @InlineOnly public inline fun <T> JavacFileManager.apply(block: JavacFileManager.() -> Unit): JavacFileManager defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavacFileManager

'outDir' @ [293:10] ==> value-parameter outDir: File? defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation[ValueParameterDescriptorImpl]

'outputDirectory' @ [293:20] ==> private final val outputDirectory: File? defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'let' @ [293:38] ==> @InlineOnly public inline fun <T, R> File.let(block: (File) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File
    <R> -> Unit

'outputDir' @ [294:13] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'mkdirs' @ [294:23] ==> public open fun mkdirs(): Boolean defined in java.io.File[JavaMethodDescriptor]

'fileManager' @ [295:13] ==> private final val fileManager: JavacFileManager defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'setLocation' @ [295:25] ==> public open fun setLocation(p0: (JavaFileManager.Location..JavaFileManager.Location?), p1: (MutableIterable<(File..File?)>..Iterable<(File..File?)>?)): Unit defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'CLASS_OUTPUT' @ [295:54] ==> enum entry CLASS_OUTPUT defined in javax.tools.StandardLocation[FakeCallableDescriptorForObject]

'listOf' @ [295:68] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'outputDir' @ [295:75] ==> value-parameter outputDir: File defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'instance' @ [298:34] ==> public open fun instance(p0: (Context..Context?)): (ClassReader..ClassReader?) defined in com.sun.tools.javac.jvm.ClassReader[JavaMethodDescriptor]

'context' @ [298:43] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'instance' @ [299:27] ==> public open fun instance(p0: (Context..Context?)): (Names..Names?) defined in com.sun.tools.javac.util.Names[JavaMethodDescriptor]

'context' @ [299:36] ==> private final val context: Context defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getLocation' @ [300:26] ==> public open fun getLocation(p0: (JavaFileManager.Location..JavaFileManager.Location?)): (MutableIterable<(File..File?)>..Iterable<(File..File?)>?) defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'CLASS_OUTPUT' @ [300:55] ==> enum entry CLASS_OUTPUT defined in javax.tools.StandardLocation[FakeCallableDescriptorForObject]

'firstOrNull' @ [300:70] ==> public fun <T> Iterable<(File..File?)>.firstOrNull(): File? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'path' @ [300:85] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'list' @ [302:9] ==> public open fun list(p0: (JavaFileManager.Location..JavaFileManager.Location?), p1: (String..String?), p2: (MutableSet<(JavaFileObject.Kind..JavaFileObject.Kind?)>..Set<(JavaFileObject.Kind..JavaFileObject.Kind?)>?), p3: Boolean): (MutableIterable<(JavaFileObject..JavaFileObject?)>..Iterable<(JavaFileObject..JavaFileObject?)>?) defined in com.sun.tools.javac.file.JavacFileManager[JavaMethodDescriptor]

'CLASS_OUTPUT' @ [302:31] ==> enum entry CLASS_OUTPUT defined in javax.tools.StandardLocation[FakeCallableDescriptorForObject]

'setOf' @ [302:49] ==> public fun <T> setOf(element: JavaFileObject.Kind): Set<JavaFileObject.Kind> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Kind

'CLASS' @ [302:75] ==> enum entry CLASS defined in javax.tools.JavaFileObject.Kind[FakeCallableDescriptorForObject]

'forEach' @ [303:18] ==> @HidesMembers public inline fun <T> Iterable<(JavaFileObject..JavaFileObject?)>.forEach(action: ((JavaFileObject..JavaFileObject?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (javax.tools.JavaFileObject..javax.tools.JavaFileObject?)

'fileObject' @ [304:34] ==> value-parameter fileObject: (JavaFileObject..JavaFileObject?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [304:45] ==> public final val JavaFileObject.name: (String..String?)[MyPropertyDescriptor]

'substringAfter' @ [305:30] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'outDirName' @ [305:45] ==> val outDirName: String defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>[LocalVariableDescriptor]

'substringBefore' @ [306:30] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [307:30] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'separator' @ [307:43] ==> public const final val separator: (String..String?) defined in java.io.File[JavaPropertyDescriptor]

'let' @ [308:30] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (className.startsWith(".")) className.substring(1) else className' @ [309:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'className' @ [309:37] ==> value-parameter className: String defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'startsWith' @ [309:47] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'className' @ [309:64] ==> value-parameter className: String defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'substring' @ [309:74] ==> @InlineOnly public inline fun String.substring(startIndex: Int): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'className' @ [309:92] ==> value-parameter className: String defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [310:31] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (Name..Name?)): (Name..Name?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (com.sun.tools.javac.util.Name..com.sun.tools.javac.util.Name?)

'names' @ [310:35] ==> val names: (Names..Names?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>[LocalVariableDescriptor]

'fromString' @ [310:42] ==> public open fun fromString(p0: (String..String?)): (Name..Name?) defined in com.sun.tools.javac.util.Names[JavaMethodDescriptor]

'symbols' @ [312:21] ==> private final val symbols: (Symtab..Symtab?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'classes' @ [312:29] ==> public final val classes: (MutableMap<(Name..Name?), (Symbol.ClassSymbol..Symbol.ClassSymbol?)>..Map<(Name..Name?), (Symbol.ClassSymbol..Symbol.ClassSymbol?)>?) defined in com.sun.tools.javac.code.Symtab[JavaPropertyDescriptor]

'fqName' @ [312:37] ==> val fqName: (Name..Name?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [312:46] ==> @InlineOnly public inline fun <T, R> Symbol.ClassSymbol.let(block: (Symbol.ClassSymbol) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> Unit

'symbols' @ [312:52] ==> private final val symbols: (Symtab..Symtab?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'classes' @ [312:60] ==> public final val classes: (MutableMap<(Name..Name?), (Symbol.ClassSymbol..Symbol.ClassSymbol?)>..Map<(Name..Name?), (Symbol.ClassSymbol..Symbol.ClassSymbol?)>?) defined in com.sun.tools.javac.code.Symtab[JavaPropertyDescriptor]

'fqName' @ [312:68] ==> val fqName: (Name..Name?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'reader' @ [313:34] ==> val reader: (ClassReader..ClassReader?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>[LocalVariableDescriptor]

'enterClass' @ [313:41] ==> public open fun enterClass(p0: (Name..Name?), p1: (JavaFileObject..JavaFileObject?)): (Symbol.ClassSymbol..Symbol.ClassSymbol?) defined in com.sun.tools.javac.jvm.ClassReader[JavaMethodDescriptor]

'fqName' @ [313:52] ==> val fqName: (Name..Name?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'fileObject' @ [313:60] ==> value-parameter fileObject: (JavaFileObject..JavaFileObject?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'elements' @ [315:22] ==> private final val elements: (JavacElements..JavacElements?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'getPackageOf' @ [315:31] ==> public open fun getPackageOf(p0: (Element..Element?)): (PackageElement..PackageElement?) defined in com.sun.tools.javac.model.JavacElements[JavaMethodDescriptor]

'symbol' @ [315:44] ==> val symbol: (Symbol.ClassSymbol..Symbol.ClassSymbol?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [315:79] ==> @InlineOnly public inline fun <T, R> Symbol.PackageSymbol.let(block: (Symbol.PackageSymbol) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PackageSymbol
    <R> -> Unit

'packageSymbol' @ [316:25] ==> value-parameter packageSymbol: Symbol.PackageSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'members_field' @ [316:39] ==> public final var members_field: (Scope..Scope?) defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaPropertyDescriptor]

'enter' @ [316:53] ==> public open fun enter(p0: (Symbol..Symbol?)): Unit defined in com.sun.tools.javac.code.Scope[JavaMethodDescriptor]

'symbol' @ [316:59] ==> val symbol: (Symbol.ClassSymbol..Symbol.ClassSymbol?) defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>[LocalVariableDescriptor]

'packageSymbol' @ [317:25] ==> value-parameter packageSymbol: Symbol.PackageSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flags_field' @ [317:39] ==> public final var flags_field: Long defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaPropertyDescriptor]

'packageSymbol' @ [317:53] ==> value-parameter packageSymbol: Symbol.PackageSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.setClassPathForCompilation.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'flags_field' @ [317:67] ==> public final var flags_field: Long defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaPropertyDescriptor]

'EXISTS' @ [317:88] ==> public const final val EXISTS: Int defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

'toLong' @ [317:95] ==> public open fun toLong(): Long defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'listOf' @ [324:13] ==> public fun <T> listOf(element: TreeBasedClass): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass

'this' @ [324:20] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper.withInnerClasses[ReceiverParameterDescriptorImpl]

'innerClasses' @ [324:28] ==> public final val innerClasses: Map<Name, TreeBasedClass> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedClass[PropertyDescriptorImpl]

'values' @ [324:41] ==> public abstract val values: Collection<TreeBasedClass> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatMap' @ [324:48] ==> public inline fun <T, R> Iterable<TreeBasedClass>.flatMap(transform: (TreeBasedClass) -> Iterable<TreeBasedClass>): List<TreeBasedClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreeBasedClass
    <R> -> TreeBasedClass

'it' @ [324:58] ==> value-parameter it: TreeBasedClass defined in org.jetbrains.kotlin.javac.JavacWrapper.withInnerClasses.<anonymous>[ValueParameterDescriptorImpl]

'withInnerClasses' @ [324:61] ==> private final fun TreeBasedClass.withInnerClasses(): List<TreeBasedClass> defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'name' @ [327:25] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[ValueParameterDescriptorImpl]

'replace' @ [327:30] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'split' @ [327:48] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'members_field' @ [328:22] ==> public final var members_field: (Scope..Scope?) defined in com.sun.tools.javac.code.Symbol.PackageSymbol[JavaPropertyDescriptor]

'getElementsByName' @ [328:36] ==> public open fun getElementsByName(p0: (Name..Name?)): (MutableIterable<(Symbol..Symbol?)>..Iterable<(Symbol..Symbol?)>?) defined in com.sun.tools.javac.code.Scope[JavaMethodDescriptor]

'names' @ [328:54] ==> private final val names: (Names..Names?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fromString' @ [328:60] ==> public open fun fromString(p0: (String..String?)): (Name..Name?) defined in com.sun.tools.javac.util.Names[JavaMethodDescriptor]

'nameParts' @ [328:71] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'first' @ [328:81] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'firstOrNull' @ [329:32] ==> public fun <T> Iterable<(Symbol..Symbol?)>.firstOrNull(): Symbol? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.code.Symbol..com.sun.tools.javac.code.Symbol?)

'nameParts' @ [330:13] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'size' @ [330:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'symbol' @ [331:13] ==> var symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'complete' @ [331:20] ==> public open fun complete(): Unit defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaMethodDescriptor]

'nameParts' @ [332:24] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'drop' @ [332:34] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'symbol' @ [333:17] ==> var symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'symbol' @ [333:26] ==> var symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'members_field' @ [333:33] ==> public final var members_field: (Scope..Scope?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

'getElementsByName' @ [333:48] ==> public open fun getElementsByName(p0: (Name..Name?)): (MutableIterable<(Symbol..Symbol?)>..Iterable<(Symbol..Symbol?)>?) defined in com.sun.tools.javac.code.Scope[JavaMethodDescriptor]

'names' @ [333:66] ==> private final val names: (Names..Names?) defined in org.jetbrains.kotlin.javac.JavacWrapper[PropertyDescriptorImpl]

'fromString' @ [333:72] ==> public open fun fromString(p0: (String..String?)): (Name..Name?) defined in com.sun.tools.javac.util.Names[JavaMethodDescriptor]

'it' @ [333:83] ==> val it: String defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'firstOrNull' @ [333:89] ==> public fun <T> Iterable<(Symbol..Symbol?)>.firstOrNull(): Symbol? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.code.Symbol..com.sun.tools.javac.code.Symbol?)

'symbol' @ [334:17] ==> var symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'complete' @ [334:24] ==> public open fun complete(): Unit defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaMethodDescriptor]

'symbol' @ [338:16] ==> var symbol: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass[LocalVariableDescriptor]

'let' @ [338:23] ==> @InlineOnly public inline fun <T, R> Symbol.ClassSymbol.let(block: (Symbol.ClassSymbol) -> SymbolBasedClass): SymbolBasedClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassSymbol
    <R> -> SymbolBasedClass

'SymbolBasedClass' @ [338:29] ==> public constructor SymbolBasedClass(element: TypeElement, javac: JavacWrapper, file: JavaFileObject?) defined in org.jetbrains.kotlin.javac.wrappers.symbols.SymbolBasedClass[ClassConstructorDescriptorImpl]

'it' @ [338:46] ==> value-parameter it: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'this@JavacWrapper' @ [338:50] ==> <this> defined in org.jetbrains.kotlin.javac.JavacWrapper[LazyClassReceiverParameterDescriptor]

'it' @ [338:69] ==> value-parameter it: Symbol.ClassSymbol defined in org.jetbrains.kotlin.javac.JavacWrapper.findClass.<anonymous>[ValueParameterDescriptorImpl]

'classfile' @ [338:72] ==> public final var classfile: (JavaFileObject..JavaFileObject?) defined in com.sun.tools.javac.code.Symbol.ClassSymbol[JavaPropertyDescriptor]

