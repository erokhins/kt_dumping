'TreeBasedElement<JCTree.JCTypeParameter>' @ [32:5] ==> public constructor TreeBasedElement<out T : JCTree>(tree: JCTree.JCTypeParameter, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCTypeParameter

'tree' @ [32:46] ==> value-parameter tree: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'treePath' @ [32:52] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [32:62] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'identifier' @ [35:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [35:33] ==> public final val tree: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'name' @ [35:38] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCTypeParameter[JavaPropertyDescriptor]

'toString' @ [35:43] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'getValue' @ [37:61] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'tree' @ [38:9] ==> value-parameter tree: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'annotations' @ [38:14] ==> internal fun JCTree.annotations(): Collection<JCTree.JCAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'map' @ [38:28] ==> public inline fun <T, R> Iterable<JCTree.JCAnnotation>.map(transform: (JCTree.JCAnnotation) -> TreeBasedAnnotation): List<TreeBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCAnnotation
    <R> -> TreeBasedAnnotation

'TreeBasedAnnotation' @ [38:34] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [38:54] ==> value-parameter it: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [38:58] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [38:68] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<init>[ValueParameterDescriptorImpl]

'annotations' @ [42:13] ==> public open val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'firstOrNull' @ [42:25] ==> public inline fun <T> Iterable<JavaAnnotation>.firstOrNull(predicate: (JavaAnnotation) -> Boolean): JavaAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'it' @ [42:39] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [42:42] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[DeserializedPropertyDescriptor]

'asSingleFqName' @ [42:51] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [42:71] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.findAnnotation[ValueParameterDescriptorImpl]

'tree' @ [48:17] ==> public final val tree: JCTree.JCTypeParameter defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'bounds' @ [48:22] ==> public final var bounds: (List<(JCTree.JCExpression..JCTree.JCExpression?)>..List<(JCTree.JCExpression..JCTree.JCExpression?)>?) defined in com.sun.tools.javac.tree.JCTree.JCTypeParameter[JavaPropertyDescriptor]

'mapNotNull' @ [48:29] ==> public inline fun <T, R : Any> Iterable<(JCTree.JCExpression..JCTree.JCExpression?)>.mapNotNull(transform: ((JCTree.JCExpression..JCTree.JCExpression?)) -> TreeBasedClassifierType<JCTree.JCExpression>?): List<TreeBasedClassifierType<JCTree.JCExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCExpression..com.sun.tools.javac.tree.JCTree.JCExpression?)
    <R : Any> -> TreeBasedClassifierType<JCExpression>

'when (it) {
                is JCTree.JCTypeApply -> TreeBasedGenericClassifierType(it, TreePath(treePath, it), javac)
                is JCTree.JCIdent -> TreeBasedNonGenericClassifierType(it, TreePath(treePath, it), javac)
                else -> null
            }' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TreeBasedClassifierType<JCTree.JCExpression>?, entry1: TreeBasedClassifierType<JCTree.JCExpression>?, entry2: TreeBasedClassifierType<JCTree.JCExpression>?): TreeBasedClassifierType<JCTree.JCExpression>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TreeBasedClassifierType<JCExpression>?

'it' @ [49:19] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'TreeBasedGenericClassifierType' @ [50:42] ==> public constructor TreeBasedGenericClassifierType(tree: JCTree.JCTypeApply, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedGenericClassifierType[ClassConstructorDescriptorImpl]

'it' @ [50:73] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [50:77] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [50:86] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'it' @ [50:96] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [50:101] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'TreeBasedNonGenericClassifierType' @ [51:38] ==> public constructor TreeBasedNonGenericClassifierType(tree: JCTree.JCExpression, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedNonGenericClassifierType[ClassConstructorDescriptorImpl]

'it' @ [51:72] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [51:76] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [51:85] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

'it' @ [51:95] ==> value-parameter it: (JCTree.JCExpression..JCTree.JCExpression?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter.<get-upperBounds>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [51:100] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[PropertyDescriptorImpl]

