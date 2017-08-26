'hashMapOf' @ [29:25] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<Tree, JavaClassifier?> /* = HashMap<Tree, JavaClassifier?> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Tree
    <V> -> JavaClassifier?

'with' @ [31:56] ==> @InlineOnly public inline fun <T, R> with(receiver: TreePath, block: TreePath.() -> JavaClassifier?): JavaClassifier? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TreePath
    <R> -> JavaClassifier?

'treePath' @ [31:61] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.resolve[ValueParameterDescriptorImpl]

'cache' @ [32:13] ==> private final val cache: HashMap<Tree, JavaClassifier?> /* = HashMap<Tree, JavaClassifier?> */ defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'containsKey' @ [32:19] ==> public open fun containsKey(key: Tree): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'leaf' @ [32:31] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'cache' @ [32:45] ==> private final val cache: HashMap<Tree, JavaClassifier?> /* = HashMap<Tree, JavaClassifier?> */ defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'leaf' @ [32:51] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'tryToGetClassifier' @ [34:16] ==> private final fun TreePath.tryToGetClassifier(): JavaClassifier? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'apply' @ [34:37] ==> @InlineOnly public inline fun <T> JavaClassifier?.apply(block: JavaClassifier?.() -> Unit): JavaClassifier? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClassifier?

'cache' @ [34:45] ==> private final val cache: HashMap<Tree, JavaClassifier?> /* = HashMap<Tree, JavaClassifier?> */ defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'leaf' @ [34:51] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'this' @ [34:59] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.resolve.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'leaf' @ [38:20] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'toString' @ [38:25] ==> public open fun toString(): String defined in com.sun.source.tree.Tree[DeserializedSimpleFunctionDescriptor]

