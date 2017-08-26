'HierarchyNodeDescriptor' @ [46:5] ==> protected/*protected and package*/ constructor HierarchyNodeDescriptor(@NotNull p0: Project, p1: raw (NodeDescriptor<(Any..Any?)>..NodeDescriptor<*>?), @NotNull p2: PsiElement, p3: Boolean) defined in com.intellij.ide.hierarchy.HierarchyNodeDescriptor[JavaClassConstructorDescriptor]

'klass' @ [46:29] ==> value-parameter klass: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.<init>[ValueParameterDescriptorImpl]

'project' @ [46:35] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'parentNode' @ [46:44] ==> value-parameter parentNode: HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.<init>[ValueParameterDescriptorImpl]

'klass' @ [46:56] ==> value-parameter klass: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.<init>[ValueParameterDescriptorImpl]

'parentNode' @ [46:63] ==> value-parameter parentNode: HierarchyNodeDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.<init>[ValueParameterDescriptorImpl]

'baseElement' @ [47:31] ==> value-parameter baseElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.<init>[ValueParameterDescriptorImpl]

'createSmartPointer' @ [47:43] ==> public fun <E : PsiElement> PsiElement.createSmartPointer(): SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> PsiElement

'when (psiElement) {
            is KtNamedDeclaration -> psiElement.resolveToDescriptor()
            is PsiMember -> psiElement.getJavaMemberDescriptor()
            else -> null
        }' @ [53:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'psiElement' @ [53:22] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.resolveToDescriptor[ValueParameterDescriptorImpl]

'psiElement' @ [54:38] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.resolveToDescriptor[ValueParameterDescriptorImpl]

'resolveToDescriptor' @ [54:49] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'psiElement' @ [55:29] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.resolveToDescriptor[ValueParameterDescriptorImpl]

'getJavaMemberDescriptor' @ [55:40] ==> @JvmOverloads public fun PsiMember.getJavaMemberDescriptor(resolutionFacade: ResolutionFacade? = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'baseElement' @ [60:39] ==> private final val baseElement: SmartPsiElementPointer<PsiElement> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'element' @ [60:51] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<PsiElement>.element: PsiElement?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> PsiElement

'let' @ [60:60] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> DeclarationDescriptor?

'resolveToDescriptor' @ [60:66] ==> private final fun resolveToDescriptor(psiElement: PsiElement): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'it' @ [60:86] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getBaseDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [62:47] ==> public final val KotlinOverrideHierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'let' @ [62:59] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> DeclarationDescriptor?): DeclarationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> DeclarationDescriptor?

