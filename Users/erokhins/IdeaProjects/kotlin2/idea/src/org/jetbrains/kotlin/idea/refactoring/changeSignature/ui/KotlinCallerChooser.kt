'CallerChooserBase<PsiElement>' @ [56:4] ==> public constructor CallerChooserBase<M : (PsiElement..PsiElement?)>(p0: (PsiElement..PsiElement?), p1: (Project..Project?), p2: (String..String?), p3: (Tree..Tree?), p4: (String..String?), p5: (Consumer<(MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?)>..Consumer<(MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?)>?)) defined in com.intellij.refactoring.changeSignature.CallerChooserBase[JavaClassConstructorDescriptor]
Inferred types:
    <M : (PsiElement..PsiElement?)> -> PsiElement

'declaration' @ [56:34] ==> value-parameter declaration: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.<init>[ValueParameterDescriptorImpl]

'project' @ [56:47] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.<init>[ValueParameterDescriptorImpl]

'title' @ [56:56] ==> value-parameter title: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.<init>[ValueParameterDescriptorImpl]

'previousTree' @ [56:63] ==> value-parameter previousTree: Tree? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.<init>[ValueParameterDescriptorImpl]

'+' @ [56:77] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'EXTENSION' @ [56:103] ==> public const final val EXTENSION: String defined in org.jetbrains.kotlin.idea.KotlinFileType[JavaPropertyDescriptor]

'callback' @ [56:114] ==> value-parameter callback: Consumer<Set<PsiElement>> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.<init>[ValueParameterDescriptorImpl]

'KotlinMethodNode' @ [58:16] ==> public constructor KotlinMethodNode(method: PsiElement?, called: HashSet<PsiElement>, project: Project, cancelCallback: Runnable) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[ClassConstructorDescriptorImpl]

'method' @ [58:33] ==> value-parameter method: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.createTreeNode[ValueParameterDescriptorImpl]

'called' @ [58:41] ==> value-parameter called: HashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.createTreeNode[ValueParameterDescriptorImpl]

'myProject' @ [58:49] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser[JavaPropertyDescriptor]

'cancelCallback' @ [58:60] ==> value-parameter cancelCallback: Runnable defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.createTreeNode[ValueParameterDescriptorImpl]

'method' @ [62:13] ==> value-parameter method: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinCallerChooser.findDeepestSuperMethods[ValueParameterDescriptorImpl]

'toLightMethods' @ [62:20] ==> public fun PsiElement.toLightMethods(): List<PsiMethod> defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [62:37] ==> public fun <T> List<PsiMethod>.singleOrNull(): PsiMethod? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'findDeepestSuperMethods' @ [62:53] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'MethodNodeBase<PsiElement>' @ [76:4] ==> protected/*protected and package*/ constructor MethodNodeBase<M : (PsiElement..PsiElement?)>(p0: (PsiElement..PsiElement?), p1: (MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?), p2: (Project..Project?), p3: (Runnable..Runnable?)) defined in com.intellij.refactoring.changeSignature.MethodNodeBase[JavaClassConstructorDescriptor]
Inferred types:
    <M : (PsiElement..PsiElement?)> -> PsiElement

'method' @ [76:31] ==> value-parameter method: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.<init>[ValueParameterDescriptorImpl]

'namedUnwrappedElement' @ [76:39] ==> public val PsiElement.namedUnwrappedElement: PsiNamedElement? defined in org.jetbrains.kotlin.asJava[DeserializedPropertyDescriptor]

'method' @ [76:64] ==> value-parameter method: PsiElement? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.<init>[ValueParameterDescriptorImpl]

'called' @ [76:74] ==> value-parameter called: HashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.<init>[ValueParameterDescriptorImpl]

'project' @ [76:82] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.<init>[ValueParameterDescriptorImpl]

'cancelCallback' @ [76:91] ==> value-parameter cancelCallback: Runnable defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.<init>[ValueParameterDescriptorImpl]

'KotlinMethodNode' @ [78:13] ==> public constructor KotlinMethodNode(method: PsiElement?, called: HashSet<PsiElement>, project: Project, cancelCallback: Runnable) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[ClassConstructorDescriptorImpl]

'caller' @ [78:30] ==> value-parameter caller: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.createNode[ValueParameterDescriptorImpl]

'called' @ [78:38] ==> value-parameter called: HashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.createNode[ValueParameterDescriptorImpl]

