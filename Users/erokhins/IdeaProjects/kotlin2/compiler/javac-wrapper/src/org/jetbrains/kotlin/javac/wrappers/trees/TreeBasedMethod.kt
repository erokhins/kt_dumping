'TreeBasedMember<JCTree.JCMethodDecl>' @ [32:5] ==> public constructor TreeBasedMember<out T : JCTree>(tree: JCTree.JCMethodDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCMethodDecl

'tree' @ [32:42] ==> value-parameter tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<init>[ValueParameterDescriptorImpl]

'treePath' @ [32:48] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [32:58] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<init>[ValueParameterDescriptorImpl]

'javac' @ [32:75] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<init>[ValueParameterDescriptorImpl]

'identifier' @ [35:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [35:33] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'name' @ [35:38] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

'toString' @ [35:43] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'containingClass' @ [38:18] ==> public open val containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'isInterface' @ [38:34] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'!' @ [38:49] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'tree' @ [38:50] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'modifiers' @ [38:55] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'hasDefaultModifier' @ [38:65] ==> internal val JCTree.JCModifiers.hasDefaultModifier: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [38:88] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'modifiers' @ [38:93] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isAbstract' @ [38:103] ==> internal val JCTree.JCModifiers.isAbstract: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [41:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'modifiers' @ [41:22] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isStatic' @ [41:32] ==> internal val JCTree.JCModifiers.isStatic: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [44:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'modifiers' @ [44:22] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'isFinal' @ [44:32] ==> internal val JCTree.JCModifiers.isFinal: Boolean defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'if (containingClass.isInterface) Visibilities.PUBLIC else tree.modifiers.visibility' @ [47:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Visibility, elseBranch: Visibility): Visibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Visibility

'containingClass' @ [47:21] ==> public open val containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'isInterface' @ [47:37] ==> public abstract val isInterface: Boolean defined in org.jetbrains.kotlin.load.java.structure.JavaClass[DeserializedPropertyDescriptor]

'PUBLIC' @ [47:63] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'tree' @ [47:75] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'modifiers' @ [47:80] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'visibility' @ [47:90] ==> internal val JCTree.JCModifiers.visibility: Visibility defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [50:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'typeParameters' @ [50:22] ==> public final val JCTree.JCMethodDecl.typeParameters: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?)[MyPropertyDescriptor]

'map' @ [50:37] ==> public inline fun <T, R> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>.map(transform: ((JCTree.JCTypeParameter..JCTree.JCTypeParameter?)) -> TreeBasedTypeParameter): List<TreeBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)
    <R> -> TreeBasedTypeParameter

'TreeBasedTypeParameter' @ [50:43] ==> public constructor TreeBasedTypeParameter(tree: JCTree.JCTypeParameter, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [50:66] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [50:70] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [50:79] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'it' @ [50:89] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [50:94] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'tree' @ [53:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'parameters' @ [53:22] ==> public final val JCTree.JCMethodDecl.parameters: (List<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>..List<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>?)[MyPropertyDescriptor]

'map' @ [53:33] ==> public inline fun <T, R> Iterable<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>.map(transform: ((JCTree.JCVariableDecl..JCTree.JCVariableDecl?)) -> TreeBasedValueParameter): List<TreeBasedValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCVariableDecl..com.sun.tools.javac.tree.JCTree.JCVariableDecl?)
    <R> -> TreeBasedValueParameter

'TreeBasedValueParameter' @ [53:39] ==> public constructor TreeBasedValueParameter(tree: JCTree.JCVariableDecl, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[ClassConstructorDescriptorImpl]

'it' @ [53:63] ==> value-parameter it: (JCTree.JCVariableDecl..JCTree.JCVariableDecl?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<get-valueParameters>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [53:67] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [53:76] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'it' @ [53:86] ==> value-parameter it: (JCTree.JCVariableDecl..JCTree.JCVariableDecl?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod.<get-valueParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [53:91] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'TreeBasedType' @ [56:17] ==> public companion object defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType[FakeCallableDescriptorForObject]

'create' @ [56:31] ==> public final fun <Type : JCTree> create(tree: (JCTree..JCTree?), treePath: TreePath, javac: JavacWrapper): TreeBasedType<JCTree.JCExpression> defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedType.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <Type : JCTree> -> (com.sun.tools.javac.tree.JCTree..com.sun.tools.javac.tree.JCTree?)

'tree' @ [56:38] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'returnType' @ [56:43] ==> public final val JCTree.JCMethodDecl.returnType: (JCTree..JCTree?)[MyPropertyDescriptor]

'treePath' @ [56:55] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'javac' @ [56:65] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'tree' @ [59:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMethod[PropertyDescriptorImpl]

'defaultValue' @ [59:22] ==> public final var defaultValue: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

