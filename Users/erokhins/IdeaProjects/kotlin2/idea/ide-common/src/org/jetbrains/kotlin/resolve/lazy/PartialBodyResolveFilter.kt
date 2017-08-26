'StatementFilter' @ [37:5] ==> public constructor StatementFilter() defined in org.jetbrains.kotlin.resolve.StatementFilter[DeserializedClassConstructorDescriptor]

'StatementMarks' @ [39:34] ==> public constructor StatementMarks() defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[ClassConstructorDescriptorImpl]

'HashSet' @ [41:40] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'probablyNothingCallableNames' @ [41:48] ==> value-parameter probablyNothingCallableNames: ProbablyNothingCallableNames defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>[ValueParameterDescriptorImpl]

'functionNames' @ [41:77] ==> public abstract fun functionNames(): Collection<String> defined in org.jetbrains.kotlin.resolve.lazy.ProbablyNothingCallableNames[SimpleFunctionDescriptorImpl]

'HashSet' @ [42:40] ==> public constructor HashSet<E : (Any..Any?)>(p0: (MutableCollection<out (String..String?)>..Collection<(String..String?)>?)) defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'probablyNothingCallableNames' @ [42:48] ==> value-parameter probablyNothingCallableNames: ProbablyNothingCallableNames defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>[ValueParameterDescriptorImpl]

'propertyNames' @ [42:77] ==> public abstract fun propertyNames(): Collection<String> defined in org.jetbrains.kotlin.resolve.lazy.ProbablyNothingCallableNames[SimpleFunctionDescriptorImpl]

'statementMarks' @ [44:59] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'statementMark' @ [44:74] ==> public final fun statementMark(statement: KtExpression): PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'it' @ [44:88] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.filter.<anonymous>[ValueParameterDescriptorImpl]

'NONE' @ [44:105] ==> enum entry NONE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'statementMarks' @ [47:17] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'allMarkedStatements' @ [47:32] ==> public final fun allMarkedStatements(): Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'elementsToResolve' @ [50:9] ==> value-parameter elementsToResolve: Collection<KtElement> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>[ValueParameterDescriptorImpl]

