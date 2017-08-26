'TreeBasedElement<JCTree.JCVariableDecl>' @ [33:5] ==> public constructor TreeBasedElement<out T : JCTree>(tree: JCTree.JCVariableDecl, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedElement[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCVariableDecl

'tree' @ [33:45] ==> value-parameter tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'treePath' @ [33:51] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [33:61] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'getValue' @ [35:61] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'tree' @ [36:9] ==> value-parameter tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'annotations' @ [36:14] ==> internal fun JCTree.annotations(): Collection<JCTree.JCAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[SimpleFunctionDescriptorImpl]

'map' @ [36:28] ==> public inline fun <T, R> Iterable<JCTree.JCAnnotation>.map(transform: (JCTree.JCAnnotation) -> TreeBasedAnnotation): List<TreeBasedAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JCAnnotation
    <R> -> TreeBasedAnnotation

'TreeBasedAnnotation' @ [36:34] ==> public constructor TreeBasedAnnotation(annotation: JCTree.JCAnnotation, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedAnnotation[ClassConstructorDescriptorImpl]

'it' @ [36:54] ==> value-parameter it: JCTree.JCAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.annotations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'treePath' @ [36:58] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'javac' @ [36:68] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.<init>[ValueParameterDescriptorImpl]

'annotations' @ [40:13] ==> public open val annotations: Collection<JavaAnnotation> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'find' @ [40:25] ==> @InlineOnly public inline fun <T> Iterable<JavaAnnotation>.find(predicate: (JavaAnnotation) -> Boolean): JavaAnnotation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JavaAnnotation

'it' @ [40:32] ==> value-parameter it: JavaAnnotation defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.findAnnotation.<anonymous>[ValueParameterDescriptorImpl]

'classId' @ [40:35] ==> public abstract val classId: ClassId? defined in org.jetbrains.kotlin.load.java.structure.JavaAnnotation[DeserializedPropertyDescriptor]

'asSingleFqName' @ [40:44] ==> @NotNull public open fun asSingleFqName(): FqName defined in org.jetbrains.kotlin.name.ClassId[JavaMethodDescriptor]

'fqName' @ [40:64] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter.findAnnotation[ValueParameterDescriptorImpl]

'identifier' @ [46:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [46:33] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'name' @ [46:38] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaPropertyDescriptor]

'toString' @ [46:43] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'TreeBasedType' @ [49:17] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[FakeCallableDescriptorForObject]

'create' @ [49:31] ==> public final fun <Type : JCTree> create(tree: (JCTree..JCTree?), treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'tree' @ [49:38] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'getType' @ [49:43] ==> public open fun getType(): (JCTree..JCTree?) defined in com.sun.tools.javac.tree.JCTree.JCVariableDecl[JavaMethodDescriptor]

'treePath' @ [49:54] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'javac' @ [49:64] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'tree' @ [52:17] ==> public final val tree: JCTree.JCVariableDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[PropertyDescriptorImpl]

'modifiers' @ [52:22] ==> public final val JCTree.JCVariableDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'flags' @ [52:32] ==> public final var flags: Long defined in com.sun.tools.javac.tree.JCTree.JCModifiers[JavaPropertyDescriptor]

'VARARGS' @ [52:48] ==> public const final val VARARGS: Long defined in com.sun.tools.javac.code.Flags[JavaPropertyDescriptor]