'substringBefore' @ [38:36] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'substringAfter' @ [38:57] ==> public fun String.substringAfter(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [39:25] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'split' @ [39:30] ==> public fun CharSequence.split(vararg delimiters: String, ignoreCase: Boolean = ..., limit: Int = ...): List<String> defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'with' @ [41:9] ==> @InlineOnly public inline fun <T, R> with(receiver: JCTree.JCCompilationUnit, block: JCTree.JCCompilationUnit.() -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCCompilationUnit
    <R> -> Nothing?

'compilationUnit' @ [41:14] ==> public final val TreePath.compilationUnit: (CompilationUnitTree..CompilationUnitTree?)[MyPropertyDescriptor]

'tryToResolveInner' @ [42:13] ==> private final fun TreePath.tryToResolveInner(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'name' @ [42:31] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [42:37] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'nameParts' @ [42:44] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'let' @ [42:56] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [42:69] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolvePackageClass' @ [43:13] ==> private final fun JCTree.JCCompilationUnit.tryToResolvePackageClass(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'name' @ [43:38] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [43:44] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'nameParts' @ [43:51] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'let' @ [43:63] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [43:76] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveByFqName' @ [44:13] ==> public fun tryToResolveByFqName(name: String, javac: JavacWrapper): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [44:34] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [44:40] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'let' @ [44:48] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [44:61] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveSingleTypeImport' @ [45:13] ==> private final fun JCTree.JCCompilationUnit.tryToResolveSingleTypeImport(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'name' @ [45:42] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [45:48] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'nameParts' @ [45:55] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'let' @ [45:67] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [45:80] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveTypeImportOnDemand' @ [46:13] ==> private final fun JCTree.JCCompilationUnit.tryToResolveTypeImportOnDemand(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'name' @ [46:44] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [46:50] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'nameParts' @ [46:57] ==> val nameParts: List<String> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'let' @ [46:69] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [46:82] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveInJavaLang' @ [47:13] ==> public fun tryToResolveInJavaLang(name: String, javac: JavacWrapper): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [47:36] ==> val name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier[LocalVariableDescriptor]

'javac' @ [47:42] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'let' @ [47:50] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing?

'it' @ [47:63] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToGetClassifier.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'tryToResolveTypeParameter' @ [50:16] ==> private final fun TreePath.tryToResolveTypeParameter(javac: JavacWrapper): TreeBasedTypeParameter? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'javac' @ [50:42] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[PropertyDescriptorImpl]

'emptyList' @ [56:39] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'findEnclosingClasses' @ [57:21] ==> private final fun TreePath.findEnclosingClasses(javac: JavacWrapper): ArrayList<JavaClass>? /* = ArrayList<JavaClass>? */ defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache[SimpleFunctionDescriptorImpl]

'javac' @ [57:42] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner[ValueParameterDescriptorImpl]

'forEach' @ [57:50] ==> @HidesMembers public inline fun <T> Iterable<JavaClass>.forEach(action: (JavaClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass

'javaClass' @ [58:17] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner.<anonymous>[ValueParameterDescriptorImpl]

'findInner' @ [58:27] ==> public fun JavaClass.findInner(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [58:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner[ValueParameterDescriptorImpl]

'javac' @ [58:43] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner[ValueParameterDescriptorImpl]

'nameParts' @ [58:50] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner[ValueParameterDescriptorImpl]

'let' @ [58:62] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'inner' @ [58:84] ==> value-parameter inner: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [59:15] ==> @InlineOnly public inline fun <T, R> Unit?.let(block: (Unit?) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit?
    <R> -> JavaClass?

'filterIsInstance' @ [62:13] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<JCTree.JCClassDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> JCClassDecl

'filter' @ [63:14] ==> public inline fun <T> Iterable<JCTree.JCClassDecl>.filter(predicate: (JCTree.JCClassDecl) -> Boolean): List<JCTree.JCClassDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl

'it' @ [63:23] ==> value-parameter it: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'extending' @ [63:26] ==> public final var extending: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'leaf' @ [63:39] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'!' @ [63:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [63:48] ==> value-parameter it: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'implementing' @ [63:51] ==> public final var implementing: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'contains' @ [63:64] ==> public operator fun <@OnlyInputTypes T> Iterable<(Tree..Tree?)>.contains(element: (Tree..Tree?)): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <@OnlyInputTypes T> -> (com.sun.source.tree.Tree..com.sun.source.tree.Tree?)

'leaf' @ [63:73] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'reversed' @ [64:14] ==> public fun <T> Iterable<JCTree.JCClassDecl>.reversed(): List<JCTree.JCClassDecl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl

'joinToString' @ [65:14] ==> public fun <T> Iterable<JCTree.JCClassDecl>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((JCTree.JCClassDecl) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCClassDecl

'compilationUnit' @ [65:56] ==> public final val TreePath.compilationUnit: (CompilationUnitTree..CompilationUnitTree?)[MyPropertyDescriptor]

'packageName' @ [65:72] ==> public final val CompilationUnitTree.packageName: (ExpressionTree..ExpressionTree?)[MyPropertyDescriptor]

'it' @ [65:90] ==> value-parameter it: JCTree.JCClassDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'simpleName' @ [65:93] ==> public final val JCTree.JCClassDecl.simpleName: (Name..Name?)[MyPropertyDescriptor]

'let' @ [66:14] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> JavaClass?

'javac' @ [66:20] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses[ValueParameterDescriptorImpl]

'findClass' @ [66:26] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [66:36] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'it' @ [66:43] ==> value-parameter it: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [67:15] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> ArrayList<JavaClass> /* = ArrayList<JavaClass> */): ArrayList<JavaClass> /* = ArrayList<JavaClass> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> ArrayList<JavaClass>

'arrayListOf' @ [68:17] ==> public fun <T> arrayListOf(vararg elements: JavaClass): ArrayList<JavaClass> /* = ArrayList<JavaClass> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass

'it' @ [68:29] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'apply' @ [68:33] ==> @InlineOnly public inline fun <T> ArrayList<JavaClass> /* = ArrayList<JavaClass> */.apply(block: ArrayList<JavaClass> /* = ArrayList<JavaClass> */.() -> Unit): ArrayList<JavaClass> /* = ArrayList<JavaClass> */ defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ArrayList<JavaClass>

'it' @ [69:42] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>[ValueParameterDescriptorImpl]

'outerClass' @ [69:45] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'enclosingClass' @ [70:28] ==> var enclosingClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'add' @ [71:25] ==> public open fun add(element: JavaClass): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'enclosingClass' @ [71:29] ==> var enclosingClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'enclosingClass' @ [72:25] ==> var enclosingClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'enclosingClass' @ [72:42] ==> var enclosingClass: JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.findEnclosingClasses.<anonymous>.<anonymous>[LocalVariableDescriptor]

'outerClass' @ [72:57] ==> public abstract val outerClass: JavaClass? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'emptyList' @ [80:39] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameParts' @ [82:9] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'size' @ [82:19] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'takeIf' @ [82:24] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [82:33] ==> value-parameter it: Int defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [82:43] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Nothing

'imports' @ [83:21] ==> public final val JCTree.JCCompilationUnit.imports: (List<(JCTree.JCImport..JCTree.JCImport?)>..List<(JCTree.JCImport..JCTree.JCImport?)>?)[MyPropertyDescriptor]

'filter' @ [83:29] ==> public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.filter(predicate: ((JCTree.JCImport..JCTree.JCImport?)) -> Boolean): List<(JCTree.JCImport..JCTree.JCImport?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'it' @ [83:38] ==> value-parameter it: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [83:41] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [83:61] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'endsWith' @ [83:72] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameParts' @ [83:85] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'first' @ [83:95] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'forEach' @ [84:30] ==> @HidesMembers public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.forEach(action: ((JCTree.JCImport..JCTree.JCImport?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'find' @ [85:33] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [85:38] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'import' @ [85:48] ==> value-parameter import: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [85:55] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'javac' @ [85:79] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'nameParts' @ [85:86] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'let' @ [85:98] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'javaClass' @ [86:44] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [89:30] ==> @InlineOnly public inline fun <T, R> Unit.let(block: (Unit) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit
    <R> -> Nothing

'imports' @ [92:16] ==> public final val JCTree.JCCompilationUnit.imports: (List<(JCTree.JCImport..JCTree.JCImport?)>..List<(JCTree.JCImport..JCTree.JCImport?)>?)[MyPropertyDescriptor]

'find' @ [93:18] ==> @InlineOnly public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.find(predicate: ((JCTree.JCImport..JCTree.JCImport?)) -> Boolean): JCTree.JCImport? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'it' @ [93:25] ==> value-parameter it: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [93:28] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [93:48] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'endsWith' @ [93:59] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [93:71] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'let' @ [94:19] ==> @InlineOnly public inline fun <T, R> JCTree.JCImport.let(block: (JCTree.JCImport) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCImport
    <R> -> JavaClass?

'FqName' @ [95:21] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'import' @ [95:28] ==> value-parameter import: JCTree.JCImport defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [95:35] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [95:55] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'let' @ [95:67] ==> @InlineOnly public inline fun <T, R> FqName.let(block: (FqName) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass?

'javac' @ [96:25] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'findClass' @ [96:31] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [96:41] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [96:52] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [96:58] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [96:78] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveSingleTypeImport.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [104:39] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameParts' @ [106:16] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'size' @ [106:26] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'takeIf' @ [106:31] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [106:40] ==> value-parameter it: Int defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [106:50] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> JavaClass?

'find' @ [107:21] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [107:26] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [107:35] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'nameParts' @ [107:49] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'first' @ [107:59] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javac' @ [107:71] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'nameParts' @ [107:78] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'javac' @ [109:19] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'findClass' @ [109:25] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [109:35] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [109:44] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'name' @ [109:57] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'javac' @ [110:19] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [110:25] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [110:45] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'packageName' @ [110:54] ==> public final val JCTree.JCCompilationUnit.packageName: (JCTree.JCExpression..JCTree.JCExpression?)[MyPropertyDescriptor]

'name' @ [110:67] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolvePackageClass[ValueParameterDescriptorImpl]

'emptyList' @ [116:39] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'with' @ [118:9] ==> @InlineOnly public inline fun <T, R> with(receiver: List<(JCTree.JCImport..JCTree.JCImport?)>, block: List<(JCTree.JCImport..JCTree.JCImport?)>.() -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<(com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)>
    <R> -> Nothing

'imports' @ [118:14] ==> public final val JCTree.JCCompilationUnit.imports: (List<(JCTree.JCImport..JCTree.JCImport?)>..List<(JCTree.JCImport..JCTree.JCImport?)>?)[MyPropertyDescriptor]

'filter' @ [118:22] ==> public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.filter(predicate: ((JCTree.JCImport..JCTree.JCImport?)) -> Boolean): List<(JCTree.JCImport..JCTree.JCImport?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'it' @ [118:31] ==> value-parameter it: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [118:34] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [118:54] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'endsWith' @ [118:65] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameParts' @ [119:13] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'size' @ [119:23] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'takeIf' @ [119:28] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [119:37] ==> value-parameter it: Int defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [120:23] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Nothing

'forEach' @ [121:25] ==> @HidesMembers public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.forEach(action: ((JCTree.JCImport..JCTree.JCImport?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'find' @ [122:29] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [122:34] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'pack' @ [122:44] ==> value-parameter pack: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [122:49] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [122:69] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'substringBefore' @ [122:80] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameParts' @ [122:103] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'first' @ [122:113] ==> public fun <T> List<String>.first(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'javac' @ [123:34] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'nameParts' @ [124:34] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'let' @ [124:46] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [124:59] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [125:27] ==> @InlineOnly public inline fun <T, R> Unit.let(block: (Unit) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit
    <R> -> Nothing

'this' @ [128:13] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>[ReceiverParameterDescriptorImpl]

'forEach' @ [128:18] ==> @HidesMembers public inline fun <T> Iterable<(JCTree.JCImport..JCTree.JCImport?)>.forEach(action: ((JCTree.JCImport..JCTree.JCImport?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCImport..com.sun.tools.javac.tree.JCTree.JCImport?)

'it' @ [129:33] ==> value-parameter it: (JCTree.JCImport..JCTree.JCImport?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifiedIdentifier' @ [129:36] ==> public final val JCTree.JCImport.qualifiedIdentifier: (JCTree..JCTree?)[MyPropertyDescriptor]

'toString' @ [129:56] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'substringBefore' @ [129:67] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'name' @ [129:89] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'let' @ [129:95] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> FqName): FqName defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> FqName

'javac' @ [130:18] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'findClass' @ [130:24] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [130:34] ==> val fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[LocalVariableDescriptor]

'javac' @ [130:45] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [130:51] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'fqName' @ [130:71] ==> val fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [130:81] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [130:94] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeImportOnDemand.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [131:15] ==> @InlineOnly public inline fun <T, R> Unit.let(block: (Unit) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit
    <R> -> Nothing

'flatMap' @ [136:13] ==> public inline fun <T, R> Iterable<(Tree..Tree?)>.flatMap(transform: ((Tree..Tree?)) -> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>): List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.source.tree.Tree..com.sun.source.tree.Tree?)
    <R> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)

'when (it) {
                    is JCTree.JCClassDecl -> it.typarams
                    is JCTree.JCMethodDecl -> it.typarams
                    else -> emptyList<JCTree.JCTypeParameter>()
                }' @ [137:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (List<JCTree.JCTypeParameter>..List<JCTree.JCTypeParameter>?), entry1: (List<JCTree.JCTypeParameter>..List<JCTree.JCTypeParameter>?), entry2: (List<JCTree.JCTypeParameter>..List<JCTree.JCTypeParameter>?)): (List<JCTree.JCTypeParameter>..List<JCTree.JCTypeParameter>?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (kotlin.collections.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter>..kotlin.collections.List<com.sun.tools.javac.tree.JCTree.JCTypeParameter>?)

'it' @ [137:23] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [138:46] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'typarams' @ [138:49] ==> public final var typarams: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?) defined in com.sun.tools.javac.tree.JCTree.JCClassDecl[JavaPropertyDescriptor]

'it' @ [139:47] ==> value-parameter it: (Tree..Tree?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'typarams' @ [139:50] ==> public final var typarams: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

'emptyList' @ [140:29] ==> public fun <T> emptyList(): List<JCTree.JCTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCTypeParameter

'find' @ [143:14] ==> @InlineOnly public inline fun <T> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>.find(predicate: ((JCTree.JCTypeParameter..JCTree.JCTypeParameter?)) -> Boolean): JCTree.JCTypeParameter? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)

'it' @ [143:21] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [143:24] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCTypeParameter[JavaMethodDescriptor]

'substringBefore' @ [143:35] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'leaf' @ [143:59] ==> public final val TreePath.leaf: (Tree..Tree?)[MyPropertyDescriptor]

'toString' @ [143:64] ==> public open fun toString(): String defined in com.sun.source.tree.Tree[DeserializedSimpleFunctionDescriptor]

'let' @ [144:15] ==> @InlineOnly public inline fun <T, R> JCTree.JCTypeParameter.let(block: (JCTree.JCTypeParameter) -> TreeBasedTypeParameter): TreeBasedTypeParameter defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCTypeParameter
    <R> -> TreeBasedTypeParameter

'TreeBasedTypeParameter' @ [145:17] ==> public constructor TreeBasedTypeParameter(tree: JCTree.JCTypeParameter, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [145:40] ==> value-parameter it: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [146:40] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter[ValueParameterDescriptorImpl]

'getTreePath' @ [146:46] ==> public final fun getTreePath(tree: JCTree, compilationUnit: CompilationUnitTree): TreePath defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'it' @ [146:58] ==> value-parameter it: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'compilationUnit' @ [146:62] ==> public final val TreePath.compilationUnit: (CompilationUnitTree..CompilationUnitTree?)[MyPropertyDescriptor]

'javac' @ [147:40] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreePathResolverCache.tryToResolveTypeParameter[ValueParameterDescriptorImpl]

'emptyList' @ [154:51] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'nameParts' @ [155:5] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'size' @ [155:15] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'takeIf' @ [155:20] ==> @InlineOnly @SinceKotlin public inline fun <T> Int.takeIf(predicate: (Int) -> Boolean): Int? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [155:29] ==> value-parameter it: Int defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [155:39] ==> @InlineOnly public inline fun <T, R> Int.let(block: (Int) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> Nothing

'find' @ [156:16] ==> public fun find(fqName: FqName, javac: JavacWrapper, nameParts: List<String>): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'FqName' @ [156:21] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqName' @ [156:31] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [156:40] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'nameParts' @ [156:54] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'javac' @ [156:71] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'nameParts' @ [156:78] ==> value-parameter nameParts: List<String> = ... defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'name' @ [159:9] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'this' @ [159:17] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ReceiverParameterDescriptorImpl]

'fqName' @ [159:22] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'shortName' @ [159:30] ==> @NotNull public open fun shortName(): Name defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'asString' @ [159:43] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'this' @ [159:62] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ReceiverParameterDescriptorImpl]

'with' @ [161:5] ==> @InlineOnly public inline fun <T, R> with(receiver: FqName, block: FqName.() -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> Nothing?

'FqName' @ [161:10] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'fqName' @ [161:20] ==> public abstract val fqName: FqName? defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'asString' @ [161:29] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'name' @ [161:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'javac' @ [162:9] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'findClass' @ [162:15] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [162:25] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>[ReceiverParameterDescriptorImpl]

'let' @ [162:32] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [162:45] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [163:9] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [163:15] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [163:35] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>[ReceiverParameterDescriptorImpl]

'let' @ [163:42] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing?): Nothing? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing?

'it' @ [163:55] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'supertypes' @ [166:5] ==> public abstract val supertypes: Collection<JavaClassifierType> defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'mapNotNull' @ [166:16] ==> public inline fun <T, R : Any> Iterable<JavaClassifierType>.mapNotNull(transform: (JavaClassifierType) -> JavaClass?): List<JavaClass> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClassifierType
    <R : Any> -> JavaClass

'it' @ [166:29] ==> value-parameter it: JavaClassifierType defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>[ValueParameterDescriptorImpl]

'classifier' @ [166:32] ==> public abstract val classifier: JavaClassifier? defined in org.jetbrains.kotlin.load.java.structure.JavaClassifierType[DeserializedPropertyDescriptor]

'forEach' @ [167:14] ==> @HidesMembers public inline fun <T> Iterable<JavaClass>.forEach(action: (JavaClass) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass

'javaClass' @ [168:17] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>[ValueParameterDescriptorImpl]

'findInner' @ [168:27] ==> public fun JavaClass.findInner(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'name' @ [168:37] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'javac' @ [168:43] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner[ValueParameterDescriptorImpl]

'let' @ [168:51] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'inner' @ [168:73] ==> value-parameter inner: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.findInner.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [169:15] ==> @InlineOnly public inline fun <T, R> Unit.let(block: (Unit) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit
    <R> -> Nothing

'with' @ [173:49] ==> @InlineOnly public inline fun <T, R> with(receiver: FqName, block: FqName.() -> JavaClass?): JavaClass? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass?

'FqName' @ [173:54] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'name' @ [173:61] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveByFqName[ValueParameterDescriptorImpl]

'javac' @ [174:5] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveByFqName[ValueParameterDescriptorImpl]

'findClass' @ [174:11] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [174:21] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveByFqName.<anonymous>[ReceiverParameterDescriptorImpl]

'javac' @ [174:30] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveByFqName[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [174:36] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [174:56] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveByFqName.<anonymous>[ReceiverParameterDescriptorImpl]

'javac' @ [178:51] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveInJavaLang[ValueParameterDescriptorImpl]

'findClass' @ [178:57] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'FqName' @ [178:67] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'name' @ [178:86] ==> value-parameter name: String defined in org.jetbrains.kotlin.javac.wrappers.trees.tryToResolveInJavaLang[ValueParameterDescriptorImpl]

'with' @ [184:19] ==> @InlineOnly public inline fun <T, R> with(receiver: FqName, block: FqName.() -> JavaClass): JavaClass defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FqName
    <R> -> JavaClass

'fqName' @ [184:24] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.find[ValueParameterDescriptorImpl]

'javac' @ [185:9] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.find[ValueParameterDescriptorImpl]

'findClass' @ [185:15] ==> public final fun findClass(fqName: FqName, scope: GlobalSearchScope = ...): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [185:25] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.find.<anonymous>[ReceiverParameterDescriptorImpl]

'javac' @ [186:12] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.find[ValueParameterDescriptorImpl]

'getKotlinClassifier' @ [186:18] ==> public final fun getKotlinClassifier(fqName: FqName): JavaClass? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'this' @ [186:38] ==> <this> defined in org.jetbrains.kotlin.javac.wrappers.trees.find.<anonymous>[ReceiverParameterDescriptorImpl]

'nameParts' @ [190:5] ==> value-parameter nameParts: List<String> defined in org.jetbrains.kotlin.javac.wrappers.trees.find[ValueParameterDescriptorImpl]

'drop' @ [190:15] ==> public fun <T> Iterable<String>.drop(n: Int): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'fold' @ [190:23] ==> public inline fun <T, R> Iterable<String>.fold(initial: JavaClass, operation: (JavaClass, String) -> JavaClass): JavaClass defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> JavaClass

'initial' @ [190:28] ==> val initial: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.find[LocalVariableDescriptor]

'javaClass' @ [191:32] ==> value-parameter javaClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.find.<anonymous>[ValueParameterDescriptorImpl]

'findInner' @ [191:42] ==> public fun JavaClass.findInner(name: String, javac: JavacWrapper, nameParts: List<String> = ...): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees[SimpleFunctionDescriptorImpl]

'namePart' @ [191:52] ==> value-parameter namePart: String defined in org.jetbrains.kotlin.javac.wrappers.trees.find.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [191:62] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.find[ValueParameterDescriptorImpl]

'let' @ [192:7] ==> @InlineOnly public inline fun <T, R> JavaClass.let(block: (JavaClass) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaClass
    <R> -> Nothing

'it' @ [192:20] ==> value-parameter it: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.find.<anonymous>[ValueParameterDescriptorImpl]