'myProject' @ [78:46] ==> protected/*protected and package*/ final val myProject: (Project..Project?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'myCancelCallback' @ [78:57] ==> protected/*protected and package*/ final val myCancelCallback: (Runnable..Runnable?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'when (myMethod) {
            is KtFunction -> myMethod.resolveToDescriptor() as FunctionDescriptor
            is KtClass -> (myMethod.resolveToDescriptor() as ClassDescriptor).unsubstitutedPrimaryConstructor ?: return
            is PsiMethod -> myMethod.getJavaMethodDescriptor() ?: return
            else -> throw AssertionError("Invalid declaration: ${myMethod.getElementTextWithContext()}")
        }' @ [81:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: FunctionDescriptor, entry1: FunctionDescriptor, entry2: FunctionDescriptor, entry3: FunctionDescriptor): FunctionDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> FunctionDescriptor

'myMethod' @ [81:32] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'myMethod' @ [82:30] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'resolveToDescriptor' @ [82:39] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'?:' @ [83:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassConstructorDescriptor?, right: ClassConstructorDescriptor): ClassConstructorDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassConstructorDescriptor

'myMethod' @ [83:28] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'resolveToDescriptor' @ [83:37] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'unsubstitutedPrimaryConstructor' @ [83:79] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'myMethod' @ [84:29] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'getJavaMethodDescriptor' @ [84:38] ==> @JvmOverloads public fun PsiMethod.getJavaMethodDescriptor(resolutionFacade: ResolutionFacade? = ...): FunctionDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'AssertionError' @ [85:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'myMethod' @ [85:66] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'getElementTextWithContext' @ [85:75] ==> public fun PsiElement.getElementTextWithContext(): String defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'generateSequence' @ [87:29] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: DeclarationDescriptor?, nextFunction: (DeclarationDescriptor) -> DeclarationDescriptor?): Sequence<DeclarationDescriptor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> DeclarationDescriptor

'descriptor' @ [87:69] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'it' @ [87:83] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText.<anonymous>[ValueParameterDescriptorImpl]

'containingDeclaration' @ [87:86] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'firstOrNull' @ [88:18] ==> public inline fun <T> Sequence<DeclarationDescriptor>.firstOrNull(predicate: (DeclarationDescriptor) -> Boolean): DeclarationDescriptor? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'it' @ [88:32] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [89:19] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'renderNamedFunction' @ [91:66] ==> public open fun renderNamedFunction(descriptor: (FunctionDescriptor..FunctionDescriptor?)): (String..String?) defined in org.jetbrains.kotlin.idea.hierarchy.calls.KotlinCallHierarchyNodeDescriptor[JavaMethodDescriptor]

'descriptor' @ [91:86] ==> val descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'containerName' @ [93:17] ==> val containerName: Name? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'let' @ [93:32] ==> @InlineOnly public inline fun <T, R> Name.let(block: (Name) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Name
    <R> -> String

'if (it.isSpecial) "[Anonymous]" else it.asString()' @ [94:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'it' @ [94:28] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText.<anonymous>[ValueParameterDescriptorImpl]

'isSpecial' @ [94:31] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'it' @ [94:61] ==> value-parameter it: Name defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText.<anonymous>[ValueParameterDescriptorImpl]

'asString' @ [94:64] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'renderedFunction' @ [94:77] ==> val renderedFunction: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'renderedFunction' @ [95:22] ==> val renderedFunction: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'if (isEnabled)
            SimpleTextAttributes(SimpleTextAttributes.STYLE_PLAIN, UIUtil.getTreeForeground())
        else
            SimpleTextAttributes.EXCLUDED_ATTRIBUTES' @ [97:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (SimpleTextAttributes..SimpleTextAttributes?), elseBranch: (SimpleTextAttributes..SimpleTextAttributes?)): (SimpleTextAttributes..SimpleTextAttributes?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (com.intellij.ui.SimpleTextAttributes..com.intellij.ui.SimpleTextAttributes?)

'isEnabled' @ [97:30] ==> public final var KotlinMethodNode.isEnabled: Boolean[MyPropertyDescriptor]

'SimpleTextAttributes' @ [98:13] ==> public constructor SimpleTextAttributes(@SimpleTextAttributes.StyleAttributeConstant p0: Int, p1: (Color..Color?)) defined in com.intellij.ui.SimpleTextAttributes[JavaClassConstructorDescriptor]

'STYLE_PLAIN' @ [98:55] ==> public const final val STYLE_PLAIN: Int defined in com.intellij.ui.SimpleTextAttributes[JavaPropertyDescriptor]

'getTreeForeground' @ [98:75] ==> public open fun getTreeForeground(): (Color..Color?) defined in com.intellij.util.ui.UIUtil[JavaMethodDescriptor]

'EXCLUDED_ATTRIBUTES' @ [100:34] ==> public final val EXCLUDED_ATTRIBUTES: (SimpleTextAttributes..SimpleTextAttributes?) defined in com.intellij.ui.SimpleTextAttributes[JavaPropertyDescriptor]

'renderer' @ [101:9] ==> value-parameter renderer: ColoredTreeCellRenderer defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[ValueParameterDescriptorImpl]

'append' @ [101:18] ==> public final fun append(@NotNull p0: String, @NotNull p1: SimpleTextAttributes): Unit defined in com.intellij.ui.ColoredTreeCellRenderer[JavaMethodDescriptor]

'renderedFunctionWithContainer' @ [101:25] ==> val renderedFunctionWithContainer: (String..String?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'attributes' @ [101:56] ==> val attributes: (SimpleTextAttributes..SimpleTextAttributes?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'?:' @ [103:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'myMethod' @ [103:28] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'containingFile' @ [103:37] ==> public final val PsiElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'packageName' @ [103:72] ==> public final var PsiClassOwner.packageName: (String..String?)[MyPropertyDescriptor]

'renderer' @ [104:9] ==> value-parameter renderer: ColoredTreeCellRenderer defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[ValueParameterDescriptorImpl]

'append' @ [104:18] ==> public final fun append(@NotNull p0: String, @NotNull p1: SimpleTextAttributes): Unit defined in com.intellij.ui.ColoredTreeCellRenderer[JavaMethodDescriptor]

'packageName' @ [104:30] ==> val packageName: String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.customizeRendererText[LocalVariableDescriptor]

'SimpleTextAttributes' @ [104:45] ==> public constructor SimpleTextAttributes(@SimpleTextAttributes.StyleAttributeConstant p0: Int, p1: (Color..Color?)) defined in com.intellij.ui.SimpleTextAttributes[JavaClassConstructorDescriptor]

'STYLE_ITALIC' @ [104:87] ==> public const final val STYLE_ITALIC: Int defined in com.intellij.ui.SimpleTextAttributes[JavaPropertyDescriptor]

'GRAY' @ [104:109] ==> public final val GRAY: (JBColor..JBColor?) defined in com.intellij.ui.JBColor[JavaPropertyDescriptor]

'myMethod' @ [108:13] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'emptyList' @ [108:38] ==> public fun <T> emptyList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'LinkedHashSet' @ [110:23] ==> public constructor LinkedHashSet<E : (Any..Any?)>() defined in java.util.LinkedHashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiElement

'CalleeReferenceProcessor' @ [112:33] ==> public constructor CalleeReferenceProcessor(only: Boolean) defined in org.jetbrains.kotlin.idea.hierarchy.calls.CalleeReferenceProcessor[JavaClassConstructorDescriptor]

'element' @ [114:22] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>.onAccept[ValueParameterDescriptorImpl]

'element' @ [114:47] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>.onAccept[ValueParameterDescriptorImpl]

'element' @ [114:69] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>.onAccept[ValueParameterDescriptorImpl]

'element' @ [114:94] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>.onAccept[ValueParameterDescriptorImpl]

'myCalled' @ [114:106] ==> protected/*protected and package*/ final val myCalled: (MutableSet<(PsiElement..PsiElement?)>..Set<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'callers' @ [115:21] ==> val callers: LinkedHashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers[LocalVariableDescriptor]

'add' @ [115:29] ==> public open fun add(element: PsiElement): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'element' @ [115:33] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>.onAccept[ValueParameterDescriptorImpl]

'myMethod' @ [119:21] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'getRepresentativeLightMethod' @ [119:30] ==> public fun PsiElement.getRepresentativeLightMethod(): PsiMethod? defined in org.jetbrains.kotlin.asJava[DeserializedSimpleFunctionDescriptor]

'let' @ [119:62] ==> @InlineOnly public inline fun <T, R> PsiMethod.let(block: (PsiMethod) -> (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?)): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R> -> (com.intellij.util.Query<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>..com.intellij.util.Query<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>?)

'search' @ [119:91] ==> public open fun search(@NotNull p0: PsiMethod, p1: (SearchScope..SearchScope?), p2: Boolean): (Query<(PsiReference..PsiReference?)>..Query<(PsiReference..PsiReference?)>?) defined in com.intellij.psi.search.searches.MethodReferencesSearch[JavaMethodDescriptor]

'it' @ [119:98] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [119:102] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<anonymous>[ValueParameterDescriptorImpl]

'useScope' @ [119:105] ==> public final val PsiMethod.useScope: SearchScope[MyPropertyDescriptor]

'search' @ [120:41] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'myMethod' @ [120:48] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'myMethod' @ [120:58] ==> protected/*protected and package*/ final val myMethod: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode[JavaPropertyDescriptor]

'useScope' @ [120:67] ==> public final val PsiElement.useScope: SearchScope[MyPropertyDescriptor]

'query' @ [121:9] ==> val query: Query<(PsiReference..PsiReference?)> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers[LocalVariableDescriptor]

'forEach' @ [121:15] ==> @HidesMembers public inline fun <T> Iterable<(PsiReference..PsiReference?)>.forEach(action: ((PsiReference..PsiReference?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)

'processor' @ [121:25] ==> val processor: <no name provided> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers[LocalVariableDescriptor]

'process' @ [121:35] ==> public open fun process(p0: (PsiReference..PsiReference?)): Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<no name provided>[JavaMethodDescriptor]

'it' @ [121:43] ==> value-parameter it: (PsiReference..PsiReference?) defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers.<anonymous>[ValueParameterDescriptorImpl]

'callers' @ [122:16] ==> val callers: LinkedHashSet<PsiElement> defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.ui.KotlinMethodNode.computeCallers[LocalVariableDescriptor]

'toList' @ [122:24] ==> public fun <T> Iterable<PsiElement>.toList(): List<PsiElement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

