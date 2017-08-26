'KotlinQuickFixAction<KtDeclaration>' @ [45:65] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtDeclaration

'declaration' @ [45:101] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.<init>[ValueParameterDescriptorImpl]

'CachedValue' @ [47:49] ==> public fun <T> CachedValue(project: Project, trackValue: Boolean = ..., provider: () -> CachedValueProvider.Result<MakeOverriddenMemberOpenFix.Companion.QuickFixInfo>): CachedValue<(MakeOverriddenMemberOpenFix.Companion.QuickFixInfo..MakeOverriddenMemberOpenFix.Companion.QuickFixInfo?)> defined in org.jetbrains.kotlin.idea.core.util[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> QuickFixInfo

'declaration' @ [47:61] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.<init>[ValueParameterDescriptorImpl]

'project' @ [47:73] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'createSingleDependency' @ [48:36] ==> public open fun <T : (Any..Any?)> createSingleDependency(@Nullable p0: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo?, @NotNull p1: Any): (CachedValueProvider.Result<(MakeOverriddenMemberOpenFix.Companion.QuickFixInfo..MakeOverriddenMemberOpenFix.Companion.QuickFixInfo?)>..CachedValueProvider.Result<(MakeOverriddenMemberOpenFix.Companion.QuickFixInfo..MakeOverriddenMemberOpenFix.Companion.QuickFixInfo?)>?) defined in com.intellij.psi.util.CachedValueProvider.Result[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> QuickFixInfo

'computeInfo' @ [48:59] ==> private final fun computeInfo(): MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[SimpleFunctionDescriptorImpl]

'MODIFICATION_COUNT' @ [48:97] ==> public final val MODIFICATION_COUNT: raw (Key<(Any..Any?)>..Key<*>?) defined in com.intellij.psi.util.PsiModificationTracker[JavaPropertyDescriptor]

'myQuickFixInfo' @ [52:17] ==> private final val myQuickFixInfo: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'declNames' @ [52:32] ==> public final val declNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.QuickFixInfo[PropertyDescriptorImpl]

'myQuickFixInfo' @ [55:17] ==> private final val myQuickFixInfo: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'declarations' @ [55:32] ==> public final val declarations: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.QuickFixInfo[PropertyDescriptorImpl]

'element' @ [58:23] ==> protected final val element: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'QUICKFIX_UNAVAILABLE' @ [58:41] ==> private final val QUICKFIX_UNAVAILABLE: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[PropertyDescriptorImpl]

'mutableListOf' @ [59:47] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartPsiElementPointer<KtCallableDeclaration>

'mutableListOf' @ [60:43] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [61:26] ==> val element: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'resolveToDescriptorIfAny' @ [61:34] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'FULL' @ [61:75] ==> enum entry FULL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'QUICKFIX_UNAVAILABLE' @ [61:120] ==> private final val QUICKFIX_UNAVAILABLE: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[PropertyDescriptorImpl]

'getAllDeclaredNonOverridableOverriddenDescriptors' @ [63:38] ==> private final fun getAllDeclaredNonOverridableOverriddenDescriptors(callableMemberDescriptor: CallableMemberDescriptor): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[SimpleFunctionDescriptorImpl]

'descriptor' @ [63:88] ==> val descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'assert' @ [64:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'overriddenDescriptor' @ [64:20] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'kind' @ [64:41] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [64:49] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DescriptorToSourceUtils' @ [65:36] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [65:60] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'overriddenDescriptor' @ [65:84] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'overriddenMember' @ [66:17] ==> val overriddenMember: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'!' @ [66:45] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'overriddenMember' @ [66:46] ==> val overriddenMember: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'canRefactor' @ [66:63] ==> public fun PsiElement.canRefactor(): Boolean defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'overriddenMember' @ [66:80] ==> val overriddenMember: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'overriddenMember' @ [67:17] ==> val overriddenMember: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'modifierList' @ [67:34] ==> public final val KtCallableDeclaration.modifierList: KtModifierList?[MyPropertyDescriptor]

'hasModifier' @ [67:48] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [67:60] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'QUICKFIX_UNAVAILABLE' @ [68:24] ==> private final val QUICKFIX_UNAVAILABLE: MakeOverriddenMemberOpenFix.Companion.QuickFixInfo defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[PropertyDescriptorImpl]

'overriddenDescriptor' @ [70:45] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'containingDeclaration' @ [70:66] ==> public final val CallableMemberDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'name' @ [70:88] ==> public final val DeclarationDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [70:93] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'overriddenNonOverridableMembers' @ [71:13] ==> val overriddenNonOverridableMembers: MutableList<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'add' @ [71:45] ==> public abstract fun add(element: DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'overriddenMember' @ [71:49] ==> val overriddenMember: PsiElement? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'createSmartPointer' @ [71:66] ==> public fun <E : PsiElement> KtCallableDeclaration.createSmartPointer(): SmartPsiElementPointer<KtCallableDeclaration> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <E : PsiElement> -> KtCallableDeclaration

'containingDeclarationsNames' @ [72:13] ==> val containingDeclarationsNames: MutableList<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'add' @ [72:41] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'containingDeclarationName' @ [72:45] ==> val containingDeclarationName: String defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'QuickFixInfo' @ [74:16] ==> public constructor QuickFixInfo(declarations: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */>, declNames: List<String>) defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.QuickFixInfo[ClassConstructorDescriptorImpl]

'overriddenNonOverridableMembers' @ [74:29] ==> val overriddenNonOverridableMembers: MutableList<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'containingDeclarationsNames' @ [74:62] ==> val containingDeclarationsNames: MutableList<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.computeInfo[LocalVariableDescriptor]

'!' @ [79:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'super' @ [79:14] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [79:20] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [79:32] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [79:41] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [79:49] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [79:58] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.isAvailable[ValueParameterDescriptorImpl]

'overriddenNonOverridableMembers' @ [83:16] ==> private final val overriddenNonOverridableMembers: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'isNotEmpty' @ [83:48] ==> @InlineOnly public inline fun <T> Collection<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartPsiElementPointer<KtCallableDeclaration>

'element' @ [87:23] ==> protected final val element: KtDeclaration? defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'overriddenNonOverridableMembers' @ [88:13] ==> private final val overriddenNonOverridableMembers: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'size' @ [88:45] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'containingDeclarationsNames' @ [89:24] ==> private final val containingDeclarationsNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'element' @ [89:63] ==> val element: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'name' @ [89:71] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'name' @ [90:27] ==> val name: String defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'OPEN_KEYWORD' @ [90:33] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'containingDeclarationsNames' @ [92:38] ==> private final val containingDeclarationsNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'sorted' @ [92:66] ==> public fun <T : Comparable<String>> Iterable<String>.sorted(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> String

'sortedDeclarationNames' @ [93:28] ==> val sortedDeclarationNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'subList' @ [93:51] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<String> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sortedDeclarationNames' @ [93:62] ==> val sortedDeclarationNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'size' @ [93:85] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'joinToString' @ [93:95] ==> public fun <T> Iterable<String>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((String) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'sortedDeclarationNames' @ [94:28] ==> val sortedDeclarationNames: List<String> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'last' @ [94:51] ==> public fun <T> List<String>.last(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'element' @ [95:25] ==> val element: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'name' @ [95:33] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'declarations' @ [95:44] ==> val declarations: String defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.getText[LocalVariableDescriptor]

'overriddenNonOverridableMembers' @ [101:34] ==> private final val overriddenNonOverridableMembers: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[PropertyDescriptorImpl]

'overriddenMember' @ [102:13] ==> val overriddenMember: DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */ defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.invoke[LocalVariableDescriptor]

'element' @ [102:30] ==> public final val <E : (PsiElement..PsiElement?)> SmartPsiElementPointer<KtCallableDeclaration>.element: KtCallableDeclaration?[MyPropertyDescriptor]
Inferred types:
    <E : (PsiElement..PsiElement?)> -> KtCallableDeclaration

'addModifier' @ [102:39] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [102:51] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'KotlinSingleIntentionActionFactory' @ [106:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'QuickFixInfo' @ [109:44] ==> public constructor QuickFixInfo(declarations: List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */>, declNames: List<String>) defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.QuickFixInfo[ClassConstructorDescriptorImpl]

'emptyList' @ [109:57] ==> public fun <T> emptyList(): List<DeclarationPointer /* = SmartPsiElementPointer<KtCallableDeclaration> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartPsiElementPointer<KtCallableDeclaration>

'emptyList' @ [109:70] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashSetOf' @ [113:26] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'retainNonOverridableMembers' @ [114:55] ==> private final fun retainNonOverridableMembers(callableMemberDescriptors: Collection<CallableMemberDescriptor>): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[SimpleFunctionDescriptorImpl]

'callableMemberDescriptor' @ [114:83] ==> value-parameter callableMemberDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[ValueParameterDescriptorImpl]

'overriddenDescriptors' @ [114:108] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'nonOverridableOverriddenDescriptors' @ [115:42] ==> val nonOverridableOverriddenDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'when (overriddenDescriptor.kind) {
                    DECLARATION ->
                        result.add(overriddenDescriptor)

                    FAKE_OVERRIDE, DELEGATION ->
                        result.addAll(getAllDeclaredNonOverridableOverriddenDescriptors(overriddenDescriptor))

                    SYNTHESIZED -> {
                    } /* do nothing */

                    else -> throw UnsupportedOperationException("Unexpected callable kind ${overriddenDescriptor.kind}")
                }' @ [116:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any, entry3: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'overriddenDescriptor' @ [116:23] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'kind' @ [116:44] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'DECLARATION' @ [117:21] ==> enum entry DECLARATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'result' @ [118:25] ==> val result: HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'add' @ [118:32] ==> public open fun add(element: CallableMemberDescriptor): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'overriddenDescriptor' @ [118:36] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'FAKE_OVERRIDE' @ [120:21] ==> enum entry FAKE_OVERRIDE defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'DELEGATION' @ [120:36] ==> enum entry DELEGATION defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'result' @ [121:25] ==> val result: HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'addAll' @ [121:32] ==> public open fun addAll(elements: Collection<CallableMemberDescriptor>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'getAllDeclaredNonOverridableOverriddenDescriptors' @ [121:39] ==> private final fun getAllDeclaredNonOverridableOverriddenDescriptors(callableMemberDescriptor: CallableMemberDescriptor): Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion[SimpleFunctionDescriptorImpl]

'overriddenDescriptor' @ [121:89] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'SYNTHESIZED' @ [123:21] ==> enum entry SYNTHESIZED defined in org.jetbrains.kotlin.descriptors.CallableMemberDescriptor.Kind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [126:35] ==> public final fun <init>(p0: (String..String?)): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'overriddenDescriptor' @ [126:93] ==> val overriddenDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'kind' @ [126:114] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'result' @ [129:20] ==> val result: HashSet<CallableMemberDescriptor> /* = HashSet<CallableMemberDescriptor> */ defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.getAllDeclaredNonOverridableOverriddenDescriptors[LocalVariableDescriptor]

'callableMemberDescriptors' @ [134:20] ==> value-parameter callableMemberDescriptors: Collection<CallableMemberDescriptor> defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.retainNonOverridableMembers[ValueParameterDescriptorImpl]

'filter' @ [134:46] ==> public inline fun <T> Iterable<CallableMemberDescriptor>.filter(predicate: (CallableMemberDescriptor) -> Boolean): List<CallableMemberDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor

'!' @ [134:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [134:56] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.retainNonOverridableMembers.<anonymous>[ValueParameterDescriptorImpl]

'isOverridable' @ [134:59] ==> public val CallableMemberDescriptor.isOverridable: Boolean defined in org.jetbrains.kotlin.descriptors[DeserializedPropertyDescriptor]

'diagnostic' @ [138:31] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [138:42] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [138:53] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtDeclaration? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtDeclaration

'MakeOverriddenMemberOpenFix' @ [139:20] ==> public constructor MakeOverriddenMemberOpenFix(declaration: KtDeclaration) defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix[ClassConstructorDescriptorImpl]

'declaration' @ [139:48] ==> val declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.quickfix.MakeOverriddenMemberOpenFix.Companion.createAction[LocalVariableDescriptor]

