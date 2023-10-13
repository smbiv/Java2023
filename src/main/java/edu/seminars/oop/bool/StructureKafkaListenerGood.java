package edu.seminars.oop.bool;

import java.util.Objects;

public class StructureKafkaListenerGood {
    private void readKafkaMessageGood(StructureKafkaEntity structureKafkaEntity) {
        if (isLegalPositionDeleted(structureKafkaEntity)) {
            System.out.println("Сценарий на случай удалении юридической позиции");
        }
    }

    private boolean isLegalPositionDeleted(StructureKafkaEntity structureKafkaEntity) {
        return Objects.equals(structureKafkaEntity.entityType(), "ENTITY_TYPE_POSITION") &&
                Objects.equals(structureKafkaEntity.structureType(), "STRUCTURE_TYPE_LEGAL") &&
                Objects.equals(structureKafkaEntity.actionType(), "ACTION_TYPE_DELETED");
    }
}
