'' @ [24:9] ==> private constructor AnnotationUseTarget(id: String) defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[ClassConstructorDescriptorImpl]

'' @ [24:24] ==> private constructor AnnotationUseTarget(id: String) defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[ClassConstructorDescriptorImpl]

'' @ [24:38] ==> private constructor AnnotationUseTarget(id: String) defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[ClassConstructorDescriptorImpl]

'' @ [24:50] ==> private constructor AnnotationUseTarget(id: String) defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[ClassConstructorDescriptorImpl]

'' @ [24:64] ==> private constructor AnnotationUseTarget(id: String) defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[ClassConstructorDescriptorImpl]

'Element' @ [30:61] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'builder' @ [33:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCode[ValueParameterDescriptorImpl]

'append' @ [33:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'target' @ [34:9] ==> public final val target: AnnotationUseTarget? defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'let' @ [34:17] ==> @InlineOnly public inline fun <T, R> AnnotationUseTarget.let(block: (AnnotationUseTarget) -> CodeBuilder): CodeBuilder defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AnnotationUseTarget
    <R> -> CodeBuilder

'builder' @ [35:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCode[ValueParameterDescriptorImpl]

'append' @ [35:21] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [35:31] ==> value-parameter it: AnnotationUseTarget defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCode.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [35:34] ==> public final val id: String defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[PropertyDescriptorImpl]

'if (arguments.isEmpty()) {
            builder.append(name)
        }
        else {
            generateCall(builder)
        }' @ [37:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'arguments' @ [37:13] ==> public final val arguments: List<Pair<Identifier?, DeferredElement<Expression>>> defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'isEmpty' @ [37:23] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'builder' @ [38:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCode[ValueParameterDescriptorImpl]

'append' @ [38:21] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'name' @ [38:28] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'generateCall' @ [41:13] ==> public final fun generateCall(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Annotation[SimpleFunctionDescriptorImpl]

'builder' @ [41:26] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCode[ValueParameterDescriptorImpl]

'builder' @ [46:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall[ValueParameterDescriptorImpl]

'append' @ [46:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'name' @ [46:24] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'append' @ [47:18] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'buildList' @ [48:18] ==> public fun <T> CodeBuilder.buildList(generators: Collection<() -> CodeBuilder>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CodeBuilder

'arguments' @ [49:38] ==> public final val arguments: List<Pair<Identifier?, DeferredElement<Expression>>> defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'map' @ [49:48] ==> public inline fun <T, R> Iterable<Pair<Identifier?, DeferredElement<Expression>>>.map(transform: (Pair<Identifier?, DeferredElement<Expression>>) -> () -> CodeBuilder): List<() -> CodeBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<Identifier?, DeferredElement<Expression>>
    <R> -> Function0<CodeBuilder>

'if (it.first != null) {
                                    builder append it.first!! append " = " append it.second
                                }
                                else {
                                    builder append it.second
                                }' @ [51:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'it' @ [51:37] ==> value-parameter it: Pair<Identifier?, DeferredElement<Expression>> defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [51:40] ==> public final val first: Identifier? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'builder' @ [52:37] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall[ValueParameterDescriptorImpl]

'it' @ [52:52] ==> value-parameter it: Pair<Identifier?, DeferredElement<Expression>> defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [52:55] ==> public final val first: Identifier? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [52:83] ==> value-parameter it: Pair<Identifier?, DeferredElement<Expression>> defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [52:86] ==> public final val second: DeferredElement<Expression> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'builder' @ [55:37] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall[ValueParameterDescriptorImpl]

'it' @ [55:52] ==> value-parameter it: Pair<Identifier?, DeferredElement<Expression>> defined in org.jetbrains.kotlin.j2k.ast.Annotation.generateCall.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [55:55] ==> public final val second: DeferredElement<Expression> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'append' @ [60:18] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [65:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotation.postGenerateCode[ValueParameterDescriptorImpl]

'append' @ [65:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'if (newLineAfter) "\n" else " "' @ [65:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'newLineAfter' @ [65:28] ==> public final val newLineAfter: Boolean defined in org.jetbrains.kotlin.j2k.ast.Annotation[PropertyDescriptorImpl]

'Expression' @ [69:118] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'Annotation' @ [70:30] ==> public constructor Annotation(name: Identifier, arguments: List<Pair<Identifier?, DeferredElement<Expression>>>, newLineAfter: Boolean, target: AnnotationUseTarget? = ...) defined in org.jetbrains.kotlin.j2k.ast.Annotation[ClassConstructorDescriptorImpl]

'name' @ [70:41] ==> value-parameter name: Identifier defined in org.jetbrains.kotlin.j2k.ast.AnnotationConstructorCall.<init>[ValueParameterDescriptorImpl]

'arguments' @ [70:47] ==> value-parameter arguments: List<Pair<Identifier?, DeferredElement<Expression>>> defined in org.jetbrains.kotlin.j2k.ast.AnnotationConstructorCall.<init>[ValueParameterDescriptorImpl]

'annotation' @ [73:9] ==> private final val annotation: Annotation defined in org.jetbrains.kotlin.j2k.ast.AnnotationConstructorCall[PropertyDescriptorImpl]

'generateCall' @ [73:20] ==> public final fun generateCall(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Annotation[SimpleFunctionDescriptorImpl]

'builder' @ [73:33] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AnnotationConstructorCall.generateCode[ValueParameterDescriptorImpl]

'Element' @ [77:56] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'builder' @ [79:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Annotations.generateCode[ValueParameterDescriptorImpl]

'append' @ [79:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'annotations' @ [79:24] ==> public final val annotations: List<Annotation> defined in org.jetbrains.kotlin.j2k.ast.Annotations[PropertyDescriptorImpl]

'annotations' @ [83:17] ==> public final val annotations: List<Annotation> defined in org.jetbrains.kotlin.j2k.ast.Annotations[PropertyDescriptorImpl]

'isEmpty' @ [83:29] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Annotations' @ [85:45] ==> public constructor Annotations(annotations: List<Annotation>) defined in org.jetbrains.kotlin.j2k.ast.Annotations[ClassConstructorDescriptorImpl]

'annotations' @ [85:57] ==> public final val annotations: List<Annotation> defined in org.jetbrains.kotlin.j2k.ast.Annotations[PropertyDescriptorImpl]

'other' @ [85:71] ==> value-parameter other: Annotations defined in org.jetbrains.kotlin.j2k.ast.Annotations.plus[ValueParameterDescriptorImpl]

'annotations' @ [85:77] ==> public final val annotations: List<Annotation> defined in org.jetbrains.kotlin.j2k.ast.Annotations[PropertyDescriptorImpl]

'assignNoPrototype' @ [85:90] ==> public fun <TElement : Element> Annotations.assignNoPrototype(): Annotations defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Annotations

'Annotations' @ [88:21] ==> public constructor Annotations(annotations: List<Annotation>) defined in org.jetbrains.kotlin.j2k.ast.Annotations[ClassConstructorDescriptorImpl]

'listOf' @ [88:33] ==> @InlineOnly public inline fun <T> listOf(): List<Annotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotation

