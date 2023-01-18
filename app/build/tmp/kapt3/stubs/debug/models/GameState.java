package models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fBO\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00070\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u001c\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00070\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00c6\u0003JX\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00070\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020\u0003H\u0016J\t\u0010%\u001a\u00020&H\u00d6\u0001J!\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u00c7\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00070\u0007\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018\u00a8\u00060"}, d2 = {"Lmodels/GameState;", "", "seen1", "", "playerAtTurn", "", "field", "", "winningPlayer", "isBoardFull", "", "connectedPlayer", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Character;[[Ljava/lang/Character;Ljava/lang/Character;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Character;[[Ljava/lang/Character;Ljava/lang/Character;ZLjava/util/List;)V", "getConnectedPlayer", "()Ljava/util/List;", "getField", "()[[Ljava/lang/Character;", "[[Ljava/lang/Character;", "()Z", "getPlayerAtTurn", "()Ljava/lang/Character;", "Ljava/lang/Character;", "getWinningPlayer", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Character;[[Ljava/lang/Character;Ljava/lang/Character;ZLjava/util/List;)Lmodels/GameState;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_debug"})
@kotlinx.serialization.Serializable()
public final class GameState {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Character playerAtTurn = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Character[][] field = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Character winningPlayer = null;
    private final boolean isBoardFull = false;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Character> connectedPlayer = null;
    @org.jetbrains.annotations.NotNull()
    public static final models.GameState.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final models.GameState copy(@org.jetbrains.annotations.Nullable()
    java.lang.Character playerAtTurn, @org.jetbrains.annotations.NotNull()
    java.lang.Character[][] field, @org.jetbrains.annotations.Nullable()
    java.lang.Character winningPlayer, boolean isBoardFull, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Character> connectedPlayer) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    models.GameState self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public GameState() {
        super();
    }
    
    public GameState(@org.jetbrains.annotations.Nullable()
    java.lang.Character playerAtTurn, @org.jetbrains.annotations.NotNull()
    java.lang.Character[][] field, @org.jetbrains.annotations.Nullable()
    java.lang.Character winningPlayer, boolean isBoardFull, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Character> connectedPlayer) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Character component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Character getPlayerAtTurn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Character[][] component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Character[][] getField() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Character component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Character getWinningPlayer() {
        return null;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean isBoardFull() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Character> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Character> getConnectedPlayer() {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0019\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0004\u00a2\u0006\u0002\u0010\u0006J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001\u00a8\u0006\n"}, d2 = {"Lmodels/GameState$Companion;", "", "()V", "emptyField", "", "", "()[[Ljava/lang/Character;", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmodels/GameState;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<models.GameState> serializer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Character[][] emptyField() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"models/GameState.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lmodels/GameState;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_debug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<models.GameState> {
        @org.jetbrains.annotations.NotNull()
        public static final models.GameState.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public models.GameState deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        models.GameState value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}