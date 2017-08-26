'KtTreeVisitorVoid' @ [25:66] ==> public constructor KtTreeVisitorVoid() defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaClassConstructorDescriptor]

'evaluators' @ [28:13] ==> value-parameter evaluators: List<Evaluator> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.<init>[ValueParameterDescriptorImpl]

'associateBy' @ [28:24] ==> public inline fun <T, K, V> Iterable<Evaluator>.associateBy(keySelector: (Evaluator) -> Evaluator, valueTransform: (Evaluator) -> ArrayList<Modification> /* = ArrayList<Modification> */): Map<Evaluator, ArrayList<Modification> /* = ArrayList<Modification> */> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Evaluator
    <K> -> Evaluator
    <V> -> ArrayList<Modification>

'it' @ [28:52] ==> value-parameter it: Evaluator defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.elementModifications.<anonymous>[ValueParameterDescriptorImpl]

'arrayListOf' @ [28:77] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Modification> /* = ArrayList<Modification> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Modification

'super' @ [31:9] ==> <this> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor[LazyClassReceiverParameterDescriptor]

'visitDeclaration' @ [31:15] ==> public open fun visitDeclaration(@NotNull p0: KtDeclaration): Unit defined in org.jetbrains.kotlin.psi.KtTreeVisitorVoid[JavaMethodDescriptor]

'declaration' @ [31:32] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [33:27] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'parseConditionalAnnotations' @ [33:39] ==> public fun KtAnnotated.parseConditionalAnnotations(): List<Conditional> defined in org.jetbrains.kotlin.preprocessor[SimpleFunctionDescriptorImpl]

'?:' @ [34:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Comparable<{Name & String}>?, right: Comparable<{Name & String}>?): Comparable<{Name & String}>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Comparable<{Name & String}>?

'declaration' @ [34:21] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'nameAsSafeName' @ [34:58] ==> public final val KtNamedDeclaration.nameAsSafeName: Name[MyPropertyDescriptor]

'declaration' @ [34:76] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'name' @ [34:88] ==> public final val KtDeclaration.name: String?[MyPropertyDescriptor]

'arrayListOf' @ [36:27] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Pair<Evaluator, Boolean>> /* = ArrayList<Pair<Evaluator, Boolean>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Evaluator, Boolean>

'component1' @ [37:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Evaluator, MutableList<Modification>>.component1(): Evaluator defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Evaluator
    <V> -> MutableList<Modification>

'component2' @ [37:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<Evaluator, MutableList<Modification>>.component2(): MutableList<Modification> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> Evaluator
    <V> -> MutableList<Modification>

'elementModifications' @ [37:44] ==> public final val elementModifications: Map<Evaluator, MutableList<Modification>> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor[PropertyDescriptorImpl]

'invoke' @ [38:37] ==> public abstract fun invoke(p1: List<Conditional>): Boolean defined in org.jetbrains.kotlin.preprocessor.Evaluator[FunctionInvokeDescriptor]

'annotations' @ [38:47] ==> val annotations: List<Conditional> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'declResults' @ [39:13] ==> val declResults: ArrayList<Pair<Evaluator, Boolean>> /* = ArrayList<Pair<Evaluator, Boolean>> */ defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'add' @ [39:25] ==> public open fun add(element: Pair<Evaluator, Boolean>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'evaluator' @ [39:29] ==> val evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'conditionalResult' @ [39:42] ==> val conditionalResult: Boolean defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'if (!conditionalResult)
                modifications.add(Modification(declaration.textRange) { rangeText ->
                    buildString {
                        append("/* Not available on $evaluator */")
                        repeat(StringUtil.getLineBreakCount(rangeText)) { append("\n") }
                    }
                })
            else {
                val targetName = annotations.filterIsInstance<Conditional.TargetName>().singleOrNull()
                if (targetName != null) {
                    val placeholderName = (declaration as KtNamedDeclaration).nameAsName!!.asString()
                    val realName = targetName.name
                    modifications.add(Modification(declaration.textRange) { it.replace(placeholderName, realName) })
                }
            }' @ [41:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [41:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conditionalResult' @ [41:18] ==> val conditionalResult: Boolean defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'modifications' @ [42:17] ==> val modifications: MutableList<Modification> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'add' @ [42:31] ==> public abstract fun add(element: Modification): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Modification' @ [42:35] ==> public constructor Modification(range: TextRange, apply: (String) -> String) defined in org.jetbrains.kotlin.preprocessor.Modification[ClassConstructorDescriptorImpl]

'declaration' @ [42:48] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'textRange' @ [42:60] ==> public final val KtDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'buildString' @ [43:21] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'append' @ [44:25] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'evaluator' @ [44:54] ==> val evaluator: Evaluator defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'repeat' @ [45:25] ==> @InlineOnly public inline fun repeat(times: Int, action: (Int) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'getLineBreakCount' @ [45:43] ==> @Contract public open fun getLineBreakCount(@NotNull p0: CharSequence): Int defined in com.intellij.openapi.util.text.StringUtil[JavaMethodDescriptor]

'rangeText' @ [45:61] ==> value-parameter rangeText: String defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'append' @ [45:75] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'annotations' @ [49:34] ==> val annotations: List<Conditional> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'filterIsInstance' @ [49:46] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<Conditional.TargetName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> TargetName

'singleOrNull' @ [49:89] ==> public fun <T> List<Conditional.TargetName>.singleOrNull(): Conditional.TargetName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TargetName

'targetName' @ [50:21] ==> val targetName: Conditional.TargetName? defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'!!' @ [51:43] ==> public final fun <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-EXCLEXCL-RESOLVE>`(baseExpr: Name?): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-EXCLEXCL-RESOLVE>`> -> Name

'declaration' @ [51:44] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'nameAsName' @ [51:79] ==> public final val KtNamedDeclaration.nameAsName: Name?[MyPropertyDescriptor]

'asString' @ [51:92] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'targetName' @ [52:36] ==> val targetName: Conditional.TargetName? defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'name' @ [52:47] ==> public final val name: String defined in org.jetbrains.kotlin.preprocessor.Conditional.TargetName[PropertyDescriptorImpl]

'modifications' @ [53:21] ==> val modifications: MutableList<Modification> defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'add' @ [53:35] ==> public abstract fun add(element: Modification): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'Modification' @ [53:39] ==> public constructor Modification(range: TextRange, apply: (String) -> String) defined in org.jetbrains.kotlin.preprocessor.Modification[ClassConstructorDescriptorImpl]

'declaration' @ [53:52] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[ValueParameterDescriptorImpl]

'textRange' @ [53:64] ==> public final val KtNamedDeclaration.textRange: (TextRange..TextRange?)[MyPropertyDescriptor]

'it' @ [53:77] ==> value-parameter it: String defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [53:80] ==> public fun String.replace(oldValue: String, newValue: String, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'placeholderName' @ [53:88] ==> val placeholderName: String defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'realName' @ [53:105] ==> val realName: String defined in org.jetbrains.kotlin.preprocessor.CollectModificationsVisitor.visitDeclaration[LocalVariableDescriptor]

'buildString' @ [63:12] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'component1' @ [65:15] ==> public final operator fun component1(): TextRange defined in org.jetbrains.kotlin.preprocessor.Modification[SimpleFunctionDescriptorImpl]

'component2' @ [65:22] ==> public final operator fun component2(): (String) -> String defined in org.jetbrains.kotlin.preprocessor.Modification[SimpleFunctionDescriptorImpl]

'this@applyTo' @ [65:36] ==> <this> defined in org.jetbrains.kotlin.preprocessor.applyTo[ReceiverParameterDescriptorImpl]

'append' @ [66:13] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sourceText' @ [66:20] ==> value-parameter sourceText: String defined in org.jetbrains.kotlin.preprocessor.applyTo[ValueParameterDescriptorImpl]

'prevIndex' @ [66:32] ==> var prevIndex: Int defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'range' @ [66:43] ==> val range: TextRange defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'startOffset' @ [66:49] ==> public final val TextRange.startOffset: Int[MyPropertyDescriptor]

'append' @ [67:13] ==> public open fun append(p0: (String..String?)): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'invoke' @ [67:20] ==> public abstract operator fun invoke(p1: String): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'range' @ [67:30] ==> val range: TextRange defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'substring' @ [67:36] ==> @NotNull public open fun substring(@NotNull p0: String): String defined in com.intellij.openapi.util.TextRange[JavaMethodDescriptor]

'sourceText' @ [67:46] ==> value-parameter sourceText: String defined in org.jetbrains.kotlin.preprocessor.applyTo[ValueParameterDescriptorImpl]

'prevIndex' @ [68:13] ==> var prevIndex: Int defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'range' @ [68:25] ==> val range: TextRange defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'endOffset' @ [68:31] ==> public final val TextRange.endOffset: Int[MyPropertyDescriptor]

'append' @ [70:9] ==> public open fun append(p0: (CharSequence..CharSequence?), p1: Int, p2: Int): (StringBuilder..StringBuilder?) defined in java.lang.StringBuilder[JavaMethodDescriptor]

'sourceText' @ [70:16] ==> value-parameter sourceText: String defined in org.jetbrains.kotlin.preprocessor.applyTo[ValueParameterDescriptorImpl]

'prevIndex' @ [70:28] ==> var prevIndex: Int defined in org.jetbrains.kotlin.preprocessor.applyTo.<anonymous>[LocalVariableDescriptor]

'sourceText' @ [70:39] ==> value-parameter sourceText: String defined in org.jetbrains.kotlin.preprocessor.applyTo[ValueParameterDescriptorImpl]

'length' @ [70:50] ==> public open val length: Int defined in kotlin.String[DeserializedPropertyDescriptor]