'forEach' @ [50:27] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'assert' @ [50:37] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'declaration' @ [50:44] ==> private final val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'isAncestor' @ [50:56] ==> public fun PsiElement?.isAncestor(element: PsiElement, strict: Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [50:67] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'assert' @ [51:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [51:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocal' @ [51:27] ==> public open fun isLocal(@NotNull p0: KtDeclaration): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'declaration' @ [51:35] ==> private final val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'declaration' @ [53:9] ==> private final val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'forEachDescendantOfType' @ [53:21] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(noinline action: (KtCallableDeclaration) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtCallableDeclaration

'declaration' @ [54:17] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [54:29] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'containsProbablyNothing' @ [54:43] ==> private final fun KtTypeReference?.containsProbablyNothing(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'declaration' @ [55:28] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [55:40] ==> public final val KtCallableDeclaration.name: String?[MyPropertyDescriptor]

'name' @ [56:21] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[LocalVariableDescriptor]

'if (declaration is KtNamedFunction) {
                        nothingFunctionNames.add(name)
                    }
                    else {
                        nothingVariableNames.add(name)
                    }' @ [57:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'declaration' @ [57:25] ==> value-parameter declaration: KtCallableDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'nothingFunctionNames' @ [58:25] ==> private final val nothingFunctionNames: HashSet<(String..String?)> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'add' @ [58:46] ==> public open fun add(element: (String..String?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [58:50] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[LocalVariableDescriptor]

'nothingVariableNames' @ [61:25] ==> private final val nothingVariableNames: HashSet<(String..String?)> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'add' @ [61:46] ==> public open fun add(element: (String..String?)): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'name' @ [61:50] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[LocalVariableDescriptor]

'elementsToResolve' @ [67:9] ==> value-parameter elementsToResolve: Collection<KtElement> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>[ValueParameterDescriptorImpl]

'forEach' @ [67:27] ==> @HidesMembers public inline fun <T> Iterable<KtElement>.forEach(action: (KtElement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtElement

'statementMarks' @ [68:13] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'mark' @ [68:28] ==> public final fun mark(element: PsiElement, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'it' @ [68:33] ==> value-parameter it: KtElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'if (forCompletion) MarkLevel.NEED_COMPLETION else MarkLevel.NEED_REFERENCE_RESOLVE' @ [68:37] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PartialBodyResolveFilter.MarkLevel, elseBranch: PartialBodyResolveFilter.MarkLevel): PartialBodyResolveFilter.MarkLevel[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> MarkLevel

'forCompletion' @ [68:41] ==> value-parameter forCompletion: Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>[ValueParameterDescriptorImpl]

'NEED_COMPLETION' @ [68:66] ==> enum entry NEED_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'NEED_REFERENCE_RESOLVE' @ [68:97] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'declaration' @ [70:9] ==> private final val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'forTopLevelBlocksInside' @ [70:21] ==> private final fun KtElement.forTopLevelBlocksInside(action: (KtBlockExpression) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'processBlock' @ [70:47] ==> private final fun processBlock(block: KtBlockExpression): PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'it' @ [70:60] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isValueNeeded' @ [76:13] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'block' @ [76:27] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[ValueParameterDescriptorImpl]

'block' @ [77:13] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[ValueParameterDescriptorImpl]

'lastStatement' @ [77:19] ==> private final fun KtBlockExpression.lastStatement(): KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'let' @ [77:36] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'statementMarks' @ [77:42] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'mark' @ [77:57] ==> public final fun mark(element: PsiElement, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'it' @ [77:62] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'NEED_REFERENCE_RESOLVE' @ [77:76] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'NameFilter' @ [80:26] ==> public constructor NameFilter() defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[ClassConstructorDescriptorImpl]

'statementMarks' @ [81:30] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'lastMarkedStatement' @ [81:45] ==> public final fun lastMarkedStatement(block: KtBlockExpression, minLevel: PartialBodyResolveFilter.MarkLevel): KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'block' @ [81:65] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[ValueParameterDescriptorImpl]

'NEED_REFERENCE_RESOLVE' @ [81:82] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'nameFilter' @ [81:116] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'startStatement' @ [83:27] ==> val startStatement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'siblings' @ [83:42] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'statement' @ [84:17] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'if (statement is KtNamedDeclaration) {
                val name = statement.getName()
                if (name != null && nameFilter(name)) {
                    statementMarks.mark(statement, MarkLevel.NEED_REFERENCE_RESOLVE)
                }
            }
            else if (statement is KtDestructuringDeclaration) {
                if (statement.entries.any {
                    val name = it.name
                    name != null && nameFilter(name)
                }) {
                    statementMarks.mark(statement, MarkLevel.NEED_REFERENCE_RESOLVE)
                }
            }' @ [86:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'statement' @ [86:17] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'statement' @ [87:28] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'getName' @ [87:38] ==> @Nullable public abstract fun getName(): String? defined in org.jetbrains.kotlin.psi.KtNamedDeclaration[JavaMethodDescriptor]

'name' @ [88:21] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'invoke' @ [88:37] ==> public open fun invoke(name: String): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[SimpleFunctionDescriptorImpl]

'name' @ [88:48] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'statementMarks' @ [89:21] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'mark' @ [89:36] ==> public final fun mark(element: PsiElement, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'statement' @ [89:41] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'NEED_REFERENCE_RESOLVE' @ [89:62] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'statement' @ [92:22] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'statement' @ [93:21] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'entries' @ [93:31] ==> public final val KtDestructuringDeclaration.entries: (MutableList<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>..List<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>)[MyPropertyDescriptor]

'any' @ [93:39] ==> public inline fun <T> Iterable<(KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)>.any(predicate: ((KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry..org.jetbrains.kotlin.psi.KtDestructuringDeclarationEntry?)

'it' @ [94:32] ==> value-parameter it: (KtDestructuringDeclarationEntry..KtDestructuringDeclarationEntry?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [94:35] ==> public final val KtDestructuringDeclarationEntry.name: String?[MyPropertyDescriptor]

'name' @ [95:21] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[LocalVariableDescriptor]

'invoke' @ [95:37] ==> public open fun invoke(name: String): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[SimpleFunctionDescriptorImpl]

'name' @ [95:48] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[LocalVariableDescriptor]

'statementMarks' @ [97:21] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'mark' @ [97:36] ==> public final fun mark(element: PsiElement, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'statement' @ [97:41] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'NEED_REFERENCE_RESOLVE' @ [97:62] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'statementMarks' @ [102:29] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'statementMark' @ [102:44] ==> public final fun statementMark(statement: KtExpression): PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'statement' @ [102:58] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'when (level) {
                    MarkLevel.NEED_REFERENCE_RESOLVE -> nameFilter.addUsedNames(statement)
                    MarkLevel.NEED_COMPLETION -> nameFilter.addAllNames()
                }' @ [103:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'level' @ [103:23] ==> val level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.updateNameFilter[LocalVariableDescriptor]

'NEED_REFERENCE_RESOLVE' @ [104:31] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'nameFilter' @ [104:57] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'addUsedNames' @ [104:68] ==> public final fun addUsedNames(statement: KtExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[SimpleFunctionDescriptorImpl]

'statement' @ [104:81] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'NEED_COMPLETION' @ [105:31] ==> enum entry NEED_COMPLETION defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'nameFilter' @ [105:50] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'addAllNames' @ [105:61] ==> public final fun addAllNames(): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[SimpleFunctionDescriptorImpl]

'updateNameFilter' @ [109:13] ==> local final fun updateNameFilter(): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[SimpleFunctionDescriptorImpl]

'!' @ [111:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nameFilter' @ [111:18] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'isEmpty' @ [111:29] ==> public final val isEmpty: Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'potentialSmartCastPlaces' @ [112:39] ==> private final fun potentialSmartCastPlaces(statement: KtExpression, filter: (PartialBodyResolveFilter.SmartCastName) -> Boolean = ...): Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'statement' @ [112:64] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'it' @ [112:77] ==> value-parameter it: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'affectsNames' @ [112:80] ==> public final fun affectsNames(nameFilter: (String) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[SimpleFunctionDescriptorImpl]

'nameFilter' @ [112:93] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'!' @ [113:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'smartCastPlaces' @ [113:22] ==> val smartCastPlaces: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'isEmpty' @ [113:38] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'smartCastPlaces' @ [115:21] ==> val smartCastPlaces: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'values' @ [115:37] ==> public abstract val values: Collection<List<KtExpression>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'flatMap' @ [116:30] ==> public inline fun <T, R> Iterable<List<KtExpression>>.flatMap(transform: (List<KtExpression>) -> Iterable<KtExpression>): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<KtExpression>
    <R> -> KtExpression

'it' @ [116:40] ==> value-parameter it: List<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [117:30] ==> @HidesMembers public inline fun <T> Iterable<KtExpression>.forEach(action: (KtExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'statementMarks' @ [117:40] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'mark' @ [117:55] ==> public final fun mark(element: PsiElement, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'it' @ [117:60] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'NEED_REFERENCE_RESOLVE' @ [117:74] ==> enum entry NEED_REFERENCE_RESOLVE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'updateNameFilter' @ [118:21] ==> local final fun updateNameFilter(): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[SimpleFunctionDescriptorImpl]

'statementMarks' @ [122:25] ==> private final val statementMarks: PartialBodyResolveFilter.StatementMarks defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'statementMark' @ [122:40] ==> public final fun statementMark(statement: KtExpression): PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'statement' @ [122:54] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'level' @ [123:17] ==> val level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'TAKE' @ [123:35] ==> enum entry TAKE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'statement' @ [124:17] ==> val statement: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'forTopLevelBlocksInside' @ [124:27] ==> private final fun KtElement.forTopLevelBlocksInside(action: (KtBlockExpression) -> Unit): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'processBlock' @ [125:39] ==> private final fun processBlock(block: KtBlockExpression): PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'nestedBlock' @ [125:52] ==> value-parameter nestedBlock: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[ValueParameterDescriptorImpl]

'nameFilter' @ [126:21] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'addNamesFromFilter' @ [126:32] ==> public final fun addNamesFromFilter(filter: PartialBodyResolveFilter.NameFilter): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[SimpleFunctionDescriptorImpl]

'childFilter' @ [126:51] ==> val childFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock.<anonymous>[LocalVariableDescriptor]

'nameFilter' @ [131:16] ==> val nameFilter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.processBlock[LocalVariableDescriptor]

'HashMap' @ [143:19] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> SmartCastName
    <V : (Any..Any?)> -> ArrayList<KtExpression>

'map' @ [146:13] ==> val map: HashMap<PartialBodyResolveFilter.SmartCastName, ArrayList<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[LocalVariableDescriptor]

'getOrPut' @ [146:17] ==> public inline fun <K, V> MutableMap<PartialBodyResolveFilter.SmartCastName, ArrayList<KtExpression>>.getOrPut(key: PartialBodyResolveFilter.SmartCastName, defaultValue: () -> ArrayList<KtExpression>): ArrayList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> ArrayList<KtExpression>

'name' @ [146:26] ==> value-parameter name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlace[ValueParameterDescriptorImpl]

'ArrayList' @ [146:34] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'add' @ [146:50] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'place' @ [146:54] ==> value-parameter place: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlace[ValueParameterDescriptorImpl]

'places' @ [150:17] ==> value-parameter places: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlaces[ValueParameterDescriptorImpl]

'isNotEmpty' @ [150:24] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'map' @ [151:17] ==> val map: HashMap<PartialBodyResolveFilter.SmartCastName, ArrayList<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[LocalVariableDescriptor]

'getOrPut' @ [151:21] ==> public inline fun <K, V> MutableMap<PartialBodyResolveFilter.SmartCastName, ArrayList<KtExpression>>.getOrPut(key: PartialBodyResolveFilter.SmartCastName, defaultValue: () -> ArrayList<KtExpression>): ArrayList<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> ArrayList<KtExpression>

'name' @ [151:30] ==> value-parameter name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlaces[ValueParameterDescriptorImpl]

'ArrayList' @ [151:38] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'places' @ [151:48] ==> value-parameter places: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlaces[ValueParameterDescriptorImpl]

'size' @ [151:55] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'addAll' @ [151:64] ==> public open fun addAll(elements: Collection<KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'places' @ [151:71] ==> value-parameter places: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addPlaces[ValueParameterDescriptorImpl]

'expression' @ [156:24] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addIfCanBeSmartCast[ValueParameterDescriptorImpl]

'smartCastExpressionName' @ [156:35] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'invoke' @ [157:17] ==> public abstract operator fun invoke(p1: PartialBodyResolveFilter.SmartCastName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'name' @ [157:24] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addIfCanBeSmartCast[LocalVariableDescriptor]

'addPlace' @ [158:17] ==> local final fun addPlace(name: PartialBodyResolveFilter.SmartCastName, place: KtExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'name' @ [158:26] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addIfCanBeSmartCast[LocalVariableDescriptor]

'expression' @ [158:32] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.addIfCanBeSmartCast[ValueParameterDescriptorImpl]

'statement' @ [162:9] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[ValueParameterDescriptorImpl]

'accept' @ [162:19] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'ControlFlowVisitor' @ [162:35] ==> public constructor ControlFlowVisitor() defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[ClassConstructorDescriptorImpl]

'expression' @ [164:17] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitPostfixExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [164:28] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtPostfixExpression[JavaMethodDescriptor]

'this' @ [164:43] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [166:21] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitPostfixExpression[ValueParameterDescriptorImpl]

'operationToken' @ [166:32] ==> public final val KtPostfixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCLEXCL' @ [166:59] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addIfCanBeSmartCast' @ [167:21] ==> local final fun addIfCanBeSmartCast(expression: KtExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'expression' @ [167:41] ==> value-parameter expression: KtPostfixExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitPostfixExpression[ValueParameterDescriptorImpl]

'baseExpression' @ [167:52] ==> public final val KtPostfixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [172:17] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [172:28] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtBinaryExpressionWithTypeRHS[JavaMethodDescriptor]

'this' @ [172:43] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [174:21] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'operationReference' @ [174:32] ==> public final val KtBinaryExpressionWithTypeRHS.operationReference: KtSimpleNameExpression[MyPropertyDescriptor]

'getReferencedNameElementType' @ [174:51] ==> public abstract fun getReferencedNameElementType(): IElementType defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'AS_KEYWORD' @ [174:94] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'addIfCanBeSmartCast' @ [175:21] ==> local final fun addIfCanBeSmartCast(expression: KtExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'expression' @ [175:41] ==> value-parameter expression: KtBinaryExpressionWithTypeRHS defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryWithTypeRHSExpression[ValueParameterDescriptorImpl]

'left' @ [175:52] ==> public final val KtBinaryExpressionWithTypeRHS.left: KtExpression[MyPropertyDescriptor]

'expression' @ [180:17] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [180:28] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtBinaryExpression[JavaMethodDescriptor]

'this' @ [180:43] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [182:21] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationToken' @ [182:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [182:59] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [183:32] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'left' @ [183:43] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'expression' @ [184:33] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'right' @ [184:44] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'left' @ [185:25] ==> val left: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'right' @ [185:41] ==> val right: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'left' @ [186:45] ==> val left: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'smartCastExpressionName' @ [186:50] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'smartCastName' @ [187:29] ==> val smartCastName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'invoke' @ [187:54] ==> public abstract operator fun invoke(p1: PartialBodyResolveFilter.SmartCastName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'smartCastName' @ [187:61] ==> val smartCastName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'collectAlwaysExitPoints' @ [188:41] ==> private final fun collectAlwaysExitPoints(statement: KtExpression?): Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'right' @ [188:65] ==> val right: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'addPlaces' @ [189:29] ==> local final fun addPlaces(name: PartialBodyResolveFilter.SmartCastName, places: Collection<KtExpression>): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'smartCastName' @ [189:39] ==> val smartCastName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'exits' @ [189:54] ==> val exits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'expression' @ [196:33] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'condition' @ [196:44] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'expression' @ [197:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'then' @ [197:45] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'expression' @ [198:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'`else`' @ [198:45] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'component1' @ [200:22] ==> public final operator fun component1(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [200:42] ==> public final operator fun component2(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'possiblySmartCastInCondition' @ [200:64] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'condition' @ [200:93] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'branch' @ [203:25] ==> value-parameter branch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[ValueParameterDescriptorImpl]

'smartCastNames' @ [204:41] ==> value-parameter smartCastNames: Collection<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[ValueParameterDescriptorImpl]

'filter' @ [204:56] ==> public inline fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.filter(predicate: (PartialBodyResolveFilter.SmartCastName) -> Boolean): List<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'filter' @ [204:63] ==> value-parameter filter: (PartialBodyResolveFilter.SmartCastName) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[ValueParameterDescriptorImpl]

'filteredNames' @ [205:25] ==> val filteredNames: List<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[LocalVariableDescriptor]

'isNotEmpty' @ [205:39] ==> @InlineOnly public inline fun <T> Collection<PartialBodyResolveFilter.SmartCastName>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'collectAlwaysExitPoints' @ [206:37] ==> private final fun collectAlwaysExitPoints(statement: KtExpression?): Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'branch' @ [206:61] ==> value-parameter branch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[ValueParameterDescriptorImpl]

'exits' @ [207:29] ==> val exits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[LocalVariableDescriptor]

'isNotEmpty' @ [207:35] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'filteredNames' @ [208:42] ==> val filteredNames: List<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[LocalVariableDescriptor]

'addPlaces' @ [209:33] ==> local final fun addPlaces(name: PartialBodyResolveFilter.SmartCastName, places: Collection<KtExpression>): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'name' @ [209:43] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[LocalVariableDescriptor]

'exits' @ [209:49] ==> val exits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.processBranchExits[LocalVariableDescriptor]

'processBranchExits' @ [215:17] ==> local final fun processBranchExits(smartCastNames: Collection<PartialBodyResolveFilter.SmartCastName>, branch: KtExpression?): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[SimpleFunctionDescriptorImpl]

'thenSmartCastNames' @ [215:36] ==> val thenSmartCastNames: Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'elseBranch' @ [215:56] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'processBranchExits' @ [216:17] ==> local final fun processBranchExits(smartCastNames: Collection<PartialBodyResolveFilter.SmartCastName>, branch: KtExpression?): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[SimpleFunctionDescriptorImpl]

'elseSmartCastNames' @ [216:36] ==> val elseSmartCastNames: Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'thenBranch' @ [216:56] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'condition' @ [218:17] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'accept' @ [218:28] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [218:35] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'thenBranch' @ [220:21] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'elseBranch' @ [220:43] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'potentialSmartCastPlaces' @ [221:37] ==> private final fun potentialSmartCastPlaces(statement: KtExpression, filter: (PartialBodyResolveFilter.SmartCastName) -> Boolean = ...): Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'thenBranch' @ [221:62] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'filter' @ [221:74] ==> value-parameter filter: (PartialBodyResolveFilter.SmartCastName) -> Boolean = ... defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[ValueParameterDescriptorImpl]

'!' @ [222:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thenCasts' @ [222:26] ==> val thenCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'isEmpty' @ [222:36] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'potentialSmartCastPlaces' @ [223:41] ==> private final fun potentialSmartCastPlaces(statement: KtExpression, filter: (PartialBodyResolveFilter.SmartCastName) -> Boolean = ...): Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'elseBranch' @ [223:66] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'invoke' @ [223:80] ==> public abstract operator fun invoke(p1: PartialBodyResolveFilter.SmartCastName): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [223:87] ==> value-parameter it: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'thenCasts' @ [223:94] ==> val thenCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'containsKey' @ [223:104] ==> public abstract fun containsKey(key: PartialBodyResolveFilter.SmartCastName): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'it' @ [223:116] ==> value-parameter it: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [224:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elseCasts' @ [224:30] ==> val elseCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'isEmpty' @ [224:40] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'component1' @ [225:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PartialBodyResolveFilter.SmartCastName, List<KtExpression>>.component1(): PartialBodyResolveFilter.SmartCastName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> List<KtExpression>

'component2' @ [225:41] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PartialBodyResolveFilter.SmartCastName, List<KtExpression>>.component2(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> List<KtExpression>

'thenCasts' @ [225:52] ==> val thenCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'elseCasts' @ [226:37] ==> val elseCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'containsKey' @ [226:47] ==> public abstract fun containsKey(key: PartialBodyResolveFilter.SmartCastName): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'name' @ [226:59] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'addPlaces' @ [227:37] ==> local final fun addPlaces(name: PartialBodyResolveFilter.SmartCastName, places: Collection<KtExpression>): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'name' @ [227:47] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'places' @ [227:53] ==> val places: List<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'component1' @ [231:35] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PartialBodyResolveFilter.SmartCastName, List<KtExpression>>.component1(): PartialBodyResolveFilter.SmartCastName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> List<KtExpression>

'component2' @ [231:41] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<PartialBodyResolveFilter.SmartCastName, List<KtExpression>>.component2(): List<KtExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> SmartCastName
    <V> -> List<KtExpression>

'elseCasts' @ [231:52] ==> val elseCasts: Map<PartialBodyResolveFilter.SmartCastName, List<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'addPlaces' @ [232:33] ==> local final fun addPlaces(name: PartialBodyResolveFilter.SmartCastName, places: Collection<KtExpression>): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[SimpleFunctionDescriptorImpl]

'name' @ [232:43] ==> val name: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'places' @ [232:49] ==> val places: List<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'expression' @ [241:17] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [241:28] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'accept' @ [241:39] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [241:46] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [245:33] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [245:44] ==> public final val KtWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'if (condition.isTrueConstant()) {
                    expression.acceptChildren(this)
                }
                else {
                    condition?.accept(this)
                }' @ [247:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'condition' @ [247:21] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitWhileExpression[LocalVariableDescriptor]

'isTrueConstant' @ [247:31] ==> private final fun KtExpression?.isTrueConstant(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [248:21] ==> value-parameter expression: KtWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitWhileExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [248:32] ==> public open fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtWhileExpression[JavaMethodDescriptor]

'this' @ [248:47] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'condition' @ [251:21] ==> val condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>.visitWhileExpression[LocalVariableDescriptor]

'accept' @ [251:32] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [251:39] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces.<no name provided>[LazyClassReceiverParameterDescriptor]

'map' @ [258:16] ==> val map: HashMap<PartialBodyResolveFilter.SmartCastName, ArrayList<KtExpression>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.potentialSmartCastPlaces[LocalVariableDescriptor]

'Pair' @ [267:27] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'setOf' @ [267:32] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'setOf' @ [267:56] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'when (condition) {
            is KtBinaryExpression -> {
                val operation = condition.operationToken
                val left = condition.left ?: return emptyResult
                val right = condition.right ?: return emptyResult

                fun smartCastInEq(): Pair<Set<SmartCastName>, Set<SmartCastName>> = when {
                    left.isNullLiteral() -> {
                        Pair(setOf(), right.smartCastExpressionName().singletonOrEmptySet())
                    }
                    right.isNullLiteral() -> {
                        Pair(setOf(), left.smartCastExpressionName().singletonOrEmptySet())
                    }
                    else -> {
                        val leftName = left.smartCastExpressionName()
                        val rightName = right.smartCastExpressionName()
                        val names = listOfNotNull(leftName, rightName).toSet()
                        Pair(names, setOf())
                    }
                }

                when (operation) {
                    KtTokens.EQEQ, KtTokens.EQEQEQ -> return smartCastInEq()

                    KtTokens.EXCLEQ, KtTokens.EXCLEQEQEQ -> return smartCastInEq().swap()

                    KtTokens.ANDAND -> {
                        val casts1 = possiblySmartCastInCondition(left)
                        val casts2 = possiblySmartCastInCondition(right)
                        return Pair(casts1.first.union(casts2.first), casts1.second.intersect(casts2.second))
                    }

                    KtTokens.OROR -> {
                        val casts1 = possiblySmartCastInCondition(left)
                        val casts2 = possiblySmartCastInCondition(right)
                        return Pair(casts1.first.intersect(casts2.first), casts1.second.union(casts2.second))
                    }
                }
            }

            is KtIsExpression -> {
                val cast = condition.leftHandSide.smartCastExpressionName().singletonOrEmptySet()
                return if (condition.isNegated) Pair(setOf(), cast) else Pair(cast, setOf())
            }

            is KtPrefixExpression -> {
                if (condition.operationToken == KtTokens.EXCL) {
                    val operand = condition.baseExpression ?: return emptyResult
                    return possiblySmartCastInCondition(operand).swap()
                }
            }

            is KtParenthesizedExpression -> {
                val operand = condition.expression ?: return emptyResult
                return possiblySmartCastInCondition(operand)
            }
        }' @ [268:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'condition' @ [268:15] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'condition' @ [270:33] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'operationToken' @ [270:43] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'condition' @ [271:28] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'left' @ [271:38] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'emptyResult' @ [271:53] ==> val emptyResult: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'condition' @ [272:29] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'right' @ [272:39] ==> public final val KtBinaryExpression.right: KtExpression?[MyPropertyDescriptor]

'emptyResult' @ [272:55] ==> val emptyResult: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'when {
                    left.isNullLiteral() -> {
                        Pair(setOf(), right.smartCastExpressionName().singletonOrEmptySet())
                    }
                    right.isNullLiteral() -> {
                        Pair(setOf(), left.smartCastExpressionName().singletonOrEmptySet())
                    }
                    else -> {
                        val leftName = left.smartCastExpressionName()
                        val rightName = right.smartCastExpressionName()
                        val names = listOfNotNull(leftName, rightName).toSet()
                        Pair(names, setOf())
                    }
                }' @ [274:85] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>, entry1: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>, entry2: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<Set<SmartCastName>, Set<SmartCastName>>

'left' @ [275:21] ==> val left: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'isNullLiteral' @ [275:26] ==> private final fun KtExpression?.isNullLiteral(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'Pair' @ [276:25] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'setOf' @ [276:30] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'right' @ [276:39] ==> val right: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'smartCastExpressionName' @ [276:45] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'singletonOrEmptySet' @ [276:71] ==> private final fun <T : Any> PartialBodyResolveFilter.SmartCastName?.singletonOrEmptySet(): Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SmartCastName

'right' @ [278:21] ==> val right: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'isNullLiteral' @ [278:27] ==> private final fun KtExpression?.isNullLiteral(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'Pair' @ [279:25] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'setOf' @ [279:30] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'left' @ [279:39] ==> val left: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'smartCastExpressionName' @ [279:44] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'singletonOrEmptySet' @ [279:70] ==> private final fun <T : Any> PartialBodyResolveFilter.SmartCastName?.singletonOrEmptySet(): Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SmartCastName

'left' @ [282:40] ==> val left: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'smartCastExpressionName' @ [282:45] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'right' @ [283:41] ==> val right: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'smartCastExpressionName' @ [283:47] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [284:37] ==> public fun <T : Any> listOfNotNull(vararg elements: PartialBodyResolveFilter.SmartCastName?): List<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> SmartCastName

'leftName' @ [284:51] ==> val leftName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition.smartCastInEq[LocalVariableDescriptor]

'rightName' @ [284:61] ==> val rightName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition.smartCastInEq[LocalVariableDescriptor]

'toSet' @ [284:72] ==> public fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.toSet(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'Pair' @ [285:25] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'names' @ [285:30] ==> val names: Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition.smartCastInEq[LocalVariableDescriptor]

'setOf' @ [285:37] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'when (operation) {
                    KtTokens.EQEQ, KtTokens.EQEQEQ -> return smartCastInEq()

                    KtTokens.EXCLEQ, KtTokens.EXCLEQEQEQ -> return smartCastInEq().swap()

                    KtTokens.ANDAND -> {
                        val casts1 = possiblySmartCastInCondition(left)
                        val casts2 = possiblySmartCastInCondition(right)
                        return Pair(casts1.first.union(casts2.first), casts1.second.intersect(casts2.second))
                    }

                    KtTokens.OROR -> {
                        val casts1 = possiblySmartCastInCondition(left)
                        val casts2 = possiblySmartCastInCondition(right)
                        return Pair(casts1.first.intersect(casts2.first), casts1.second.union(casts2.second))
                    }
                }' @ [289:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'operation' @ [289:23] ==> val operation: IElementType defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'EQEQ' @ [290:30] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [290:45] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'smartCastInEq' @ [290:62] ==> local final fun smartCastInEq(): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[SimpleFunctionDescriptorImpl]

'EXCLEQ' @ [292:30] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [292:47] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'smartCastInEq' @ [292:68] ==> local final fun smartCastInEq(): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[SimpleFunctionDescriptorImpl]

'swap' @ [292:84] ==> public fun <T1, T2> Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>.swap(): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T1> -> Set<SmartCastName>
    <T2> -> Set<SmartCastName>

'ANDAND' @ [294:30] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'possiblySmartCastInCondition' @ [295:38] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'left' @ [295:67] ==> val left: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'possiblySmartCastInCondition' @ [296:38] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'right' @ [296:67] ==> val right: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'Pair' @ [297:32] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'casts1' @ [297:37] ==> val casts1: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'first' @ [297:44] ==> public final val first: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'union' @ [297:50] ==> public infix fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.union(other: Iterable<PartialBodyResolveFilter.SmartCastName>): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'casts2' @ [297:56] ==> val casts2: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'first' @ [297:63] ==> public final val first: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'casts1' @ [297:71] ==> val casts1: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'second' @ [297:78] ==> public final val second: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'intersect' @ [297:85] ==> public infix fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.intersect(other: Iterable<PartialBodyResolveFilter.SmartCastName>): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'casts2' @ [297:95] ==> val casts2: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'second' @ [297:102] ==> public final val second: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'OROR' @ [300:30] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'possiblySmartCastInCondition' @ [301:38] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'left' @ [301:67] ==> val left: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'possiblySmartCastInCondition' @ [302:38] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'right' @ [302:67] ==> val right: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'Pair' @ [303:32] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'casts1' @ [303:37] ==> val casts1: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'first' @ [303:44] ==> public final val first: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'intersect' @ [303:50] ==> public infix fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.intersect(other: Iterable<PartialBodyResolveFilter.SmartCastName>): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'casts2' @ [303:60] ==> val casts2: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'first' @ [303:67] ==> public final val first: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'casts1' @ [303:75] ==> val casts1: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'second' @ [303:82] ==> public final val second: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'union' @ [303:89] ==> public infix fun <T> Iterable<PartialBodyResolveFilter.SmartCastName>.union(other: Iterable<PartialBodyResolveFilter.SmartCastName>): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'casts2' @ [303:95] ==> val casts2: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'second' @ [303:102] ==> public final val second: Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'condition' @ [309:28] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'leftHandSide' @ [309:38] ==> public final val KtIsExpression.leftHandSide: KtExpression[MyPropertyDescriptor]

'smartCastExpressionName' @ [309:51] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'singletonOrEmptySet' @ [309:77] ==> private final fun <T : Any> PartialBodyResolveFilter.SmartCastName?.singletonOrEmptySet(): Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> SmartCastName

'if (condition.isNegated) Pair(setOf(), cast) else Pair(cast, setOf())' @ [310:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>, elseBranch: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<Set<SmartCastName>, Set<SmartCastName>>

'condition' @ [310:28] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'isNegated' @ [310:38] ==> public final val KtIsExpression.isNegated: Boolean[MyPropertyDescriptor]

'Pair' @ [310:49] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'setOf' @ [310:54] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'cast' @ [310:63] ==> val cast: Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'Pair' @ [310:74] ==> public constructor Pair<out A, out B>(first: Set<PartialBodyResolveFilter.SmartCastName>, second: Set<PartialBodyResolveFilter.SmartCastName>) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Set<SmartCastName>
    <out B> -> Set<SmartCastName>

'cast' @ [310:79] ==> val cast: Set<PartialBodyResolveFilter.SmartCastName> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'setOf' @ [310:85] ==> @InlineOnly public inline fun <T> setOf(): Set<PartialBodyResolveFilter.SmartCastName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SmartCastName

'condition' @ [314:21] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'operationToken' @ [314:31] ==> public final val KtPrefixExpression.operationToken: (IElementType..IElementType?)[MyPropertyDescriptor]

'EXCL' @ [314:58] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'condition' @ [315:35] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'baseExpression' @ [315:45] ==> public final val KtPrefixExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'emptyResult' @ [315:70] ==> val emptyResult: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'possiblySmartCastInCondition' @ [316:28] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'operand' @ [316:57] ==> val operand: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'swap' @ [316:66] ==> public fun <T1, T2> Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>>.swap(): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T1> -> Set<SmartCastName>
    <T2> -> Set<SmartCastName>

'condition' @ [321:31] ==> value-parameter condition: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[ValueParameterDescriptorImpl]

'expression' @ [321:41] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'emptyResult' @ [321:62] ==> val emptyResult: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'possiblySmartCastInCondition' @ [322:24] ==> private final fun possiblySmartCastInCondition(condition: KtExpression?): Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'operand' @ [322:53] ==> val operand: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'emptyResult' @ [326:16] ==> val emptyResult: Pair<Set<PartialBodyResolveFilter.SmartCastName>, Set<PartialBodyResolveFilter.SmartCastName>> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.possiblySmartCastInCondition[LocalVariableDescriptor]

'ArrayList' @ [334:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KtExpression

'statement' @ [335:9] ==> value-parameter statement: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[ValueParameterDescriptorImpl]

'accept' @ [335:20] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'ControlFlowVisitor' @ [335:36] ==> public constructor ControlFlowVisitor() defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[ClassConstructorDescriptorImpl]

'result' @ [339:17] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [339:24] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [339:28] ==> value-parameter expression: KtReturnExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitReturnExpression[ValueParameterDescriptorImpl]

'result' @ [343:17] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [343:24] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [343:28] ==> value-parameter expression: KtThrowExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitThrowExpression[ValueParameterDescriptorImpl]

'expression' @ [347:17] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'condition' @ [347:28] ==> public final val KtIfExpression.condition: KtExpression?[MyPropertyDescriptor]

'accept' @ [347:39] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [347:46] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'expression' @ [349:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'then' @ [349:45] ==> public final val KtIfExpression.then: KtExpression?[MyPropertyDescriptor]

'expression' @ [350:34] ==> value-parameter expression: KtIfExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[ValueParameterDescriptorImpl]

'`else`' @ [350:45] ==> public final val KtIfExpression.`else`: KtExpression?[MyPropertyDescriptor]

'thenBranch' @ [351:21] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'elseBranch' @ [351:43] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'collectAlwaysExitPoints' @ [352:37] ==> private final fun collectAlwaysExitPoints(statement: KtExpression?): Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'thenBranch' @ [352:61] ==> val thenBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'thenExits' @ [353:25] ==> val thenExits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'isNotEmpty' @ [353:35] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'collectAlwaysExitPoints' @ [354:41] ==> private final fun collectAlwaysExitPoints(statement: KtExpression?): Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'elseBranch' @ [354:65] ==> val elseBranch: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'elseExits' @ [355:29] ==> val elseExits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'isNotEmpty' @ [355:39] ==> @InlineOnly public inline fun <T> Collection<KtExpression>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'result' @ [356:29] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'addAll' @ [356:36] ==> public open fun addAll(elements: Collection<KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'thenExits' @ [356:43] ==> val thenExits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'result' @ [357:29] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'addAll' @ [357:36] ==> public open fun addAll(elements: Collection<KtExpression>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'elseExits' @ [357:43] ==> val elseExits: Collection<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitIfExpression[LocalVariableDescriptor]

'loop' @ [364:17] ==> value-parameter loop: KtForExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [364:22] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'accept' @ [364:33] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [364:40] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'loop' @ [369:33] ==> value-parameter loop: KtWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [369:38] ==> public final val KtWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'if (condition.isTrueConstant()) {
                    insideLoopLevel++
                    loop.body?.accept(this)
                    insideLoopLevel--
                }
                else {
                    // do not make sense to search exits inside while-loop as not necessary enter it at all
                    condition.accept(this)
                }' @ [370:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'condition' @ [370:21] ==> val condition: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitWhileExpression[LocalVariableDescriptor]

'isTrueConstant' @ [370:31] ==> private final fun KtExpression?.isTrueConstant(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'insideLoopLevel' @ [371:21] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'loop' @ [372:21] ==> value-parameter loop: KtWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitWhileExpression[ValueParameterDescriptorImpl]

'body' @ [372:26] ==> public final val KtWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'accept' @ [372:32] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [372:39] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'insideLoopLevel' @ [373:21] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'condition' @ [377:21] ==> val condition: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitWhileExpression[LocalVariableDescriptor]

'accept' @ [377:31] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [377:38] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'loop' @ [382:17] ==> value-parameter loop: KtDoWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitDoWhileExpression[ValueParameterDescriptorImpl]

'condition' @ [382:22] ==> public final val KtDoWhileExpression.condition: KtExpression?[MyPropertyDescriptor]

'accept' @ [382:33] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [382:40] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'insideLoopLevel' @ [383:17] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'loop' @ [384:17] ==> value-parameter loop: KtDoWhileExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitDoWhileExpression[ValueParameterDescriptorImpl]

'body' @ [384:22] ==> public final val KtDoWhileExpression.body: KtExpression?[MyPropertyDescriptor]

'accept' @ [384:28] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [384:35] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'insideLoopLevel' @ [385:17] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'insideLoopLevel' @ [389:21] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'expression' @ [389:45] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitBreakExpression[ValueParameterDescriptorImpl]

'getLabelName' @ [389:56] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtBreakExpression[DeserializedSimpleFunctionDescriptor]

'result' @ [390:21] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [390:28] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [390:32] ==> value-parameter expression: KtBreakExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitBreakExpression[ValueParameterDescriptorImpl]

'insideLoopLevel' @ [395:21] ==> public final var insideLoopLevel: Int defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[PropertyDescriptorImpl]

'expression' @ [395:45] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitContinueExpression[ValueParameterDescriptorImpl]

'getLabelName' @ [395:56] ==> public final fun getLabelName(): String? defined in org.jetbrains.kotlin.psi.KtContinueExpression[DeserializedSimpleFunctionDescriptor]

'result' @ [396:21] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [396:28] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [396:32] ==> value-parameter expression: KtContinueExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitContinueExpression[ValueParameterDescriptorImpl]

'expression' @ [401:29] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'calleeExpression' @ [401:40] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getReferencedName' @ [401:86] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [402:21] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'name' @ [402:37] ==> val name: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitCallExpression[LocalVariableDescriptor]

'nothingFunctionNames' @ [402:45] ==> private final val nothingFunctionNames: HashSet<(String..String?)> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'result' @ [403:21] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [403:28] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [403:32] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'super' @ [405:17] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCallExpression' @ [405:23] ==> public open fun visitCallExpression(@NotNull p0: KtCallExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[JavaMethodDescriptor]

'expression' @ [405:43] ==> value-parameter expression: KtCallExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitCallExpression[ValueParameterDescriptorImpl]

'expression' @ [409:28] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'getReferencedName' @ [409:39] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'name' @ [410:21] ==> val name: String defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitSimpleNameExpression[LocalVariableDescriptor]

'nothingVariableNames' @ [410:29] ==> private final val nothingVariableNames: HashSet<(String..String?)> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'result' @ [411:21] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'add' @ [411:28] ==> public open fun add(element: KtExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'expression' @ [411:32] ==> value-parameter expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitSimpleNameExpression[ValueParameterDescriptorImpl]

'if (expression.operationToken == KtTokens.ELVIS) {
                    // do not search exits after "?:"
                    expression.left?.accept(this)
                }
                else {
                    super.visitBinaryExpression(expression)
                }' @ [416:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'expression' @ [416:21] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'operationToken' @ [416:32] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'ELVIS' @ [416:59] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'expression' @ [418:21] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'left' @ [418:32] ==> public final val KtBinaryExpression.left: KtExpression?[MyPropertyDescriptor]

'accept' @ [418:38] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'this' @ [418:45] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [421:21] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [421:27] ==> public open fun visitBinaryExpression(@NotNull p0: KtBinaryExpression): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[JavaMethodDescriptor]

'expression' @ [421:49] ==> value-parameter expression: KtBinaryExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'result' @ [425:16] ==> val result: ArrayList<KtExpression> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.collectAlwaysExitPoints[LocalVariableDescriptor]

'KtVisitorVoid' @ [431:49] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'element' @ [433:17] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor.visitKtElement[ValueParameterDescriptorImpl]

'noControlFlowInside' @ [433:25] ==> private final fun KtElement.noControlFlowInside(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[SimpleFunctionDescriptorImpl]

'element' @ [434:13] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor.visitKtElement[ValueParameterDescriptorImpl]

'acceptChildren' @ [434:21] ==> public abstract fun acceptChildren(@NotNull p0: PsiElementVisitor): Unit defined in org.jetbrains.kotlin.psi.KtElement[JavaMethodDescriptor]

'this' @ [434:36] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor[LazyClassReceiverParameterDescriptor]

'this' @ [437:55] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor.noControlFlowInside[ReceiverParameterDescriptorImpl]

'this' @ [437:77] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor.noControlFlowInside[ReceiverParameterDescriptorImpl]

'this' @ [437:96] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.ControlFlowVisitor.noControlFlowInside[ReceiverParameterDescriptorImpl]

'selectorName' @ [445:17] ==> private final val selectorName: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'assert' @ [446:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverName' @ [446:24] ==> private final val receiverName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'if (receiverName != null) receiverName.toString() + "." + selectorName else selectorName ?: "this"' @ [450:43] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'receiverName' @ [450:47] ==> private final val receiverName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'receiverName' @ [450:69] ==> private final val receiverName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'toString' @ [450:82] ==> public open fun toString(): String defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[SimpleFunctionDescriptorImpl]

'selectorName' @ [450:101] ==> private final val selectorName: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'selectorName' @ [450:119] ==> private final val selectorName: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'selectorName' @ [453:17] ==> private final val selectorName: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'!' @ [454:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'invoke' @ [454:18] ==> public abstract operator fun invoke(p1: String): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'selectorName' @ [454:29] ==> private final val selectorName: String? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'receiverName' @ [455:20] ==> private final val receiverName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'receiverName' @ [455:44] ==> private final val receiverName: PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[PropertyDescriptorImpl]

'affectsNames' @ [455:57] ==> public final fun affectsNames(nameFilter: (String) -> Boolean): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[SimpleFunctionDescriptorImpl]

'nameFilter' @ [455:70] ==> value-parameter nameFilter: (String) -> Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName.affectsNames[ValueParameterDescriptorImpl]

'when (this) {
            is KtSimpleNameExpression -> SmartCastName(null, this.getReferencedName())

            is KtQualifiedExpression -> {
                val selector = selectorExpression as? KtSimpleNameExpression ?: return null
                val selectorName = selector.getReferencedName()
                val receiver = receiverExpression
                if (receiver is KtThisExpression) {
                    return SmartCastName(null, selectorName)
                }
                val receiverName = receiver.smartCastExpressionName() ?: return null
                return SmartCastName(receiverName, selectorName)
            }

            is KtThisExpression -> SmartCastName(null, null)

            else -> null
        }' @ [460:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PartialBodyResolveFilter.SmartCastName?, entry1: PartialBodyResolveFilter.SmartCastName?, entry2: PartialBodyResolveFilter.SmartCastName?, entry3: PartialBodyResolveFilter.SmartCastName?): PartialBodyResolveFilter.SmartCastName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SmartCastName?

'this' @ [460:22] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[ReceiverParameterDescriptorImpl]

'SmartCastName' @ [461:42] ==> public constructor SmartCastName(receiverName: PartialBodyResolveFilter.SmartCastName?, selectorName: String?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[ClassConstructorDescriptorImpl]

'this' @ [461:62] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[ReceiverParameterDescriptorImpl]

'getReferencedName' @ [461:67] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'selectorExpression' @ [464:32] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'selector' @ [465:36] ==> val selector: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'getReferencedName' @ [465:45] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'receiverExpression' @ [466:32] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'receiver' @ [467:21] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'SmartCastName' @ [468:28] ==> public constructor SmartCastName(receiverName: PartialBodyResolveFilter.SmartCastName?, selectorName: String?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[ClassConstructorDescriptorImpl]

'selectorName' @ [468:48] ==> val selectorName: String defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'receiver' @ [470:36] ==> val receiver: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'smartCastExpressionName' @ [470:45] ==> private final fun KtExpression.smartCastExpressionName(): PartialBodyResolveFilter.SmartCastName? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[SimpleFunctionDescriptorImpl]

'SmartCastName' @ [471:24] ==> public constructor SmartCastName(receiverName: PartialBodyResolveFilter.SmartCastName?, selectorName: String?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[ClassConstructorDescriptorImpl]

'receiverName' @ [471:38] ==> val receiverName: PartialBodyResolveFilter.SmartCastName defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'selectorName' @ [471:52] ==> val selectorName: String defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.smartCastExpressionName[LocalVariableDescriptor]

'SmartCastName' @ [474:36] ==> public constructor SmartCastName(receiverName: PartialBodyResolveFilter.SmartCastName?, selectorName: String?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.SmartCastName[ClassConstructorDescriptorImpl]

'HashSet' @ [482:50] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> String

'names' @ [484:45] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'name' @ [484:62] ==> value-parameter name: String defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.invoke[ValueParameterDescriptorImpl]

'names' @ [484:70] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'names' @ [487:21] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'isEmpty' @ [487:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'names' @ [490:17] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'statement' @ [491:17] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.addUsedNames[ValueParameterDescriptorImpl]

'forEachDescendantOfType' @ [491:27] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (KtSimpleNameExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtSimpleNameExpression

'it' @ [491:91] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.addUsedNames.<anonymous>[ValueParameterDescriptorImpl]

'names' @ [492:21] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'add' @ [492:29] ==> public abstract fun add(element: String): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'it' @ [492:33] ==> value-parameter it: KtSimpleNameExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.addUsedNames.<anonymous>[ValueParameterDescriptorImpl]

'getReferencedName' @ [492:36] ==> public abstract fun getReferencedName(): String defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'names' @ [498:17] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'if (filter.names == null) {
                names = null
            }
            else {
                names!!.addAll(filter.names!!)
            }' @ [499:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'filter' @ [499:17] ==> value-parameter filter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.addNamesFromFilter[ValueParameterDescriptorImpl]

'names' @ [499:24] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'names' @ [500:17] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'names' @ [503:17] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'addAll' @ [503:25] ==> public abstract fun addAll(elements: Collection<String>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'filter' @ [503:32] ==> value-parameter filter: PartialBodyResolveFilter.NameFilter defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter.addNamesFromFilter[ValueParameterDescriptorImpl]

'names' @ [503:39] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'names' @ [508:13] ==> private final var names: MutableSet<String>? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.NameFilter[PropertyDescriptorImpl]

'element' @ [521:20] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.findStatementToResolve[ValueParameterDescriptorImpl]

'parentsWithSelf' @ [521:28] ==> public val PsiElement.parentsWithSelf: Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'takeWhile' @ [521:44] ==> public fun <T> Sequence<PsiElement>.takeWhile(predicate: (PsiElement) -> Boolean): Sequence<PsiElement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [521:56] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.findStatementToResolve.<anonymous>[ValueParameterDescriptorImpl]

'declaration' @ [521:62] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.findStatementToResolve[ValueParameterDescriptorImpl]

'firstOrNull' @ [521:76] ==> public inline fun <T> Sequence<PsiElement>.firstOrNull(predicate: (PsiElement) -> Boolean): PsiElement? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement

'it' @ [521:90] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.findStatementToResolve.<anonymous>[ValueParameterDescriptorImpl]

'isStatement' @ [521:93] ==> private final fun PsiElement.isStatement(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'forEachDescendantOfType' @ [525:13] ==> public inline fun <reified T : PsiElement> PsiElement.forEachDescendantOfType(crossinline canGoInside: (PsiElement) -> Boolean, noinline action: (KtBlockExpression) -> Unit): Unit defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtBlockExpression

'it' @ [525:53] ==> value-parameter it: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.forTopLevelBlocksInside.<anonymous>[ValueParameterDescriptorImpl]

'action' @ [525:90] ==> value-parameter action: (KtBlockExpression) -> Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.forTopLevelBlocksInside[ValueParameterDescriptorImpl]

'this' @ [528:53] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isNullLiteral[ReceiverParameterDescriptorImpl]

'node' @ [528:59] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [528:65] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'NULL' @ [528:92] ==> public final val NULL: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'this' @ [531:19] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isTrueConstant[ReceiverParameterDescriptorImpl]

'node' @ [531:35] ==> public final val KtExpression.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [531:41] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'BOOLEAN_CONSTANT' @ [531:68] ==> public final val BOOLEAN_CONSTANT: (KtNodeType..KtNodeType?) defined in org.jetbrains.kotlin.KtNodeTypes[JavaPropertyDescriptor]

'text' @ [531:88] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'if (this != null) setOf(this) else setOf()' @ [533:66] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Set<T>, elseBranch: Set<T>): Set<T>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Set<T>

'this' @ [533:70] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.singletonOrEmptySet[ReceiverParameterDescriptorImpl]

'setOf' @ [533:84] ==> public fun <T> setOf(element: T): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'this' @ [533:90] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.singletonOrEmptySet[ReceiverParameterDescriptorImpl]

'setOf' @ [533:101] ==> @InlineOnly public inline fun <T> setOf(): Set<T> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'expression' @ [537:26] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [537:37] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
                is KtBlockExpression -> expression == parent.lastStatement() && isValueNeeded(parent)

                is KtContainerNode -> { //TODO - not quite correct
                    val pparent = parent.parent as? KtExpression
                    pparent != null && isValueNeeded(pparent)
                }

                is KtDeclarationWithBody -> {
                    if (expression == parent.bodyExpression)
                        !parent.hasBlockBody() && !parent.hasDeclaredReturnType()
                    else
                        true
                }

                is KtAnonymousInitializer -> false

                else -> true
            }' @ [538:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean, entry3: Boolean, entry4: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [538:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'expression' @ [539:41] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [539:55] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'lastStatement' @ [539:62] ==> private final fun KtBlockExpression.lastStatement(): KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'isValueNeeded' @ [539:81] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'parent' @ [539:95] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'parent' @ [542:35] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'parent' @ [542:42] ==> public final val KtContainerNode.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'pparent' @ [543:21] ==> val pparent: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'isValueNeeded' @ [543:40] ==> private final fun isValueNeeded(expression: KtExpression): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'pparent' @ [543:54] ==> val pparent: KtExpression? defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'if (expression == parent.bodyExpression)
                        !parent.hasBlockBody() && !parent.hasDeclaredReturnType()
                    else
                        true' @ [547:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'expression' @ [547:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[ValueParameterDescriptorImpl]

'parent' @ [547:39] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'bodyExpression' @ [547:46] ==> public final val KtDeclarationWithBody.bodyExpression: KtExpression?[MyPropertyDescriptor]

'!' @ [548:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [548:26] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'hasBlockBody' @ [548:33] ==> public abstract fun hasBlockBody(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'!' @ [548:51] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [548:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isValueNeeded[LocalVariableDescriptor]

'hasDeclaredReturnType' @ [548:59] ==> public abstract fun hasDeclaredReturnType(): Boolean defined in org.jetbrains.kotlin.psi.KtDeclarationWithBody[JavaMethodDescriptor]

'lastChild' @ [560:19] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [560:30] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'firstIsInstanceOrNull' @ [560:57] ==> public inline fun <reified T : Any> Sequence<*>.firstIsInstanceOrNull(): KtExpression? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> KtExpression

'this' @ [562:48] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.isStatement[ReceiverParameterDescriptorImpl]

'parent' @ [562:72] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'this' @ [565:19] ==> <this> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.containsProbablyNothing[ReceiverParameterDescriptorImpl]

'typeElement' @ [565:25] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[DeserializedPropertyDescriptor]

'anyDescendantOfType' @ [565:38] ==> public inline fun <reified T : PsiElement> PsiElement.anyDescendantOfType(noinline predicate: (KtUserType) -> Boolean = ...): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'it' @ [565:72] ==> value-parameter it: KtUserType defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion.containsProbablyNothing.<anonymous>[ValueParameterDescriptorImpl]

'isProbablyNothing' @ [565:75] ==> public fun KtUserType?.isProbablyNothing(): Boolean defined in org.jetbrains.kotlin.util in file TypeIndexUtil.kt[SimpleFunctionDescriptorImpl]

'HashMap' @ [569:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> MarkLevel

'HashMap' @ [570:35] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtBlockExpression
    <V : (Any..Any?)> -> MarkLevel

'element' @ [573:21] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[ValueParameterDescriptorImpl]

'e' @ [574:20] ==> var e: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[LocalVariableDescriptor]

'declaration' @ [574:25] ==> private final val declaration: KtDeclaration defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter[PropertyDescriptorImpl]

'e' @ [575:21] ==> var e: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[LocalVariableDescriptor]

'isStatement' @ [575:23] ==> private final fun PsiElement.isStatement(): Boolean defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.Companion[SimpleFunctionDescriptorImpl]

'markStatement' @ [576:21] ==> private final fun markStatement(statement: KtExpression, level: PartialBodyResolveFilter.MarkLevel): Unit defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'e' @ [576:35] ==> var e: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[LocalVariableDescriptor]

'level' @ [576:54] ==> value-parameter level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[ValueParameterDescriptorImpl]

'e' @ [578:17] ==> var e: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[LocalVariableDescriptor]

'e' @ [578:21] ==> var e: PsiElement defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.mark[LocalVariableDescriptor]

'parent' @ [578:23] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'statementMark' @ [583:32] ==> public final fun statementMark(statement: KtExpression): PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'statement' @ [583:46] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'currentLevel' @ [584:17] ==> val currentLevel: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[LocalVariableDescriptor]

'level' @ [584:32] ==> value-parameter level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'statementMarks' @ [585:17] ==> private final val statementMarks: HashMap<KtExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'statement' @ [585:32] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'level' @ [585:45] ==> value-parameter level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'statement' @ [587:29] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'parent' @ [587:39] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'blockLevels' @ [588:41] ==> private final val blockLevels: HashMap<KtBlockExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'block' @ [588:53] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[LocalVariableDescriptor]

'NONE' @ [588:73] ==> enum entry NONE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'currentBlockLevel' @ [589:21] ==> val currentBlockLevel: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[LocalVariableDescriptor]

'level' @ [589:41] ==> value-parameter level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'blockLevels' @ [590:21] ==> private final val blockLevels: HashMap<KtBlockExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'block' @ [590:33] ==> val block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[LocalVariableDescriptor]

'level' @ [590:42] ==> value-parameter level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.markStatement[ValueParameterDescriptorImpl]

'statementMarks' @ [596:19] ==> private final val statementMarks: HashMap<KtExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'statement' @ [596:34] ==> value-parameter statement: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.statementMark[ValueParameterDescriptorImpl]

'NONE' @ [596:58] ==> enum entry NONE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'statementMarks' @ [599:19] ==> private final val statementMarks: HashMap<KtExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'keys' @ [599:34] ==> public open val keys: MutableSet<KtExpression> defined in java.util.HashMap[JavaPropertyDescriptor]

'blockLevels' @ [602:25] ==> private final val blockLevels: HashMap<KtBlockExpression, PartialBodyResolveFilter.MarkLevel> defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[PropertyDescriptorImpl]

'block' @ [602:37] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement[ValueParameterDescriptorImpl]

'NONE' @ [602:57] ==> enum entry NONE defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.MarkLevel[FakeCallableDescriptorForObject]

'level' @ [603:17] ==> val level: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement[LocalVariableDescriptor]

'minLevel' @ [603:25] ==> value-parameter minLevel: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement[ValueParameterDescriptorImpl]

'block' @ [604:20] ==> value-parameter block: KtBlockExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement[ValueParameterDescriptorImpl]

'lastChild' @ [604:26] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'siblings' @ [604:36] ==> public fun PsiElement.siblings(forward: Boolean = ..., withItself: Boolean = ...): Sequence<PsiElement> defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'filterIsInstance' @ [605:22] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<KtExpression> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> KtExpression

'first' @ [606:22] ==> public inline fun <T> Sequence<KtExpression>.first(predicate: (KtExpression) -> Boolean): KtExpression defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression

'statementMark' @ [606:30] ==> public final fun statementMark(statement: KtExpression): PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks[SimpleFunctionDescriptorImpl]

'it' @ [606:44] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement.<anonymous>[ValueParameterDescriptorImpl]

'minLevel' @ [606:51] ==> value-parameter minLevel: PartialBodyResolveFilter.MarkLevel defined in org.jetbrains.kotlin.resolve.lazy.PartialBodyResolveFilter.StatementMarks.lastMarkedStatement[ValueParameterDescriptorImpl]

