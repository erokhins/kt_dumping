'this' @ [40:9] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, compilationUnit: CompilationUnitTree, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'annotation' @ [40:14] ==> value-parameter annotation: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation.<init>[ValueParameterDescriptorImpl]

'treePath' @ [40:26] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation.<init>[ValueParameterDescriptorImpl]

'compilationUnit' @ [40:35] ==> public final val TreePath.compilationUnit: (CompilationUnitTree..CompilationUnitTree?)[MyPropertyDescriptor]

'javac' @ [40:52] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation.<init>[ValueParameterDescriptorImpl]

'annotation' @ [43:17] ==> private final val annotation: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[PropertyDescriptorImpl]

'arguments' @ [43:28] ==> public final val JCTree.JCAnnotation.arguments: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?)[MyPropertyDescriptor]

'map' @ [43:38] ==> public inline fun <T, R> Iterable<(JCTree.JCExpression..JCTree.JCExpression?)>.map(transform: ((JCTree.JCExpression..JCTree.JCExpression?)) -> TreeBasedAnnotationArgument): List<TreeBasedAnnotationArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)
    <R> -> TreeBasedAnnotationArgument

'TreeBasedAnnotationArgument' @ [43:44] ==> public constructor TreeBasedAnnotationArgument(name: Name) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotationArgument[ClassConstructorDescriptorImpl]

'identifier' @ [43:77] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'it' @ [43:88] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [43:91] ==> public open fun toString(): String defined in com.sun.tools.javac.tree.JCTree.JCExpression[JavaMethodDescriptor]

'resolve' @ [46:17] ==> public open fun resolve(): JavaClass? defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[SimpleFunctionDescriptorImpl]

'computeClassId' @ [46:28] ==> public fun JavaClass.computeClassId(): ClassId? defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'javac' @ [49:13] ==> private final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[PropertyDescriptorImpl]

'resolve' @ [49:19] ==> public final fun resolve(treePath: TreePath): JavaClassifier? defined in org.jetbrains.kotlin.javac.JavacWrapper[SimpleFunctionDescriptorImpl]

'getPath' @ [49:36] ==> public open fun getPath(p0: (CompilationUnitTree..CompilationUnitTree?), p1: (Tree..Tree?)): (TreePath..TreePath?) defined in com.sun.source.util.TreePath[JavaMethodDescriptor]

'compilationUnit' @ [49:44] ==> private final val compilationUnit: CompilationUnitTree defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[PropertyDescriptorImpl]

'annotation' @ [49:61] ==> private final val annotation: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[PropertyDescriptorImpl]

'annotationType' @ [49:72] ==> public final var annotationType: (JCTree..JCTree?) defined in com.sun.tools.javac.tree.JCTree.JCAnnotation[JavaPropertyDescriptor]

