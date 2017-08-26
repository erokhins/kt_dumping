'TreeBasedMember<JCTree.JCMethodDecl>' @ [34:5] ==> public constructor TreeBasedMember<out T : JCTree>(tree: JCTree.JCMethodDecl, treePath: TreePath, containingClass: JavaClass, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedMember[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : JCTree> -> JCMethodDecl

'tree' @ [34:42] ==> value-parameter tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<init>[ValueParameterDescriptorImpl]

'treePath' @ [34:48] ==> value-parameter treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<init>[ValueParameterDescriptorImpl]

'containingClass' @ [34:58] ==> value-parameter containingClass: JavaClass defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<init>[ValueParameterDescriptorImpl]

'javac' @ [34:75] ==> value-parameter javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<init>[ValueParameterDescriptorImpl]

'identifier' @ [37:22] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'tree' @ [37:33] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'name' @ [37:38] ==> public final var name: (Name..Name?) defined in com.sun.tools.javac.tree.JCTree.JCMethodDecl[JavaPropertyDescriptor]

'toString' @ [37:43] ==> public open fun toString(): String defined in com.sun.tools.javac.util.Name[JavaMethodDescriptor]

'tree' @ [49:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'modifiers' @ [49:22] ==> public final val JCTree.JCMethodDecl.modifiers: (JCTree.JCModifiers..JCTree.JCModifiers?)[MyPropertyDescriptor]

'visibility' @ [49:32] ==> internal val JCTree.JCModifiers.visibility: Visibility defined in org.jetbrains.kotlin.javac.wrappers.trees in file utils.kt[PropertyDescriptorImpl]

'tree' @ [52:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'typeParameters' @ [52:22] ==> public final val JCTree.JCMethodDecl.typeParameters: (List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>..List<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>?)[MyPropertyDescriptor]

'map' @ [52:37] ==> public inline fun <T, R> Iterable<(JCTree.JCTypeParameter..JCTree.JCTypeParameter?)>.map(transform: ((JCTree.JCTypeParameter..JCTree.JCTypeParameter?)) -> TreeBasedTypeParameter): List<TreeBasedTypeParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCTypeParameter..com.sun.tools.javac.tree.JCTree.JCTypeParameter?)
    <R> -> TreeBasedTypeParameter

'TreeBasedTypeParameter' @ [52:43] ==> public constructor TreeBasedTypeParameter(tree: JCTree.JCTypeParameter, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedTypeParameter[ClassConstructorDescriptorImpl]

'it' @ [52:66] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [52:70] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [52:79] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'it' @ [52:89] ==> value-parameter it: (JCTree.JCTypeParameter..JCTree.JCTypeParameter?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<get-typeParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [52:94] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'tree' @ [55:17] ==> public final val tree: JCTree.JCMethodDecl defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'parameters' @ [55:22] ==> public final val JCTree.JCMethodDecl.parameters: (List<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>..List<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>?)[MyPropertyDescriptor]

'map' @ [55:33] ==> public inline fun <T, R> Iterable<(JCTree.JCVariableDecl..JCTree.JCVariableDecl?)>.map(transform: ((JCTree.JCVariableDecl..JCTree.JCVariableDecl?)) -> TreeBasedValueParameter): List<TreeBasedValueParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.tools.javac.tree.JCTree.JCVariableDecl..com.sun.tools.javac.tree.JCTree.JCVariableDecl?)
    <R> -> TreeBasedValueParameter

'TreeBasedValueParameter' @ [55:39] ==> public constructor TreeBasedValueParameter(tree: JCTree.JCVariableDecl, treePath: TreePath, javac: JavacWrapper) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedValueParameter[ClassConstructorDescriptorImpl]

'it' @ [55:63] ==> value-parameter it: (JCTree.JCVariableDecl..JCTree.JCVariableDecl?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<get-valueParameters>.<anonymous>[ValueParameterDescriptorImpl]

'TreePath' @ [55:67] ==> public constructor TreePath(p0: (TreePath..TreePath?), p1: (Tree..Tree?)) defined in com.sun.source.util.TreePath[JavaClassConstructorDescriptor]

'treePath' @ [55:76] ==> public final val treePath: TreePath defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

'it' @ [55:86] ==> value-parameter it: (JCTree.JCVariableDecl..JCTree.JCVariableDecl?) defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor.<get-valueParameters>.<anonymous>[ValueParameterDescriptorImpl]

'javac' @ [55:91] ==> public final val javac: JavacWrapper defined in org.jetbrains.kotlin.javac.wrappers.trees.TreeBasedConstructor[PropertyDescriptorImpl]