'resolveToDescriptor' @ [62:65] ==> private final fun resolveToDescriptor(psiElement: PsiElement): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'it' @ [62:85] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentClassDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'getCurrentClassDescriptor' @ [65:31] ==> private final fun getCurrentClassDescriptor(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'getBaseDescriptor' @ [66:30] ==> private final fun getBaseDescriptor(): CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'baseDescriptor' @ [67:35] ==> val baseDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'containingDeclaration' @ [67:50] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'getTypeSubstitutor' @ [68:27] ==> public fun getTypeSubstitutor(baseType: KotlinType, derivedType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.types.substitutions[DeserializedSimpleFunctionDescriptor]

'baseClassDescriptor' @ [68:46] ==> val baseClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'defaultType' @ [68:66] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [68:79] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'defaultType' @ [68:95] ==> public final val ClassDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'classDescriptor' @ [69:16] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'findCallableMemberBySignature' @ [69:32] ==> public fun ClassDescriptor.findCallableMemberBySignature(signature: CallableMemberDescriptor, allowOverridabilityConflicts: Boolean = ...): CallableMemberDescriptor? defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'baseDescriptor' @ [69:62] ==> val baseDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'substitute' @ [69:77] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [69:88] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.getCurrentDescriptor[LocalVariableDescriptor]

'getCurrentClassDescriptor' @ [73:31] ==> private final fun getCurrentClassDescriptor(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'getCurrentDescriptor' @ [74:34] ==> private final fun getCurrentDescriptor(): CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'MethodNotDefined' @ [74:86] ==> public final val MethodNotDefined: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'callableDescriptor' @ [76:13] ==> val callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'kind' @ [76:32] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [76:70] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'callableDescriptor' @ [77:17] ==> val callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'modality' @ [77:36] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [77:57] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'MethodDefined' @ [78:39] ==> public final val MethodDefined: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'classDescriptor' @ [81:31] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'modality' @ [81:47] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [81:68] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'getAllOverriddenDeclarations' @ [82:53] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> getAllOverriddenDeclarations(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'callableDescriptor' @ [82:82] ==> val callableDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'any' @ [82:102] ==> public inline fun <T> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.any(predicate: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)

'it' @ [82:108] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [82:111] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'ABSTRACT' @ [82:132] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'if (isAbstractClass || hasBaseImplementation) AllIcons.Hierarchy.MethodNotDefined else AllIcons.Hierarchy.ShouldDefineMethod' @ [83:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Icon?, elseBranch: Icon?): Icon?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Icon?

'isAbstractClass' @ [83:20] ==> val isAbstractClass: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'hasBaseImplementation' @ [83:39] ==> val hasBaseImplementation: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.calculateState[LocalVariableDescriptor]

'MethodNotDefined' @ [83:81] ==> public final val MethodNotDefined: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'ShouldDefineMethod' @ [83:122] ==> public final val ShouldDefineMethod: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'ICON_FLAG_VISIBILITY' @ [87:30] ==> public const final val ICON_FLAG_VISIBILITY: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'isMarkReadOnly' @ [88:13] ==> protected/*protected and package*/ for synthetic extension final val KotlinOverrideHierarchyNodeDescriptor.isMarkReadOnly: Boolean[MyPropertyDescriptor]

'flags' @ [89:13] ==> var flags: Int defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'flags' @ [89:21] ==> var flags: Int defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'ICON_FLAG_READ_STATUS' @ [89:39] ==> public const final val ICON_FLAG_READ_STATUS: Int defined in com.intellij.openapi.util.Iconable[JavaPropertyDescriptor]

'super' @ [92:23] ==> <this> defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[LazyClassReceiverParameterDescriptor]

'update' @ [92:29] ==> public open fun update(): Boolean defined in com.intellij.ide.hierarchy.HierarchyNodeDescriptor[JavaMethodDescriptor]

'psiElement' @ [94:24] ==> public final val KotlinOverrideHierarchyNodeDescriptor.psiElement: PsiElement?[MyPropertyDescriptor]

'getCurrentClassDescriptor' @ [95:31] ==> private final fun getCurrentClassDescriptor(): ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'classPsi' @ [96:13] ==> val classPsi: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'classDescriptor' @ [96:33] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'message' @ [97:43] ==> public open fun message(@NotNull @PropertyKey p0: String, @NotNull vararg p1: (Any..Any?)): (String..String?) defined in com.intellij.ide.IdeBundle[JavaMethodDescriptor]

'!' @ [98:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'myHighlightedText' @ [98:18] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'text' @ [98:36] ==> public final val CompositeAppearance.text: String[MyPropertyDescriptor]

'startsWith' @ [98:41] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'invalidPrefix' @ [98:52] ==> val invalidPrefix: (String..String?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'myHighlightedText' @ [99:17] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'beginning' @ [99:35] ==> public final val CompositeAppearance.beginning: (CompositeAppearance.DequeEnd..CompositeAppearance.DequeEnd?)[MyPropertyDescriptor]

'addText' @ [99:45] ==> public open fun addText(p0: (String..String?), p1: (TextAttributes..TextAttributes?)): Unit defined in com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd[JavaMethodDescriptor]

'invalidPrefix' @ [99:53] ==> val invalidPrefix: (String..String?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'getInvalidPrefixAttributes' @ [99:68] ==> protected/*protected static*/ open fun getInvalidPrefixAttributes(): (TextAttributes..TextAttributes?) defined in com.intellij.ide.hierarchy.HierarchyNodeDescriptor[JavaMethodDescriptor]

'classPsi' @ [104:26] ==> val classPsi: PsiElement? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'getIcon' @ [104:35] ==> public abstract fun getIcon(@Iconable.IconFlags p0: Int): (Icon..Icon?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'flags' @ [104:43] ==> var flags: Int defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'calculateState' @ [105:28] ==> internal final fun calculateState(): Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[SimpleFunctionDescriptorImpl]

'changes' @ [107:13] ==> var changes: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'newRawIcon' @ [107:24] ==> val newRawIcon: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'rawIcon' @ [107:39] ==> private final var rawIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'newStateIcon' @ [107:50] ==> val newStateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'stateIcon' @ [107:67] ==> private final var stateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'changes' @ [108:13] ==> var changes: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'rawIcon' @ [110:13] ==> private final var rawIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'newRawIcon' @ [110:23] ==> val newRawIcon: (Icon..Icon?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'stateIcon' @ [111:13] ==> private final var stateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'newStateIcon' @ [111:25] ==> val newStateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'rawIcon' @ [113:27] ==> private final var rawIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'myIsBase' @ [115:17] ==> protected/*protected and package*/ final val myIsBase: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'LayeredIcon' @ [116:28] ==> public constructor LayeredIcon(p0: Int) defined in com.intellij.ui.LayeredIcon[JavaClassConstructorDescriptor]

'icon' @ [117:17] ==> val icon: LayeredIcon defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'setIcon' @ [117:22] ==> public open fun setIcon(p0: (Icon..Icon?), p1: Int): Unit defined in com.intellij.ui.LayeredIcon[JavaMethodDescriptor]

'newIcon' @ [117:30] ==> var newIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'icon' @ [118:17] ==> val icon: LayeredIcon defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'setIcon' @ [118:22] ==> public open fun setIcon(p0: (Icon..Icon?), p1: Int, p2: Int, p3: Int): Unit defined in com.intellij.ui.LayeredIcon[JavaMethodDescriptor]

'Base' @ [118:49] ==> public final val Base: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'-' @ [118:58] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'Base' @ [118:78] ==> public final val Base: (Icon..Icon?) defined in com.intellij.icons.AllIcons.Hierarchy[JavaPropertyDescriptor]

'iconWidth' @ [118:83] ==> public final val Icon.iconWidth: Int[MyPropertyDescriptor]

'newIcon' @ [119:17] ==> var newIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'icon' @ [119:27] ==> val icon: LayeredIcon defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'stateIcon' @ [122:17] ==> private final var stateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'newIcon' @ [123:17] ==> var newIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'RowIcon' @ [123:27] ==> public constructor RowIcon(vararg p0: (Icon..Icon?)) defined in com.intellij.ui.RowIcon[JavaClassConstructorDescriptor]

'stateIcon' @ [123:35] ==> private final var stateIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[PropertyDescriptorImpl]

'newIcon' @ [123:46] ==> var newIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'icon' @ [126:13] ==> public final var KotlinOverrideHierarchyNodeDescriptor.icon: (Icon..Icon?)[MyPropertyDescriptor]

'newIcon' @ [126:20] ==> var newIcon: Icon? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'myHighlightedText' @ [129:23] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'myHighlightedText' @ [131:9] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'CompositeAppearance' @ [131:29] ==> public constructor CompositeAppearance() defined in com.intellij.openapi.roots.ui.util.CompositeAppearance[JavaClassConstructorDescriptor]

'myColor' @ [133:13] ==> protected/*protected and package*/ final var myColor: (Color..Color?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'classNameAttributes' @ [134:13] ==> var classNameAttributes: TextAttributes? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'TextAttributes' @ [134:35] ==> public constructor TextAttributes(@Nullable p0: Color?, @Nullable p1: Color?, @Nullable p2: Color?, p3: (EffectType..EffectType?), @JdkConstants.FontStyle p4: Int) defined in com.intellij.openapi.editor.markup.TextAttributes[JavaClassConstructorDescriptor]

'myColor' @ [134:50] ==> protected/*protected and package*/ final var myColor: (Color..Color?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'PLAIN' @ [134:82] ==> public const final val PLAIN: Int defined in java.awt.Font[JavaPropertyDescriptor]

'with' @ [137:9] ==> @InlineOnly public inline fun <T, R> with(receiver: (CompositeAppearance.DequeEnd..CompositeAppearance.DequeEnd?), block: (CompositeAppearance.DequeEnd..CompositeAppearance.DequeEnd?).() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd..com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd?)
    <R> -> Unit

'myHighlightedText' @ [137:15] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'ending' @ [137:33] ==> public final val CompositeAppearance.ending: (CompositeAppearance.DequeEnd..CompositeAppearance.DequeEnd?)[MyPropertyDescriptor]

'addText' @ [138:13] ==> public open fun addText(p0: (String..String?), p1: (TextAttributes..TextAttributes?)): Unit defined in com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd[JavaMethodDescriptor]

'classDescriptor' @ [138:21] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'name' @ [138:37] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [138:42] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'classNameAttributes' @ [138:54] ==> var classNameAttributes: TextAttributes? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'classDescriptor' @ [139:13] ==> val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'parents' @ [139:29] ==> public val DeclarationDescriptor.parents: Sequence<DeclarationDescriptor> defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'forEach' @ [139:37] ==> public inline fun <T> Sequence<DeclarationDescriptor>.forEach(action: (DeclarationDescriptor) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor

'when (parentDescriptor) {
                    is MemberDescriptor -> {
                        addText(" in ${parentDescriptor.name.asString()}", classNameAttributes)
                        if (parentDescriptor is FunctionDescriptor) {
                            addText("()", classNameAttributes)
                        }
                    }
                    is PackageFragmentDescriptor -> {
                        addText("  (${parentDescriptor.fqName.asString()})", HierarchyNodeDescriptor.getPackageNameAttributes())
                        return@forEach
                    }
                }' @ [140:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'parentDescriptor' @ [140:23] ==> value-parameter parentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addText' @ [142:25] ==> public open fun addText(p0: (String..String?), p1: (TextAttributes..TextAttributes?)): Unit defined in com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd[JavaMethodDescriptor]

'parentDescriptor' @ [142:40] ==> value-parameter parentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [142:57] ==> public final val MemberDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [142:62] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'classNameAttributes' @ [142:76] ==> var classNameAttributes: TextAttributes? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'parentDescriptor' @ [143:29] ==> value-parameter parentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'addText' @ [144:29] ==> public open fun addText(p0: (String..String?), p1: (TextAttributes..TextAttributes?)): Unit defined in com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd[JavaMethodDescriptor]

'classNameAttributes' @ [144:43] ==> var classNameAttributes: TextAttributes? defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'addText' @ [148:25] ==> public open fun addText(p0: (String..String?), p1: (TextAttributes..TextAttributes?)): Unit defined in com.intellij.openapi.roots.ui.util.CompositeAppearance.DequeEnd[JavaMethodDescriptor]

'parentDescriptor' @ [148:39] ==> value-parameter parentDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'fqName' @ [148:56] ==> public abstract val fqName: FqName defined in org.jetbrains.kotlin.descriptors.PackageFragmentDescriptor[DeserializedPropertyDescriptor]

'asString' @ [148:63] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'getPackageNameAttributes' @ [148:102] ==> protected/*protected static*/ open fun getPackageNameAttributes(): (TextAttributes..TextAttributes?) defined in com.intellij.ide.hierarchy.HierarchyNodeDescriptor[JavaMethodDescriptor]

'myName' @ [155:9] ==> protected/*protected and package*/ final var myName: (String..String?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'myHighlightedText' @ [155:18] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'text' @ [155:36] ==> public final val CompositeAppearance.text: String[MyPropertyDescriptor]

'!' @ [157:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'equal' @ [157:24] ==> public open fun <T : (Any..Any?)> equal(@Nullable p0: CompositeAppearance?, @Nullable p1: CompositeAppearance?): Boolean defined in com.intellij.openapi.util.Comparing[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompositeAppearance

'myHighlightedText' @ [157:30] ==> protected/*protected and package*/ final var myHighlightedText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor[JavaPropertyDescriptor]

'oldText' @ [157:49] ==> val oldText: (CompositeAppearance..CompositeAppearance?) defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'changes' @ [158:13] ==> var changes: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

'changes' @ [161:16] ==> var changes: Boolean defined in org.jetbrains.kotlin.idea.hierarchy.overrides.KotlinOverrideHierarchyNodeDescriptor.update[LocalVariableDescriptor]

