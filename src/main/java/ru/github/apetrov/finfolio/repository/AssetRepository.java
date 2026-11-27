package ru.github.apetrov.finfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.github.apetrov.finfolio.entity.Asset;

public interface AssetRepository  extends JpaRepository<Asset, String > {
}
