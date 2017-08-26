'Member' @ [32:5] ==> public constructor Member(annotations: Annotations, modifiers: Modifiers) defined in org.jetbrains.kotlin.j2k.ast.Member[ClassConstructorDescriptorImpl]

'annotations' @ [32:12] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.Class.<init>[ValueParameterDescriptorImpl]

'modifiers' @ [32:25] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Class.<init>[ValueParameterDescriptorImpl]

'builder' @ [35:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.generateCode[ValueParameterDescriptorImpl]

'append' @ [35:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'annotations' @ [35:24] ==> public final var annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'appendWithSpaceAfter' @ [36:18] ==> public infix fun CodeBuilder.appendWithSpaceAfter(modifiers: Modifiers): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Modifier.kt[SimpleFunctionDescriptorImpl]

'presentationModifiers' @ [36:39] ==> protected open fun presentationModifiers(): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Class[SimpleFunctionDescriptorImpl]

'append' @ [37:18] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'keyword' @ [37:25] ==> protected open val keyword: String defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'append' @ [38:18] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [39:18] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'name' @ [39:25] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'append' @ [40:18] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'typeParameterList' @ [40:25] ==> public final val typeParameterList: TypeParameterList defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'body' @ [42:13] ==> public final val body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'primaryConstructorSignature' @ [42:18] ==> public final val primaryConstructorSignature: PrimaryConstructorSignature? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'builder' @ [43:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.generateCode[ValueParameterDescriptorImpl]

'append' @ [43:21] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'body' @ [43:28] ==> public final val body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'primaryConstructorSignature' @ [43:33] ==> public final val primaryConstructorSignature: PrimaryConstructorSignature? defined in org.jetbrains.kotlin.j2k.ast.ClassBody[PropertyDescriptorImpl]

'appendBaseTypes' @ [46:9] ==> protected final fun appendBaseTypes(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Class[SimpleFunctionDescriptorImpl]

'builder' @ [46:25] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.generateCode[ValueParameterDescriptorImpl]

'typeParameterList' @ [47:9] ==> public final val typeParameterList: TypeParameterList defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'appendWhere' @ [47:27] ==> public final fun appendWhere(builder: CodeBuilder): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[SimpleFunctionDescriptorImpl]

'builder' @ [47:39] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.generateCode[ValueParameterDescriptorImpl]

'body' @ [49:9] ==> public final val body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'appendTo' @ [49:14] ==> public final fun appendTo(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.ClassBody[SimpleFunctionDescriptorImpl]

'builder' @ [49:23] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.generateCode[ValueParameterDescriptorImpl]

'builder' @ [56:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.appendBaseTypes[ValueParameterDescriptorImpl]

'buildList' @ [56:17] ==> public fun <T> CodeBuilder.buildList(generators: Collection<() -> CodeBuilder>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> CodeBuilder

'baseClassSignatureWithParams' @ [56:40] ==> private final fun baseClassSignatureWithParams(builder: CodeBuilder): List<() -> CodeBuilder> defined in org.jetbrains.kotlin.j2k.ast.Class[SimpleFunctionDescriptorImpl]

'builder' @ [56:69] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.appendBaseTypes[ValueParameterDescriptorImpl]

'implementsTypes' @ [56:80] ==> public final val implementsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'map' @ [56:96] ==> public inline fun <T, R> Iterable<Type>.map(transform: (Type) -> () -> CodeBuilder): List<() -> CodeBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Function0<CodeBuilder>

'builder' @ [56:104] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.appendBaseTypes[ValueParameterDescriptorImpl]

'append' @ [56:112] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [56:119] ==> value-parameter it: Type defined in org.jetbrains.kotlin.j2k.ast.Class.appendBaseTypes.<anonymous>[ValueParameterDescriptorImpl]

'keyword' @ [62:13] ==> protected open val keyword: String defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'equals' @ [62:21] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'extendsTypes' @ [62:40] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'size' @ [62:53] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'baseClassParams' @ [62:66] ==> public final val baseClassParams: List<DeferredElement<Expression>>? defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'listOf' @ [63:20] ==> public fun <T> listOf(element: () -> CodeBuilder): List<() -> CodeBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<CodeBuilder>

'builder' @ [64:31] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.baseClassSignatureWithParams[ValueParameterDescriptorImpl]

'extendsTypes' @ [64:46] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'builder' @ [65:31] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.baseClassSignatureWithParams[ValueParameterDescriptorImpl]

'append' @ [65:39] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'baseClassParams' @ [65:46] ==> public final val baseClassParams: List<DeferredElement<Expression>>? defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'builder' @ [66:31] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.baseClassSignatureWithParams[ValueParameterDescriptorImpl]

'extendsTypes' @ [69:16] ==> public final val extendsTypes: List<Type> defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'map' @ [69:29] ==> public inline fun <T, R> Iterable<Type>.map(transform: (Type) -> () -> CodeBuilder): List<() -> CodeBuilder> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type
    <R> -> Function0<CodeBuilder>

'builder' @ [69:37] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Class.baseClassSignatureWithParams[ValueParameterDescriptorImpl]

'append' @ [69:45] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'it' @ [69:52] ==> value-parameter it: Type defined in org.jetbrains.kotlin.j2k.ast.Class.baseClassSignatureWithParams.<anonymous>[ValueParameterDescriptorImpl]

'if (modifiers.contains(Modifier.ABSTRACT)) modifiers.without(Modifier.OPEN) else modifiers' @ [73:15] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Modifiers, elseBranch: Modifiers): Modifiers[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Modifiers

'modifiers' @ [73:19] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'contains' @ [73:29] ==> public final fun contains(modifier: Modifier): Boolean defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'ABSTRACT' @ [73:47] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [73:58] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'without' @ [73:68] ==> public final fun without(modifier: Modifier?): Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers[SimpleFunctionDescriptorImpl]

'OPEN' @ [73:85] ==> enum entry OPEN defined in org.jetbrains.kotlin.j2k.ast.Modifier[FakeCallableDescriptorForObject]

'modifiers' @ [73:96] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Class[PropertyDescriptorImpl]

'Class' @ [81:5] ==> public constructor Class(name: Identifier, annotations: Annotations, modifiers: Modifiers, typeParameterList: TypeParameterList, extendsTypes: List<Type>, baseClassParams: List<DeferredElement<Expression>>?, implementsTypes: List<Type>, body: ClassBody) defined in org.jetbrains.kotlin.j2k.ast.Class[ClassConstructorDescriptorImpl]

'name' @ [81:11] ==> value-parameter name: Identifier defined in org.jetbrains.kotlin.j2k.ast.Object.<init>[ValueParameterDescriptorImpl]

'annotations' @ [81:17] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.j2k.ast.Object.<init>[ValueParameterDescriptorImpl]

'modifiers' @ [81:30] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Object.<init>[ValueParameterDescriptorImpl]

'TypeParameterList' @ [81:41] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList[FakeCallableDescriptorForObject]

'Empty' @ [81:59] ==> public final val Empty: TypeParameterList defined in org.jetbrains.kotlin.j2k.ast.TypeParameterList.Companion[PropertyDescriptorImpl]

'emptyList' @ [81:66] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'emptyList' @ [81:85] ==> public fun <T> emptyList(): List<Type> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Type

'body' @ [81:98] ==> value-parameter body: ClassBody defined in org.jetbrains.kotlin.j2k.ast.Object.<init>[ValueParameterDescriptorImpl]

